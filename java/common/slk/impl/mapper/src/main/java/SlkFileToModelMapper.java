import org.modelmapper.ModelMapper;
import w3.common.api.Mapper;
import w3.common.slk.model.SlkFile;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class SlkFileToModelMapper<ModelType> implements Mapper<SlkFile, ModelType> {
    private final Class<ModelType> modelClass;

    public SlkFileToModelMapper(Class<ModelType> modelClass) {
        this.modelClass = modelClass;
    }

    @Override
    public ModelType map(SlkFile data) {
        try {
            final ModelType model = modelClass.getConstructor().newInstance();

            data.getRows().forEach((id, slkRow) -> {
                final Optional<Class<?>> objectClassOptional = Arrays.stream(modelClass.getClasses()).filter(nestedClass -> Objects.equals(nestedClass.getSimpleName(), "Object")).findFirst();

                objectClassOptional.ifPresent(objectClass -> {
                    try {
                        final Object object = objectClass.getConstructor().newInstance();

                        final List<Object> objects = (List<Object>) model.getClass().getMethod("getObjects").invoke(model);
                        objects.add(object);

                        final Field primaryField = object.getClass().getFields()[0];

                        primaryField.set(object, slkRow.getId());

                        slkRow.getValues().forEach((fieldId, value) -> {
                            try {
                                final Field field = object.getClass().getField(fieldId.getValue());
                                final Class<?> fieldType = field.getType();
                                if (fieldType.isAssignableFrom(List.class)) {
                                    final Type elementType = fieldType.getTypeParameters()[0];
                                    final List<Object> listValue = Arrays.stream(value.toString().split(",")).map(s -> new ModelMapper().map(s, elementType)).collect(Collectors.toList());
                                    field.set(object, listValue);
                                } else {
                                    field.set(object, value);
                                }
                            } catch (NoSuchFieldException | IllegalAccessException e) {
                            }
                        });
                    } catch (InstantiationException | NoSuchMethodException | InvocationTargetException |
                             IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                });
            });

            return model;
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
