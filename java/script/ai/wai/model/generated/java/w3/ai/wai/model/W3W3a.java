package w3.ai.wai.model;

import java.lang.Long;
import java.lang.Object;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class W3W3a {
  private long version;

  private ObjectsChunk defaultObjectsChunk;

  private ObjectsChunk customObjectsChunk;

  public long getVersion() {
    return version;
  }

  public ObjectsChunk getDefaultObjectsChunk() {
    return defaultObjectsChunk;
  }

  public ObjectsChunk getCustomObjectsChunk() {
    return customObjectsChunk;
  }

  public void setVersion(long value) {
    this.version = value;
  }

  public void setDefaultObjectsChunk(ObjectsChunk value) {
    this.defaultObjectsChunk = value;
  }

  public void setCustomObjectsChunk(ObjectsChunk value) {
    this.customObjectsChunk = value;
  }

  public static class ObjectsChunk {
    private List<Obj> object;

    public List<Obj> getObject() {
      return object;
    }

    public void setObject(List<Obj> value) {
      this.object = value;
    }
  }

  public static class Obj {
    private W3id baseId;

    private W3id newId;

    private List<Long> unknown;

    private List<Mod> mod;

    public W3id getBaseId() {
      return baseId;
    }

    public W3id getNewId() {
      return newId;
    }

    public List<Long> getUnknown() {
      return unknown;
    }

    public List<Mod> getMod() {
      return mod;
    }

    public void setBaseId(W3id value) {
      this.baseId = value;
    }

    public void setNewId(W3id value) {
      this.newId = value;
    }

    public void setUnknown(List<Long> value) {
      this.unknown = value;
    }

    public void setMod(List<Mod> value) {
      this.mod = value;
    }
  }

  public enum ValueTypes {
    INT(0),

    REAL(1),

    UNREAL(2),

    STRING(3);

    private static final Map<Long, ValueTypes> byId = new HashMap<>();

    static {
      for (ValueTypes e : ValueTypes.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    ValueTypes(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public ValueTypes byId(long id) {
      return byId.get(id);
    }
  }

  public static class Mod {
    private W3id id;

    private ValueTypes valueType;

    private long level;

    private long dataPointer;

    private Object value;

    private W3id endToken;

    public W3id getId() {
      return id;
    }

    public ValueTypes getValueType() {
      return valueType;
    }

    public long getLevel() {
      return level;
    }

    public long getDataPointer() {
      return dataPointer;
    }

    public Object getValue() {
      return value;
    }

    public W3id getEndToken() {
      return endToken;
    }

    public void setId(W3id value) {
      this.id = value;
    }

    public void setValueType(ValueTypes value) {
      this.valueType = value;
    }

    public void setLevel(long value) {
      this.level = value;
    }

    public void setDataPointer(long value) {
      this.dataPointer = value;
    }

    public void setValue(Object value) {
      this.value = value;
    }

    public void setEndToken(W3id value) {
      this.endToken = value;
    }
  }
}
