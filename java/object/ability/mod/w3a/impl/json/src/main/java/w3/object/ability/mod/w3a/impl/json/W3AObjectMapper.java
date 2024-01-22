package w3.object.ability.mod.w3a.impl.json;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import w3.common.core.DataType;
import w3.common.core.MetaFieldId;
import w3.common.core.app.*;
import w3.object.ability.mod.w3a.model.AbilityMod;
import w3.object.ability.mod.w3a.model.AbilityObj;
import w3.object.ability.mod.w3a.model.W3A;
import w3.object.common.core.ObjId;
import w3.object.common.impl.model.W3ObjModFile;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class W3AObjectMapper extends ObjectMapper {
    public W3AObjectMapper() {
        addMixIn(W3A.class, W3AMixIn.class);
        addMixIn(W3A.Obj.class, W3AObjMixin.class);
        addMixIn(W3A.Mod.class, W3AModMixin.class);

        final SimpleModule idModule = new SimpleModule();

        idModule.addSerializer(ObjId.class, new StdSerializer<>(ObjId.class) {
            @Override
            public void serialize(ObjId objId, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
                jsonGenerator.writeString(objId.getValue());
            }
        });

        final SimpleModule dataTypeModule = new SimpleModule();
        dataTypeModule.addSerializer(DataType.class, new StdSerializer<>(DataType.class) {
            @Override
            public void serialize(DataType value, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
                final Object convertedValue = convert(value);
                if (convertedValue instanceof Integer) {
                    jsonGenerator.writeNumber((Integer) convertedValue);
                }
                if (convertedValue instanceof String) {
                    jsonGenerator.writeString((String) convertedValue);
                }
            }

            private Object convert(DataType value) {
                if (value instanceof War3Bool) {
                    return ((War3Bool) value).getValue();
                }
                if (value instanceof War3Int) {
                    return ((War3Int) value).getValue();
                }
                if (value instanceof War3Real) {
                    return ((War3Real) value).getValue();
                }
                if (value instanceof War3Char) {
                    return ((War3Char) value).getValue();
                }
                if (value instanceof War3String) {
                    return ((War3String) value).getValue();
                }
                return value.toString();
            }
        });

        registerModules(dataTypeModule);
        registerModule(idModule);
    }

    public static class W3AMixIn {
        @JsonIgnore
        public Integer version;

        @JsonIgnore
        public W3A.ObjectsChunk<AbilityObj> originalObjectsChunk;

        @JsonIgnore
        public W3A.ObjectsChunk<AbilityObj> customObjectsChunk;

        @JsonIgnore
        public List<AbilityObj> objsList;

        @JsonIgnore
        public List<AbilityObj> getObjsList() {
            throw new RuntimeException();
        }

        @JsonIgnore
        public int extended;

        @JsonIgnore
        public List<AbilityObj> objs;
    }

    public static class W3AObjMixin {
        @JsonIgnore
        public final Map<MetaFieldId, List<AbilityMod>> modsMap = new LinkedHashMap<>();

        @JsonIgnore
        public boolean isExtended;

        @JsonIgnore
        public Set<MetaFieldId> fields;

        @JsonIgnore
        public Map<MetaFieldId, List<AbilityMod>> modsMapByField;
    }

    public static class W3AModMixin {
        @JsonIgnore
        public W3ObjModFile.ValueTypes valueType;

        @JsonIgnore
        public boolean isExtended;
    }
}
