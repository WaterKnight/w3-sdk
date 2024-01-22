package w3.object.common.api.serializer;

import w3.common.api.Serializer;
import w3.object.common.impl.model.W3ObjModFile;

public interface ObjModFileSerializer<ObjModFileType extends W3ObjModFile<ObjModFileObjType, ObjModFileModType>, ObjModFileObjType extends W3ObjModFile.Obj<ObjModFileModType>, ObjModFileModType extends W3ObjModFile.Mod> extends Serializer<ObjModFileType> {
    void serialize(ObjModFileType objModFile);
}
