package w3.script.jass.extensible_jass;

public class Keyword extends LexerValue {
    public Keyword(String value) {
        super(String.format("'%s'", value));
    }
}
