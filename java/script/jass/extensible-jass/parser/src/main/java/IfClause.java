import java.util.List;

public class IfClause {
    private Expr condition;
    private List<Statement> thenClause;

    public Expr getCondition() {
        return condition;
    }

    public void setCondition(Expr condition) {
        this.condition = condition;
    }

    public List<Statement> getThenClause() {
        return thenClause;
    }

    public void setThenClause(List<Statement> thenClause) {
        this.thenClause = thenClause;
    }
}
