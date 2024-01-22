package w3.object.collection.mod.w3o.impl.std;

import w3.common.core.Wc3BinOutputStream;
import w3.object.ability.mod.impl.std.StdW3ASerializer;
import w3.object.ability.mod.w3a.api.W3ASerializer;
import w3.object.buff.mod.w3h.api.W3HSerializer;
import w3.object.buff.mod.w3h.impl.std.StdW3HSerializer;
import w3.object.collection.mod.w3o.api.W3OSerializer;
import w3.object.collection.mod.w3o.model.EncodingFormat;
import w3.object.collection.mod.w3o.model.W3O;
import w3.object.destructable.mod.w3b.api.W3BSerializer;
import w3.object.destructable.mod.w3b.impl.std.StdW3BSerializer;
import w3.object.doodad.mod.w3d.api.W3DSerializer;
import w3.object.doodad.mod.w3d.impl.std.StdW3DSerializer;
import w3.object.item.mod.w3t.api.W3TSerializer;
import w3.object.item.mod.w3t.impl.std.StdW3TSerializer;
import w3.object.unit.mod.w3u.api.W3USerializer;
import w3.object.unit.mod.w3u.impl.std.StdW3USerializer;
import w3.object.upgrade.mod.w3q.api.W3QSerializer;
import w3.object.upgrade.mod.w3q.impl.std.StdW3QSerializer;

import javax.annotation.Nonnull;

public class StdW3OSerializer implements W3OSerializer {
    private final Wc3BinOutputStream outputStream;
    private final W3ASerializer w3aSerializer;
    private final W3BSerializer w3bSerializer;
    private final W3DSerializer w3dSerializer;
    private final W3HSerializer w3hSerializer;
    private final W3QSerializer w3qSerializer;
    private final W3TSerializer w3tSerializer;
    private final W3USerializer w3uSerializer;

    public StdW3OSerializer(
            @Nonnull Wc3BinOutputStream outputStream, EncodingFormat format,
            w3.object.common.core.EncodingFormat objEncodingFormat
    ) {
        this.outputStream = outputStream;
        this.w3aSerializer = new StdW3ASerializer(outputStream, objEncodingFormat);
        this.w3bSerializer = new StdW3BSerializer(outputStream, objEncodingFormat);
        this.w3dSerializer = new StdW3DSerializer(outputStream, objEncodingFormat);
        this.w3hSerializer = new StdW3HSerializer(outputStream, objEncodingFormat);
        this.w3qSerializer = new StdW3QSerializer(outputStream, objEncodingFormat);
        this.w3tSerializer = new StdW3TSerializer(outputStream, objEncodingFormat);
        this.w3uSerializer = new StdW3USerializer(outputStream, objEncodingFormat);
    }

    @Override
    public void serialize(W3O w3o) {
        outputStream.writeUInt32(w3o.getVersion());
        outputStream.writeUInt32(w3o.getUseUnit());
        w3uSerializer.serialize(w3o.getW3u());
        outputStream.writeUInt32(w3o.getUseItem());
        w3tSerializer.serialize(w3o.getW3t());
        outputStream.writeUInt32(w3o.getUseDestructable());
        w3bSerializer.serialize(w3o.getW3b());
        outputStream.writeUInt32(w3o.getUseDoodad());
        w3dSerializer.serialize(w3o.getW3d());
        outputStream.writeUInt32(w3o.getUseAbility());
        w3aSerializer.serialize(w3o.getW3a());
        outputStream.writeUInt32(w3o.getUseBuff());
        w3hSerializer.serialize(w3o.getW3h());
        outputStream.writeUInt32(w3o.getUseUpgrade());
        w3qSerializer.serialize(w3o.getW3q());
    }
}
