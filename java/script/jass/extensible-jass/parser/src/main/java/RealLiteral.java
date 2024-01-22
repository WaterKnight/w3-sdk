public class RealLiteral extends Literal {
    private double value;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public RealLiteral() {
    }

    public RealLiteral(double value) {
        this.value = value;
    }
}
