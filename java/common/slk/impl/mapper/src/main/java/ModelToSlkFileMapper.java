import w3.common.api.Mapper;
import w3.common.core.*;
import w3.common.slk.model.SlkFile;
import w3.common.slk.model.SlkRow;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class ModelToSlkFileMapper<ModelType> implements Mapper<ModelType, SlkFile> {
    @Override
    public SlkFile map(ModelType data) {
        final SlkFile slkFile = new SlkFile();
        try {
            final Optional<Class<?>> objectClassOptional = Arrays.stream(data.getClass().getClasses()).filter(c -> Objects.equals(c.getSimpleName(), "Object")).findFirst();

            objectClassOptional.ifPresent(objectClass -> {
                slkFile.setPrimaryField(FieldId.valueOf(objectClass.getFields()[0].getName()));
            });

            final List<Object> objects = (List<Object>) data.getClass().getMethod("getObjects").invoke(data);

            objects.forEach(object -> {
                final Field[] fields = object.getClass().getFields();
                if (fields.length > 0) {
                    final SlkRow slkRow;
                    try {
                        slkRow = slkFile.addRow((Id) fields[0].get(object));
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                    for (final Field field : fields) {
                        Object value = null;
                        try {
                            value = field.get(object);
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException("cannot get value for " + field.getName(), e);
                        }
                        if (value instanceof List) {
                            final List listValue = new DataList<>(Id.class);
                            listValue.addAll((List) value);
                            value = listValue;
                        }
                        try {
                            slkRow.set(FieldId.valueOf(field.getName()), (DataType) value);
                        } catch (ClassCastException e) {
                            throw new RuntimeException("cannot cast " + value + " for field " + field.getName(), e);
                        }
                    }
                }
            });

            return slkFile;
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
