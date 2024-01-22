package w3.asset.model.mdx.model;

public class MDXParticleEmitterLatitudeTrack extends MDXTrack<MDXParticleEmitterLatitudeTrack.Latitude> {
    public static class Latitude {
        private float value;

        public float getValue() {
            return value;
        }

        public void setValue(float value) {
            this.value = value;
        }
    }
}
