package w3.info.w3i.impl.kaitai;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import w3.common.core.KaitaiMapper;
import w3.common.core.War3StringMixin;
import w3.common.core.app.War3String;
import w3.info.w3i.api.W3IParser;
import w3.info.w3i.model.W3I;
import w3.info.w3i.model.kaitaiToW3W3iMapper;

import java.io.IOException;

public class KaitaiBasedW3IParser implements W3IParser {
    private final byte[] bytes;

    public KaitaiBasedW3IParser(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public W3I parse() {
        final KaitaiStream inKaitaiStream = new ByteBufferKaitaiStream(bytes);
        final w3.info.w3i.model.kaitai.W3W3i w3W3i = new w3.info.w3i.model.kaitai.W3W3i(inKaitaiStream);
        w3W3i.mapName();
        final ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new SimpleModule().addSerializer(new StdSerializer<W3str>(W3str.class) {
            @Override
            public void serialize(W3str w3str, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
                jsonGenerator.writeString(w3str.value());
            }
        }));
        objectMapper.addMixIn(War3String.class, War3StringMixin.class);
        return new KaitaiMapper().map(kaitaiToW3W3iMapper.map(w3W3i), W3I.class);
        //return new KaitaiMapper(objectMapper).map(w3W3i, W3I.class);
    }

    public static class War3StringMixIn {
        private final String value;

        @JsonCreator
        public War3StringMixIn(@JsonProperty("value") String value) {
            this.value = value;
        }
    }
}
