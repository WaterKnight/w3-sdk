package w3.asset.model.mdx.model;

public class MDXLightVisibilityTrack implements MDXTrack<MDXLightVisibilityTrack.LightVisibility> {
    public static class LightVisibility {
        private float value;

        public float getValue() {
            return value;
        }

        public void setValue(float value) {
            this.value = value;
        }
    }
}
