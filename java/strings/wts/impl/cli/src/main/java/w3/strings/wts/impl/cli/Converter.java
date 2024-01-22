package w3.strings.wts.impl.cli;

import w3.common.cli.AbstractConverter;
import w3.common.core.Wc3BinOutputStream;
import w3.strings.wts.impl.antlr.AntlrBasedWTSParser;
import w3.strings.wts.impl.json.JsonWTSParser;
import w3.strings.wts.impl.json.JsonWTSSerializer;
import w3.strings.wts.model.WTS;

import java.io.*;
import java.nio.file.Files;

public class Converter extends AbstractConverter<WTS> {
    private Integer targetVersion = null;

    public Converter(File inputFile, File outputFile, Integer targetVersion) {
        super(inputFile, outputFile);
        this.targetVersion = targetVersion;
    }

    {
        registerParser(Types.JSON.getName(), (inputFile) -> {
            try (final InputStream inputStream = new ByteArrayInputStream(Files.readAllBytes(inputFile.toPath()))) {
                return new JsonWTSParser(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        registerParser(Types.WTS.getName(), (inputFile) -> {
            try {
                return new AntlrBasedWTSParser(Files.readAllBytes(inputFile.toPath()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    {
        registerSerializer(Types.JSON.getName(), (outputFile) -> w3i -> {
            try (final OutputStream outputStream = new FileOutputStream(outputFile)) {
                new JsonWTSSerializer(outputStream).serialize(w3i);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        registerSerializer(Types.WTS.getName(), (outputFile) -> w3i -> {
            try (final var outputStream = new Wc3BinOutputStream(new FileOutputStream(outputFile))) {
                //new StdWTSSerializer(outputStream, targetVersion == null ? EncodingFormat.AUTO : EncodingFormat.valueOf(targetVersion)).serialize(w3i);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
