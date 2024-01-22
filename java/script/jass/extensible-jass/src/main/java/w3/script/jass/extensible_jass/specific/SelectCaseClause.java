package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

public class SelectCaseClause extends JassNonTerminal {
    public SelectCaseClause() {
        super("case_clause");
    }

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new Sequence(
                new JassTerminal("CASE") {
                    @Override
                    public LexerValue getLexerValue(ParseContext ctx) {
                        return new Keyword("case");
                    }
                },
                new Expr(),
                new NewLines(),
                new StatementList()
        );
    }
}
