package w3.object.upgrade.mod.w3q.impl.kaitai;

import w3.common.core.Id;
import w3.object.common.core.ObjId;
import w3.object.common.impl.model.W3ObjModFile;
import w3.object.common.impl.model.W3id;
import w3.object.upgrade.mod.w3q.model.UpgradeMod;
import w3.object.upgrade.mod.w3q.model.UpgradeObj;
import w3.object.upgrade.mod.w3q.model.W3Q;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class ObjModFileToW3QMapper {
    public W3Q map(W3ObjModFile<W3ObjModFile.Obj<W3ObjModFile.Mod>, W3ObjModFile.Mod> objModFile) {
        final W3Q w3q = new W3Q();

        final var originalObjectsChunk = new W3Q.ObjectsChunk<UpgradeObj>();
        originalObjectsChunk.setObject(new ArrayList<>(objModFile.getDefaultObjectsChunk().getObject().stream().map(objModFileObj -> new ObjModFileObjToW3QObjMapper().map(objModFileObj)).collect(Collectors.toList())));
        w3q.setDefaultObjectsChunk(originalObjectsChunk);

        final var customObjectsChunk = new W3Q.ObjectsChunk<UpgradeObj>();
        customObjectsChunk.setObject(new ArrayList<>(objModFile.getCustomObjectsChunk().getObject().stream().map(objModFileObj -> new ObjModFileObjToW3QObjMapper().map(objModFileObj)).collect(Collectors.toList())));
        w3q.setCustomObjectsChunk(customObjectsChunk);

        w3q.setVersion(objModFile.getVersion());

        return w3q;
    }

    public static class ObjModFileObjToW3QObjMapper {
        public UpgradeObj map(W3ObjModFile.Obj<W3ObjModFile.Mod> objModFileObj) {
            ObjId baseId = Optional.ofNullable(objModFileObj.getBaseId()).map(Id::getValue).map(ObjId::valueOf).orElse(null);
            if (baseId == null || baseId.getValue() == null || baseId.getValue().trim().isEmpty()) {
                baseId = null;
            }
            ObjId newId = Optional.ofNullable(objModFileObj.getNewId()).map(Id::getValue).map(ObjId::valueOf).orElse(null);
            if (newId == null || newId.getValue() == null || newId.getValue().trim().isEmpty()) {
                newId = null;
            }
            final UpgradeObj w3qObj = new UpgradeObj();

            w3qObj.setBaseId(Optional.ofNullable(baseId).map(s -> new W3id(s.toString())).orElse(null));
            w3qObj.setNewId(Optional.ofNullable(newId).map(s -> new W3id(s.toString())).orElse(null));
            w3qObj.setMod(new ArrayList<>(objModFileObj.getMod().stream().map(objModFileMod -> new ObjModFileModToW3QModMapper().map(objModFileMod)).collect(Collectors.toList())));
            w3qObj.setUnknown(objModFileObj.getUnknown());

            return w3qObj;
        }
    }

    public static class ObjModFileModToW3QModMapper {
        public UpgradeMod map(W3ObjModFile.Mod objModFileMod) {
            final UpgradeMod w3qMod = new UpgradeMod();

            w3qMod.setId(objModFileMod.getId());
            switch (Objects.requireNonNull(objModFileMod.getValueType())) {
                case INT:
                    w3qMod.setValueType(W3ObjModFile.ValueTypes.INT);
                    break;
                case REAL:
                    w3qMod.setValueType(W3ObjModFile.ValueTypes.REAL);
                    break;
                case UNREAL:
                    w3qMod.setValueType(W3ObjModFile.ValueTypes.UNREAL);
                    break;
                case STRING:
                    w3qMod.setValueType(W3ObjModFile.ValueTypes.STRING);
                    break;
            }
            w3qMod.setValue(objModFileMod.getValue());
            w3qMod.setLevelOrVariation(objModFileMod.getLevelOrVariation());
            w3qMod.setDataPointer(objModFileMod.getDataPointer());
            w3qMod.setEndToken(objModFileMod.getEndToken());

            return w3qMod;
        }
    }
}
