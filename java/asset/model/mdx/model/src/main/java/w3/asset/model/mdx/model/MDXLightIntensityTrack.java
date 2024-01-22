package w3.asset.model.mdx.model;

public class MDXLightIntensityTrack extends MDXTrack<MDXLightIntensityTrack.Intensity> {
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
