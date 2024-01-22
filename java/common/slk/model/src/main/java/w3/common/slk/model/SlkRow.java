package w3.common.slk.model;

import w3.common.core.DataType;
import w3.common.core.FieldId;
import w3.common.core.Id;

import javax.annotation.Nonnull;
import java.util.LinkedHashMap;
import java.util.Map;

public class SlkRow {
    public SlkRow(@Nonnull Id id) {
        this.id = id;
    }

    private final Map<FieldId, DataType> values = new LinkedHashMap<>();

    @Nonnull
    public Map<FieldId, DataType> getValues() {
        return values;
    }

    public boolean contains(@Nonnull FieldId field) {
        return values.containsKey(field);
    }

    public DataType get(@Nonnull FieldId field) {
        return values.get(field);
    }

    public DataType get(@Nonnull FieldId field, @Nonnull DataType defVal) {
        if (!values.containsKey(field)) {
            return defVal;
        }

        return values.get(field);
    }

    public DataType get(@Nonnull String fieldS) {
        return get(FieldId.valueOf(fieldS));
    }

    public String getString(@Nonnull FieldId field) {
        if (!contains(field)) return null;

        return get(field).toString();
    }

    public void set(@Nonnull FieldId fieldId, DataType val) {
        values.put(fieldId, val);
    }

    public void remove(@Nonnull FieldId fieldId) {
        values.remove(fieldId);
    }

    public void clear() {
        values.clear();
    }

    private final Id id;

    @Nonnull
    public Id getId() {
        return id;
    }

    @Override
    public String toString() {
        return values.toString();
    }
}
