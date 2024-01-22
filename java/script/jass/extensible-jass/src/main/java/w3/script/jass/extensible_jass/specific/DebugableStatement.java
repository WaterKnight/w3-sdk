package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.JassNode;
import w3.script.jass.extensible_jass.JassNonTerminal;
import w3.script.jass.extensible_jass.ParseContext;

public class DebugableStatement extends JassNonTerminal {
    public DebugableStatement() {
        super("debugable_statement");
    }

    @Override
    public JassNode getContent(ParseContext ctx) {
        return null;
    }
}
