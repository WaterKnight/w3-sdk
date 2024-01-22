package w3.object.collection.mod.w3o.model;

import w3.common.core.Format;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Map;

public class EncodingFormat extends Format<EncodingFormat.Enum> {
    public enum Enum {
        AUTO,
        AS_DEFINED,
        W3O_0x1,
    }

    private final static Map<Integer, EncodingFormat> _map = new LinkedHashMap<>();

    public final static EncodingFormat AUTO = new EncodingFormat(Enum.AUTO, -1);
    public final static EncodingFormat AS_DEFINED = new EncodingFormat(Enum.AS_DEFINED, null);
    public final static EncodingFormat W3O_0x1 = new EncodingFormat(Enum.W3O_0x1, 0x1);

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
