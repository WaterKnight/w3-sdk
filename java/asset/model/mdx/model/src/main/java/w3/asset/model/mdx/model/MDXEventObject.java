package w3.asset.model.mdx.model;

public class MDXEventObject {
    private MDXNode node;

    public MDXNode getNode() {
        return node;
    }

    public void setNode(MDXNode node) {
        this.node = node;
    }

    private MDXChunk chunk;

    public MDXChunk getChunk() {
        return chunk;
    }

    public void setChunk(MDXChunk chunk) {
        this.chunk = chunk;
    }
}
