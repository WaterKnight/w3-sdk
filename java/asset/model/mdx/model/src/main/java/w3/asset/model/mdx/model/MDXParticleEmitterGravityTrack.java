package w3.asset.model.mdx.model;

public class MDXParticleEmitterGravityTrack extends MDXTrack<ParticleEmitterMDXGravityTrack.Gravity> {
    public static class Gravity {
        private float value;

        public float getValue() {
            return value;
        }

        public void setValue(float value) {
            this.value = value;
        }
    }
}
