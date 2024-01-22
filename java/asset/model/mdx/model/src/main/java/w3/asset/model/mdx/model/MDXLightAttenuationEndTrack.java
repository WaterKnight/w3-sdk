package w3.asset.model.mdx.model;

public class MDXLightAttenuationEndTrack extends MDXTrack<MDXLightAttenuationEndTrack.Attenuation> {
    public static class Attenuation {
        private float value;

        public float getValue() {
            return value;
        }

        public void setValue(float value) {
            this.value = value;
        }
    }
}
