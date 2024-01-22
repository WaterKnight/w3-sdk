package w3.asset.imports.imp.impl.std;

import w3.common.core.Format;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class EncodingFormat extends Format<EncodingFormat.Enum> {
    public enum Enum {
        AUTO,
        IMP_0x1,
    }

    public final static EncodingFormat AUTO = new EncodingFormat(Enum.AUTO, -1);
    public final static EncodingFormat IMP_0x1 = new EncodingFormat(Enum.IMP_0x1, 0x1);

    @Nullable
    public static EncodingFormat valueOf(@Nonnull Integer version) {
        return get(EncodingFormat.class, version);
    }

    private EncodingFormat(@Nonnull Enum enumVal, int version) {
        super(enumVal, version);
    }
}
