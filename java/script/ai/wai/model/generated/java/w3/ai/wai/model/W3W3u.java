package w3.ai.wai.model;

import java.lang.Long;
import java.lang.Object;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class W3W3u {
  private long version;

  private ObjectsChunk originalObjectsChunk;

  private ObjectsChunk customObjectsChunk;

  public long getVersion() {
    return version;
  }

  public ObjectsChunk getOriginalObjectsChunk() {
    return originalObjectsChunk;
  }

  public ObjectsChunk getCustomObjectsChunk() {
    return customObjectsChunk;
  }

  public void setVersion(long value) {
    this.version = value;
  }

  public void setOriginalObjectsChunk(ObjectsChunk value) {
    this.originalObjectsChunk = value;
  }

  public void setCustomObjectsChunk(ObjectsChunk value) {
    this.customObjectsChunk = value;
  }

  public static class ObjectsChunk {
    private List<Obj> obj;

    public List<Obj> getObj() {
      return obj;
    }

    public void setObj(List<Obj> value) {
      this.obj = value;
    }
  }

  public enum VarTypes {
    INT(0),

    REAL(1),

    UNREAL(2),

    STRING(3);

    private static final Map<Long, VarTypes> byId = new HashMap<>();

    static {
      for (VarTypes e : VarTypes.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    VarTypes(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public VarTypes byId(long id) {
      return byId.get(id);
    }
  }

  public static class Mod {
    private W3id modId;

    private VarTypes varType;

    private Object value;

    private W3id endToken;

    public W3id getModId() {
      return modId;
    }

    public VarTypes getVarType() {
      return varType;
    }

    public Object getValue() {
      return value;
    }

    public W3id getEndToken() {
      return endToken;
    }

    public void setModId(W3id value) {
      this.modId = value;
    }

    public void setVarType(VarTypes value) {
      this.varType = value;
    }

    public void setValue(Object value) {
      this.value = value;
    }

    public void setEndToken(W3id value) {
      this.endToken = value;
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
}
