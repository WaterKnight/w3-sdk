package w3.asset.model.mdx.model;

public class MDXCameraRotationTrack extends MDXTrack<MDXCameraRotationTrack.Quaternion> {
    public static class Quaternion {
        private float x;
        private float y;
        private float z;
        private float a;

        public float getX() {
            return x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }

        public float getZ() {
            return z;
        }

        public void setZ(float z) {
            this.z = z;
        }

        public float getA() {
            return a;
        }

        public void setA(float a) {
            this.a = a;
        }
    }
}
