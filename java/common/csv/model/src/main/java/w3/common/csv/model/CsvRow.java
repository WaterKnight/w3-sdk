package w3.common.csv.model;

import java.util.ArrayList;
import java.util.List;

public class CsvRow {
    private final List<String> elements;

    public List<String> getElements() {
        return elements;
    }

    public String get(int index) {
        if (index < elements.size()) {
            return elements.get(index);
        }
        return null;
    }

    public CsvRow() {
        this.elements = new ArrayList<>();
    }
}
