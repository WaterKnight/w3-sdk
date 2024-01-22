package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

public class SelectDefaultCaseClause extends JassNonTerminal {
    public SelectDefaultCaseClause() {
        super("default_case_clause");
    }

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new Sequence(
                new JassTerminal("DEFAULT_CASE") {
                    @Override
                    public LexerValue getLexerValue(ParseContext ctx) {
                        return new Keyword("default");
                    }
                },
                new NewLines(),
                new StatementList()
        );
    }
}
