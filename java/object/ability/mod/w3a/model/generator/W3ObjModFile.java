package w3.object.common.impl.model;

import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class W3ObjModFile {
  private long version;

  private ObjectsChunk originalObjectsChunk;

  private ObjectsChunk customObjectsChunk;

  private int extended;

  public long getVersion() {
    return version;
  }

  public ObjectsChunk getOriginalObjectsChunk() {
    return originalObjectsChunk;
  }

  public ObjectsChunk getCustomObjectsChunk() {
    return customObjectsChunk;
  }

  public int getExtended() {
    return extended;
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

  public void setExtended(int value) {
    this.extended = value;
  }

  public static class ObjectsChunk {
    private long numObj;

    private ArrayList<Obj> obj;

    public long getNumObj() {
      return numObj;
    }

    public ArrayList<Obj> getObj() {
      return obj;
    }

    public void setNumObj(long value) {
      this.numObj = value;
    }

    public void setObj(ArrayList<Obj> value) {
      this.obj = value;
    }
  }

  public static class Mod {
    private W3id modId;

    private VarTypes varType;

    private Long level;

    private Long dataPt;

    private Object value;

    private W3id endToken;

    public W3id getModId() {
      return modId;
    }

    public VarTypes getVarType() {
      return varType;
    }

    public Long getLevel() {
      return level;
    }

    public Long getDataPt() {
      return dataPt;
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

    public void setLevel(Long value) {
      this.level = value;
    }

    public void setDataPt(Long value) {
      this.dataPt = value;
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

    private Long numUnknown;

    private ArrayList<Long> unknown;

    private long numMod;

    private ArrayList<Mod> mod;

    public W3id getBaseId() {
      return baseId;
    }

    public W3id getNewId() {
      return newId;
    }

    public Long getNumUnknown() {
      return numUnknown;
    }

    public ArrayList<Long> getUnknown() {
      return unknown;
    }

    public long getNumMod() {
      return numMod;
    }

    public ArrayList<Mod> getMod() {
      return mod;
    }

    public void setBaseId(W3id value) {
      this.baseId = value;
    }

    public void setNewId(W3id value) {
      this.newId = value;
    }

    public void setNumUnknown(Long value) {
      this.numUnknown = value;
    }

    public void setUnknown(ArrayList<Long> value) {
      this.unknown = value;
    }

    public void setNumMod(long value) {
      this.numMod = value;
    }

    public void setMod(ArrayList<Mod> value) {
      this.mod = value;
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
}
