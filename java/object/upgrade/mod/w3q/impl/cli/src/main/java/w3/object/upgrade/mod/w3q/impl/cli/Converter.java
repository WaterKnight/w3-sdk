package w3.object.upgrade.mod.w3q.impl.cli;

import w3.common.cli.AbstractConverter;
import w3.common.core.Wc3BinOutputStream;
import w3.object.common.core.EncodingFormat;
import w3.object.upgrade.mod.w3q.impl.kaitai.KaitaiBasedW3QParser;
import w3.object.upgrade.mod.w3q.impl.std.StdW3QSerializer;
import w3.object.upgrade.mod.w3q.model.W3Q;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

public class Converter extends AbstractConverter<W3Q> {
    public Converter(File inputFile, File outputFile) {
        super(inputFile, outputFile);
    }
    {
//        registerParser(w3.object.upgrade.mod.w3q.impl.cli.Types.JSON.getName(), (inputFile) -> {
//            try (final InputStream inputStream = new ByteArrayInputStream(Files.readAllBytes(inputFile.toPath()))) {
//                return new JsonW3QParser(inputStream);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        });
        registerParser(Types.W3Q.getName(), (inputFile) -> {
            try {
                return new KaitaiBasedW3QParser(Files.readAllBytes(inputFile.toPath()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
    {
//        registerSerializer(w3.object.upgrade.mod.w3q.impl.cli.Types.JSON.getName(), (outputFile) -> w3q -> {
//            try (final OutputStream outputStream = new FileOutputStream(outputFile)) {
//                new JsonW3QSerializer(outputStream).serialize(w3q);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        });
        registerSerializer(Types.W3Q.getName(), (outputFile) -> w3q -> {
            try (final var outputStream = new Wc3BinOutputStream(new FileOutputStream(outputFile))) {
                new StdW3QSerializer(outputStream, EncodingFormat.AUTO).serialize(w3q);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
