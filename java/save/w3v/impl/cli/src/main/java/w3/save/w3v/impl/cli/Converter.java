package w3.save.w3v.impl.cli;

import w3.common.cli.AbstractConverter;
import w3.common.core.Wc3BinOutputStream;
import w3.save.w3v.impl.json.JsonW3VParser;
import w3.save.w3v.impl.json.JsonW3VSerializer;
import w3.save.w3v.impl.kaitai.KaitaiBasedW3VParser;
import w3.save.w3v.model.EncodingFormat;
import w3.save.w3v.impl.std.StdW3VSerializer;
import w3.save.w3v.model.W3V;

import java.io.*;
import java.nio.file.Files;

public class Converter extends AbstractConverter<W3V> {
    private Integer targetVersion = null;
    private boolean decompress = true;
    private boolean compress = true;
    public Converter(File inputFile, File outputFile, Integer targetVersion, boolean decompress, boolean compress) {
        super(inputFile, outputFile);
        this.targetVersion = targetVersion;
        this.decompress = decompress;
        this.compress = compress;
    }

    {
        registerParser(Types.JSON.getName(), (inputFile) -> {
            try (final InputStream inputStream = new ByteArrayInputStream(Files.readAllBytes(inputFile.toPath()))) {
                return new JsonW3VParser(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        registerParser(Types.W3V.getName(), (inputFile) -> {
            try {
                return new KaitaiBasedW3VParser(Files.readAllBytes(inputFile.toPath()), decompress);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    {
        registerSerializer(Types.JSON.getName(), (outputFile) -> w3v -> {
            try (final OutputStream outputStream = new FileOutputStream(outputFile)) {
                new JsonW3VSerializer(outputStream).serialize(w3v);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        registerSerializer(Types.W3V.getName(), (outputFile) -> w3v -> {
            try (final var outputStream = new Wc3BinOutputStream(new FileOutputStream(outputFile))) {
                new StdW3VSerializer(outputStream, targetVersion == null ? EncodingFormat.AUTO : EncodingFormat.valueOf(targetVersion), compress).serialize(w3v);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
