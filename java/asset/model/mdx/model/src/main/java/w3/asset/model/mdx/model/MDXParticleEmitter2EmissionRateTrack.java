package w3.asset.model.mdx.model;

public class MDXParticleEmitter2EmissionRateTrack extends MDXTrack<MDXParticleEmitter2EmissionRateTrack.EmissionRate> {
    public static class EmissionRate {
        private float value;

        public float getValue() {
            return value;
        }

        public void setValue(float value) {
            this.value = value;
        }
    }
}
