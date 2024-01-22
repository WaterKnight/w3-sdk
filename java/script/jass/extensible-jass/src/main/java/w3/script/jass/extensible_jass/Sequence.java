package w3.script.jass.extensible_jass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Sequence extends JassNonTerminal implements MultiNode {
    private final List<JassNode> children;

    @Override
    public List<JassNode> getChildren() {
        return children;
    }

    public Sequence(JassNode ...nodes) {
        super("meta_sequence");
        children = new ArrayList<>(Arrays.asList(nodes));
    }

    @Override
    public JassNode getContent(ParseContext ctx) {
        throw new RuntimeException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Sequence that = (Sequence) o;
        return Objects.equals(children, that.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), children);
    }
}
