package w3.asset.model.mdx.model;

public class MDXLightAmbientIntensityTrack extends MDXTrack<MDXLightAmbientIntensityTrack.Intensity> {
    public static class Intensity {
        private float value;

        public float getValue() {
            return value;
        }

        public void setValue(float value) {
            this.value = value;
        }
    }
}
