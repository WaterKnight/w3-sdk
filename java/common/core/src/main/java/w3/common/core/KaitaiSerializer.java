package w3.common.core;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import w3.common.core.app.War3String;

public class KaitaiSerializer {
    public static byte[] serializeBinary(Object data, ObjectMapper objectMapper) throws IOException {
        SimpleBeanPropertyFilter theFilter = SimpleBeanPropertyFilter
                .serializeAllExcept("_io", "_parent", "_root");
        FilterProvider filters = new SimpleFilterProvider()
                .addFilter("myFilter", theFilter);

        final ByteArrayOutputStream bos = new ByteArrayOutputStream();

        objectMapper.addMixIn(DataType.class, DataTypeMixin.class);
        objectMapper.registerModule(new SimpleModule().addSerializer(new StdSerializer<>(War3String.class) {
            @Override
            public void serialize(War3String war3String, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
                jsonGenerator.writeString(war3String.getValue());
            }
        }));
        objectMapper.registerModule(new SimpleModule().addSerializer(new StdSerializer<>(Id.class) {
            @Override
            public void serialize(Id id, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
                jsonGenerator.writeString(id.getValue());
            }
        }));

        objectMapper
                .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
                .setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY)
                //.setVisibility(PropertyAccessor.GETTER, JsonAutoDetect.Visibility.PUBLIC_ONLY)
                .setAnnotationIntrospector(new JacksonAnnotationIntrospector(){
                    @Override
                    public boolean hasIgnoreMarker(final AnnotatedMember m) {
                        final List<String> exclusions = Arrays.asList("_io", "_parent", "_root");
                        return exclusions.contains(m.getName()) || m.getName().startsWith("_raw") || super.hasIgnoreMarker(m);
                    }
                })
                .writer(filters)
                .writeValue(bos, data);

        return bos.toByteArray();
    }

    public static byte[] serializeBinary(Object data) throws IOException {
        return serializeBinary(data, new ObjectMapper());
    }

    public static String serialize(Object data, ObjectMapper objectMapper) throws IOException {
        SimpleBeanPropertyFilter theFilter = SimpleBeanPropertyFilter
                .serializeAllExcept("_io", "_parent", "_root");
        FilterProvider filters = new SimpleFilterProvider()
                .addFilter("myFilter", theFilter);

        final ByteArrayOutputStream bos = new ByteArrayOutputStream();

        objectMapper.addMixIn(DataType.class, DataTypeMixin.class);
        objectMapper.setVisibility(
                objectMapper.getSerializationConfig().getDefaultVisibilityChecker()
                        .withFieldVisibility(JsonAutoDetect.Visibility.NONE)
                        .withGetterVisibility(JsonAutoDetect.Visibility.PUBLIC_ONLY)
        );
        objectMapper.registerModule(new SimpleModule().addSerializer(new StdSerializer<>(War3String.class) {
            @Override
            public void serialize(War3String war3String, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
                jsonGenerator.writeString(war3String.getValue());
            }
        }));
        objectMapper.registerModule(new SimpleModule().addSerializer(new StdSerializer<>(Id.class) {
            @Override
            public void serialize(Id id, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
                jsonGenerator.writeString(id.getValue());
            }
        }));
        objectMapper.registerModule(new SimpleModule().addSerializer(new StdSerializer<>(Integer.class) {
            @Override
            public void serialize(Integer integer, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
                jsonGenerator.writeNumber(integer);
            }
        }));

        objectMapper
                .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
                .setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY)
                //.setVisibility(PropertyAccessor.GETTER, JsonAutoDetect.Visibility.PUBLIC_ONLY)
                .setAnnotationIntrospector(new JacksonAnnotationIntrospector(){
                    @Override
                    public boolean hasIgnoreMarker(final AnnotatedMember m) {
                        final List<String> exclusions = Arrays.asList("_io", "_parent", "_root");
                        return exclusions.contains(m.getName()) || m.getName().startsWith("_raw") || super.hasIgnoreMarker(m);
                    }
                })
                .writer(filters)
                .writeValue(bos, data);

        return bos.toString(StandardCharsets.UTF_8);
    }

    public static String serialize(Object data) throws IOException {
        return serialize(data, new ObjectMapper());
    }
}
