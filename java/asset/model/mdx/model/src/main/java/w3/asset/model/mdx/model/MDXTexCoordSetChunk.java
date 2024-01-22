package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXTexCoordSetChunk implements MDXChunk {
    @Override
    public Id getToken() {
        return Id.valueOf("UVAS");
    }

    private List<MDXTexCoordSet> texCoordSets;

    public List<MDXTexCoordSet> getTexCoordSets() {
        return texCoordSets;
    }

    public void setTexCoordSets(List<MDXTexCoordSet> texCoordSets) {
        this.texCoordSets = texCoordSets;
    }
}
