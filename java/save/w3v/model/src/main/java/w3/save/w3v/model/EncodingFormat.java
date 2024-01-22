package w3.save.w3v.model;

import w3.common.core.Format;

import javax.annotation.Nonnull;
import java.util.LinkedHashMap;
import java.util.Map;

public class EncodingFormat extends Format<EncodingFormat.Enum> {
    public enum Enum {
        AUTO,
        W3V_0x1
    }

    static Map<Integer, EncodingFormat> _map = new LinkedHashMap<>();

    public final static EncodingFormat AUTO = new EncodingFormat(Enum.AUTO, -1);
    public final static EncodingFormat W3V_0x1 = new EncodingFormat(Enum.W3V_0x1, 0x1);

    public static EncodingFormat valueOf(@Nonnull Integer version) {
        return _map.get(version);
    }

    private EncodingFormat(Enum enumVal, int version) {
        super(enumVal, version);

        _map.put(version, this);
    }
}
