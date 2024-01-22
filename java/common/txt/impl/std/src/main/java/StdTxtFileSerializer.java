package w3.common.txt.impl;

import w3.common.txt.api.TxtFileSerializer;
import w3.common.txt.model.TxtFile;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.stream.Collectors;

public class StdTxtFileSerializer implements TxtFileSerializer {
    private final OutputStream outputStream;

    public StdTxtFileSerializer(PrintStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(TxtFile data) {
        write(data);
    }

    private void write(TxtFile data) {
        try (final PrintStream printStream = new PrintStream(outputStream)) {
            data.getTxtFileLines().forEach(txtFileLine -> {
                printStream.println(txtFileLine.getKey());
                printStream.print("=");
                printStream.print(txtFileLine.getValues().stream().map(Object::toString).collect(Collectors.joining(",")));
                printStream.println();
            });
            data.getTxtFileCategories().forEach(txtFileCategory -> {
                printStream.printf("[%s]%n", txtFileCategory.getId());
                txtFileCategory.getTxtFileLines().forEach(txtFileLine -> {
                    printStream.print(txtFileLine.getKey());
                    printStream.print("=");
                    printStream.print(txtFileLine.getValues().stream().map(Object::toString).collect(Collectors.joining(",")));
                    printStream.println();
                });
            });
        }
    }
}
