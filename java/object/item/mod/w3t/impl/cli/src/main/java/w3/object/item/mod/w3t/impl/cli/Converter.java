package w3.object.item.mod.w3t.impl.cli;

import w3.common.cli.AbstractConverter;
import w3.common.core.Wc3BinOutputStream;
import w3.object.common.core.EncodingFormat;
import w3.object.item.mod.impl.kaitai.KaitaiBasedW3TParser;
import w3.object.item.mod.w3t.impl.std.StdW3TSerializer;
import w3.object.item.mod.w3t.model.W3T;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

public class Converter extends AbstractConverter<W3T> {
    public Converter(File inputFile, File outputFile) {
        super(inputFile, outputFile);
    }
    {
//        registerParser(w3.object.item.mod.w3t.impl.cli.Types.JSON.getName(), (inputFile) -> {
//            try (final InputStream inputStream = new ByteArrayInputStream(Files.readAllBytes(inputFile.toPath()))) {
//                return new JsonW3TParser(inputStream);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        });
        registerParser(Types.W3T.getName(), (inputFile) -> {
            try {
                return new KaitaiBasedW3TParser(Files.readAllBytes(inputFile.toPath()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
    {
//        registerSerializer(w3.object.item.mod.w3t.impl.cli.Types.JSON.getName(), (outputFile) -> w3t -> {
//            try (final OutputStream outputStream = new FileOutputStream(outputFile)) {
//                new JsonW3TSerializer(outputStream).serialize(w3t);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        });
        registerSerializer(Types.W3T.getName(), (outputFile) -> w3t -> {
            try (final var outputStream = new Wc3BinOutputStream(new FileOutputStream(outputFile))) {
                new StdW3TSerializer(outputStream, EncodingFormat.AUTO).serialize(w3t);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
