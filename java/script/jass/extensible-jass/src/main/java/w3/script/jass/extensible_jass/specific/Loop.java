package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

public class Loop extends JassNonTerminal {
    public Loop() {
        super("loop");
    }

    public static JassTerminal LOOP = new JassTerminal("LOOP") {
        @Override
        public LexerValue getLexerValue(ParseContext ctx) {
            return new Keyword("loop");
        }
    };

    public static JassTerminal ENDLOOP = new JassTerminal("ENDLOOP") {
        @Override
        public LexerValue getLexerValue(ParseContext ctx) {
            return new Keyword("endloop");
        }
    };

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new Sequence(
                LOOP,
                new PlusQuantifier(new NewLines()),
                new StatementList(),
                ENDLOOP
        );
    }
}
