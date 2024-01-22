package w3.ai.wai.model;

import java.util.stream.Collectors;

public class kaitaiToW3W3aMapper {
  public static W3W3a map(w3.ai.wai.model.kaitai.W3W3a data) {
    final W3W3a newData = new W3W3a();
    newData.setVersion(data.version());
    newData.setDefaultObjectsChunk(kaitaiToObjectsChunkMapper.map(data.defaultObjectsChunk()));
    newData.setCustomObjectsChunk(kaitaiToObjectsChunkMapper.map(data.customObjectsChunk()));
    return newData;
  }

  public static class kaitaiToObjectsChunkMapper {
    public static W3W3a.ObjectsChunk map(w3.ai.wai.model.kaitai.W3W3a.ObjectsChunk data) {
      final W3W3a.ObjectsChunk newData = new W3W3a.ObjectsChunk();
      newData.setObject(data.object().stream().map(kaitaiToObjMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToObjMapper {
    public static W3W3a.Obj map(w3.ai.wai.model.kaitai.W3W3a.Obj data) {
      final W3W3a.Obj newData = new W3W3a.Obj();
      newData.setBaseId(kaitaiToW3idMapper.map(data.baseId()));
      newData.setNewId(kaitaiToW3idMapper.map(data.newId()));
      newData.setUnknown(data.unknown());
      newData.setMod(data.mod().stream().map(kaitaiToModMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToValueTypesMapper {
    public static W3W3a.ValueTypes map(w3.ai.wai.model.kaitai.W3W3a.ValueTypes data) {
      return W3W3a.ValueTypes.valueOf(data.name());
    }
  }

  public static class kaitaiToModMapper {
    public static W3W3a.Mod map(w3.ai.wai.model.kaitai.W3W3a.Mod data) {
      final W3W3a.Mod newData = new W3W3a.Mod();
      newData.setId(kaitaiToW3idMapper.map(data.id()));
      newData.setValueType(kaitaiToValueTypesMapper.map(data.valueType()));
      newData.setLevel(data.level());
      newData.setDataPointer(data.dataPointer());
      newData.setValue(data.value());
      newData.setEndToken(kaitaiToW3idMapper.map(data.endToken()));
      return newData;
    }
  }
}
