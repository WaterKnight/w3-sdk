package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

public class Select extends JassNonTerminal {
    public Select() {
        super("select");
    }

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new Sequence(
                new JassTerminal("SELECT") {
                    @Override
                    public LexerValue getLexerValue(ParseContext ctx) {
                        return new Keyword("select");
                    }
                },
                new Expr(),
                new NewLines(),
                new StarQuantifier(new SelectCaseClause()),
                new OptionalQuantifier(new SelectDefaultCaseClause()),
                new NewLines(),
                new JassTerminal("ENDSELECT") {
                    @Override
                    public LexerValue getLexerValue(ParseContext ctx) {
                        return new Keyword("endselect");
                    }
                }
        );
    }
}
