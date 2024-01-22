package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

public class NativeFunc extends JassNonTerminal {
    public NativeFunc() {
        super("native_func");
    }

    public final static JassTerminal CONSTANT = new JassTerminal("CONSTANT") {
        @Override
        public LexerValue getLexerValue(ParseContext ctx) {
            return new Keyword("constant");
        }
    };

    public final static JassTerminal NATIVE = new JassTerminal("NATIVE") {
        @Override
        public LexerValue getLexerValue(ParseContext ctx) {
            return new Keyword("native");
        }
    };

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new Sequence(
                new OptionalQuantifier(
                        CONSTANT
                ),
                NATIVE,
                new FuncDeclaration()
        );
    }
}
