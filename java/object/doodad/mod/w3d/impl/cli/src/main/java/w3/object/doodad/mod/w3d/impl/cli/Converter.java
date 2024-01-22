package w3.object.doodad.mod.w3d.impl.cli;

import w3.common.cli.AbstractConverter;
import w3.common.core.Wc3BinOutputStream;
import w3.object.common.core.EncodingFormat;
import w3.object.doodad.mod.w3d.impl.kaitai.KaitaiBasedW3DParser;
import w3.object.doodad.mod.w3d.impl.std.StdW3DSerializer;
import w3.object.doodad.mod.w3d.model.W3D;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

public class Converter extends AbstractConverter<W3D> {
    public Converter(File inputFile, File outputFile) {
        super(inputFile, outputFile);
    }
    {
//        registerParser(w3.object.doodad.mod.w3d.impl.cli.Types.JSON.getName(), (inputFile) -> {
//            try (final InputStream inputStream = new ByteArrayInputStream(Files.readAllBytes(inputFile.toPath()))) {
//                return new JsonW3DParser(inputStream);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        });
        registerParser(Types.W3D.getName(), (inputFile) -> {
            try {
                return new KaitaiBasedW3DParser(Files.readAllBytes(inputFile.toPath()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
    {
//        registerSerializer(w3.object.doodad.mod.w3d.impl.cli.Types.JSON.getName(), (outputFile) -> w3d -> {
//            try (final OutputStream outputStream = new FileOutputStream(outputFile)) {
//                new JsonW3DSerializer(outputStream).serialize(w3d);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        });
        registerSerializer(Types.W3D.getName(), (outputFile) -> w3d -> {
            try (final var outputStream = new Wc3BinOutputStream(new FileOutputStream(outputFile))) {
                new StdW3DSerializer(outputStream, EncodingFormat.AUTO).serialize(w3d);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
