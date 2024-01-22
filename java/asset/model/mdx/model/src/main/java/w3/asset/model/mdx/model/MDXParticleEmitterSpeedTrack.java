package w3.asset.model.mdx.model;

public class MDXParticleEmitterSpeedTrack extends MDXTrack<MDXParticleEmitterSpeedTrack.Speed> {
    public static class Speed {
        private float value;

        public float getValue() {
            return value;
        }

        public void setValue(float value) {
            this.value = value;
        }
    }
}
