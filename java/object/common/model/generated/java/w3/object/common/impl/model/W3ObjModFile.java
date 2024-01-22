package w3.object.common.impl.model;

import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class W3ObjModFile<ObjType extends W3ObjModFile.Obj<ModType>, ModType extends W3ObjModFile.Mod> {
  private long version;

  private ObjectsChunk<ObjType> defaultObjectsChunk;

  private ObjectsChunk<ObjType> customObjectsChunk;

  private int useExtended;

  public long getVersion() {
    return version;
  }

  public ObjectsChunk<ObjType> getDefaultObjectsChunk() {
    return defaultObjectsChunk;
  }

  public ObjectsChunk<ObjType> getCustomObjectsChunk() {
    return customObjectsChunk;
  }

  public int getUseExtended() {
    return useExtended;
  }

  public void setVersion(long value) {
    this.version = value;
  }

  public void setDefaultObjectsChunk(ObjectsChunk<ObjType> value) {
    this.defaultObjectsChunk = value;
  }

  public void setCustomObjectsChunk(ObjectsChunk<ObjType> value) {
    this.customObjectsChunk = value;
  }

  public void setUseExtended(int value) {
    this.useExtended = value;
  }

  public static class ObjectsChunk<ObjType extends W3ObjModFile.Obj> {
    private List<ObjType> object;

    @Override
    public int hashCode() {
      return Objects.hash(getObject());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof ObjectsChunk)) {
        return false;
      }
      final ObjectsChunk thatTyped = (ObjectsChunk) that;
      if (!Objects.equals(getObject(), thatTyped.getObject())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getObject:");
      stringBuilder.append(getObject());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<ObjType> getObject() {
      return object;
    }

    public void setObject(List<ObjType> value) {
      this.object = value;
    }
  }

  public static class Mod {
    private W3id id;

    private ValueTypes valueType;

    private Long levelOrVariation;

    private Long dataPointer;

    private Object value;

    private W3id endToken;

    @Override
    public int hashCode() {
      return Objects.hash(getId(), getValueType(), getLevelOrVariation(), getDataPointer(), getValue(), getEndToken());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Mod)) {
        return false;
      }
      final Mod thatTyped = (Mod) that;
      if (!Objects.equals(getId(), thatTyped.getId())) {
        return false;
      }
      if (!Objects.equals(getValueType(), thatTyped.getValueType())) {
        return false;
      }
      if (!Objects.equals(getLevelOrVariation(), thatTyped.getLevelOrVariation())) {
        return false;
      }
      if (!Objects.equals(getDataPointer(), thatTyped.getDataPointer())) {
        return false;
      }
      if (!Objects.equals(getValue(), thatTyped.getValue())) {
        return false;
      }
      if (!Objects.equals(getEndToken(), thatTyped.getEndToken())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getId:");
      stringBuilder.append(getId());
      stringBuilder.append(", \n");
      stringBuilder.append("getValueType:");
      stringBuilder.append(getValueType());
      stringBuilder.append(", \n");
      stringBuilder.append("getLevelOrVariation:");
      stringBuilder.append(getLevelOrVariation());
      stringBuilder.append(", \n");
      stringBuilder.append("getDataPointer:");
      stringBuilder.append(getDataPointer());
      stringBuilder.append(", \n");
      stringBuilder.append("getValue:");
      stringBuilder.append(getValue());
      stringBuilder.append(", \n");
      stringBuilder.append("getEndToken:");
      stringBuilder.append(getEndToken());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public W3id getId() {
      return id;
    }

    public ValueTypes getValueType() {
      return valueType;
    }

    public Long getLevelOrVariation() {
      return levelOrVariation;
    }

    public Long getDataPointer() {
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

    public void setLevelOrVariation(Long value) {
      this.levelOrVariation = value;
    }

    public void setDataPointer(Long value) {
      this.dataPointer = value;
    }

    public void setValue(Object value) {
      this.value = value;
    }

    public void setEndToken(W3id value) {
      this.endToken = value;
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

  public static class Obj<ModType extends Mod> {
    private W3id baseId;

    private W3id newId;

    private List<Long> unknown;

    private List<ModType> mod;

    @Override
    public int hashCode() {
      return Objects.hash(getBaseId(), getNewId(), getUnknown(), getMod());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Obj)) {
        return false;
      }
      final Obj thatTyped = (Obj) that;
      if (!Objects.equals(getBaseId(), thatTyped.getBaseId())) {
        return false;
      }
      if (!Objects.equals(getNewId(), thatTyped.getNewId())) {
        return false;
      }
      if (!Objects.equals(getUnknown(), thatTyped.getUnknown())) {
        return false;
      }
      if (!Objects.equals(getMod(), thatTyped.getMod())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getBaseId:");
      stringBuilder.append(getBaseId());
      stringBuilder.append(", \n");
      stringBuilder.append("getNewId:");
      stringBuilder.append(getNewId());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnknown:");
      stringBuilder.append(getUnknown());
      stringBuilder.append(", \n");
      stringBuilder.append("getMod:");
      stringBuilder.append(getMod());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public W3id getBaseId() {
      return baseId;
    }

    public W3id getNewId() {
      return newId;
    }

    public List<Long> getUnknown() {
      return unknown;
    }

    public List<ModType> getMod() {
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

    public void setMod(List<ModType> value) {
      this.mod = value;
    }
  }
}
