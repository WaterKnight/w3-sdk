package w3.strings.color;

import w3.common.api.Mapper;

import static w3.strings.common.StringUtil.padLeft;

public class RGBAToHexMapper implements Mapper<RGBA, String> {
    @Override
    public String map(RGBA data) {
        return toHexComponent((int) data.getRed()) + toHexComponent((int) data.getGreen()) + toHexComponent((int) data.getBlue());
    }

    public static String toHexComponent(int value) {
        return padLeft(Integer.toHexString(value), 2, '0');
    }
}
