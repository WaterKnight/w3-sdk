package w3.asset.model.mdx.model;

public class MDXTextureTrack extends MDXTrack<MDXTextureTrack.Texture> {
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
