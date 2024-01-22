package w3.replay.w3g.model;

import w3.common.core.Format;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class EncodingFormat extends Format<EncodingFormat.Enum> {
    public enum Enum {
        AUTO,
        W3G_0x0,
    }

    public final static EncodingFormat AUTO = new EncodingFormat(Enum.AUTO, -1);
    public final static EncodingFormat W3I_0x1F = new EncodingFormat(Enum.W3G_0x0, 0x0);

    @Nullable
    public static EncodingFormat valueOf(@Nonnull Integer version) {
        return get(EncodingFormat.class, version);
    }

    private EncodingFormat(@Nonnull Enum enumVal, int version) {
        super(enumVal, version);
    }
}
