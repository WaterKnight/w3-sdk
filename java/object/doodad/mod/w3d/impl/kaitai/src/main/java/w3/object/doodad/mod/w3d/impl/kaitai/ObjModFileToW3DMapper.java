package w3.object.doodad.mod.w3d.impl.kaitai;

import w3.common.core.Id;
import w3.object.common.core.ObjId;
import w3.object.common.impl.model.W3ObjModFile;
import w3.object.common.impl.model.W3id;
import w3.object.doodad.mod.w3d.model.DoodadMod;
import w3.object.doodad.mod.w3d.model.DoodadObj;
import w3.object.doodad.mod.w3d.model.W3D;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class ObjModFileToW3DMapper {
    public W3D map(W3ObjModFile<W3ObjModFile.Obj<W3ObjModFile.Mod>, W3ObjModFile.Mod> objModFile) {
        final W3D w3d = new W3D();

        final var originalObjectsChunk = new W3D.ObjectsChunk<DoodadObj>();
        originalObjectsChunk.setObject(new ArrayList<>(objModFile.getDefaultObjectsChunk().getObject().stream().map(objModFileObj -> new ObjModFileObjToW3DObjMapper().map(objModFileObj)).collect(Collectors.toList())));
        w3d.setDefaultObjectsChunk(originalObjectsChunk);

        final var customObjectsChunk = new W3D.ObjectsChunk<DoodadObj>();
        customObjectsChunk.setObject(new ArrayList<>(objModFile.getCustomObjectsChunk().getObject().stream().map(objModFileObj -> new ObjModFileObjToW3DObjMapper().map(objModFileObj)).collect(Collectors.toList())));
        w3d.setCustomObjectsChunk(customObjectsChunk);

        w3d.setVersion(objModFile.getVersion());

        return w3d;
    }

    public static class ObjModFileObjToW3DObjMapper {
        public DoodadObj map(W3ObjModFile.Obj<W3ObjModFile.Mod> objModFileObj) {
            ObjId baseId = Optional.ofNullable(objModFileObj.getBaseId()).map(Id::getValue).map(ObjId::valueOf).orElse(null);
            if (baseId == null || baseId.getValue() == null || baseId.getValue().trim().isEmpty()) {
                baseId = null;
            }
            ObjId newId = Optional.ofNullable(objModFileObj.getNewId()).map(Id::getValue).map(ObjId::valueOf).orElse(null);
            if (newId == null || newId.getValue() == null || newId.getValue().trim().isEmpty()) {
                newId = null;
            }
            final DoodadObj w3dObj = new DoodadObj();

            w3dObj.setBaseId(Optional.ofNullable(baseId).map(s -> new W3id(s.toString())).orElse(null));
            w3dObj.setNewId(Optional.ofNullable(newId).map(s -> new W3id(s.toString())).orElse(null));
            w3dObj.setMod(new ArrayList<>(objModFileObj.getMod().stream().map(objModFileMod -> new ObjModFileModToW3DModMapper().map(objModFileMod)).collect(Collectors.toList())));
            w3dObj.setUnknown(objModFileObj.getUnknown());

            return w3dObj;
        }
    }

    public static class ObjModFileModToW3DModMapper {
        public DoodadMod map(W3ObjModFile.Mod objModFileMod) {
            final DoodadMod w3dMod = new DoodadMod();

            w3dMod.setId(objModFileMod.getId());
            switch (Objects.requireNonNull(objModFileMod.getValueType())) {
                case INT:
                    w3dMod.setValueType(W3ObjModFile.ValueTypes.INT);
                    break;
                case REAL:
                    w3dMod.setValueType(W3ObjModFile.ValueTypes.REAL);
                    break;
                case UNREAL:
                    w3dMod.setValueType(W3ObjModFile.ValueTypes.UNREAL);
                    break;
                case STRING:
                    w3dMod.setValueType(W3ObjModFile.ValueTypes.STRING);
                    break;
            }
            w3dMod.setValue(objModFileMod.getValue());
            w3dMod.setLevelOrVariation(objModFileMod.getLevelOrVariation());
            w3dMod.setDataPointer(objModFileMod.getDataPointer());
            w3dMod.setEndToken(objModFileMod.getEndToken());

            return w3dMod;
        }
    }
}
