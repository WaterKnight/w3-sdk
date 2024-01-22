package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXVertexGroupChunk implements MDXChunk {
    @Override
    public Id getToken() {
        return Id.valueOf("GNDX");
    }

    private List<MDXVertexGroup> vertexGroups;

    public List<MDXVertexGroup> getVertexGroups() {
        return vertexGroups;
    }

    public void setVertexGroups(List<MDXVertexGroup> vertexGroups) {
        this.vertexGroups = vertexGroups;
    }
}
