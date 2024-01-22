package w3.script.gui.wtg.impl.cli;

import w3.common.cli.AbstractConverter;
import w3.common.core.Wc3BinOutputStream;
import w3.script.gui.wtg.impl.json.JsonWTGParser;
import w3.script.gui.wtg.impl.json.JsonWTGSerializer;
import w3.script.gui.wtg.impl.kaitai.KaitaiBasedWTGParser;
import w3.script.gui.wtg.impl.std.StdWTGSerializer;
import w3.script.gui.wtg.model.EncodingFormat;
import w3.script.gui.wtg.model.WTG;

import java.io.*;
import java.nio.file.Files;

public class Converter extends AbstractConverter<WTG> {
    private Integer targetVersion = null;
    public Converter(File inputFile, File outputFile, Integer targetVersion) {
        super(inputFile, outputFile);
        this.targetVersion = targetVersion;
    }

    {
        registerParser(Types.JSON.getName(), (inputFile) -> {
            try (final InputStream inputStream = new ByteArrayInputStream(Files.readAllBytes(inputFile.toPath()))) {
                return new JsonWTGParser(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        registerParser(Types.WTG.getName(), (inputFile) -> {
            try {
                return new KaitaiBasedWTGParser(Files.readAllBytes(inputFile.toPath()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    {
        registerSerializer(Types.JSON.getName(), (outputFile) -> wtg -> {
            try (final OutputStream outputStream = new FileOutputStream(outputFile)) {
                new JsonWTGSerializer(outputStream).serialize(wtg);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        registerSerializer(Types.WTG.getName(), (outputFile) -> wtg -> {
            try (final var outputStream = new Wc3BinOutputStream(new FileOutputStream(outputFile))) {
                new StdWTGSerializer(outputStream, targetVersion == null ? EncodingFormat.AUTO : EncodingFormat.valueOf(targetVersion)).serialize(wtg);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
