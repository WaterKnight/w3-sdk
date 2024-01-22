package w3.object.ability.mod.impl.std;

import w3.common.core.Wc3BinOutputStream;
import w3.object.ability.mod.w3a.api.W3ASerializer;
import w3.object.ability.mod.w3a.model.AbilityMod;
import w3.object.ability.mod.w3a.model.AbilityObj;
import w3.object.ability.mod.w3a.model.W3A;
import w3.object.common.api.serializer.ObjModFileSerializer;
import w3.object.common.api.serializer.ObjModSerializer;
import w3.object.common.core.EncodingFormat;
import w3.object.common.impl.serializer.StdObjModFileSerializer;

import javax.annotation.Nonnull;

public class StdW3ASerializer implements W3ASerializer {
    private final ObjModFileSerializer<W3A, AbilityObj, AbilityMod> objModFileSerializer;
    public StdW3ASerializer(@Nonnull Wc3BinOutputStream stream, EncodingFormat format) {
        this.objModFileSerializer = new StdObjModFileSerializer<>(stream, format, true);
    }

    @Override
    public void serialize(W3A w3a) {
        objModFileSerializer.serialize(w3a);
    }
}
