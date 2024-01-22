package w3.asset.model.mdx.model;

public class MDXLayerTextureTrack extends MDXTrack<MDXLayerTextureTrack.Texture> {
    public static class Texture {
        private long textureId;

        public long getTextureId() {
            return textureId;
        }

        public void setTextureId(long textureId) {
            this.textureId = textureId;
        }
    }
}
