package w3.asset.model.mdx.model;

public class MDXParticleEmitter2SpeedTrack extends MDXTrack<MDXParticleEmitter2SpeedTrack.Speed> {
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
