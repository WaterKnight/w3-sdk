package w3.asset.model.mdx.model;

public class MDXRibbonEmitterHeightAboveTrack extends MDXTrack<MDXRibbonEmitterHeightAboveTrack.HeightAbove> {
    public static class HeightAbove {
        private float value;

        public float getValue() {
            return value;
        }

        public void setValue(float value) {
            this.value = value;
        }
    }
}
