package w3.common.csv.impl.std;

import w3.common.csv.api.CsvFileSerializer;
import w3.common.csv.model.CsvFile;
import w3.common.csv.model.CsvRow;

import java.io.BufferedWriter;
import java.io.IOException;

public class StdCsvFileSerializer implements CsvFileSerializer {
    private final BufferedWriter writer;
    private final String delimiter;

    public StdCsvFileSerializer(BufferedWriter writer, String delimiter) {
        this.writer = writer;
        this.delimiter = delimiter;
    }

    @Override
    public void serialize(CsvFile data) {
        data.getRows().forEach(row -> {
            try {
                write(data);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private void write(CsvFile data) throws IOException {
        for (final CsvRow row : data.getRows()) {
            writer.write(String.join(delimiter, row.getElements()));
        }
        ;
    }
}
