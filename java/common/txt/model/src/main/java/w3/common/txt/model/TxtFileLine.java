package w3.common.txt.model;

import java.util.List;

public class TxtFileLine {
    private String key;
    private List<Object> values;

    public TxtFileLine(String key, List<Object> values) {
        this.key = key;
        this.values = values;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<Object> getValues() {
        return values;
    }

    public void setValues(List<Object> values) {
        this.values = values;
    }
}
