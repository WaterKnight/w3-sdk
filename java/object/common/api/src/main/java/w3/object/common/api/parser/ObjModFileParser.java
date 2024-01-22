package w3.object.common.api.parser;

import w3.common.api.Parser;
import w3.object.common.impl.model.W3ObjModFile;

public interface ObjModFileParser<ObjModFileType extends W3ObjModFile<ObjModFileObjType, ObjModFileModType>, ObjModFileObjType extends W3ObjModFile.Obj<ObjModFileModType>, ObjModFileModType extends W3ObjModFile.Mod> extends Parser<ObjModFileType> {
}
