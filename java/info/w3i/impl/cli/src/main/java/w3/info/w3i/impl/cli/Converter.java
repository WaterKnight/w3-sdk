package w3.info.w3i.impl.cli;

import w3.common.cli.AbstractConverter;
import w3.common.core.Wc3BinOutputStream;
import w3.info.w3i.impl.json.JsonW3IParser;
import w3.info.w3i.impl.json.JsonW3ISerializer;
import w3.info.w3i.impl.kaitai.KaitaiBasedW3IParser;
import w3.info.w3i.impl.std.EncodingFormat;
import w3.info.w3i.impl.std.StdW3ISerializer;
import w3.info.w3i.model.W3I;

import java.io.*;
import java.nio.file.Files;

public class Converter extends AbstractConverter<W3I> {
    private Integer targetVersion = null;

    public Converter(File inputFile, File outputFile, Integer targetVersion) {
        super(inputFile, outputFile);
        this.targetVersion = targetVersion;
    }

    {
        registerParser(Types.JSON.getName(), (inputFile) -> {
            try (final InputStream inputStream = new ByteArrayInputStream(Files.readAllBytes(inputFile.toPath()))) {
                return new JsonW3IParser(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        registerParser(Types.W3I.getName(), (inputFile) -> {
            try {
                return new KaitaiBasedW3IParser(Files.readAllBytes(inputFile.toPath()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    {
        registerSerializer(Types.JSON.getName(), (outputFile) -> w3i -> {
            try (final OutputStream outputStream = new FileOutputStream(outputFile)) {
                new JsonW3ISerializer(outputStream).serialize(w3i);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        registerSerializer(Types.W3I.getName(), (outputFile) -> w3i -> {
            try (final var outputStream = new Wc3BinOutputStream(new FileOutputStream(outputFile))) {
                new StdW3ISerializer(outputStream, targetVersion == null ? EncodingFormat.AUTO : EncodingFormat.valueOf(targetVersion)).serialize(w3i);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
