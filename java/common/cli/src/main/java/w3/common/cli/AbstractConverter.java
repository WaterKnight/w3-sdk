package w3.common.cli;

import w3.common.api.Parser;
import w3.common.api.Serializer;
import w3.common.core.FileUtil;

import javax.naming.OperationNotSupportedException;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public abstract class AbstractConverter<DataType> {
    private final File inputFile;
    private final File outputFile;

    public AbstractConverter(File inputFile, File outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }

    public void convert() {
        try {
            exec();
        } catch (IOException | OperationNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    private void exec() throws IOException, OperationNotSupportedException {
        final String outputFileExtension = FileUtil.getFileExtension(outputFile);

        final DataType data = read();

        final String typeName = outputFileExtension;

        final Serializer<DataType> serializer = typeToSerializer.get(typeName).apply(outputFile);

        if (serializer == null) {
            throw new OperationNotSupportedException(String.format("no serializer for type %s available", outputFileExtension));
        }

        serializer.serialize(data);
    }

    private DataType read() throws OperationNotSupportedException {
        final String inputFileExtension = FileUtil.getFileExtension(inputFile);

        final String typeName = inputFileExtension;

        final Parser<DataType> parser = typeToParser.get(typeName).apply(inputFile);

        if (parser == null) {
            throw new OperationNotSupportedException(String.format("no parser for type %s available", inputFileExtension));
        }

        return parser.parse();
    }

    private final Map<String, Function<File, Parser<DataType>>> typeToParser = new HashMap<>();

    protected void registerParser(String type, Function<File, Parser<DataType>> parserFunction) {
        typeToParser.put(type, parserFunction);
    }

    private final Map<String, Function<File, Serializer<DataType>>> typeToSerializer = new HashMap<>();

    protected void registerSerializer(String type, Function<File, Serializer<DataType>> serializerFunction) {
        typeToSerializer.put(type, serializerFunction);
    }
}
