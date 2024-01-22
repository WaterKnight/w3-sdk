public class GlobalVar {
    private String type;
    private String name;
    private boolean isArray;
    private String value;

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public boolean isArray() {
        return isArray;
    }

    public String getValue() {
        return value;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArray(boolean array) {
        isArray = array;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public GlobalVar() {
    }
}
