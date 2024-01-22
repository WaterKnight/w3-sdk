package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

import java.util.Arrays;
import java.util.List;

public class StatementList extends JassNonTerminal {
    public StatementList() {
        super("statement_list");
    }

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new StarQuantifier(
                    new Sequence(
                    new Statement(),
                    new NewLines()
                )
        );
    }
}
