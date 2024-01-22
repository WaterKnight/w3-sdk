package w3.object.destructable.mod.w3b.impl.cli;

import kaitai.KaitaiBasedW3BParser;
import w3.common.cli.AbstractConverter;
import w3.common.core.Wc3BinOutputStream;
import w3.object.destructable.mod.w3b.model.W3B;
import w3.object.common.core.EncodingFormat;
import w3.object.destructable.mod.w3b.impl.std.StdW3BSerializer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

public class Converter extends AbstractConverter<W3B> {
    public Converter(File inputFile, File outputFile) {
        super(inputFile, outputFile);
    }
    {
//        registerParser(w3.object.destructable.mod.w3b.impl.cli.Types.JSON.getName(), (inputFile) -> {
//            try (final InputStream inputStream = new ByteArrayInputStream(Files.readAllBytes(inputFile.toPath()))) {
//                return new JsonW3BParser(inputStream);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        });
        registerParser(Types.W3B.getName(), (inputFile) -> {
            try {
                return new KaitaiBasedW3BParser(Files.readAllBytes(inputFile.toPath()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
    {
//        registerSerializer(w3.object.destructable.mod.w3b.impl.cli.Types.JSON.getName(), (outputFile) -> w3b -> {
//            try (final OutputStream outputStream = new FileOutputStream(outputFile)) {
//                new JsonW3BSerializer(outputStream).serialize(w3b);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        });
        registerSerializer(Types.W3B.getName(), (outputFile) -> w3b -> {
            try (final var outputStream = new Wc3BinOutputStream(new FileOutputStream(outputFile))) {
                new StdW3BSerializer(outputStream, EncodingFormat.AUTO).serialize(w3b);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
