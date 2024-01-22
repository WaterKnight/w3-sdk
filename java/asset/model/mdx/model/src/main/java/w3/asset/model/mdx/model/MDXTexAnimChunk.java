package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXTexAnimChunk implements MDXChunk {
    @Override
    public Id getToken() {
        return Id.valueOf("TXAN");
    }

    private List<MDXTexAnim> texAnims;

    public List<MDXTexAnim> getTexAnims() {
        return texAnims;
    }

    public void setTexAnims(List<MDXTexAnim> texAnims) {
        this.texAnims = texAnims;
    }
}
