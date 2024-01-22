package w3.object.doodad.mod.w3d.impl.std;

import w3.common.core.Wc3BinOutputStream;
import w3.object.common.api.serializer.ObjModFileSerializer;
import w3.object.common.core.EncodingFormat;
import w3.object.common.impl.serializer.StdObjModFileSerializer;
import w3.object.doodad.mod.w3d.api.W3DSerializer;
import w3.object.doodad.mod.w3d.model.DoodadMod;
import w3.object.doodad.mod.w3d.model.DoodadObj;
import w3.object.doodad.mod.w3d.model.W3D;

import javax.annotation.Nonnull;

public class StdW3DSerializer implements W3DSerializer {
    private final ObjModFileSerializer<W3D, DoodadObj, DoodadMod> objModFileSerializer;
    public StdW3DSerializer(@Nonnull Wc3BinOutputStream stream, EncodingFormat format) {
        this.objModFileSerializer = new StdObjModFileSerializer<>(stream, format, true);
    }

    @Override
    public void serialize(W3D w3d) {
        objModFileSerializer.serialize(w3d);
    }
}
