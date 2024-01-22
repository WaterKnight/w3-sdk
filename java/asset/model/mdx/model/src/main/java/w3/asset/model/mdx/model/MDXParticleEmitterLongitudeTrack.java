package w3.asset.model.mdx.model;

public class MDXParticleEmitterLongitudeTrack extends MDXTrack<MDXLongitudeTrack.Longitude> {
    public static class Longitude {
        private float value;

        public float getValue() {
            return value;
        }

        public void setValue(float value) {
            this.value = value;
        }
    }
}
