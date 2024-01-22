package w3.object.common.impl;

import w3.object.common.impl.kaitai.W3ObjModFile;
import w3.object.common.impl.kaitai.W3str;
import w3.object.common.impl.model.W3id;

import java.util.Optional;
import java.util.stream.Collectors;

public class KaitaiMappers {
    public w3.object.common.impl.model.W3ObjModFile<w3.object.common.impl.model.W3ObjModFile.Obj<w3.object.common.impl.model.W3ObjModFile.Mod>, w3.object.common.impl.model.W3ObjModFile.Mod> kaitaiObjModFileToObjModFile(W3ObjModFile kaitaiFile) {
        final var objModFile = new w3.object.common.impl.model.W3ObjModFile<>();

        objModFile.setDefaultObjectsChunk(kaitaiObjectsModFileObjChunkToObjModFileObjectsChunk(kaitaiFile.defaultObjectsChunk()));
        objModFile.setCustomObjectsChunk(kaitaiObjectsModFileObjChunkToObjModFileObjectsChunk(kaitaiFile.customObjectsChunk()));

        objModFile.setVersion(kaitaiFile.version());
        objModFile.setUseExtended(kaitaiFile.useExtended());

        return objModFile;
    }

    public w3.object.common.impl.model.W3ObjModFile.ObjectsChunk<w3.object.common.impl.model.W3ObjModFile.Obj<w3.object.common.impl.model.W3ObjModFile.Mod>> kaitaiObjectsModFileObjChunkToObjModFileObjectsChunk(W3ObjModFile.ObjectsChunk kaitaiObjectsChunk) {
        final var objectsChunk = new w3.object.common.impl.model.W3ObjModFile.ObjectsChunk<w3.object.common.impl.model.W3ObjModFile.Obj<w3.object.common.impl.model.W3ObjModFile.Mod>>();

        objectsChunk.setObject(kaitaiObjectsChunk.object().stream().map(this::kaitaiObjModFileObjToObjModFileObj).collect(Collectors.toList()));

        return objectsChunk;
    }

    public w3.object.common.impl.model.W3ObjModFile.Obj<w3.object.common.impl.model.W3ObjModFile.Mod> kaitaiObjModFileObjToObjModFileObj(W3ObjModFile.Obj kaitaiObj) {
        final var obj = new w3.object.common.impl.model.W3ObjModFile.Obj<>();

        obj.setBaseId(Optional.ofNullable(kaitaiObj.baseId()).flatMap(baseId -> Optional.of(baseId.value()).map(String::trim).map(s -> s.isEmpty() ? null : s).map(W3id::new)).orElse(null));
        obj.setNewId(Optional.ofNullable(kaitaiObj.newId()).flatMap(newId -> Optional.of(newId.value()).map(String::trim).map(s -> s.isEmpty() ? null : s).map(W3id::new)).orElse(null));
        obj.setUnknown(kaitaiObj.unknown());
        obj.setMod(kaitaiObj.mod().stream().map(this::modToObjModFileMod).collect(Collectors.toList()));

        return obj;
    }

    public w3.object.common.impl.model.W3ObjModFile.Mod modToObjModFileMod(W3ObjModFile.Mod kaitaiMod) {
        final var mod = new w3.object.common.impl.model.W3ObjModFile.Mod();

        mod.setId(Optional.ofNullable(kaitaiMod.id()).flatMap(id -> Optional.of(id.value()).map(String::trim).map(s -> s.isEmpty() ? null : s).map(W3id::new)).orElse(null));
        mod.setValueType(mapValueType(kaitaiMod.valueType()));
        mod.setValue(kaitaiValueToValue(kaitaiMod.value()));
        mod.setLevelOrVariation(kaitaiMod.levelOrVariation());
        mod.setDataPointer(kaitaiMod.dataPointer());
        mod.setEndToken(Optional.ofNullable(kaitaiMod.endToken()).flatMap(endToken -> Optional.of(endToken.value()).map(String::trim).map(s -> s.isEmpty() ? null : s).map(W3id::new)).orElse(null));

        return mod;
    }

    public w3.object.common.impl.model.W3ObjModFile.ValueTypes mapValueType(W3ObjModFile.ValueTypes kaitaiValueType) {
        switch (kaitaiValueType) {
            case INT:
                return w3.object.common.impl.model.W3ObjModFile.ValueTypes.INT;
            case REAL:
                return w3.object.common.impl.model.W3ObjModFile.ValueTypes.REAL;
            case UNREAL:
                return w3.object.common.impl.model.W3ObjModFile.ValueTypes.UNREAL;
            case STRING:
                return w3.object.common.impl.model.W3ObjModFile.ValueTypes.STRING;
        }
        throw new IllegalArgumentException(kaitaiValueType.toString());
    }

    public Object kaitaiValueToValue(Object kaitaiValue) {
        if (kaitaiValue instanceof W3str) {
            return ((W3str) kaitaiValue).value();
        }
        return kaitaiValue;
    }
}
