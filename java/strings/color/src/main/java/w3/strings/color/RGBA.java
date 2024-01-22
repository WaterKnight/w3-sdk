package w3.strings.color;

import java.util.Objects;
import java.util.stream.DoubleStream;

public class RGBA implements Color {
    private final double red;
    private final double green;
    private final double blue;
    private final double alpha;

    public double getRed() {
        return red;
    }

    public double getGreen() {
        return green;
    }

    public double getBlue() {
        return blue;
    }

    public double getAlpha() {
        return alpha;
    }

    public RGBA(double red, double green, double blue, double alpha) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.alpha = alpha;
    }

    public static RGBA fromRGBAHex(String hex_str) {
        final String red_part_str = hex_str.substring(0, 2);
        final String green_part_str = hex_str.substring(2, 4);
        final String blue_part_str = hex_str.substring(4, 6);
        final String alpha_part_str = hex_str.substring(6, 8);
        final int red_part = Integer.parseInt(red_part_str);
        final int green_part = Integer.parseInt(green_part_str);
        final int blue_part = Integer.parseInt(blue_part_str);
        final int alpha_part = Integer.parseInt(alpha_part_str);
        return new RGBA(red_part, green_part, blue_part, alpha_part);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RGBA color = (RGBA) o;
        return red == color.red && green == color.green && blue == color.blue && alpha == color.alpha;
    }

    @Override
    public int hashCode() {
        return Objects.hash(red, green, blue, alpha);
    }
}
