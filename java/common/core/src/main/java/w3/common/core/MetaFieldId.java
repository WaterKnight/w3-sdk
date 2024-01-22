package w3.common.core;

import javax.annotation.Nonnull;

public class MetaFieldId extends FieldId {
    protected MetaFieldId(@Nonnull String idString) {
        super(idString);
    }

    public static MetaFieldId valueOf(@Nonnull String idString) {
        return new MetaFieldId(idString);
    }

    public static MetaFieldId valueOf(@Nonnull Id id) {
        return valueOf(id.toString());
    }
}
