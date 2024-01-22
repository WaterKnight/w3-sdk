package w3.asset.model.mdx.model;

public class MDXLightAttenuationStartTrack extends MDXTrack<MDXLightAttenuationStartTrack.Attenuation> {
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
