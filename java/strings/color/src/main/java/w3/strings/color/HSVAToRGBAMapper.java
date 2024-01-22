package w3.strings.color;

import w3.common.api.Mapper;

public class HSVAToRGBAMapper implements Mapper<HSVA, RGBA> {
    @Override
    public RGBA map(HSVA hsva) {
        final double hue = hsva.getHue();
        final double saturation = hsva.getSaturation();
        final double value = hsva.getValue();
        final double alpha = hsva.getAlpha();

        final double c = value * saturation;
        final double x = c * (1 - Math.abs(hue / 60) % 2 - 1);
        final double m = value - c;

        double red_part;
        double green_part;
        double blue_part;

        if (hue < 60) {
            red_part = c;
            green_part = x;
            blue_part = 0;
        } else if (hue < 120) {
            red_part = x;
            green_part = c;
            blue_part = 0;
        } else if (hue < 180) {
            red_part = 0;
            green_part = c;
            blue_part = x;
        } else if (hue < 240) {
            red_part = 0;
            green_part = x;
            blue_part = c;
        } else if (hue < 300) {
            red_part = x;
            green_part = 0;
            blue_part = c;
        } else {
            red_part = c;
            green_part = 0;
            blue_part = x;
        }

        final double red = (red_part + m) * 255;
        final double green = (green_part + m) * 255;
        final double blue = (blue_part + m) * 255;

        return new RGBA(red, green, blue, alpha);
    }
}
