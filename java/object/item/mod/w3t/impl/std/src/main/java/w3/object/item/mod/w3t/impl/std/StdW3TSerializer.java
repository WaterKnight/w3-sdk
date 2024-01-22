package w3.object.item.mod.w3t.impl.std;

import w3.common.core.Wc3BinOutputStream;
import w3.object.common.api.serializer.ObjModFileSerializer;
import w3.object.common.core.EncodingFormat;
import w3.object.common.impl.serializer.StdObjModFileSerializer;
import w3.object.item.mod.w3t.api.W3TSerializer;
import w3.object.item.mod.w3t.model.ItemMod;
import w3.object.item.mod.w3t.model.ItemObj;
import w3.object.item.mod.w3t.model.W3T;

import javax.annotation.Nonnull;

public class StdW3TSerializer implements W3TSerializer {
    private final ObjModFileSerializer<W3T, ItemObj, ItemMod> objModFileSerializer;
    public StdW3TSerializer(@Nonnull Wc3BinOutputStream stream, EncodingFormat format) {
        this.objModFileSerializer = new StdObjModFileSerializer<>(stream, format, false);
    }

    @Override
    public void serialize(W3T w3t) {
        objModFileSerializer.serialize(w3t);
    }
}
