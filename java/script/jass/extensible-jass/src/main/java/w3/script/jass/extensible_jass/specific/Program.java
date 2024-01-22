package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

import java.util.Arrays;
import java.util.List;

public class Program extends JassNonTerminal {
    public Program() {
        super("program");
    }

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new PlusQuantifier(
                new File()
        );
    }
}
