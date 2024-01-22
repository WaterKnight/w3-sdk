package w3.asset.imports.imp.impl.cli;

import w3.asset.imports.imp.impl.json.JsonIMPParser;
import w3.asset.imports.imp.impl.json.JsonIMPSerializer;
import w3.asset.imports.imp.impl.kaitai.KaitaiBasedIMPParser;
import w3.asset.imports.imp.impl.std.EncodingFormat;
import w3.asset.imports.imp.impl.std.StdIMPSerializer;
import w3.asset.imports.imp.model.IMP;
import w3.common.cli.AbstractConverter;
import w3.common.core.Wc3BinOutputStream;

import java.io.*;
import java.nio.file.Files;

public class Converter extends AbstractConverter<IMP> {
    private Integer targetVersion = null;

    public Converter(File inputFile, File outputFile, Integer targetVersion) {
        super(inputFile, outputFile);
        this.targetVersion = targetVersion;
    }

    {
        registerParser(Types.JSON.getName(), (inputFile) -> {
            try (final InputStream inputStream = new ByteArrayInputStream(Files.readAllBytes(inputFile.toPath()))) {
                return new JsonIMPParser(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        registerParser(Types.IMP.getName(), (inputFile) -> {
            try {
                return new KaitaiBasedIMPParser(Files.readAllBytes(inputFile.toPath()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    {
        registerSerializer(Types.JSON.getName(), (outputFile) -> imp -> {
            try (final OutputStream outputStream = new FileOutputStream(outputFile)) {
                new JsonIMPSerializer(outputStream).serialize(imp);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        registerSerializer(Types.IMP.getName(), (outputFile) -> imp -> {
            try (final var outputStream = new Wc3BinOutputStream(new FileOutputStream(outputFile))) {
                new StdIMPSerializer(outputStream, targetVersion == null ? EncodingFormat.AUTO : EncodingFormat.valueOf(targetVersion)).serialize(imp);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
