package w3.asset.model.mdx.model;

import w3.common.core.Format;

import javax.annotation.Nonnull;
import java.util.LinkedHashMap;
import java.util.Map;

public class EncodingFormat extends Format<EncodingFormat.Enum> {
    public enum Enum {
        AUTO,
        MDX_0x0
    }

    private static Map<Integer, EncodingFormat> _map = new LinkedHashMap<>();

    public final static EncodingFormat AUTO = new EncodingFormat(Enum.AUTO, -1);
    public final static EncodingFormat MDX_0x0 = new EncodingFormat(Enum.MDX_0x0, 0x0);

    public static EncodingFormat valueOf(int version) {
        return _map.get(version);
    }

    private EncodingFormat(@Nonnull Enum enumVal, int version) {
        super(enumVal, version);

        _map.put(version, this);
    }
}
