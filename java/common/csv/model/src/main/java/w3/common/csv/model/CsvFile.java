package w3.common.csv.model;

import java.util.ArrayList;
import java.util.List;

public class CsvFile {
    private final List<CsvRow> rows;

    public List<CsvRow> getRows() {
        return rows;
    }

    public CsvFile() {
        this.rows = new ArrayList<>();
    }
}
