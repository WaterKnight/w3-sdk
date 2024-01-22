public class UnaryExpr extends Expr {
    private String operator;
    private Expr content;

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Expr getContent() {
        return content;
    }

    public void setContent(Expr content) {
        this.content = content;
    }
}
