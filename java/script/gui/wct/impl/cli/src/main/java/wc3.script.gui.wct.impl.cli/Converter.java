package wc3.script.gui.wct.impl.cli;

import w3.common.cli.AbstractConverter;
import w3.common.core.Wc3BinOutputStream;
import w3.script.gui.wct.impl.std.StdWCTSerializer;
import wc3.script.gui.wct.impl.json.JsonWCTParser;
import wc3.script.gui.wct.impl.json.JsonWCTSerializer;
import wc3.script.gui.wct.impl.kaitai.KaitaiBasedWCTParser;
import wc3.script.gui.wct.model.EncodingFormat;
import wc3.script.gui.wct.model.WCT;

import java.io.*;
import java.nio.file.Files;

public class Converter extends AbstractConverter<WCT> {
    private Integer targetVersion = null;
    public Converter(File inputFile, File outputFile, Integer targetVersion) {
        super(inputFile, outputFile);
        this.targetVersion = targetVersion;
    }

    {
        registerParser(Types.JSON.getName(), (inputFile) -> {
            try (final InputStream inputStream = new ByteArrayInputStream(Files.readAllBytes(inputFile.toPath()))) {
                return new JsonWCTParser(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        registerParser(Types.WCT.getName(), (inputFile) -> {
            try {
                return new KaitaiBasedWCTParser(Files.readAllBytes(inputFile.toPath()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    {
        registerSerializer(Types.JSON.getName(), (outputFile) -> wct -> {
            try (final OutputStream outputStream = new FileOutputStream(outputFile)) {
                new JsonWCTSerializer(outputStream).serialize(wct);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        registerSerializer(Types.WCT.getName(), (outputFile) -> wct -> {
            try (final var outputStream = new Wc3BinOutputStream(new FileOutputStream(outputFile))) {
                new StdWCTSerializer(outputStream, targetVersion == null ? EncodingFormat.AUTO : EncodingFormat.valueOf(targetVersion)).serialize(wct);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
