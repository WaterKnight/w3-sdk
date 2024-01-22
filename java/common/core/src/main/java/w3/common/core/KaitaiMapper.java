package w3.common.core;

import com.fasterxml.jackson.databind.ObjectMapper;
import w3.common.core.app.War3String;

import java.io.IOException;

public class KaitaiMapper {
    private final ObjectMapper objectMapper;
    public KaitaiMapper() {
        objectMapper = new ObjectMapper();
    }

    public KaitaiMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public <T> T map(Object value, Class<T> targetClass) {
        objectMapper.addMixIn(DataType.class, DataTypeMixin.class);
        objectMapper.addMixIn(War3String.class, War3StringMixin.class);
        //objectMapper.addMixIn(W3id.class, DataTypeMixin.class);
        try {
            return objectMapper.readValue(KaitaiSerializer.serializeBinary(value, objectMapper), targetClass);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
