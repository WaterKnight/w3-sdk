package w3.strings.color;

import w3.common.api.Mapper;

import java.util.stream.DoubleStream;

public class RGBAToHSVAMapper implements Mapper<RGBA, HSVA> {
    @Override
    public HSVA map(RGBA rgba) {
        final double red = rgba.getRed();
        final double green = rgba.getGreen();
        final double blue = rgba.getBlue();
        final double alpha = rgba.getAlpha();

        final double red_part = red / 255;
        final double green_part = green / 255;
        final double blue_part = blue / 255;

        final double max_part = DoubleStream.of(red_part, green_part, blue_part).max().getAsDouble();
        final double min_part = DoubleStream.of(red_part, green_part, blue_part).min().getAsDouble();

        final double delta = max_part - min_part;

        double hue;

        if (delta == 0) {
            hue = 0;
        } else if (max_part == red_part) {
            hue = 60 * ((green_part - blue_part) / delta % 6);
        } else if (max_part == green_part) {
            hue = 60 * ((blue_part - red_part) / delta + 2);
        } else if (max_part == blue_part) {
            hue = 60 * ((red_part - green_part) / delta + 4);
        } else {
            hue = 0;
        }

        double saturation;

        if (max_part == 0) {
            saturation = 0;
        } else {
            saturation = delta / max_part;
        }

        final double value = max_part;

        return new HSVA(hue, saturation, value, alpha);
    }
}
