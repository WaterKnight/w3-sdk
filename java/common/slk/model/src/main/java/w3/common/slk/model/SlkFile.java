package w3.common.slk.model;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.*;

import w3.common.core.DataType;
import w3.common.core.FieldId;
import w3.common.core.Id;

public class SlkFile {
    public SlkFile() {
    }

    private final Map<FieldId, SlkField> fields = new LinkedHashMap<>();

    @Nullable
    public FieldId getPrimaryField() {
        return primaryField;
    }

    private FieldId primaryField = null;

    @Nonnull
    public Map<FieldId, SlkField> getFields() {
        return fields;
    }

    public boolean containsField(@Nonnull FieldId field) {
        return fields.containsKey(field);
    }

    public void addField(@Nonnull FieldId fieldId, @Nullable DataType defVal) {
        final SlkField field = new SlkField(fieldId, defVal);

        fields.putIfAbsent(fieldId, field);

        if (primaryField == null) {
            primaryField = fieldId;
        }
    }

    public void addField(@Nonnull FieldId field) {
        addField(field, null);
    }

    private Map<Id, SlkRow> rowData = new LinkedHashMap<>();

    public Map<Id, SlkRow> getRows() {
        return rowData;
    }

    public SlkRow addRow(final Id id) {
        final SlkRow slkRow = new SlkRow(id);
        rowData.put(id, slkRow);
        return slkRow;
    }

    public void clearFields() {
        fields.clear();
    }

    public void setPrimaryField(FieldId fieldId) {
        primaryField = fieldId;
    }
}
