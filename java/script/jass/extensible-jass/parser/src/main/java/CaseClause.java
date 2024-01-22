import java.util.ArrayList;
import java.util.List;

public class CaseClause {
    private Expr matchingExpr;
    private List<Statement> statements = new ArrayList<>();

    public Expr getMatchingExpr() {
        return matchingExpr;
    }

    public void setMatchingExpr(Expr matchingExpr) {
        this.matchingExpr = matchingExpr;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }
}
