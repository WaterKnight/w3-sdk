package w3.object.unit.mod.w3u.impl.kaitai;

import w3.common.core.Id;
import w3.object.common.core.ObjId;
import w3.object.common.impl.model.W3ObjModFile;
import w3.object.common.impl.model.W3id;
import w3.object.unit.mod.w3u.model.UnitMod;
import w3.object.unit.mod.w3u.model.UnitObj;
import w3.object.unit.mod.w3u.model.W3U;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class ObjModFileToW3UMapper {
    public W3U map(W3ObjModFile<W3ObjModFile.Obj<W3ObjModFile.Mod>, W3ObjModFile.Mod> objModFile) {
        final W3U w3u = new W3U();

        final var originalObjectsChunk = new W3U.ObjectsChunk<UnitObj>();
        originalObjectsChunk.setObject(new ArrayList<>(objModFile.getDefaultObjectsChunk().getObject().stream().map(objModFileObj -> new ObjModFileObjToW3UObjMapper().map(objModFileObj)).collect(Collectors.toList())));
        w3u.setDefaultObjectsChunk(originalObjectsChunk);

        final var customObjectsChunk = new W3U.ObjectsChunk<UnitObj>();
        customObjectsChunk.setObject(new ArrayList<>(objModFile.getCustomObjectsChunk().getObject().stream().map(objModFileObj -> new ObjModFileObjToW3UObjMapper().map(objModFileObj)).collect(Collectors.toList())));
        w3u.setCustomObjectsChunk(customObjectsChunk);

        w3u.setVersion(objModFile.getVersion());

        return w3u;
    }

    public static class ObjModFileObjToW3UObjMapper {
        public UnitObj map(W3ObjModFile.Obj<W3ObjModFile.Mod> objModFileObj) {
            ObjId baseId = Optional.ofNullable(objModFileObj.getBaseId()).map(Id::getValue).map(ObjId::valueOf).orElse(null);
            if (baseId == null || baseId.getValue() == null || baseId.getValue().trim().isEmpty()) {
                baseId = null;
            }
            ObjId newId = Optional.ofNullable(objModFileObj.getNewId()).map(Id::getValue).map(ObjId::valueOf).orElse(null);
            if (newId == null || newId.getValue() == null || newId.getValue().trim().isEmpty()) {
                newId = null;
            }
            final UnitObj w3uObj = new UnitObj();

            w3uObj.setBaseId(Optional.ofNullable(baseId).map(s -> new W3id(s.toString())).orElse(null));
            w3uObj.setNewId(Optional.ofNullable(newId).map(s -> new W3id(s.toString())).orElse(null));
            w3uObj.setMod(new ArrayList<>(objModFileObj.getMod().stream().map(objModFileMod -> new ObjModFileModToW3UModMapper().map(objModFileMod)).collect(Collectors.toList())));
            w3uObj.setUnknown(objModFileObj.getUnknown());

            return w3uObj;
        }
    }

    public static class ObjModFileModToW3UModMapper {
        public UnitMod map(W3ObjModFile.Mod objModFileMod) {
            final UnitMod w3uMod = new UnitMod();

            w3uMod.setId(objModFileMod.getId());
            switch (Objects.requireNonNull(objModFileMod.getValueType())) {
                case INT:
                    w3uMod.setValueType(W3ObjModFile.ValueTypes.INT);
                    break;
                case REAL:
                    w3uMod.setValueType(W3ObjModFile.ValueTypes.REAL);
                    break;
                case UNREAL:
                    w3uMod.setValueType(W3ObjModFile.ValueTypes.UNREAL);
                    break;
                case STRING:
                    w3uMod.setValueType(W3ObjModFile.ValueTypes.STRING);
                    break;
            }
            w3uMod.setValue(objModFileMod.getValue());
            w3uMod.setLevelOrVariation(objModFileMod.getLevelOrVariation());
            w3uMod.setDataPointer(objModFileMod.getDataPointer());
            w3uMod.setEndToken(objModFileMod.getEndToken());

            return w3uMod;
        }
    }
}
