package w3.object.unit.mod.w3u.impl.std;

import w3.common.core.Wc3BinOutputStream;
import w3.object.common.api.serializer.ObjModFileSerializer;
import w3.object.common.core.EncodingFormat;
import w3.object.common.impl.serializer.StdObjModFileSerializer;
import w3.object.unit.mod.w3u.api.W3USerializer;
import w3.object.unit.mod.w3u.model.UnitMod;
import w3.object.unit.mod.w3u.model.UnitObj;
import w3.object.unit.mod.w3u.model.W3U;

import javax.annotation.Nonnull;

public class StdW3USerializer implements W3USerializer {
    private final ObjModFileSerializer<W3U, UnitObj, UnitMod> objModFileSerializer;
    public StdW3USerializer(@Nonnull Wc3BinOutputStream stream, EncodingFormat format) {
        this.objModFileSerializer = new StdObjModFileSerializer<>(stream, format, false);
    }

    @Override
    public void serialize(W3U w3u) {
        objModFileSerializer.serialize(w3u);
    }
}
