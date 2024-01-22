package w3.script.gui.wtg.model;

import w3.common.core.Format;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class EncodingFormat extends Format<EncodingFormat.Enum> {
    public enum Enum {
        AUTO,
        WTG_0x4,
        WTG_0x7
    }

    public final static EncodingFormat AUTO = new EncodingFormat(Enum.AUTO, -1);
    public final static EncodingFormat WTG_0x4 = new EncodingFormat(Enum.WTG_0x4, 0x4);
    public final static EncodingFormat WTG_0x7 = new EncodingFormat(Enum.WTG_0x7, 0x7);

    @Nullable
    public static EncodingFormat valueOf(@Nonnull Integer version) {
        return get(EncodingFormat.class, version);
    }

    private EncodingFormat(@Nonnull Enum enumVal, int version) {
        super(enumVal, version);
    }
}
