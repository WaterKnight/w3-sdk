package w3.object.common.core;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Map;
import w3.common.core.Format;

public class EncodingFormat extends Format<EncodingFormat.Enum> {
    public enum Enum {
        AUTO,
        AS_DEFINED,
        OBJ_0x1,
        OBJ_0x2,
        OBJ_0x3
    }

    private final static Map<Integer, EncodingFormat> _map = new LinkedHashMap<>();

    public final static EncodingFormat AUTO = new EncodingFormat(Enum.AUTO, -1);
    public final static EncodingFormat AS_DEFINED = new EncodingFormat(Enum.AS_DEFINED, null);
    public final static EncodingFormat OBJ_0x1 = new EncodingFormat(Enum.OBJ_0x1, 0x1);
    public final static EncodingFormat OBJ_0x2 = new EncodingFormat(Enum.OBJ_0x2, 0x2);
    public final static EncodingFormat OBJ_0x3 = new EncodingFormat(Enum.OBJ_0x3, 0x3);

    @Nullable
    public static EncodingFormat valueOf(Integer version) {
        return _map.get(version);
    }

    private EncodingFormat(@Nonnull Enum enumVal, @Nullable Integer version) {
        super(enumVal, version);

        if (version != null) {
            _map.put(version, this);
        }
    }
}
