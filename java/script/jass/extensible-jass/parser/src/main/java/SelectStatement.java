import java.util.ArrayList;
import java.util.List;

public class SelectStatement extends Statement {
    private Expr discriminator;
    private List<CaseClause> caseClauses = new ArrayList<>();
    private DefaultClause defaultClause;

    public Expr getDiscriminator() {
        return discriminator;
    }

    public void setDiscriminator(Expr discriminator) {
        this.discriminator = discriminator;
    }

    public List<CaseClause> getCaseClauses() {
        return caseClauses;
    }

    public void setCaseClauses(List<CaseClause> caseClauses) {
        this.caseClauses = caseClauses;
    }

    public DefaultClause getDefaultClause() {
        return defaultClause;
    }

    public void setDefaultClause(DefaultClause defaultClause) {
        this.defaultClause = defaultClause;
    }
}
