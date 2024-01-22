package w3.ai.wai.model;

import java.util.stream.Collectors;

public class kaitaiToW3W3uMapper {
  public static W3W3u map(w3.ai.wai.model.kaitai.W3W3u data) {
    final W3W3u newData = new W3W3u();
    newData.setVersion(data.version());
    newData.setOriginalObjectsChunk(kaitaiToObjectsChunkMapper.map(data.originalObjectsChunk()));
    newData.setCustomObjectsChunk(kaitaiToObjectsChunkMapper.map(data.customObjectsChunk()));
    return newData;
  }

  public static class kaitaiToObjectsChunkMapper {
    public static W3W3u.ObjectsChunk map(w3.ai.wai.model.kaitai.W3W3u.ObjectsChunk data) {
      final W3W3u.ObjectsChunk newData = new W3W3u.ObjectsChunk();
      newData.setObj(data.obj().stream().map(kaitaiToObjMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToVarTypesMapper {
    public static W3W3u.VarTypes map(w3.ai.wai.model.kaitai.W3W3u.VarTypes data) {
      return W3W3u.VarTypes.valueOf(data.name());
    }
  }

  public static class kaitaiToModMapper {
    public static W3W3u.Mod map(w3.ai.wai.model.kaitai.W3W3u.Mod data) {
      final W3W3u.Mod newData = new W3W3u.Mod();
      newData.setModId(kaitaiToW3idMapper.map(data.modId()));
      newData.setVarType(kaitaiToVarTypesMapper.map(data.varType()));
      newData.setValue(data.value());
      newData.setEndToken(kaitaiToW3idMapper.map(data.endToken()));
      return newData;
    }
  }

  public static class kaitaiToObjMapper {
    public static W3W3u.Obj map(w3.ai.wai.model.kaitai.W3W3u.Obj data) {
      final W3W3u.Obj newData = new W3W3u.Obj();
      newData.setBaseId(kaitaiToW3idMapper.map(data.baseId()));
      newData.setNewId(kaitaiToW3idMapper.map(data.newId()));
      newData.setUnknown(data.unknown());
      newData.setMod(data.mod().stream().map(kaitaiToModMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }
}
