package w3.common.txt.model;

import w3.common.core.Id;

import java.util.ArrayList;
import java.util.List;

public class TxtFileCategory {
    private final List<TxtFileLine> txtFileLines = new ArrayList<>();

    public List<TxtFileLine> getTxtFileLines() {
        return txtFileLines;
    }

    private Id id;

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }
}
