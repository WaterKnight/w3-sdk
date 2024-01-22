package w3.asset.model.mdx.model;

import java.util.List;

public class MDXLayer {
    private long filterMode;
    private long shadingFlags;
    private long textureId;
    private long textureAnimId;
    private long coordId;
    private float alpha;

    private List<MDXTextureTrackChunk> textureTrackChunks;
    private List<MDXLayerAlphaTrackChunk> alphaTrackChunks;

    public long getFilterMode() {
        return filterMode;
    }

    public void setFilterMode(long filterMode) {
        this.filterMode = filterMode;
    }

    public long getShadingFlags() {
        return shadingFlags;
    }

    public void setShadingFlags(long shadingFlags) {
        this.shadingFlags = shadingFlags;
    }

    public long getTextureId() {
        return textureId;
    }

    public void setTextureId(long textureId) {
        this.textureId = textureId;
    }

    public long getTextureAnimId() {
        return textureAnimId;
    }

    public void setTextureAnimId(long textureAnimId) {
        this.textureAnimId = textureAnimId;
    }

    public long getCoordId() {
        return coordId;
    }

    public void setCoordId(long coordId) {
        this.coordId = coordId;
    }

    public float getAlpha() {
        return alpha;
    }

    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }

    public List<MDXTextureTrackChunk> getTextureTrackChunks() {
        return textureTrackChunks;
    }

    public void setTextureTrackChunks(List<MDXTextureTrackChunk> textureTrackChunks) {
        this.textureTrackChunks = textureTrackChunks;
    }

    public List<MDXLayerAlphaTrackChunk> getAlphaTrackChunks() {
        return alphaTrackChunks;
    }

    public void setAlphaTrackChunks(List<MDXLayerAlphaTrackChunk> alphaTrackChunks) {
        this.alphaTrackChunks = alphaTrackChunks;
    }
}
