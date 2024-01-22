package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

import java.util.Arrays;
import java.util.List;

public class ParamList extends JassNonTerminal {
    public ParamList() {
        super("param_list");
    }

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new Sequence(
                new Type(),
                new Id(),
                new OptionalQuantifier(
                        new Sequence(
                            new Comma(),
                            new Type(),
                            new Id()
                        )
                )
        );
    }
}
