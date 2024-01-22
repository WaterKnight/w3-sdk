package w3.asset.model.mdx.model;

public class MDXParticleEmitterVisibilityTrack extends MDXTrack<MDXParticleEmitterVisibilityTrack.Visibility> {
    public static class Visibility {
        private float value;

        public float getValue() {
            return value;
        }

        public void setValue(float value) {
            this.value = value;
        }
    }
}
