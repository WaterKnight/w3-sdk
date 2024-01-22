package w3.object.collection.mod.w3o.model;

import java.util.stream.Collectors;

public class kaitaiToW3ObjModFileMapper {
  public static W3ObjModFile map(w3.object.collection.mod.w3o.model.kaitai.W3ObjModFile data) {
    if (data == null) {
      return null;
    }
    final W3ObjModFile newData = new W3ObjModFile();
    newData.setVersion(data.version());
    newData.setDefaultObjectsChunk(kaitaiToObjectsChunkMapper.map(data.defaultObjectsChunk()));
    newData.setCustomObjectsChunk(kaitaiToObjectsChunkMapper.map(data.customObjectsChunk()));
    newData.setUseExtended(data.useExtended());
    return newData;
  }

  public static class kaitaiToModMapper {
    public static W3ObjModFile.Mod map(
        w3.object.collection.mod.w3o.model.kaitai.W3ObjModFile.Mod data) {
      if (data == null) {
        return null;
      }
      final W3ObjModFile.Mod newData = new W3ObjModFile.Mod();
      newData.setId(kaitaiToW3idMapper.map(data.id()));
      newData.setValueType(kaitaiToValueTypesMapper.map(data.valueType()));
      newData.setLevelOrVariation(data.levelOrVariation());
      newData.setDataPointer(data.dataPointer());
      try {
        newData.setValue(Class.forName(kaitaiToW3ObjModFileMapper.class.getTypeName() + "$kaitaiTo" + data.value().getClass().getSimpleName() + "Mapper").getMethod("map", data.value().getClass()).invoke(null, data.value()));
      } catch (Exception e) {
        throw new AssertionError(e);
      }
      newData.setEndToken(kaitaiToW3idMapper.map(data.endToken()));
      return newData;
    }
  }

  public static class kaitaiToObjMapper {
    public static W3ObjModFile.Obj map(
        w3.object.collection.mod.w3o.model.kaitai.W3ObjModFile.Obj data) {
      if (data == null) {
        return null;
      }
      final W3ObjModFile.Obj newData = new W3ObjModFile.Obj();
      newData.setBaseId(kaitaiToW3idMapper.map(data.baseId()));
      newData.setNewId(kaitaiToW3idMapper.map(data.newId()));
      newData.setSet(data.set().stream().map(kaitaiToSetMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToNumSetMapper {
    public static W3ObjModFile.NumSet map(
        w3.object.collection.mod.w3o.model.kaitai.W3ObjModFile.NumSet data) {
      if (data == null) {
        return null;
      }
      final W3ObjModFile.NumSet newData = new W3ObjModFile.NumSet();
      newData.setValue(data.value());
      return newData;
    }
  }

  public static class kaitaiToSetMapper {
    public static W3ObjModFile.Set map(
        w3.object.collection.mod.w3o.model.kaitai.W3ObjModFile.Set data) {
      if (data == null) {
        return null;
      }
      final W3ObjModFile.Set newData = new W3ObjModFile.Set();
      newData.setSetFlag(data.setFlag());
      newData.setMod(data.mod().stream().map(kaitaiToModMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToObjectsChunkMapper {
    public static W3ObjModFile.ObjectsChunk map(
        w3.object.collection.mod.w3o.model.kaitai.W3ObjModFile.ObjectsChunk data) {
      if (data == null) {
        return null;
      }
      final W3ObjModFile.ObjectsChunk newData = new W3ObjModFile.ObjectsChunk();
      newData.setObject(data.object().stream().map(kaitaiToObjMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToValueTypesMapper {
    public static W3ObjModFile.ValueTypes map(
        w3.object.collection.mod.w3o.model.kaitai.W3ObjModFile.ValueTypes data) {
      if (data == null) {
        return null;
      }
      return W3ObjModFile.ValueTypes.valueOf(data.name());
    }
  }
}
