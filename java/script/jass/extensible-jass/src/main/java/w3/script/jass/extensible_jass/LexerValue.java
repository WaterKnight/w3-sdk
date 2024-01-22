package w3.script.jass.extensible_jass;

public class LexerValue {
    public LexerValue(String value) {
        this.value = value;
    }

    private final String value;

    public String getValue() {
        return value;
    }

    private boolean skipped = false;

    public boolean isSkipped() {
        return skipped;
    }

    public LexerValue setSkipped(boolean skipped) {
        this.skipped = skipped;
        return this;
    }
}
