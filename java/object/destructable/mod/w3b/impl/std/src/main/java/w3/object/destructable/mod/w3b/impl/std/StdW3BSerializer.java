package w3.object.destructable.mod.w3b.impl.std;

import w3.common.core.Wc3BinOutputStream;
import w3.object.common.api.serializer.ObjModFileSerializer;
import w3.object.common.core.EncodingFormat;
import w3.object.common.impl.serializer.StdObjModFileSerializer;
import w3.object.destructable.mod.w3b.api.W3BSerializer;
import w3.object.destructable.mod.w3b.model.DestructableMod;
import w3.object.destructable.mod.w3b.model.DestructableObj;
import w3.object.destructable.mod.w3b.model.W3B;

import javax.annotation.Nonnull;

public class StdW3BSerializer implements W3BSerializer {
    private final ObjModFileSerializer<W3B, DestructableObj, DestructableMod> objModFileSerializer;
    public StdW3BSerializer(@Nonnull Wc3BinOutputStream stream, EncodingFormat format) {
        this.objModFileSerializer = new StdObjModFileSerializer<>(stream, format, false);
    }

    @Override
    public void serialize(W3B w3b) {
        objModFileSerializer.serialize(w3b);
    }
}
