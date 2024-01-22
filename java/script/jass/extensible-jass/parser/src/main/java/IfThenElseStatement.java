import java.util.ArrayList;
import java.util.List;

public class IfThenElseStatement extends Statement {
    private IfClause ifClause;
    private List<IfClause> elseifClauses = new ArrayList<>();
    private List<Statement> elseClause = new ArrayList<>();

    public IfClause getIfClause() {
        return ifClause;
    }

    public void setIfClause(IfClause ifClause) {
        this.ifClause = ifClause;
    }

    public List<IfClause> getElseifClauses() {
        return elseifClauses;
    }

    public void setElseifClauses(List<IfClause> elseifClauses) {
        this.elseifClauses = elseifClauses;
    }

    public List<Statement> getElseClause() {
        return elseClause;
    }

    public void setElseClause(List<Statement> elseClause) {
        this.elseClause = elseClause;
    }
}
