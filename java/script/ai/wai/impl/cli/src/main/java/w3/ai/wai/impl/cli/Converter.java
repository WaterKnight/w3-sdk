package w3.ai.wai.impl.cli;

import w3.ai.wai.impl.json.JsonWAIParser;
import w3.ai.wai.impl.json.JsonWAISerializer;
import w3.ai.wai.impl.std.StdWAISerializer;
import w3.script.ai.wai.model.EncodingFormat;
import w3.common.cli.AbstractConverter;
import w3.common.core.Wc3BinOutputStream;

import java.io.*;
import java.nio.file.Files;
import w3.script.ai.wai.model.WAI;
import w3.script.ai.wai.impl.kaitai.KaitaiBasedWAIParser;

public class Converter extends AbstractConverter<WAI> {
    private Integer targetVersion = null;

    public Converter(File inputFile, File outputFile, Integer targetVersion) {
        super(inputFile, outputFile);
        this.targetVersion = targetVersion;
    }

    {
        registerParser(Types.JSON.getName(), (inputFile) -> {
            try (final InputStream inputStream = new ByteArrayInputStream(Files.readAllBytes(inputFile.toPath()))) {
                return new JsonWAIParser(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        registerParser(Types.WAI.getName(), (inputFile) -> {
            try {
                return new KaitaiBasedWAIParser(Files.readAllBytes(inputFile.toPath()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    {
        registerSerializer(Types.JSON.getName(), (outputFile) -> wai -> {
            try (final OutputStream outputStream = new FileOutputStream(outputFile)) {
                new JsonWAISerializer(outputStream).serialize(wai);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        registerSerializer(Types.WAI.getName(), (outputFile) -> wai -> {
            try (final var outputStream = new Wc3BinOutputStream(new FileOutputStream(outputFile))) {
                new StdWAISerializer(outputStream, targetVersion == null ? EncodingFormat.AUTO : EncodingFormat.valueOf(targetVersion)).serialize(wai);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
