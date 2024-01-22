package w3.asset.model.mdx.model;

import java.util.List;

public class MDXGeosetAnim {
    private float alpha;
    private long flags;
    private Color color;
    private long geosetId;

    private List<MDXChunk> chunks;

    public float getAlpha() {
        return alpha;
    }

    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }

    public long getFlags() {
        return flags;
    }

    public void setFlags(long flags) {
        this.flags = flags;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public long getGeosetId() {
        return geosetId;
    }

    public void setGeosetId(long geosetId) {
        this.geosetId = geosetId;
    }

    public List<MDXChunk> getChunks() {
        return chunks;
    }

    public void setChunks(List<MDXChunk> chunks) {
        this.chunks = chunks;
    }

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
