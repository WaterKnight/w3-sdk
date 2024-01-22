package w3.asset.model.mdx.model;

public class MDXGeosetAnimColorTrack extends MDXTrack<MDXGeosetAnimColorTrack.Color> {
    public static class Color {
        private float blue;
        private float green;
        private float red;

        public float getBlue() {
            return blue;
        }

        public void setBlue(float blue) {
            this.blue = blue;
        }

        public float getGreen() {
            return green;
        }

        public void setGreen(float green) {
            this.green = green;
        }

        public float getRed() {
            return red;
        }

        public void setRed(float red) {
            this.red = red;
        }
    }
}
