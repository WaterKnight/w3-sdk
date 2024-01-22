package w3.object.item.mod.impl.kaitai;

import w3.common.core.Id;
import w3.object.common.core.ObjId;
import w3.object.common.impl.model.W3ObjModFile;
import w3.object.common.impl.model.W3id;
import w3.object.item.mod.w3t.model.ItemMod;
import w3.object.item.mod.w3t.model.ItemObj;
import w3.object.item.mod.w3t.model.W3T;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class ObjModFileToW3TMapper {
    public W3T map(W3ObjModFile<W3ObjModFile.Obj<W3ObjModFile.Mod>, W3ObjModFile.Mod> objModFile) {
        final W3T w3t = new W3T();

        final var originalObjectsChunk = new W3T.ObjectsChunk<ItemObj>();
        originalObjectsChunk.setObject(new ArrayList<>(objModFile.getDefaultObjectsChunk().getObject().stream().map(objModFileObj -> new ObjModFileObjToW3TObjMapper().map(objModFileObj)).collect(Collectors.toList())));
        w3t.setDefaultObjectsChunk(originalObjectsChunk);

        final var customObjectsChunk = new W3T.ObjectsChunk<ItemObj>();
        customObjectsChunk.setObject(new ArrayList<>(objModFile.getCustomObjectsChunk().getObject().stream().map(objModFileObj -> new ObjModFileObjToW3TObjMapper().map(objModFileObj)).collect(Collectors.toList())));
        w3t.setCustomObjectsChunk(customObjectsChunk);

        w3t.setVersion(objModFile.getVersion());

        return w3t;
    }

    public static class ObjModFileObjToW3TObjMapper {
        public ItemObj map(W3ObjModFile.Obj<W3ObjModFile.Mod> objModFileObj) {
            ObjId baseId = Optional.ofNullable(objModFileObj.getBaseId()).map(Id::getValue).map(ObjId::valueOf).orElse(null);
            if (baseId == null || baseId.getValue() == null || baseId.getValue().trim().isEmpty()) {
                baseId = null;
            }
            ObjId newId = Optional.ofNullable(objModFileObj.getNewId()).map(Id::getValue).map(ObjId::valueOf).orElse(null);
            if (newId == null || newId.getValue() == null || newId.getValue().trim().isEmpty()) {
                newId = null;
            }
            final ItemObj w3tObj = new ItemObj();

            w3tObj.setBaseId(Optional.ofNullable(baseId).map(s -> new W3id(s.toString())).orElse(null));
            w3tObj.setNewId(Optional.ofNullable(newId).map(s -> new W3id(s.toString())).orElse(null));
            w3tObj.setMod(new ArrayList<>(objModFileObj.getMod().stream().map(objModFileMod -> new ObjModFileModToW3TModMapper().map(objModFileMod)).collect(Collectors.toList())));
            w3tObj.setUnknown(objModFileObj.getUnknown());

            return w3tObj;
        }
    }

    public static class ObjModFileModToW3TModMapper {
        public ItemMod map(W3ObjModFile.Mod objModFileMod) {
            final ItemMod w3tMod = new ItemMod();

            w3tMod.setId(objModFileMod.getId());
            switch (Objects.requireNonNull(objModFileMod.getValueType())) {
                case INT:
                    w3tMod.setValueType(W3ObjModFile.ValueTypes.INT);
                    break;
                case REAL:
                    w3tMod.setValueType(W3ObjModFile.ValueTypes.REAL);
                    break;
                case UNREAL:
                    w3tMod.setValueType(W3ObjModFile.ValueTypes.UNREAL);
                    break;
                case STRING:
                    w3tMod.setValueType(W3ObjModFile.ValueTypes.STRING);
                    break;
            }
            w3tMod.setValue(objModFileMod.getValue());
            w3tMod.setLevelOrVariation(objModFileMod.getLevelOrVariation());
            w3tMod.setDataPointer(objModFileMod.getDataPointer());
            w3tMod.setEndToken(objModFileMod.getEndToken());

            return w3tMod;
        }
    }
}
