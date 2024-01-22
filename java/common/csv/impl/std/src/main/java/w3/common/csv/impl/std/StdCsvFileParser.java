package w3.common.csv.impl.std;

import w3.common.csv.api.CsvFileParser;
import w3.common.csv.model.CsvFile;
import w3.common.csv.model.CsvRow;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StdCsvFileParser implements CsvFileParser {
    private final InputStream inputStream;
    private final String delimiter;

    public StdCsvFileParser(InputStream inputStream, String delimiter) {
        this.inputStream = inputStream;
        this.delimiter = delimiter;
    }

    @Override
    public CsvFile parse() {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));

        CsvFile csvFile = new CsvFile();

        reader.lines().forEach(line -> {
            final CsvRow row = new CsvRow();
            Arrays.stream(line.split(delimiter)).forEach(element -> {
                row.getElements().add(element);
            });
            csvFile.getRows().add(row);
        });

        return csvFile;
    }
}
