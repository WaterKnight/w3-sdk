package w3.object.collection.mod.w3o.impl.cli;

import w3.common.cli.AbstractConverter;
import w3.common.core.Wc3BinOutputStream;
import w3.object.collection.mod.w3o.impl.json.JsonW3OParser;
import w3.object.collection.mod.w3o.impl.json.JsonW3OSerializer;
import w3.object.collection.mod.w3o.impl.kaitai.KaitaiBasedW3OParser;
import w3.object.collection.mod.w3o.impl.std.StdW3OSerializer;
import w3.object.collection.mod.w3o.model.EncodingFormat;
import w3.object.collection.mod.w3o.model.W3O;

import java.io.*;
import java.nio.file.Files;

public class Converter extends AbstractConverter<W3O> {
    private Integer targetVersion = null;
    private Integer targetObjectVersion = null;

    public Converter(File inputFile, File outputFile, Integer targetVersion, Integer targetObjectVersion) {
        super(inputFile, outputFile);
        this.targetVersion = targetVersion;
        this.targetObjectVersion = targetObjectVersion;
    }

    {
        registerParser(Types.JSON.getName(), (inputFile) -> {
            try (final InputStream inputStream = new ByteArrayInputStream(Files.readAllBytes(inputFile.toPath()))) {
                return new JsonW3OParser(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        registerParser(Types.WAI.getName(), (inputFile) -> {
            try {
                return new KaitaiBasedW3OParser(Files.readAllBytes(inputFile.toPath()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    {
        registerSerializer(Types.JSON.getName(), (outputFile) -> wai -> {
            try (final OutputStream outputStream = new FileOutputStream(outputFile)) {
                new JsonW3OSerializer(outputStream).serialize(wai);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        registerSerializer(Types.WAI.getName(), (outputFile) -> wai -> {
            try (final var outputStream = new Wc3BinOutputStream(new FileOutputStream(outputFile))) {
                new StdW3OSerializer(outputStream, targetVersion == null ? EncodingFormat.AUTO : EncodingFormat.valueOf(targetVersion), targetObjectVersion == null ? w3.object.common.core.EncodingFormat.AUTO : w3.object.common.core.EncodingFormat.valueOf(targetObjectVersion)).serialize(wai);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
