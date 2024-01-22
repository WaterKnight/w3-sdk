package w3.env.placement.object.doo.model;

import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

public class W3Doo {
  private W3id fileId;

  private long version;

  private long subVersion;

  private List<Doodad> doodad;

  private long specialDoodadVersion;

  private List<SpecialDoodad> specialDoodad;

  private int useSkin;

  public W3id getFileId() {
    return fileId;
  }

  public long getVersion() {
    return version;
  }

  public long getSubVersion() {
    return subVersion;
  }

  public List<Doodad> getDoodad() {
    return doodad;
  }

  public long getSpecialDoodadVersion() {
    return specialDoodadVersion;
  }

  public List<SpecialDoodad> getSpecialDoodad() {
    return specialDoodad;
  }

  public int getUseSkin() {
    return useSkin;
  }

  public void setFileId(W3id value) {
    this.fileId = value;
  }

  public void setVersion(long value) {
    this.version = value;
  }

  public void setSubVersion(long value) {
    this.subVersion = value;
  }

  public void setDoodad(List<Doodad> value) {
    this.doodad = value;
  }

  public void setSpecialDoodadVersion(long value) {
    this.specialDoodadVersion = value;
  }

  public void setSpecialDoodad(List<SpecialDoodad> value) {
    this.specialDoodad = value;
  }

  public void setUseSkin(int value) {
    this.useSkin = value;
  }

  public static class Item {
    private W3id id;

    private long chance;

    @Override
    public int hashCode() {
      return Objects.hash(getId(), getChance());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Item)) {
        return false;
      }
      final Item thatTyped = (Item) that;
      if (!Objects.equals(getId(), thatTyped.getId())) {
        return false;
      }
      if (!Objects.equals(getChance(), thatTyped.getChance())) {
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
      stringBuilder.append("getChance:");
      stringBuilder.append(getChance());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public W3id getId() {
      return id;
    }

    public long getChance() {
      return chance;
    }

    public void setId(W3id value) {
      this.id = value;
    }

    public void setChance(long value) {
      this.chance = value;
    }
  }

  public static class SpecialDoodad {
    private W3id id;

    private float x;

    private float y;

    private float z;

    @Override
    public int hashCode() {
      return Objects.hash(getId(), getx(), gety(), getz());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof SpecialDoodad)) {
        return false;
      }
      final SpecialDoodad thatTyped = (SpecialDoodad) that;
      if (!Objects.equals(getId(), thatTyped.getId())) {
        return false;
      }
      if (!Objects.equals(getx(), thatTyped.getx())) {
        return false;
      }
      if (!Objects.equals(gety(), thatTyped.gety())) {
        return false;
      }
      if (!Objects.equals(getz(), thatTyped.getz())) {
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
      stringBuilder.append("getx:");
      stringBuilder.append(getx());
      stringBuilder.append(", \n");
      stringBuilder.append("gety:");
      stringBuilder.append(gety());
      stringBuilder.append(", \n");
      stringBuilder.append("getz:");
      stringBuilder.append(getz());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public W3id getId() {
      return id;
    }

    public float getx() {
      return x;
    }

    public float gety() {
      return y;
    }

    public float getz() {
      return z;
    }

    public void setId(W3id value) {
      this.id = value;
    }

    public void setx(float value) {
      this.x = value;
    }

    public void sety(float value) {
      this.y = value;
    }

    public void setz(float value) {
      this.z = value;
    }
  }

  public static class ItemSet {
    private List<Item> item;

    @Override
    public int hashCode() {
      return Objects.hash(getItem());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof ItemSet)) {
        return false;
      }
      final ItemSet thatTyped = (ItemSet) that;
      if (!Objects.equals(getItem(), thatTyped.getItem())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getItem:");
      stringBuilder.append(getItem());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<Item> getItem() {
      return item;
    }

    public void setItem(List<Item> value) {
      this.item = value;
    }
  }

  public static class Doodad {
    private W3id id;

    private long variation;

    private float x;

    private float y;

    private float z;

    private float angle;

    private float scaleX;

    private float scaleY;

    private float scaleZ;

    private W3id skinId;

    private int flags;

    private int life;

    private Long randomItemSetPtr;

    private List<ItemSet> itemSet;

    private long editorId;

    @Override
    public int hashCode() {
      return Objects.hash(getId(), getVariation(), getx(), gety(), getz(), getAngle(), getScaleX(), getScaleY(), getScaleZ(), getSkinId(), getFlags(), getLife(), getRandomItemSetPtr(), getItemSet(), getEditorId());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Doodad)) {
        return false;
      }
      final Doodad thatTyped = (Doodad) that;
      if (!Objects.equals(getId(), thatTyped.getId())) {
        return false;
      }
      if (!Objects.equals(getVariation(), thatTyped.getVariation())) {
        return false;
      }
      if (!Objects.equals(getx(), thatTyped.getx())) {
        return false;
      }
      if (!Objects.equals(gety(), thatTyped.gety())) {
        return false;
      }
      if (!Objects.equals(getz(), thatTyped.getz())) {
        return false;
      }
      if (!Objects.equals(getAngle(), thatTyped.getAngle())) {
        return false;
      }
      if (!Objects.equals(getScaleX(), thatTyped.getScaleX())) {
        return false;
      }
      if (!Objects.equals(getScaleY(), thatTyped.getScaleY())) {
        return false;
      }
      if (!Objects.equals(getScaleZ(), thatTyped.getScaleZ())) {
        return false;
      }
      if (!Objects.equals(getSkinId(), thatTyped.getSkinId())) {
        return false;
      }
      if (!Objects.equals(getFlags(), thatTyped.getFlags())) {
        return false;
      }
      if (!Objects.equals(getLife(), thatTyped.getLife())) {
        return false;
      }
      if (!Objects.equals(getRandomItemSetPtr(), thatTyped.getRandomItemSetPtr())) {
        return false;
      }
      if (!Objects.equals(getItemSet(), thatTyped.getItemSet())) {
        return false;
      }
      if (!Objects.equals(getEditorId(), thatTyped.getEditorId())) {
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
      stringBuilder.append("getVariation:");
      stringBuilder.append(getVariation());
      stringBuilder.append(", \n");
      stringBuilder.append("getx:");
      stringBuilder.append(getx());
      stringBuilder.append(", \n");
      stringBuilder.append("gety:");
      stringBuilder.append(gety());
      stringBuilder.append(", \n");
      stringBuilder.append("getz:");
      stringBuilder.append(getz());
      stringBuilder.append(", \n");
      stringBuilder.append("getAngle:");
      stringBuilder.append(getAngle());
      stringBuilder.append(", \n");
      stringBuilder.append("getScaleX:");
      stringBuilder.append(getScaleX());
      stringBuilder.append(", \n");
      stringBuilder.append("getScaleY:");
      stringBuilder.append(getScaleY());
      stringBuilder.append(", \n");
      stringBuilder.append("getScaleZ:");
      stringBuilder.append(getScaleZ());
      stringBuilder.append(", \n");
      stringBuilder.append("getSkinId:");
      stringBuilder.append(getSkinId());
      stringBuilder.append(", \n");
      stringBuilder.append("getFlags:");
      stringBuilder.append(getFlags());
      stringBuilder.append(", \n");
      stringBuilder.append("getLife:");
      stringBuilder.append(getLife());
      stringBuilder.append(", \n");
      stringBuilder.append("getRandomItemSetPtr:");
      stringBuilder.append(getRandomItemSetPtr());
      stringBuilder.append(", \n");
      stringBuilder.append("getItemSet:");
      stringBuilder.append(getItemSet());
      stringBuilder.append(", \n");
      stringBuilder.append("getEditorId:");
      stringBuilder.append(getEditorId());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public W3id getId() {
      return id;
    }

    public long getVariation() {
      return variation;
    }

    public float getx() {
      return x;
    }

    public float gety() {
      return y;
    }

    public float getz() {
      return z;
    }

    public float getAngle() {
      return angle;
    }

    public float getScaleX() {
      return scaleX;
    }

    public float getScaleY() {
      return scaleY;
    }

    public float getScaleZ() {
      return scaleZ;
    }

    public W3id getSkinId() {
      return skinId;
    }

    public int getFlags() {
      return flags;
    }

    public int getLife() {
      return life;
    }

    public Long getRandomItemSetPtr() {
      return randomItemSetPtr;
    }

    public List<ItemSet> getItemSet() {
      return itemSet;
    }

    public long getEditorId() {
      return editorId;
    }

    public void setId(W3id value) {
      this.id = value;
    }

    public void setVariation(long value) {
      this.variation = value;
    }

    public void setx(float value) {
      this.x = value;
    }

    public void sety(float value) {
      this.y = value;
    }

    public void setz(float value) {
      this.z = value;
    }

    public void setAngle(float value) {
      this.angle = value;
    }

    public void setScaleX(float value) {
      this.scaleX = value;
    }

    public void setScaleY(float value) {
      this.scaleY = value;
    }

    public void setScaleZ(float value) {
      this.scaleZ = value;
    }

    public void setSkinId(W3id value) {
      this.skinId = value;
    }

    public void setFlags(int value) {
      this.flags = value;
    }

    public void setLife(int value) {
      this.life = value;
    }

    public void setRandomItemSetPtr(Long value) {
      this.randomItemSetPtr = value;
    }

    public void setItemSet(List<ItemSet> value) {
      this.itemSet = value;
    }

    public void setEditorId(long value) {
      this.editorId = value;
    }
  }
}
