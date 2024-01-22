package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXTextureChunk implements MDXChunk {
    @Override
    public Id getToken() {
        return Id.valueOf("TEXS");
    }

    private List<MDXTexture> textures;

    public List<MDXTexture> getTextures() {
        return textures;
    }

    public void setTextures(List<MDXTexture> textures) {
        this.textures = textures;
    }
}
