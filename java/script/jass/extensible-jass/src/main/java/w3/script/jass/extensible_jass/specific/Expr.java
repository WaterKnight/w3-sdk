package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

import java.util.Arrays;
import java.util.List;

public class Expr extends JassNonTerminal {
    public Expr() {
        super("expr");
    }

    public final static JassTerminal BINARY_OP = new JassTerminal("BINARY_OP") {
        @Override
        public LexerValue getLexerValue(ParseContext ctx) {
            return new LexerValue(String.join(
                    " | ",
                    new PlusOp().getLexerValue(ctx).getValue(),
                    new MinusOp().getLexerValue(ctx).getValue(),
                    new MultOp().getLexerValue(ctx).getValue(),
                    new DivOp().getLexerValue(ctx).getValue(),
                    new EqualityOp().getLexerValue(ctx).getValue(),
                    new InequalityOp().getLexerValue(ctx).getValue(),
                    new GreaterOp().getLexerValue(ctx).getValue(),
                    new GreaterEqualOp().getLexerValue(ctx).getValue(),
                    new LessOp().getLexerValue(ctx).getValue(),
                    new LessEqualOp().getLexerValue(ctx).getValue(),
                    new AndOp().getLexerValue(ctx).getValue(),
                    new OrOp().getLexerValue(ctx).getValue()
            ));
        }
    };

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new Sequence(
                new AtomicExpr(),
                new OptionalQuantifier(
                        new Sequence(
                            BINARY_OP,
                            new Expr()
                        )
                ),
                new Sequence(
                        new ParensLeft(),
                        new Expr(),
                        new ParensRight()
                )
        );
    }
}
