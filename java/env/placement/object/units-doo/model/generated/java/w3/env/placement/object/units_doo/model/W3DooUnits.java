package w3.env.placement.object.units_doo.model;

import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class W3DooUnits {
  private W3id fileId;

  private long version;

  private long subVersion;

  private List<Unit> unit;

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

  public List<Unit> getUnit() {
    return unit;
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

  public void setUnit(List<Unit> value) {
    this.unit = value;
  }

  public void setUseSkin(int value) {
    this.useSkin = value;
  }

  public static class RandomBuildingItem {
    private int level;

    private int unknown1;

    private int unknown2;

    private int itemClass;

    @Override
    public int hashCode() {
      return Objects.hash(getLevel(), getUnknown1(), getUnknown2(), getItemClass());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof RandomBuildingItem)) {
        return false;
      }
      final RandomBuildingItem thatTyped = (RandomBuildingItem) that;
      if (!Objects.equals(getLevel(), thatTyped.getLevel())) {
        return false;
      }
      if (!Objects.equals(getUnknown1(), thatTyped.getUnknown1())) {
        return false;
      }
      if (!Objects.equals(getUnknown2(), thatTyped.getUnknown2())) {
        return false;
      }
      if (!Objects.equals(getItemClass(), thatTyped.getItemClass())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getLevel:");
      stringBuilder.append(getLevel());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnknown1:");
      stringBuilder.append(getUnknown1());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnknown2:");
      stringBuilder.append(getUnknown2());
      stringBuilder.append(", \n");
      stringBuilder.append("getItemClass:");
      stringBuilder.append(getItemClass());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public int getLevel() {
      return level;
    }

    public int getUnknown1() {
      return unknown1;
    }

    public int getUnknown2() {
      return unknown2;
    }

    public int getItemClass() {
      return itemClass;
    }

    public void setLevel(int value) {
      this.level = value;
    }

    public void setUnknown1(int value) {
      this.unknown1 = value;
    }

    public void setUnknown2(int value) {
      this.unknown2 = value;
    }

    public void setItemClass(int value) {
      this.itemClass = value;
    }
  }

  public static class GroupUnit {
    private W3id id;

    private long chance;

    @Override
    public int hashCode() {
      return Objects.hash(getId(), getChance());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof GroupUnit)) {
        return false;
      }
      final GroupUnit thatTyped = (GroupUnit) that;
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

  public static class AbilityMod {
    private W3id id;

    private AutocastActive autocastActive;

    private long level;

    @Override
    public int hashCode() {
      return Objects.hash(getId(), getAutocastActive(), getLevel());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof AbilityMod)) {
        return false;
      }
      final AbilityMod thatTyped = (AbilityMod) that;
      if (!Objects.equals(getId(), thatTyped.getId())) {
        return false;
      }
      if (!Objects.equals(getAutocastActive(), thatTyped.getAutocastActive())) {
        return false;
      }
      if (!Objects.equals(getLevel(), thatTyped.getLevel())) {
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
      stringBuilder.append("getAutocastActive:");
      stringBuilder.append(getAutocastActive());
      stringBuilder.append(", \n");
      stringBuilder.append("getLevel:");
      stringBuilder.append(getLevel());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public W3id getId() {
      return id;
    }

    public AutocastActive getAutocastActive() {
      return autocastActive;
    }

    public long getLevel() {
      return level;
    }

    public void setId(W3id value) {
      this.id = value;
    }

    public void setAutocastActive(AutocastActive value) {
      this.autocastActive = value;
    }

    public void setLevel(long value) {
      this.level = value;
    }
  }

  public static class Random {
    private int randomType;

    private int randomTypeRest;

    private Object value;

    @Override
    public int hashCode() {
      return Objects.hash(getRandomType(), getRandomTypeRest(), getValue());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Random)) {
        return false;
      }
      final Random thatTyped = (Random) that;
      if (!Objects.equals(getRandomType(), thatTyped.getRandomType())) {
        return false;
      }
      if (!Objects.equals(getRandomTypeRest(), thatTyped.getRandomTypeRest())) {
        return false;
      }
      if (!Objects.equals(getValue(), thatTyped.getValue())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getRandomType:");
      stringBuilder.append(getRandomType());
      stringBuilder.append(", \n");
      stringBuilder.append("getRandomTypeRest:");
      stringBuilder.append(getRandomTypeRest());
      stringBuilder.append(", \n");
      stringBuilder.append("getValue:");
      stringBuilder.append(getValue());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public int getRandomType() {
      return randomType;
    }

    public int getRandomTypeRest() {
      return randomTypeRest;
    }

    public Object getValue() {
      return value;
    }

    public void setRandomType(int value) {
      this.randomType = value;
    }

    public void setRandomTypeRest(int value) {
      this.randomTypeRest = value;
    }

    public void setValue(Object value) {
      this.value = value;
    }
  }

  public enum AutocastActive {
    INACTIVE(0),

    ACTIVE(1);

    private static final Map<Long, AutocastActive> byId = new HashMap<>();

    static {
      for (AutocastActive e : AutocastActive.values()) {
        byId.put(e.id(), e);
      }
    }

    private final long id;

    AutocastActive(long id) {
      this.id = id;
    }

    public long id() {
      return id;
    }

    public AutocastActive byId(long id) {
      return byId.get(id);
    }
  }

  public static class Unit {
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

    private long ownerIndex;

    private int unknown1;

    private int unknown2;

    private long life;

    private long mana;

    private Long droppedItemSetPtr;

    private List<ItemSet> droppedItemSet;

    private long resourcesAmount;

    private float targetAquisition;

    private long heroLevel;

    private Long heroStrength;

    private Long heroAgility;

    private Long heroIntelligence;

    private List<InventoryItem> inventoryItem;

    private List<AbilityMod> abilityMod;

    private Random random;

    private long color;

    private long waygate;

    private long unitId;

    @Override
    public int hashCode() {
      return Objects.hash(getId(), getVariation(), getx(), gety(), getz(), getAngle(), getScaleX(), getScaleY(), getScaleZ(), getSkinId(), getFlags(), getOwnerIndex(), getUnknown1(), getUnknown2(), getLife(), getMana(), getDroppedItemSetPtr(), getDroppedItemSet(), getResourcesAmount(), getTargetAquisition(), getHeroLevel(), getHeroStrength(), getHeroAgility(), getHeroIntelligence(), getInventoryItem(), getAbilityMod(), getRandom(), getColor(), getWaygate(), getUnitId());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Unit)) {
        return false;
      }
      final Unit thatTyped = (Unit) that;
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
      if (!Objects.equals(getOwnerIndex(), thatTyped.getOwnerIndex())) {
        return false;
      }
      if (!Objects.equals(getUnknown1(), thatTyped.getUnknown1())) {
        return false;
      }
      if (!Objects.equals(getUnknown2(), thatTyped.getUnknown2())) {
        return false;
      }
      if (!Objects.equals(getLife(), thatTyped.getLife())) {
        return false;
      }
      if (!Objects.equals(getMana(), thatTyped.getMana())) {
        return false;
      }
      if (!Objects.equals(getDroppedItemSetPtr(), thatTyped.getDroppedItemSetPtr())) {
        return false;
      }
      if (!Objects.equals(getDroppedItemSet(), thatTyped.getDroppedItemSet())) {
        return false;
      }
      if (!Objects.equals(getResourcesAmount(), thatTyped.getResourcesAmount())) {
        return false;
      }
      if (!Objects.equals(getTargetAquisition(), thatTyped.getTargetAquisition())) {
        return false;
      }
      if (!Objects.equals(getHeroLevel(), thatTyped.getHeroLevel())) {
        return false;
      }
      if (!Objects.equals(getHeroStrength(), thatTyped.getHeroStrength())) {
        return false;
      }
      if (!Objects.equals(getHeroAgility(), thatTyped.getHeroAgility())) {
        return false;
      }
      if (!Objects.equals(getHeroIntelligence(), thatTyped.getHeroIntelligence())) {
        return false;
      }
      if (!Objects.equals(getInventoryItem(), thatTyped.getInventoryItem())) {
        return false;
      }
      if (!Objects.equals(getAbilityMod(), thatTyped.getAbilityMod())) {
        return false;
      }
      if (!Objects.equals(getRandom(), thatTyped.getRandom())) {
        return false;
      }
      if (!Objects.equals(getColor(), thatTyped.getColor())) {
        return false;
      }
      if (!Objects.equals(getWaygate(), thatTyped.getWaygate())) {
        return false;
      }
      if (!Objects.equals(getUnitId(), thatTyped.getUnitId())) {
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
      stringBuilder.append("getOwnerIndex:");
      stringBuilder.append(getOwnerIndex());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnknown1:");
      stringBuilder.append(getUnknown1());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnknown2:");
      stringBuilder.append(getUnknown2());
      stringBuilder.append(", \n");
      stringBuilder.append("getLife:");
      stringBuilder.append(getLife());
      stringBuilder.append(", \n");
      stringBuilder.append("getMana:");
      stringBuilder.append(getMana());
      stringBuilder.append(", \n");
      stringBuilder.append("getDroppedItemSetPtr:");
      stringBuilder.append(getDroppedItemSetPtr());
      stringBuilder.append(", \n");
      stringBuilder.append("getDroppedItemSet:");
      stringBuilder.append(getDroppedItemSet());
      stringBuilder.append(", \n");
      stringBuilder.append("getResourcesAmount:");
      stringBuilder.append(getResourcesAmount());
      stringBuilder.append(", \n");
      stringBuilder.append("getTargetAquisition:");
      stringBuilder.append(getTargetAquisition());
      stringBuilder.append(", \n");
      stringBuilder.append("getHeroLevel:");
      stringBuilder.append(getHeroLevel());
      stringBuilder.append(", \n");
      stringBuilder.append("getHeroStrength:");
      stringBuilder.append(getHeroStrength());
      stringBuilder.append(", \n");
      stringBuilder.append("getHeroAgility:");
      stringBuilder.append(getHeroAgility());
      stringBuilder.append(", \n");
      stringBuilder.append("getHeroIntelligence:");
      stringBuilder.append(getHeroIntelligence());
      stringBuilder.append(", \n");
      stringBuilder.append("getInventoryItem:");
      stringBuilder.append(getInventoryItem());
      stringBuilder.append(", \n");
      stringBuilder.append("getAbilityMod:");
      stringBuilder.append(getAbilityMod());
      stringBuilder.append(", \n");
      stringBuilder.append("getRandom:");
      stringBuilder.append(getRandom());
      stringBuilder.append(", \n");
      stringBuilder.append("getColor:");
      stringBuilder.append(getColor());
      stringBuilder.append(", \n");
      stringBuilder.append("getWaygate:");
      stringBuilder.append(getWaygate());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnitId:");
      stringBuilder.append(getUnitId());
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

    public long getOwnerIndex() {
      return ownerIndex;
    }

    public int getUnknown1() {
      return unknown1;
    }

    public int getUnknown2() {
      return unknown2;
    }

    public long getLife() {
      return life;
    }

    public long getMana() {
      return mana;
    }

    public Long getDroppedItemSetPtr() {
      return droppedItemSetPtr;
    }

    public List<ItemSet> getDroppedItemSet() {
      return droppedItemSet;
    }

    public long getResourcesAmount() {
      return resourcesAmount;
    }

    public float getTargetAquisition() {
      return targetAquisition;
    }

    public long getHeroLevel() {
      return heroLevel;
    }

    public Long getHeroStrength() {
      return heroStrength;
    }

    public Long getHeroAgility() {
      return heroAgility;
    }

    public Long getHeroIntelligence() {
      return heroIntelligence;
    }

    public List<InventoryItem> getInventoryItem() {
      return inventoryItem;
    }

    public List<AbilityMod> getAbilityMod() {
      return abilityMod;
    }

    public Random getRandom() {
      return random;
    }

    public long getColor() {
      return color;
    }

    public long getWaygate() {
      return waygate;
    }

    public long getUnitId() {
      return unitId;
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

    public void setOwnerIndex(long value) {
      this.ownerIndex = value;
    }

    public void setUnknown1(int value) {
      this.unknown1 = value;
    }

    public void setUnknown2(int value) {
      this.unknown2 = value;
    }

    public void setLife(long value) {
      this.life = value;
    }

    public void setMana(long value) {
      this.mana = value;
    }

    public void setDroppedItemSetPtr(Long value) {
      this.droppedItemSetPtr = value;
    }

    public void setDroppedItemSet(List<ItemSet> value) {
      this.droppedItemSet = value;
    }

    public void setResourcesAmount(long value) {
      this.resourcesAmount = value;
    }

    public void setTargetAquisition(float value) {
      this.targetAquisition = value;
    }

    public void setHeroLevel(long value) {
      this.heroLevel = value;
    }

    public void setHeroStrength(Long value) {
      this.heroStrength = value;
    }

    public void setHeroAgility(Long value) {
      this.heroAgility = value;
    }

    public void setHeroIntelligence(Long value) {
      this.heroIntelligence = value;
    }

    public void setInventoryItem(List<InventoryItem> value) {
      this.inventoryItem = value;
    }

    public void setAbilityMod(List<AbilityMod> value) {
      this.abilityMod = value;
    }

    public void setRandom(Random value) {
      this.random = value;
    }

    public void setColor(long value) {
      this.color = value;
    }

    public void setWaygate(long value) {
      this.waygate = value;
    }

    public void setUnitId(long value) {
      this.unitId = value;
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

  public static class InventoryItem {
    private long slot;

    private W3id id;

    @Override
    public int hashCode() {
      return Objects.hash(getSlot(), getId());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof InventoryItem)) {
        return false;
      }
      final InventoryItem thatTyped = (InventoryItem) that;
      if (!Objects.equals(getSlot(), thatTyped.getSlot())) {
        return false;
      }
      if (!Objects.equals(getId(), thatTyped.getId())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getSlot:");
      stringBuilder.append(getSlot());
      stringBuilder.append(", \n");
      stringBuilder.append("getId:");
      stringBuilder.append(getId());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getSlot() {
      return slot;
    }

    public W3id getId() {
      return id;
    }

    public void setSlot(long value) {
      this.slot = value;
    }

    public void setId(W3id value) {
      this.id = value;
    }
  }

  public static class CustomGroup {
    private List<GroupUnit> groupUnit;

    @Override
    public int hashCode() {
      return Objects.hash(getGroupUnit());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof CustomGroup)) {
        return false;
      }
      final CustomGroup thatTyped = (CustomGroup) that;
      if (!Objects.equals(getGroupUnit(), thatTyped.getGroupUnit())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getGroupUnit:");
      stringBuilder.append(getGroupUnit());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public List<GroupUnit> getGroupUnit() {
      return groupUnit;
    }

    public void setGroupUnit(List<GroupUnit> value) {
      this.groupUnit = value;
    }
  }

  public static class W3iGroup {
    private long index;

    private long columnIndex;

    @Override
    public int hashCode() {
      return Objects.hash(getIndex(), getColumnIndex());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof W3iGroup)) {
        return false;
      }
      final W3iGroup thatTyped = (W3iGroup) that;
      if (!Objects.equals(getIndex(), thatTyped.getIndex())) {
        return false;
      }
      if (!Objects.equals(getColumnIndex(), thatTyped.getColumnIndex())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getIndex:");
      stringBuilder.append(getIndex());
      stringBuilder.append(", \n");
      stringBuilder.append("getColumnIndex:");
      stringBuilder.append(getColumnIndex());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public long getIndex() {
      return index;
    }

    public long getColumnIndex() {
      return columnIndex;
    }

    public void setIndex(long value) {
      this.index = value;
    }

    public void setColumnIndex(long value) {
      this.columnIndex = value;
    }
  }
}
