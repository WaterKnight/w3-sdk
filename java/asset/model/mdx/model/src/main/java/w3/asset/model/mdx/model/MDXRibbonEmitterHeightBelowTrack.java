package w3.asset.model.mdx.model;

public class MDXRibbonEmitterHeightBelowTrack extends MDXTrack<MDXRibbonEmitterHeightBelowTrack.HeightBelow> {
    public static class HeightBelow {
        private float value;

        public float getValue() {
            return value;
        }

        public void setValue(float value) {
            this.value = value;
        }
    }
}
