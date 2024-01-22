package w3.info.mmp.impl.cli;

import w3.common.cli.AbstractConverter;
import w3.common.core.Wc3BinOutputStream;
import w3.info.mmp.impl.json.JsonMMPParser;
import w3.info.mmp.impl.json.JsonMMPSerializer;
import w3.info.mmp.impl.kaitai.KaitaiBasedMMPParser;
import w3.info.mmp.impl.std.StdMMPSerializer;
import w3.info.mmp.model.EncodingFormat;
import w3.info.mmp.model.MMP;

import java.io.*;
import java.nio.file.Files;

public class Converter extends AbstractConverter<MMP> {
    private Integer targetVersion = null;

    public Converter(File inputFile, File outputFile, Integer targetVersion) {
        super(inputFile, outputFile);
        this.targetVersion = targetVersion;
    }

    {
        registerParser(Types.JSON.getName(), (inputFile) -> {
            try (final InputStream inputStream = new ByteArrayInputStream(Files.readAllBytes(inputFile.toPath()))) {
                return new JsonMMPParser(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        registerParser(Types.MMP.getName(), (inputFile) -> {
            try {
                return new KaitaiBasedMMPParser(Files.readAllBytes(inputFile.toPath()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    {
        registerSerializer(Types.JSON.getName(), (outputFile) -> imp -> {
            try (final OutputStream outputStream = new FileOutputStream(outputFile)) {
                new JsonMMPSerializer(outputStream).serialize(imp);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        registerSerializer(Types.MMP.getName(), (outputFile) -> imp -> {
            try (final var outputStream = new Wc3BinOutputStream(new FileOutputStream(outputFile))) {
                new StdMMPSerializer(outputStream, targetVersion == null ? EncodingFormat.AUTO : EncodingFormat.valueOf(targetVersion)).serialize(imp);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
