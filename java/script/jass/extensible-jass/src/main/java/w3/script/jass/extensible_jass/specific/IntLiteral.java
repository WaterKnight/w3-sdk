package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntLiteral extends JassTerminal {
    public IntLiteral() {
        super("INT");
    }

    @Override
    public LexerValue getLexerValue(ParseContext ctx) {
        return new LexerValue(String.join(" | ", Arrays.asList(
                new DecIntLiteral().getLexerValue(ctx).getValue(),
                new OctIntLiteral().getLexerValue(ctx).getValue(),
                new HexIntLiteral().getLexerValue(ctx).getValue(),
                new IdIntLiteral().getLexerValue(ctx).getValue()
        )));
    }
}
