package w3.replay.w3g.impl.cli;

import w3.common.cli.AbstractConverter;
import w3.common.core.Wc3BinOutputStream;
import w3.replay.w3g.impl.json.JsonW3GParser;
import w3.replay.w3g.impl.json.JsonW3GSerializer;
import w3.replay.w3g.impl.kaitai.KaitaiBasedW3GParser;
import w3.replay.w3g.impl.std.StdW3GSerializer;
import w3.replay.w3g.model.EncodingFormat;
import w3.replay.w3g.model.W3G;

import java.io.*;
import java.nio.file.Files;

public class Converter extends AbstractConverter<W3G> {
    private Integer targetVersion = null;

    public Converter(File inputFile, File outputFile, Integer targetVersion) {
        super(inputFile, outputFile);
        this.targetVersion = targetVersion;
    }

    {
        registerParser(Types.JSON.getName(), (inputFile) -> {
            try (final InputStream inputStream = new ByteArrayInputStream(Files.readAllBytes(inputFile.toPath()))) {
                return new JsonW3GParser(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        registerParser(Types.W3G.getName(), (inputFile) -> {
            try {
                return new KaitaiBasedW3GParser(Files.readAllBytes(inputFile.toPath()), true);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    {
        registerSerializer(Types.JSON.getName(), (outputFile) -> w3i -> {
            try (final OutputStream outputStream = new FileOutputStream(outputFile)) {
                new JsonW3GSerializer(outputStream).serialize(w3i);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        registerSerializer(Types.W3G.getName(), (outputFile) -> w3i -> {
            try (final var outputStream = new Wc3BinOutputStream(new FileOutputStream(outputFile))) {
                new StdW3GSerializer(outputStream, targetVersion == null ? EncodingFormat.AUTO : EncodingFormat.valueOf(targetVersion)).serialize(w3i);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
