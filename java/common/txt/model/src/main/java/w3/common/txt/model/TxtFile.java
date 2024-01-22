package w3.common.txt.model;

import java.util.ArrayList;
import java.util.List;

public class TxtFile {
    private final List<TxtFileCategory> txtFileCategories = new ArrayList<>();

    public List<TxtFileCategory> getTxtFileCategories() {
        return txtFileCategories;
    }

    private final List<TxtFileLine> txtFileLines = new ArrayList<>();

    public List<TxtFileLine> getTxtFileLines() {
        return txtFileLines;
    }
}
