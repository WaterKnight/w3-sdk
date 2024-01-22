package w3.common.test;

import w3.common.api.Parser;
import w3.common.api.Serializer;
import w3.common.core.Wc3BinOutputStream;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.util.Collections;
import java.util.Objects;

public class ReadWriteCycleTest {
    public interface ParserSupplier<ModelClassType> {
        Parser<ModelClassType> get(byte[] inputBytes);
    }

    public interface SerializerSupplier<ModelClassType> {
        Serializer<ModelClassType> get(Wc3BinOutputStream outputStream, ModelClassType inputData);
    }

    public interface AssertionRunnable<ModelClassType> {
        void doAssertions(ModelClassType inputData, ModelClassType outputData);
    }

    public <ModelClassType> void test(URL resource, String directory, String extension, ParserSupplier<ModelClassType> parserSupplier, SerializerSupplier<ModelClassType> serializerSupplier, AssertionRunnable<ModelClassType> equalityTester) throws URISyntaxException {
        final URI uri = Objects.requireNonNull(resource).toURI();
        try (final FileSystem fileSystem = FileSystems.newFileSystem(uri, Collections.emptyMap())) {
            test(fileSystem, directory, extension, parserSupplier, serializerSupplier, equalityTester);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public static class BytesNotEqualError extends AssertionError {
        public BytesNotEqualError(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public <ModelClassType> void test(FileSystem fileSystem, String directory, String extension, ParserSupplier<ModelClassType> parserSupplier, SerializerSupplier<ModelClassType> serializerSupplier, AssertionRunnable<ModelClassType> equalityTester) throws URISyntaxException {
        final var files = TestFileUtil.getFilesWithExtension(fileSystem, directory, extension);

        files.forEach(file -> {
            System.out.println("test " + file.toString());
            try {
                final byte[] inputBytes = Files.readAllBytes(file);
                final Parser<ModelClassType> parser = parserSupplier.get(inputBytes);
                final ModelClassType inputData = parser.parse();
                try (
                        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        final Wc3BinOutputStream outputStream = new Wc3BinOutputStream(byteArrayOutputStream)
                ) {
                    final Serializer<ModelClassType> serializer = serializerSupplier.get(outputStream, inputData);
                    serializer.serialize(inputData);
                    outputStream.close();
                    final byte[] outBytes = byteArrayOutputStream.toByteArray();

                    final ModelClassType outputData = parserSupplier.get(outBytes).parse();

                    equalityTester.doAssertions(inputData, outputData);

                    try {
                        org.hamcrest.MatcherAssert.assertThat(inputBytes, org.hamcrest.core.Is.is(outBytes));
                    } catch (AssertionError e) {
                        throw new BytesNotEqualError(e.getMessage(), e);
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public interface PrintSerializerSupplier<ModelClassType> {
        Serializer<ModelClassType> get(PrintStream outputStream, ModelClassType inputData);
    }

    public <ModelClassType> void testPrint(URL resource, String directory, String extension, ParserSupplier<ModelClassType> parserSupplier, PrintSerializerSupplier<ModelClassType> serializerSupplier, AssertionRunnable<ModelClassType> equalityTester) throws URISyntaxException {
        final URI uri = Objects.requireNonNull(resource).toURI();
        try (final FileSystem fileSystem = FileSystems.newFileSystem(uri, Collections.emptyMap())) {
            final var files = TestFileUtil.getFilesWithExtension(fileSystem, directory, extension);

            files.forEach(file -> {
                System.out.println("test " + file.toString());
                try {
                    final byte[] inputBytes = Files.readAllBytes(file);
                    final Parser<ModelClassType> parser = parserSupplier.get(inputBytes);
                    final ModelClassType inputData = parser.parse();
                    try (
                            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            final PrintStream outputStream = new PrintStream(byteArrayOutputStream)
                    ) {
                        final Serializer<ModelClassType> serializer = serializerSupplier.get(outputStream, inputData);
                        serializer.serialize(inputData);
                        outputStream.close();
                        final byte[] outBytes = byteArrayOutputStream.toByteArray();

                        final ModelClassType outputData = parserSupplier.get(outBytes).parse();

                        equalityTester.doAssertions(inputData, outputData);

                        final String inputString = cleanLines(new String(inputBytes, StandardCharsets.UTF_8));
                        final String outputString = cleanLines(new String(outBytes, StandardCharsets.UTF_8));

                        org.hamcrest.MatcherAssert.assertThat(inputString, org.hamcrest.core.Is.is(outputString));
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    private String cleanLines(String str) {
        str = str.replaceAll("\\p{Cntrl}", "\n");
        final String[] lines = str.split("\n");
        final StringBuilder stringBuilder = new StringBuilder();
        for (String line : lines) {
            line = line.replaceAll("//.*$", "");
            if (!line.isEmpty()) {
                stringBuilder.append(line);
                stringBuilder.append("\n");
            }
        }
        str = stringBuilder.toString();
        str = str.replaceAll("\\s+", " ");
        return str;
    }
}
