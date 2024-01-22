package w3.strings.color;

import java.util.Objects;
import java.util.stream.DoubleStream;

public class HSVA implements Color {
    private final double hue;
    private final double saturation;
    private final double value;
    private final double alpha;

    public double getHue() {
        return hue;
    }

    public double getSaturation() {
        return saturation;
    }

    public double getValue() {
        return value;
    }

    public double getAlpha() {
        return alpha;
    }

    public HSVA(double hue, double saturation, double value, double alpha) {
        this.hue = hue;
        this.saturation = saturation;
        this.value = value;
        this.alpha = alpha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HSVA hsv = (HSVA) o;
        return Double.compare(hsv.hue, hue) == 0 && Double.compare(hsv.saturation, saturation) == 0 && Double.compare(hsv.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hue, saturation, value);
    }
}
