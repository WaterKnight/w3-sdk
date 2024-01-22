package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXTexCoordSet implements MDXChunk {
    @Override
    public Id getToken() {
        return Id.valueOf("UVBS");
    }

    private List<MDXTexCoord> texCoords;

    public List<MDXTexCoord> getTexCoords() {
        return texCoords;
    }

    public void setTexCoords(List<MDXTexCoord> texCoords) {
        this.texCoords = texCoords;
    }
}
