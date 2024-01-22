package w3.info.w3f.impl.cli;

import w3.common.cli.AbstractConverter;
import w3.common.core.Wc3BinOutputStream;
import w3.info.w3f.impl.json.JsonW3FParser;
import w3.info.w3f.impl.json.JsonW3FSerializer;
import w3.info.w3f.impl.kaitai.KaitaiBasedW3FParser;
import w3.info.w3f.impl.std.StdW3FSerializer;
import w3.info.w3f.model.EncodingFormat;
import w3.info.w3f.model.W3F;
import w3.info.w3f.model.W3W3f;

import java.io.*;
import java.nio.file.Files;

public class Converter extends AbstractConverter<W3F> {
    private Integer targetVersion = null;
    public Converter(File inputFile, File outputFile, Integer targetVersion) {
        super(inputFile, outputFile);
        this.targetVersion = targetVersion;
    }

    {
        registerParser(Types.JSON.getName(), (inputFile) -> {
            try {
                return new JsonW3FParser(Files.readAllBytes(inputFile.toPath()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        registerParser(Types.W3F.getName(), (inputFile) -> {
            try {
                return new KaitaiBasedW3FParser(Files.readAllBytes(inputFile.toPath()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    {
        registerSerializer(Types.JSON.getName(), (outputFile) -> w3f -> {
            try (final OutputStream outputStream = new FileOutputStream(outputFile)) {
                new JsonW3FSerializer(outputStream).serialize(w3f);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        registerSerializer(Types.W3F.getName(), (outputFile) -> w3f -> {
            try (final var outputStream = new Wc3BinOutputStream(new FileOutputStream(outputFile))) {
                new StdW3FSerializer(outputStream, targetVersion == null ? EncodingFormat.AUTO : EncodingFormat.valueOf(targetVersion)).serialize(w3f);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
