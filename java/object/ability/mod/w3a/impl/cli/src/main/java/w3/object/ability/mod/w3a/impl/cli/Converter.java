package w3.object.ability.mod.w3a.impl.cli;

import w3.common.cli.AbstractConverter;
import w3.common.core.Wc3BinOutputStream;
import w3.object.ability.mod.impl.std.StdW3ASerializer;
import w3.object.ability.mod.w3a.impl.json.JsonW3ASerializer;
import w3.object.ability.mod.w3a.impl.kaitai.KaitaiBasedW3AParser;
import w3.object.ability.mod.w3a.model.W3A;
import w3.object.common.core.EncodingFormat;

import java.io.*;
import java.nio.file.Files;

public class Converter extends AbstractConverter<W3A> {
    public Converter(File inputFile, File outputFile) {
        super(inputFile, outputFile);
    }
    {
//        registerParser(Types.JSON.getName(), (inputFile) -> {
//            try (final InputStream inputStream = new ByteArrayInputStream(Files.readAllBytes(inputFile.toPath()))) {
//                return new JsonW3AParser(inputStream);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        });
        registerParser(Types.W3A.getName(), (inputFile) -> {
            try {
                return new KaitaiBasedW3AParser(Files.readAllBytes(inputFile.toPath()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
    {
        registerSerializer(Types.JSON.getName(), (outputFile) -> w3a -> {
            try (final OutputStream outputStream = new FileOutputStream(outputFile)) {
                new JsonW3ASerializer(outputStream).serialize(w3a);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        registerSerializer(Types.W3A.getName(), (outputFile) -> w3a -> {
            try (final var outputStream = new Wc3BinOutputStream(new FileOutputStream(outputFile))) {
                new StdW3ASerializer(outputStream, EncodingFormat.AUTO).serialize(w3a);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
