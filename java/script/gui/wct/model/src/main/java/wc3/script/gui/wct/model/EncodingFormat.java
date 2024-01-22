package wc3.script.gui.wct.model;

import w3.common.core.Format;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class EncodingFormat extends Format<EncodingFormat.Enum> {
    public enum Enum {
        AUTO,
        WCT_0x0,
        WCT_0x1,
    }

    public final static EncodingFormat AUTO = new EncodingFormat(Enum.AUTO, -1);
    public final static EncodingFormat WCT_0x0 = new EncodingFormat(Enum.WCT_0x0, 0x0);
    public final static EncodingFormat WCT_0x1 = new EncodingFormat(Enum.WCT_0x1, 0x1);

    @Nullable
    public static EncodingFormat valueOf(@Nonnull Integer version) {
        return Format.get(EncodingFormat.class, version);
    }

    private EncodingFormat(@Nonnull Enum enumVal, int version) {
        super(enumVal, version);
    }
}
