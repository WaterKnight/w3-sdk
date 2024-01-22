package w3.asset.model.mdx.model;

public class MDXParticleEmitter2GravityTrack extends MDXTrack<MDXParticleEmitter2GravityTrack.Gravity> {
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
