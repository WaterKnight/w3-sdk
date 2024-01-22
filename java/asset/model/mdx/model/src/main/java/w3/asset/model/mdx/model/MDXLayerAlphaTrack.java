package w3.asset.model.mdx.model;

public class MDXLayerAlphaTrack extends MDXTrack<MDXLayerAlphaTrack.Alpha> {
    public static class Alpha {
        private float value;

        public float getValue() {
            return value;
        }

        public void setValue(float value) {
            this.value = value;
        }
    }
}
