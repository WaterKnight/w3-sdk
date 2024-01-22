package kaitai;

import w3.common.core.Id;
import w3.object.common.core.ObjId;
import w3.object.common.impl.model.W3ObjModFile;
import w3.object.common.impl.model.W3id;
import w3.object.destructable.mod.w3b.model.DestructableMod;
import w3.object.destructable.mod.w3b.model.DestructableObj;
import w3.object.destructable.mod.w3b.model.W3B;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class ObjModFileToW3BMapper {
    public W3B map(W3ObjModFile<W3ObjModFile.Obj<W3ObjModFile.Mod>, W3ObjModFile.Mod> objModFile) {
        final W3B w3b = new W3B();

        final var originalObjectsChunk = new W3B.ObjectsChunk<DestructableObj>();
        originalObjectsChunk.setObject(new ArrayList<>(objModFile.getDefaultObjectsChunk().getObject().stream().map(objModFileObj -> new ObjModFileObjToW3BObjMapper().map(objModFileObj)).collect(Collectors.toList())));
        w3b.setDefaultObjectsChunk(originalObjectsChunk);

        final var customObjectsChunk = new W3B.ObjectsChunk<DestructableObj>();
        customObjectsChunk.setObject(new ArrayList<>(objModFile.getCustomObjectsChunk().getObject().stream().map(objModFileObj -> new ObjModFileObjToW3BObjMapper().map(objModFileObj)).collect(Collectors.toList())));
        w3b.setCustomObjectsChunk(customObjectsChunk);

        w3b.setVersion(objModFile.getVersion());

        return w3b;
    }

    public static class ObjModFileObjToW3BObjMapper {
        public DestructableObj map(W3ObjModFile.Obj<W3ObjModFile.Mod> objModFileObj) {
            ObjId baseId = Optional.ofNullable(objModFileObj.getBaseId()).map(Id::getValue).map(ObjId::valueOf).orElse(null);
            if (baseId == null || baseId.getValue() == null || baseId.getValue().trim().isEmpty()) {
                baseId = null;
            }
            ObjId newId = Optional.ofNullable(objModFileObj.getNewId()).map(Id::getValue).map(ObjId::valueOf).orElse(null);
            if (newId == null || newId.getValue() == null || newId.getValue().trim().isEmpty()) {
                newId = null;
            }
            final DestructableObj w3bObj = new DestructableObj();

            w3bObj.setBaseId(Optional.ofNullable(baseId).map(s -> new W3id(s.toString())).orElse(null));
            w3bObj.setNewId(Optional.ofNullable(newId).map(s -> new W3id(s.toString())).orElse(null));
            w3bObj.setMod(new ArrayList<>(objModFileObj.getMod().stream().map(objModFileMod -> new ObjModFileModToW3BModMapper().map(objModFileMod)).collect(Collectors.toList())));
            w3bObj.setUnknown(objModFileObj.getUnknown());

            return w3bObj;
        }
    }

    public static class ObjModFileModToW3BModMapper {
        public DestructableMod map(W3ObjModFile.Mod objModFileMod) {
            final DestructableMod w3bMod = new DestructableMod();

            w3bMod.setId(objModFileMod.getId());
            switch (Objects.requireNonNull(objModFileMod.getValueType())) {
                case INT:
                    w3bMod.setValueType(W3ObjModFile.ValueTypes.INT);
                    break;
                case REAL:
                    w3bMod.setValueType(W3ObjModFile.ValueTypes.REAL);
                    break;
                case UNREAL:
                    w3bMod.setValueType(W3ObjModFile.ValueTypes.UNREAL);
                    break;
                case STRING:
                    w3bMod.setValueType(W3ObjModFile.ValueTypes.STRING);
                    break;
            }
            w3bMod.setValue(objModFileMod.getValue());
            w3bMod.setLevelOrVariation(objModFileMod.getLevelOrVariation());
            w3bMod.setDataPointer(objModFileMod.getDataPointer());
            w3bMod.setEndToken(objModFileMod.getEndToken());

            return w3bMod;
        }
    }
}
