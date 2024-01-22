package w3.object.ability.mod.w3a.impl.kaitai;

import w3.common.core.Id;
import w3.object.ability.mod.w3a.model.AbilityMod;
import w3.object.ability.mod.w3a.model.AbilityObj;
import w3.object.ability.mod.w3a.model.W3A;
import w3.object.common.core.*;
import w3.object.common.impl.model.W3ObjModFile;
import w3.object.common.impl.model.W3id;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class ObjModFileToW3AMapper {
    public W3A map(W3ObjModFile<W3ObjModFile.Obj<W3ObjModFile.Mod>, W3ObjModFile.Mod> objModFile) {
        final W3A w3a = new W3A();

        final var originalObjectsChunk = new W3A.ObjectsChunk<AbilityObj>();
        originalObjectsChunk.setObject(new ArrayList<>(objModFile.getDefaultObjectsChunk().getObject().stream().map(objModFileObj -> new ObjModFileObjToW3AObjMapper().map(objModFileObj)).collect(Collectors.toList())));
        w3a.setDefaultObjectsChunk(originalObjectsChunk);

        final var customObjectsChunk = new W3A.ObjectsChunk<AbilityObj>();
        customObjectsChunk.setObject(new ArrayList<>(objModFile.getCustomObjectsChunk().getObject().stream().map(objModFileObj -> new ObjModFileObjToW3AObjMapper().map(objModFileObj)).collect(Collectors.toList())));
        w3a.setCustomObjectsChunk(customObjectsChunk);

        w3a.setVersion(objModFile.getVersion());

        return w3a;
    }

    public static class ObjModFileObjToW3AObjMapper {
        public AbilityObj map(W3ObjModFile.Obj<W3ObjModFile.Mod> objModFileObj) {
            ObjId baseId = Optional.ofNullable(objModFileObj.getBaseId()).map(Id::getValue).map(ObjId::valueOf).orElse(null);
            if (baseId == null || baseId.getValue() == null || baseId.getValue().trim().isEmpty()) {
                baseId = null;
            }
            ObjId newId = Optional.ofNullable(objModFileObj.getNewId()).map(Id::getValue).map(ObjId::valueOf).orElse(null);
            if (newId == null || newId.getValue() == null || newId.getValue().trim().isEmpty()) {
                newId = null;
            }
            final AbilityObj w3aObj = new AbilityObj();

            w3aObj.setBaseId(Optional.ofNullable(baseId).map(s -> new W3id(s.toString())).orElse(null));
            w3aObj.setNewId(Optional.ofNullable(newId).map(s -> new W3id(s.toString())).orElse(null));
            w3aObj.setMod(new ArrayList<>(objModFileObj.getMod().stream().map(objModFileMod -> new ObjModFileModToW3AModMapper().map(objModFileMod)).collect(Collectors.toList())));
            w3aObj.setUnknown(objModFileObj.getUnknown());

            return w3aObj;
        }
    }

    public static class ObjModFileModToW3AModMapper {
        public AbilityMod map(W3ObjModFile.Mod objModFileMod) {
            final AbilityMod w3aMod = new AbilityMod();

            w3aMod.setId(objModFileMod.getId());
            switch (Objects.requireNonNull(objModFileMod.getValueType())) {
                case INT:
                    w3aMod.setValueType(W3ObjModFile.ValueTypes.INT);
                    break;
                case REAL:
                    w3aMod.setValueType(W3ObjModFile.ValueTypes.REAL);
                    break;
                case UNREAL:
                    w3aMod.setValueType(W3ObjModFile.ValueTypes.UNREAL);
                    break;
                case STRING:
                    w3aMod.setValueType(W3ObjModFile.ValueTypes.STRING);
                    break;
            }
            w3aMod.setValue(objModFileMod.getValue());
            w3aMod.setLevelOrVariation(objModFileMod.getLevelOrVariation());
            w3aMod.setDataPointer(objModFileMod.getDataPointer());
            w3aMod.setEndToken(objModFileMod.getEndToken());

            return w3aMod;
        }
    }
}
