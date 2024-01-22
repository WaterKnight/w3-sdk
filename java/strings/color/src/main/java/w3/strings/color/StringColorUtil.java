package w3.strings.color;

import static w3.strings.color.RGBAToHexMapper.toHexComponent;

public class StringColorUtil {
    public static String makePrefix(RGBA rgba) {
        return "|c" + toHexComponent((int) rgba.getAlpha()) + toHexComponent((int) rgba.getRed()) + toHexComponent((int) rgba.getGreen()) + toHexComponent((int) rgba.getBlue());
    }

    public static String apply(String str, RGBA rgba) {
        return makePrefix(rgba) + str;
    }

    public static String reset(String str) {
        return str + "|r";
    }
}
