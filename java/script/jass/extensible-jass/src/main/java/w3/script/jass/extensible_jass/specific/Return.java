package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

public class Return extends JassNonTerminal {
    public Return() {
        super("return_statement");
    }

    public static JassTerminal RETURN = new JassTerminal("RETURN") {
        @Override
        public LexerValue getLexerValue(ParseContext ctx) {
            return new Keyword("return");
        }
    };

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new Sequence(
                RETURN,
                new OptionalQuantifier(new Expr())
        );
    }
}
