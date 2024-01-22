package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

import java.util.Arrays;
import java.util.List;

public class BoolLiteral extends JassTerminal {
    public BoolLiteral() {
        super("BOOL");
    }

    @Override
    public LexerValue getLexerValue(ParseContext ctx) {
        return new LexerValue(String.join(
                " | ",
                new True().getLexerValue(ctx).getValue(),
                new False().getLexerValue(ctx).getValue()
        ));
    }
}
