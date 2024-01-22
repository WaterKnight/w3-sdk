package w3.common.slk.model;

import w3.common.core.DataType;
import w3.common.core.FieldId;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class SlkField {
    private final FieldId fieldId;

    public FieldId getFieldId() {
        return fieldId;
    }

    private final DataType defaultValue;

    @Nullable
    public DataType getDefaultValue() {
        return defaultValue;
    }

    public SlkField(@Nonnull FieldId fieldId, @Nullable DataType defaultValue) {
        this.fieldId = fieldId;
        this.defaultValue = defaultValue;
    }
}
