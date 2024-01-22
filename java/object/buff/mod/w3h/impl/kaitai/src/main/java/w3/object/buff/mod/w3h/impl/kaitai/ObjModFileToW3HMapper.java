package w3.object.buff.mod.w3h.impl.kaitai;

import w3.common.core.Id;
import w3.object.buff.mod.w3h.model.BuffMod;
import w3.object.buff.mod.w3h.model.BuffObj;
import w3.object.buff.mod.w3h.model.W3H;
import w3.object.common.core.ObjId;
import w3.object.common.impl.model.W3ObjModFile;
import w3.object.common.impl.model.W3id;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class ObjModFileToW3HMapper {
    public W3H map(W3ObjModFile<W3ObjModFile.Obj<W3ObjModFile.Mod>, W3ObjModFile.Mod> objModFile) {
        final W3H w3h = new W3H();

        final var originalObjectsChunk = new W3H.ObjectsChunk<BuffObj>();
        originalObjectsChunk.setObject(new ArrayList<>(objModFile.getDefaultObjectsChunk().getObject().stream().map(objModFileObj -> new ObjModFileObjToW3HObjMapper().map(objModFileObj)).collect(Collectors.toList())));
        w3h.setDefaultObjectsChunk(originalObjectsChunk);

        final var customObjectsChunk = new W3H.ObjectsChunk<BuffObj>();
        customObjectsChunk.setObject(new ArrayList<>(objModFile.getCustomObjectsChunk().getObject().stream().map(objModFileObj -> new ObjModFileObjToW3HObjMapper().map(objModFileObj)).collect(Collectors.toList())));
        w3h.setCustomObjectsChunk(customObjectsChunk);

        w3h.setVersion(objModFile.getVersion());

        return w3h;
    }

    public static class ObjModFileObjToW3HObjMapper {
        public BuffObj map(W3ObjModFile.Obj<W3ObjModFile.Mod> objModFileObj) {
            ObjId baseId = Optional.ofNullable(objModFileObj.getBaseId()).map(Id::getValue).map(ObjId::valueOf).orElse(null);
            if (baseId == null || baseId.getValue() == null || baseId.getValue().trim().isEmpty()) {
                baseId = null;
            }
            ObjId newId = Optional.ofNullable(objModFileObj.getNewId()).map(Id::getValue).map(ObjId::valueOf).orElse(null);
            if (newId == null || newId.getValue() == null || newId.getValue().trim().isEmpty()) {
                newId = null;
            }
            final BuffObj w3hObj = new BuffObj();

            w3hObj.setBaseId(Optional.ofNullable(baseId).map(s -> new W3id(s.toString())).orElse(null));
            w3hObj.setNewId(Optional.ofNullable(newId).map(s -> new W3id(s.toString())).orElse(null));
            w3hObj.setMod(new ArrayList<>(objModFileObj.getMod().stream().map(objModFileMod -> new ObjModFileModToW3HModMapper().map(objModFileMod)).collect(Collectors.toList())));
            w3hObj.setUnknown(objModFileObj.getUnknown());

            return w3hObj;
        }
    }

    public static class ObjModFileModToW3HModMapper {
        public BuffMod map(W3ObjModFile.Mod objModFileMod) {
            final BuffMod w3hMod = new BuffMod();

            w3hMod.setId(objModFileMod.getId());
            switch (Objects.requireNonNull(objModFileMod.getValueType())) {
                case INT:
                    w3hMod.setValueType(W3ObjModFile.ValueTypes.INT);
                    break;
                case REAL:
                    w3hMod.setValueType(W3ObjModFile.ValueTypes.REAL);
                    break;
                case UNREAL:
                    w3hMod.setValueType(W3ObjModFile.ValueTypes.UNREAL);
                    break;
                case STRING:
                    w3hMod.setValueType(W3ObjModFile.ValueTypes.STRING);
                    break;
            }
            w3hMod.setValue(objModFileMod.getValue());
            w3hMod.setLevelOrVariation(objModFileMod.getLevelOrVariation());
            w3hMod.setDataPointer(objModFileMod.getDataPointer());
            w3hMod.setEndToken(objModFileMod.getEndToken());

            return w3hMod;
        }
    }
}
