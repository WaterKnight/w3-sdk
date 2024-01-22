package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

public class Func extends JassNonTerminal {
    public Func() {
        super("func");
    }

    public final static JassTerminal CONSTANT = new JassTerminal("CONSTANT") {
        @Override
        public LexerValue getLexerValue(ParseContext ctx) {
            return new Keyword("constant");
        }
    };

    public final static JassTerminal ENDFUNCTION = new JassTerminal("ENDFUNCTION") {
        @Override
        public LexerValue getLexerValue(ParseContext ctx) {
            return new Keyword("endfunction");
        }
    };

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new Sequence(
                new OptionalQuantifier(
                        CONSTANT
                ),
                new Function(),
                new FuncDeclaration(),
                new NewLines(),
                new LocalVarList(),
                new StatementList(),
                ENDFUNCTION,
                new NewLines()
        );
    }
}
