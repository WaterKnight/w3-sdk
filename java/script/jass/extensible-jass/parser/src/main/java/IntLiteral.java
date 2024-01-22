public class IntLiteral extends Literal {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public IntLiteral() {
    }

    public IntLiteral(int value) {
        this.value = value;
    }
}
