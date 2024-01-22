package w3.script.jass.extensible_jass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Alternative extends JassNonTerminal implements MultiNode {
    private final List<JassNode> children;

    @Override
    public List<JassNode> getChildren() {
        return children;
    }

    public Alternative(JassNode ...nodes) {
        super("meta_alternative");
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
        Alternative that = (Alternative) o;
        return Objects.equals(children, that.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), children);
    }
}
