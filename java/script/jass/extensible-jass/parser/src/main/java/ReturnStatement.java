public class ReturnStatement extends Statement {
    private Expr value;

    public Expr getValue() {
        return value;
    }

    public void setValue(Expr value) {
        this.value = value;
    }
}
