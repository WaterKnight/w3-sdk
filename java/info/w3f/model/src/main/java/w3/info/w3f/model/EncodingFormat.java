package w3.info.w3f.model;

import w3.common.core.Format;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class EncodingFormat extends Format<EncodingFormat.Enum> {
    public enum Enum {
        AUTO,
        W3F_0x1
    }

    public final static EncodingFormat AUTO = new EncodingFormat(Enum.AUTO, -1);
    public final static EncodingFormat W3F_0x1 = new EncodingFormat(Enum.W3F_0x1, 0x1);

    @Nullable
    public static EncodingFormat valueOf(@Nonnull Integer version) {
        return get(EncodingFormat.class, version);
    }

    private EncodingFormat(@Nonnull Enum enumVal, int version) {
        super(enumVal, version);
    }
}
