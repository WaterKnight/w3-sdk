package w3.object.buff.mod.w3h.impl.std;

import w3.common.core.Wc3BinOutputStream;
import w3.object.buff.mod.w3h.api.W3HSerializer;
import w3.object.buff.mod.w3h.model.BuffMod;
import w3.object.buff.mod.w3h.model.BuffObj;
import w3.object.buff.mod.w3h.model.W3H;
import w3.object.common.api.serializer.ObjModFileSerializer;
import w3.object.common.core.EncodingFormat;
import w3.object.common.impl.serializer.StdObjModFileSerializer;

import javax.annotation.Nonnull;

public class StdW3HSerializer implements W3HSerializer {
    private final ObjModFileSerializer<W3H, BuffObj, BuffMod> objModFileSerializer;
    public StdW3HSerializer(@Nonnull Wc3BinOutputStream stream, EncodingFormat format) {
        this.objModFileSerializer = new StdObjModFileSerializer<>(stream, format, false);
    }

    @Override
    public void serialize(W3H w3h) {
        objModFileSerializer.serialize(w3h);
    }
}
