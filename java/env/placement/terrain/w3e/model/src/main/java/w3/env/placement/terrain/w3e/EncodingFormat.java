package w3.env.placement.terrain.w3e;

import w3.common.core.Format;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class EncodingFormat extends Format<EncodingFormat.Enum> {
    public enum Enum {
        AUTO,
        W3E_0xB,
    }

    public final static EncodingFormat AUTO = new EncodingFormat(Enum.AUTO, null);
    public final static EncodingFormat W3E_0xB = new EncodingFormat(Enum.W3E_0xB, 0xB);

    @Nullable
    public static EncodingFormat valueOf(@Nonnull Integer version) {
        return get(EncodingFormat.class, version);
    }

    private EncodingFormat(@Nonnull Enum enumVal, @Nullable Integer version) {
        super(enumVal, version);
    }
}
