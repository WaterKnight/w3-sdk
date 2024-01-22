package w3.object.unit.mod.w3u.impl.cli;

import w3.common.cli.AbstractConverter;
import w3.common.core.Wc3BinOutputStream;
import w3.object.common.core.EncodingFormat;
import w3.object.unit.mod.w3u.impl.kaitai.KaitaiBasedW3UParser;
import w3.object.unit.mod.w3u.impl.std.StdW3USerializer;
import w3.object.unit.mod.w3u.model.W3U;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

public class Converter extends AbstractConverter<W3U> {
    public Converter(File inputFile, File outputFile) {
        super(inputFile, outputFile);
    }
    {
//        registerParser(w3.object.unit.mod.w3u.impl.cli.Types.JSON.getName(), (inputFile) -> {
//            try (final InputStream inputStream = new ByteArrayInputStream(Files.readAllBytes(inputFile.toPath()))) {
//                return new JsonW3UParser(inputStream);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        });
        registerParser(Types.W3U.getName(), (inputFile) -> {
            try {
                return new KaitaiBasedW3UParser(Files.readAllBytes(inputFile.toPath()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
    {
//        registerSerializer(w3.object.unit.mod.w3u.impl.cli.Types.JSON.getName(), (outputFile) -> w3u -> {
//            try (final OutputStream outputStream = new FileOutputStream(outputFile)) {
//                new JsonW3USerializer(outputStream).serialize(w3u);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        });
        registerSerializer(Types.W3U.getName(), (outputFile) -> w3u -> {
            try (final var outputStream = new Wc3BinOutputStream(new FileOutputStream(outputFile))) {
                new StdW3USerializer(outputStream, EncodingFormat.AUTO).serialize(w3u);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
