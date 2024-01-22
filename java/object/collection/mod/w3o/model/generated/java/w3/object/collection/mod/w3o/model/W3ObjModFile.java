package w3.object.collection.mod.w3o.model;

import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class W3ObjModFile {
  private long version;

  private ObjectsChunk defaultObjectsChunk;

  private ObjectsChunk customObjectsChunk;

  private int useExtended;

  public long getVersion() {
    return version;
  }

  public ObjectsChunk getDefaultObjectsChunk() {
    return defaultObjectsChunk;
  }

  public ObjectsChunk getCustomObjectsChunk() {
    return customObjectsChunk;
  }

  public int getUseExtended() {
    return useExtended;
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

  public void setUseExtended(int value) {
    this.useExtended = value;
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

  public static class Obj {
    private W3id baseId;

    private W3id newId;

    private List<Set> set;

    @Override
    public int hashCode() {
      return Objects.hash(getBaseId(), getNewId(), getSet());
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
      if (!Objects.equals(getSet(), thatTyped.getSet())) {
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
      stringBuilder.append("getSet:");
      stringBuilder.append(getSet());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public W3id getBaseId() {
      return baseId;
    }

    public W3id getNewId() {
      return newId;
    }

    public List<Set> getSet() {
      return set;
    }

    public void setBaseId(W3id value) {
      this.baseId = value;
    }

    public void setNewId(W3id value) {
      this.newId = value;
    }

    public void setSet(List<Set> value) {
      this.set = value;
    }
  }

  public static class NumSet {
    private Long value;

    @Override
    public int hashCode() {
      return Objects.hash(getValue());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof NumSet)) {
        return false;
      }
      final NumSet thatTyped = (NumSet) that;
      if (!Objects.equals(getValue(), thatTyped.getValue())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getValue:");
      stringBuilder.append(getValue());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public Long getValue() {
      return value;
    }

    public void setValue(Long value) {
      this.value = value;
    }
  }

  public static class Set {
    private Long setFlag;

    private List<Mod> mod;

    @Override
    public int hashCode() {
      return Objects.hash(getSetFlag(), getMod());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Set)) {
        return false;
      }
      final Set thatTyped = (Set) that;
      if (!Objects.equals(getSetFlag(), thatTyped.getSetFlag())) {
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
      stringBuilder.append("getSetFlag:");
      stringBuilder.append(getSetFlag());
      stringBuilder.append(", \n");
      stringBuilder.append("getMod:");
      stringBuilder.append(getMod());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public Long getSetFlag() {
      return setFlag;
    }

    public List<Mod> getMod() {
      return mod;
    }

    public void setSetFlag(Long value) {
      this.setFlag = value;
    }

    public void setMod(List<Mod> value) {
      this.mod = value;
    }
  }

  public static class ObjectsChunk {
    private List<Obj> object;

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

    public List<Obj> getObject() {
      return object;
    }

    public void setObject(List<Obj> value) {
      this.object = value;
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
}
