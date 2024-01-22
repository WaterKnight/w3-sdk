package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

import java.util.Arrays;

public class UnaryOp extends JassNonTerminal {
    public UnaryOp() {
        super("unary_op");
    }

    public static JassTerminal UNARY_OP = new JassTerminal("UNARY_OP") {
        @Override
        public LexerValue getLexerValue(ParseContext ctx) {
            return new LexerValue(String.join(" | ", Arrays.asList(
                    new PlusOp().getLexerValue(ctx).getValue(),
                    new MinusOp().getLexerValue(ctx).getValue(),
                    new NotOp().getLexerValue(ctx).getValue()
            )));
        }
    };

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new Sequence(
                UNARY_OP,
                new Expr()
        );
    }
}
