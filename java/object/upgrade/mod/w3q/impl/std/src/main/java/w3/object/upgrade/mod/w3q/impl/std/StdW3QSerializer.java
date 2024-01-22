package w3.object.upgrade.mod.w3q.impl.std;

import w3.common.core.Wc3BinOutputStream;
import w3.object.common.api.serializer.ObjModFileSerializer;
import w3.object.common.core.EncodingFormat;
import w3.object.common.impl.serializer.StdObjModFileSerializer;
import w3.object.upgrade.mod.w3q.api.W3QSerializer;
import w3.object.upgrade.mod.w3q.model.UpgradeMod;
import w3.object.upgrade.mod.w3q.model.UpgradeObj;
import w3.object.upgrade.mod.w3q.model.W3Q;

import javax.annotation.Nonnull;

public class StdW3QSerializer implements W3QSerializer {
    private final ObjModFileSerializer<W3Q, UpgradeObj, UpgradeMod> objModFileSerializer;
    public StdW3QSerializer(@Nonnull Wc3BinOutputStream stream, EncodingFormat format) {
        this.objModFileSerializer = new StdObjModFileSerializer<>(stream, format, true);
    }

    @Override
    public void serialize(W3Q w3q) {
        objModFileSerializer.serialize(w3q);
    }
}
