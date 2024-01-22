public class BoolLiteral extends Literal {
    private boolean value;

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public BoolLiteral() {
    }

    public BoolLiteral(boolean value) {
        this.value = value;
    }
}
