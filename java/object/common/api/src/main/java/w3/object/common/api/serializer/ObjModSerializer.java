package w3.object.common.api.serializer;

import w3.object.common.impl.model.W3ObjModFile;

public interface ObjModSerializer<ObjModFileObjType extends W3ObjModFile.Obj<ObjModFileModType>, ObjModFileModType extends W3ObjModFile.Mod> {
    void serialize(ObjModFileObjType objMod);
}
