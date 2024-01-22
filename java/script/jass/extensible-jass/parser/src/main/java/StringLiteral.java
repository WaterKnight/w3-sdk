public class StringLiteral extends Literal {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public StringLiteral() {
    }

    public StringLiteral(String value) {
        this.value = value;
    }
}
