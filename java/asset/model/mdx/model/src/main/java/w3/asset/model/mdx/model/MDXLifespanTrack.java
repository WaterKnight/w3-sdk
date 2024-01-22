package w3.asset.model.mdx.model;

public class MDXLifespanTrack extends MDXTrack<MDXLifespanTrack.Lifespan> {
    public static class Lifespan {
        private float value;

        public float getValue() {
            return value;
        }

        public void setValue(float value) {
            this.value = value;
        }
    }
}
