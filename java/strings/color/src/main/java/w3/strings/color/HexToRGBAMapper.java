package w3.strings.color;

import w3.common.api.Mapper;

import static w3.strings.common.StringUtil.padLeft;

public class HexToRGBAMapper implements Mapper<String, RGBA> {
    @Override
    public RGBA map(String data) {
        return new RGBA(
                fromHexComponent(data.substring(0, 2)),
                fromHexComponent(data.substring(2, 4)),
                fromHexComponent(data.substring(4, 6)),
                fromHexComponent(data.substring(6, 8))
        );
    }

    public static int fromHexComponent(String value) {
        return Integer.parseInt(value, 16);
    }
}
