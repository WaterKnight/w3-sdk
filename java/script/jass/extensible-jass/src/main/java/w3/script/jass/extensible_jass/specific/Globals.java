package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

public class Globals extends JassNonTerminal {
    public Globals() {
        super("globals");
    }

    public static JassTerminal GLOBALS = new JassTerminal("GLOBALS") {
        @Override
        public LexerValue getLexerValue(ParseContext ctx) {
            return new Keyword("globals");
        }
    };

    public static JassTerminal ENDGLOBALS = new JassTerminal("ENDGLOBALS") {
        @Override
        public LexerValue getLexerValue(ParseContext ctx) {
            return new Keyword("endglobals");
        }
    };

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new Sequence(
                GLOBALS,
                new NewLines(),
                new GlobalVarList(),
                ENDGLOBALS
        );
    }
}
