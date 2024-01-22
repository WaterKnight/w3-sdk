package w3.env.placement.object.units_doo.impl.kaitai;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStream;
import org.modelmapper.ModelMapper;
import w3.common.core.KaitaiMapper;
import w3.env.placement.object.units_doo.api.UnitsDooParser;
import w3.env.placement.object.units_doo.model.UnitsDoo;
import w3.env.placement.object.units_doo.model.W3id;
import w3.env.placement.object.units_doo.model.kaitai.W3DooUnits;
import w3.env.placement.object.units_doo.model.kaitaiToW3DooUnitsMapper;

public class KaitaiBasedUnitsDooParser implements UnitsDooParser {
    private final byte[] bytes;
    private final boolean use_skin;

    public KaitaiBasedUnitsDooParser(byte[] bytes, boolean use_skin) {
        this.bytes = bytes;
        this.use_skin = use_skin;
    }
    @Override
    public UnitsDoo parse() {
        final KaitaiStream inKaitaiStream = new ByteBufferKaitaiStream(bytes);
        final W3DooUnits w3DooUnits = new W3DooUnits(inKaitaiStream, use_skin ? 1 : 0);
        return new ModelMapper().map(kaitaiToW3DooUnitsMapper.map(w3DooUnits), UnitsDoo.class);
    }

    public static class W3idMixin {
        @JsonCreator
        public W3idMixin(@JsonProperty("value") String value) {

        }
    }
}
