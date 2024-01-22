package w3.save.w3v.model;

import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

public class W3W3v {
  private long version;

  private List<GameCache> gameCache;

  public long getVersion() {
    return version;
  }

  public List<GameCache> getGameCache() {
    return gameCache;
  }

  public void setVersion(long value) {
    this.version = value;
  }

  public void setGameCache(List<GameCache> value) {
    this.gameCache = value;
  }

  public static class ItemFlags2 {
    private boolean flag7;

    private boolean flag6;

    private boolean pawnable;

    private boolean flag4;

    private boolean flag3;

    private boolean droppable;

    private boolean activelyUsed;

    private boolean flag0;

    @Override
    public int hashCode() {
      return Objects.hash(getFlag7(), getFlag6(), getPawnable(), getFlag4(), getFlag3(), getDroppable(), getActivelyUsed(), getFlag0());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof ItemFlags2)) {
        return false;
      }
      final ItemFlags2 thatTyped = (ItemFlags2) that;
      if (!Objects.equals(getFlag7(), thatTyped.getFlag7())) {
        return false;
      }
      if (!Objects.equals(getFlag6(), thatTyped.getFlag6())) {
        return false;
      }
      if (!Objects.equals(getPawnable(), thatTyped.getPawnable())) {
        return false;
      }
      if (!Objects.equals(getFlag4(), thatTyped.getFlag4())) {
        return false;
      }
      if (!Objects.equals(getFlag3(), thatTyped.getFlag3())) {
        return false;
      }
      if (!Objects.equals(getDroppable(), thatTyped.getDroppable())) {
        return false;
      }
      if (!Objects.equals(getActivelyUsed(), thatTyped.getActivelyUsed())) {
        return false;
      }
      if (!Objects.equals(getFlag0(), thatTyped.getFlag0())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getFlag7:");
      stringBuilder.append(getFlag7());
      stringBuilder.append(", \n");
      stringBuilder.append("getFlag6:");
      stringBuilder.append(getFlag6());
      stringBuilder.append(", \n");
      stringBuilder.append("getPawnable:");
      stringBuilder.append(getPawnable());
      stringBuilder.append(", \n");
      stringBuilder.append("getFlag4:");
      stringBuilder.append(getFlag4());
      stringBuilder.append(", \n");
      stringBuilder.append("getFlag3:");
      stringBuilder.append(getFlag3());
      stringBuilder.append(", \n");
      stringBuilder.append("getDroppable:");
      stringBuilder.append(getDroppable());
      stringBuilder.append(", \n");
      stringBuilder.append("getActivelyUsed:");
      stringBuilder.append(getActivelyUsed());
      stringBuilder.append(", \n");
      stringBuilder.append("getFlag0:");
      stringBuilder.append(getFlag0());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public boolean getFlag7() {
      return flag7;
    }

    public boolean getFlag6() {
      return flag6;
    }

    public boolean getPawnable() {
      return pawnable;
    }

    public boolean getFlag4() {
      return flag4;
    }

    public boolean getFlag3() {
      return flag3;
    }

    public boolean getDroppable() {
      return droppable;
    }

    public boolean getActivelyUsed() {
      return activelyUsed;
    }

    public boolean getFlag0() {
      return flag0;
    }

    public void setFlag7(boolean value) {
      this.flag7 = value;
    }

    public void setFlag6(boolean value) {
      this.flag6 = value;
    }

    public void setPawnable(boolean value) {
      this.pawnable = value;
    }

    public void setFlag4(boolean value) {
      this.flag4 = value;
    }

    public void setFlag3(boolean value) {
      this.flag3 = value;
    }

    public void setDroppable(boolean value) {
      this.droppable = value;
    }

    public void setActivelyUsed(boolean value) {
      this.activelyUsed = value;
    }

    public void setFlag0(boolean value) {
      this.flag0 = value;
    }
  }

  public static class Category {
    private W3str name;

    private List<Integer> reservedVarTypes;

    private List<Integer> filler;

    private List<IntEntry> intEntry;

    private List<RealEntry> realEntry;

    private List<BooleanEntry> booleanEntry;

    private List<UnitEntry> unitEntry;

    private List<StringEntry> stringEntry;

    @Override
    public int hashCode() {
      return Objects.hash(getName(), getReservedVarTypes(), getFiller(), getIntEntry(), getRealEntry(), getBooleanEntry(), getUnitEntry(), getStringEntry());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof Category)) {
        return false;
      }
      final Category thatTyped = (Category) that;
      if (!Objects.equals(getName(), thatTyped.getName())) {
        return false;
      }
      if (!Objects.equals(getReservedVarTypes(), thatTyped.getReservedVarTypes())) {
        return false;
      }
      if (!Objects.equals(getFiller(), thatTyped.getFiller())) {
        return false;
      }
      if (!Objects.equals(getIntEntry(), thatTyped.getIntEntry())) {
        return false;
      }
      if (!Objects.equals(getRealEntry(), thatTyped.getRealEntry())) {
        return false;
      }
      if (!Objects.equals(getBooleanEntry(), thatTyped.getBooleanEntry())) {
        return false;
      }
      if (!Objects.equals(getUnitEntry(), thatTyped.getUnitEntry())) {
        return false;
      }
      if (!Objects.equals(getStringEntry(), thatTyped.getStringEntry())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getName:");
      stringBuilder.append(getName());
      stringBuilder.append(", \n");
      stringBuilder.append("getReservedVarTypes:");
      stringBuilder.append(getReservedVarTypes());
      stringBuilder.append(", \n");
      stringBuilder.append("getFiller:");
      stringBuilder.append(getFiller());
      stringBuilder.append(", \n");
      stringBuilder.append("getIntEntry:");
      stringBuilder.append(getIntEntry());
      stringBuilder.append(", \n");
      stringBuilder.append("getRealEntry:");
      stringBuilder.append(getRealEntry());
      stringBuilder.append(", \n");
      stringBuilder.append("getBooleanEntry:");
      stringBuilder.append(getBooleanEntry());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnitEntry:");
      stringBuilder.append(getUnitEntry());
      stringBuilder.append(", \n");
      stringBuilder.append("getStringEntry:");
      stringBuilder.append(getStringEntry());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public W3str getName() {
      return name;
    }

    public List<Integer> getReservedVarTypes() {
      return reservedVarTypes;
    }

    public List<Integer> getFiller() {
      return filler;
    }

    public List<IntEntry> getIntEntry() {
      return intEntry;
    }

    public List<RealEntry> getRealEntry() {
      return realEntry;
    }

    public List<BooleanEntry> getBooleanEntry() {
      return booleanEntry;
    }

    public List<UnitEntry> getUnitEntry() {
      return unitEntry;
    }

    public List<StringEntry> getStringEntry() {
      return stringEntry;
    }

    public void setName(W3str value) {
      this.name = value;
    }

    public void setReservedVarTypes(List<Integer> value) {
      this.reservedVarTypes = value;
    }

    public void setFiller(List<Integer> value) {
      this.filler = value;
    }

    public void setIntEntry(List<IntEntry> value) {
      this.intEntry = value;
    }

    public void setRealEntry(List<RealEntry> value) {
      this.realEntry = value;
    }

    public void setBooleanEntry(List<BooleanEntry> value) {
      this.booleanEntry = value;
    }

    public void setUnitEntry(List<UnitEntry> value) {
      this.unitEntry = value;
    }

    public void setStringEntry(List<StringEntry> value) {
      this.stringEntry = value;
    }
  }

  public static class IntEntry {
    private W3str name;

    private long value;

    @Override
    public int hashCode() {
      return Objects.hash(getName(), getValue());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof IntEntry)) {
        return false;
      }
      final IntEntry thatTyped = (IntEntry) that;
      if (!Objects.equals(getName(), thatTyped.getName())) {
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
      stringBuilder.append("getName:");
      stringBuilder.append(getName());
      stringBuilder.append(", \n");
      stringBuilder.append("getValue:");
      stringBuilder.append(getValue());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public W3str getName() {
      return name;
    }

    public long getValue() {
      return value;
    }

    public void setName(W3str value) {
      this.name = value;
    }

    public void setValue(long value) {
      this.value = value;
    }
  }

  public static class BooleanEntry {
    private W3str name;

    private long value;

    @Override
    public int hashCode() {
      return Objects.hash(getName(), getValue());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof BooleanEntry)) {
        return false;
      }
      final BooleanEntry thatTyped = (BooleanEntry) that;
      if (!Objects.equals(getName(), thatTyped.getName())) {
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
      stringBuilder.append("getName:");
      stringBuilder.append(getName());
      stringBuilder.append(", \n");
      stringBuilder.append("getValue:");
      stringBuilder.append(getValue());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public W3str getName() {
      return name;
    }

    public long getValue() {
      return value;
    }

    public void setName(W3str value) {
      this.name = value;
    }

    public void setValue(long value) {
      this.value = value;
    }
  }

  public static class ItemFlags {
    private boolean dropUponDeath;

    private boolean perishable;

    private boolean flag5;

    private boolean flag4;

    private boolean invulnerable;

    private boolean flag2;

    private boolean flag1;

    private boolean flag0;

    @Override
    public int hashCode() {
      return Objects.hash(getDropUponDeath(), getPerishable(), getFlag5(), getFlag4(), getInvulnerable(), getFlag2(), getFlag1(), getFlag0());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof ItemFlags)) {
        return false;
      }
      final ItemFlags thatTyped = (ItemFlags) that;
      if (!Objects.equals(getDropUponDeath(), thatTyped.getDropUponDeath())) {
        return false;
      }
      if (!Objects.equals(getPerishable(), thatTyped.getPerishable())) {
        return false;
      }
      if (!Objects.equals(getFlag5(), thatTyped.getFlag5())) {
        return false;
      }
      if (!Objects.equals(getFlag4(), thatTyped.getFlag4())) {
        return false;
      }
      if (!Objects.equals(getInvulnerable(), thatTyped.getInvulnerable())) {
        return false;
      }
      if (!Objects.equals(getFlag2(), thatTyped.getFlag2())) {
        return false;
      }
      if (!Objects.equals(getFlag1(), thatTyped.getFlag1())) {
        return false;
      }
      if (!Objects.equals(getFlag0(), thatTyped.getFlag0())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getDropUponDeath:");
      stringBuilder.append(getDropUponDeath());
      stringBuilder.append(", \n");
      stringBuilder.append("getPerishable:");
      stringBuilder.append(getPerishable());
      stringBuilder.append(", \n");
      stringBuilder.append("getFlag5:");
      stringBuilder.append(getFlag5());
      stringBuilder.append(", \n");
      stringBuilder.append("getFlag4:");
      stringBuilder.append(getFlag4());
      stringBuilder.append(", \n");
      stringBuilder.append("getInvulnerable:");
      stringBuilder.append(getInvulnerable());
      stringBuilder.append(", \n");
      stringBuilder.append("getFlag2:");
      stringBuilder.append(getFlag2());
      stringBuilder.append(", \n");
      stringBuilder.append("getFlag1:");
      stringBuilder.append(getFlag1());
      stringBuilder.append(", \n");
      stringBuilder.append("getFlag0:");
      stringBuilder.append(getFlag0());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public boolean getDropUponDeath() {
      return dropUponDeath;
    }

    public boolean getPerishable() {
      return perishable;
    }

    public boolean getFlag5() {
      return flag5;
    }

    public boolean getFlag4() {
      return flag4;
    }

    public boolean getInvulnerable() {
      return invulnerable;
    }

    public boolean getFlag2() {
      return flag2;
    }

    public boolean getFlag1() {
      return flag1;
    }

    public boolean getFlag0() {
      return flag0;
    }

    public void setDropUponDeath(boolean value) {
      this.dropUponDeath = value;
    }

    public void setPerishable(boolean value) {
      this.perishable = value;
    }

    public void setFlag5(boolean value) {
      this.flag5 = value;
    }

    public void setFlag4(boolean value) {
      this.flag4 = value;
    }

    public void setInvulnerable(boolean value) {
      this.invulnerable = value;
    }

    public void setFlag2(boolean value) {
      this.flag2 = value;
    }

    public void setFlag1(boolean value) {
      this.flag1 = value;
    }

    public void setFlag0(boolean value) {
      this.flag0 = value;
    }
  }

  public static class StringEntry {
    private W3str name;

    private W3str value;

    @Override
    public int hashCode() {
      return Objects.hash(getName(), getValue());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof StringEntry)) {
        return false;
      }
      final StringEntry thatTyped = (StringEntry) that;
      if (!Objects.equals(getName(), thatTyped.getName())) {
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
      stringBuilder.append("getName:");
      stringBuilder.append(getName());
      stringBuilder.append(", \n");
      stringBuilder.append("getValue:");
      stringBuilder.append(getValue());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public W3str getName() {
      return name;
    }

    public W3str getValue() {
      return value;
    }

    public void setName(W3str value) {
      this.name = value;
    }

    public void setValue(W3str value) {
      this.value = value;
    }
  }

  public static class GameCache {
    private W3str name;

    private long reserved;

    private List<Category> category;

    @Override
    public int hashCode() {
      return Objects.hash(getName(), getReserved(), getCategory());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof GameCache)) {
        return false;
      }
      final GameCache thatTyped = (GameCache) that;
      if (!Objects.equals(getName(), thatTyped.getName())) {
        return false;
      }
      if (!Objects.equals(getReserved(), thatTyped.getReserved())) {
        return false;
      }
      if (!Objects.equals(getCategory(), thatTyped.getCategory())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getName:");
      stringBuilder.append(getName());
      stringBuilder.append(", \n");
      stringBuilder.append("getReserved:");
      stringBuilder.append(getReserved());
      stringBuilder.append(", \n");
      stringBuilder.append("getCategory:");
      stringBuilder.append(getCategory());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public W3str getName() {
      return name;
    }

    public long getReserved() {
      return reserved;
    }

    public List<Category> getCategory() {
      return category;
    }

    public void setName(W3str value) {
      this.name = value;
    }

    public void setReserved(long value) {
      this.reserved = value;
    }

    public void setCategory(List<Category> value) {
      this.category = value;
    }
  }

  public static class InventorySlot {
    private W3id itemId;

    private long charges;

    private ItemFlags flags;

    private ItemFlags2 flags2;

    private int flags3;

    private int flags4;

    @Override
    public int hashCode() {
      return Objects.hash(getItemId(), getCharges(), getFlags(), getFlags2(), getFlags3(), getFlags4());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof InventorySlot)) {
        return false;
      }
      final InventorySlot thatTyped = (InventorySlot) that;
      if (!Objects.equals(getItemId(), thatTyped.getItemId())) {
        return false;
      }
      if (!Objects.equals(getCharges(), thatTyped.getCharges())) {
        return false;
      }
      if (!Objects.equals(getFlags(), thatTyped.getFlags())) {
        return false;
      }
      if (!Objects.equals(getFlags2(), thatTyped.getFlags2())) {
        return false;
      }
      if (!Objects.equals(getFlags3(), thatTyped.getFlags3())) {
        return false;
      }
      if (!Objects.equals(getFlags4(), thatTyped.getFlags4())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getItemId:");
      stringBuilder.append(getItemId());
      stringBuilder.append(", \n");
      stringBuilder.append("getCharges:");
      stringBuilder.append(getCharges());
      stringBuilder.append(", \n");
      stringBuilder.append("getFlags:");
      stringBuilder.append(getFlags());
      stringBuilder.append(", \n");
      stringBuilder.append("getFlags2:");
      stringBuilder.append(getFlags2());
      stringBuilder.append(", \n");
      stringBuilder.append("getFlags3:");
      stringBuilder.append(getFlags3());
      stringBuilder.append(", \n");
      stringBuilder.append("getFlags4:");
      stringBuilder.append(getFlags4());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public W3id getItemId() {
      return itemId;
    }

    public long getCharges() {
      return charges;
    }

    public ItemFlags getFlags() {
      return flags;
    }

    public ItemFlags2 getFlags2() {
      return flags2;
    }

    public int getFlags3() {
      return flags3;
    }

    public int getFlags4() {
      return flags4;
    }

    public void setItemId(W3id value) {
      this.itemId = value;
    }

    public void setCharges(long value) {
      this.charges = value;
    }

    public void setFlags(ItemFlags value) {
      this.flags = value;
    }

    public void setFlags2(ItemFlags2 value) {
      this.flags2 = value;
    }

    public void setFlags3(int value) {
      this.flags3 = value;
    }

    public void setFlags4(int value) {
      this.flags4 = value;
    }
  }

  public static class UnitEntry {
    private W3str name;

    private W3id unitId;

    private List<InventorySlot> inventorySlot;

    private long experience;

    private long levelMinusOne;

    private long unusedSkillPoints;

    private int unknown0;

    private int heroProperNameIndex;

    private long str;

    private float strPlus;

    private long agi;

    private float moveSpeedIncrementFromAgi;

    private float attackSpeedIncrementFromAgi;

    private float agiPlus;

    private long intelligence;

    private float intPlus;

    private List<HeroSkill> heroSkill;

    private List<Long> unknown4;

    private float lifeIncrement;

    private float manaIncrement;

    private float sightRangeDay;

    private List<Integer> unknown7;

    private long atkIncrement1;

    private long atkIncrement2;

    private float armorIncrement;

    private List<Integer> unknown8;

    @Override
    public int hashCode() {
      return Objects.hash(getName(), getUnitId(), getInventorySlot(), getExperience(), getLevelMinusOne(), getUnusedSkillPoints(), getUnknown0(), getHeroProperNameIndex(), getStr(), getStrPlus(), getAgi(), getMoveSpeedIncrementFromAgi(), getAttackSpeedIncrementFromAgi(), getAgiPlus(), getIntelligence(), getIntPlus(), getHeroSkill(), getUnknown4(), getLifeIncrement(), getManaIncrement(), getSightRangeDay(), getUnknown7(), getAtkIncrement1(), getAtkIncrement2(), getArmorIncrement(), getUnknown8());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof UnitEntry)) {
        return false;
      }
      final UnitEntry thatTyped = (UnitEntry) that;
      if (!Objects.equals(getName(), thatTyped.getName())) {
        return false;
      }
      if (!Objects.equals(getUnitId(), thatTyped.getUnitId())) {
        return false;
      }
      if (!Objects.equals(getInventorySlot(), thatTyped.getInventorySlot())) {
        return false;
      }
      if (!Objects.equals(getExperience(), thatTyped.getExperience())) {
        return false;
      }
      if (!Objects.equals(getLevelMinusOne(), thatTyped.getLevelMinusOne())) {
        return false;
      }
      if (!Objects.equals(getUnusedSkillPoints(), thatTyped.getUnusedSkillPoints())) {
        return false;
      }
      if (!Objects.equals(getUnknown0(), thatTyped.getUnknown0())) {
        return false;
      }
      if (!Objects.equals(getHeroProperNameIndex(), thatTyped.getHeroProperNameIndex())) {
        return false;
      }
      if (!Objects.equals(getStr(), thatTyped.getStr())) {
        return false;
      }
      if (!Objects.equals(getStrPlus(), thatTyped.getStrPlus())) {
        return false;
      }
      if (!Objects.equals(getAgi(), thatTyped.getAgi())) {
        return false;
      }
      if (!Objects.equals(getMoveSpeedIncrementFromAgi(), thatTyped.getMoveSpeedIncrementFromAgi())) {
        return false;
      }
      if (!Objects.equals(getAttackSpeedIncrementFromAgi(), thatTyped.getAttackSpeedIncrementFromAgi())) {
        return false;
      }
      if (!Objects.equals(getAgiPlus(), thatTyped.getAgiPlus())) {
        return false;
      }
      if (!Objects.equals(getIntelligence(), thatTyped.getIntelligence())) {
        return false;
      }
      if (!Objects.equals(getIntPlus(), thatTyped.getIntPlus())) {
        return false;
      }
      if (!Objects.equals(getHeroSkill(), thatTyped.getHeroSkill())) {
        return false;
      }
      if (!Objects.equals(getUnknown4(), thatTyped.getUnknown4())) {
        return false;
      }
      if (!Objects.equals(getLifeIncrement(), thatTyped.getLifeIncrement())) {
        return false;
      }
      if (!Objects.equals(getManaIncrement(), thatTyped.getManaIncrement())) {
        return false;
      }
      if (!Objects.equals(getSightRangeDay(), thatTyped.getSightRangeDay())) {
        return false;
      }
      if (!Objects.equals(getUnknown7(), thatTyped.getUnknown7())) {
        return false;
      }
      if (!Objects.equals(getAtkIncrement1(), thatTyped.getAtkIncrement1())) {
        return false;
      }
      if (!Objects.equals(getAtkIncrement2(), thatTyped.getAtkIncrement2())) {
        return false;
      }
      if (!Objects.equals(getArmorIncrement(), thatTyped.getArmorIncrement())) {
        return false;
      }
      if (!Objects.equals(getUnknown8(), thatTyped.getUnknown8())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getName:");
      stringBuilder.append(getName());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnitId:");
      stringBuilder.append(getUnitId());
      stringBuilder.append(", \n");
      stringBuilder.append("getInventorySlot:");
      stringBuilder.append(getInventorySlot());
      stringBuilder.append(", \n");
      stringBuilder.append("getExperience:");
      stringBuilder.append(getExperience());
      stringBuilder.append(", \n");
      stringBuilder.append("getLevelMinusOne:");
      stringBuilder.append(getLevelMinusOne());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnusedSkillPoints:");
      stringBuilder.append(getUnusedSkillPoints());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnknown0:");
      stringBuilder.append(getUnknown0());
      stringBuilder.append(", \n");
      stringBuilder.append("getHeroProperNameIndex:");
      stringBuilder.append(getHeroProperNameIndex());
      stringBuilder.append(", \n");
      stringBuilder.append("getStr:");
      stringBuilder.append(getStr());
      stringBuilder.append(", \n");
      stringBuilder.append("getStrPlus:");
      stringBuilder.append(getStrPlus());
      stringBuilder.append(", \n");
      stringBuilder.append("getAgi:");
      stringBuilder.append(getAgi());
      stringBuilder.append(", \n");
      stringBuilder.append("getMoveSpeedIncrementFromAgi:");
      stringBuilder.append(getMoveSpeedIncrementFromAgi());
      stringBuilder.append(", \n");
      stringBuilder.append("getAttackSpeedIncrementFromAgi:");
      stringBuilder.append(getAttackSpeedIncrementFromAgi());
      stringBuilder.append(", \n");
      stringBuilder.append("getAgiPlus:");
      stringBuilder.append(getAgiPlus());
      stringBuilder.append(", \n");
      stringBuilder.append("getIntelligence:");
      stringBuilder.append(getIntelligence());
      stringBuilder.append(", \n");
      stringBuilder.append("getIntPlus:");
      stringBuilder.append(getIntPlus());
      stringBuilder.append(", \n");
      stringBuilder.append("getHeroSkill:");
      stringBuilder.append(getHeroSkill());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnknown4:");
      stringBuilder.append(getUnknown4());
      stringBuilder.append(", \n");
      stringBuilder.append("getLifeIncrement:");
      stringBuilder.append(getLifeIncrement());
      stringBuilder.append(", \n");
      stringBuilder.append("getManaIncrement:");
      stringBuilder.append(getManaIncrement());
      stringBuilder.append(", \n");
      stringBuilder.append("getSightRangeDay:");
      stringBuilder.append(getSightRangeDay());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnknown7:");
      stringBuilder.append(getUnknown7());
      stringBuilder.append(", \n");
      stringBuilder.append("getAtkIncrement1:");
      stringBuilder.append(getAtkIncrement1());
      stringBuilder.append(", \n");
      stringBuilder.append("getAtkIncrement2:");
      stringBuilder.append(getAtkIncrement2());
      stringBuilder.append(", \n");
      stringBuilder.append("getArmorIncrement:");
      stringBuilder.append(getArmorIncrement());
      stringBuilder.append(", \n");
      stringBuilder.append("getUnknown8:");
      stringBuilder.append(getUnknown8());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public W3str getName() {
      return name;
    }

    public W3id getUnitId() {
      return unitId;
    }

    public List<InventorySlot> getInventorySlot() {
      return inventorySlot;
    }

    public long getExperience() {
      return experience;
    }

    public long getLevelMinusOne() {
      return levelMinusOne;
    }

    public long getUnusedSkillPoints() {
      return unusedSkillPoints;
    }

    public int getUnknown0() {
      return unknown0;
    }

    public int getHeroProperNameIndex() {
      return heroProperNameIndex;
    }

    public long getStr() {
      return str;
    }

    public float getStrPlus() {
      return strPlus;
    }

    public long getAgi() {
      return agi;
    }

    public float getMoveSpeedIncrementFromAgi() {
      return moveSpeedIncrementFromAgi;
    }

    public float getAttackSpeedIncrementFromAgi() {
      return attackSpeedIncrementFromAgi;
    }

    public float getAgiPlus() {
      return agiPlus;
    }

    public long getIntelligence() {
      return intelligence;
    }

    public float getIntPlus() {
      return intPlus;
    }

    public List<HeroSkill> getHeroSkill() {
      return heroSkill;
    }

    public List<Long> getUnknown4() {
      return unknown4;
    }

    public float getLifeIncrement() {
      return lifeIncrement;
    }

    public float getManaIncrement() {
      return manaIncrement;
    }

    public float getSightRangeDay() {
      return sightRangeDay;
    }

    public List<Integer> getUnknown7() {
      return unknown7;
    }

    public long getAtkIncrement1() {
      return atkIncrement1;
    }

    public long getAtkIncrement2() {
      return atkIncrement2;
    }

    public float getArmorIncrement() {
      return armorIncrement;
    }

    public List<Integer> getUnknown8() {
      return unknown8;
    }

    public void setName(W3str value) {
      this.name = value;
    }

    public void setUnitId(W3id value) {
      this.unitId = value;
    }

    public void setInventorySlot(List<InventorySlot> value) {
      this.inventorySlot = value;
    }

    public void setExperience(long value) {
      this.experience = value;
    }

    public void setLevelMinusOne(long value) {
      this.levelMinusOne = value;
    }

    public void setUnusedSkillPoints(long value) {
      this.unusedSkillPoints = value;
    }

    public void setUnknown0(int value) {
      this.unknown0 = value;
    }

    public void setHeroProperNameIndex(int value) {
      this.heroProperNameIndex = value;
    }

    public void setStr(long value) {
      this.str = value;
    }

    public void setStrPlus(float value) {
      this.strPlus = value;
    }

    public void setAgi(long value) {
      this.agi = value;
    }

    public void setMoveSpeedIncrementFromAgi(float value) {
      this.moveSpeedIncrementFromAgi = value;
    }

    public void setAttackSpeedIncrementFromAgi(float value) {
      this.attackSpeedIncrementFromAgi = value;
    }

    public void setAgiPlus(float value) {
      this.agiPlus = value;
    }

    public void setIntelligence(long value) {
      this.intelligence = value;
    }

    public void setIntPlus(float value) {
      this.intPlus = value;
    }

    public void setHeroSkill(List<HeroSkill> value) {
      this.heroSkill = value;
    }

    public void setUnknown4(List<Long> value) {
      this.unknown4 = value;
    }

    public void setLifeIncrement(float value) {
      this.lifeIncrement = value;
    }

    public void setManaIncrement(float value) {
      this.manaIncrement = value;
    }

    public void setSightRangeDay(float value) {
      this.sightRangeDay = value;
    }

    public void setUnknown7(List<Integer> value) {
      this.unknown7 = value;
    }

    public void setAtkIncrement1(long value) {
      this.atkIncrement1 = value;
    }

    public void setAtkIncrement2(long value) {
      this.atkIncrement2 = value;
    }

    public void setArmorIncrement(float value) {
      this.armorIncrement = value;
    }

    public void setUnknown8(List<Integer> value) {
      this.unknown8 = value;
    }
  }

  public static class HeroSkill {
    private W3id abilityId;

    private long currentLevel;

    @Override
    public int hashCode() {
      return Objects.hash(getAbilityId(), getCurrentLevel());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof HeroSkill)) {
        return false;
      }
      final HeroSkill thatTyped = (HeroSkill) that;
      if (!Objects.equals(getAbilityId(), thatTyped.getAbilityId())) {
        return false;
      }
      if (!Objects.equals(getCurrentLevel(), thatTyped.getCurrentLevel())) {
        return false;
      }
      return true;
    }

    @Override
    public String toString() {
      final StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("{");
      stringBuilder.append("getAbilityId:");
      stringBuilder.append(getAbilityId());
      stringBuilder.append(", \n");
      stringBuilder.append("getCurrentLevel:");
      stringBuilder.append(getCurrentLevel());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public W3id getAbilityId() {
      return abilityId;
    }

    public long getCurrentLevel() {
      return currentLevel;
    }

    public void setAbilityId(W3id value) {
      this.abilityId = value;
    }

    public void setCurrentLevel(long value) {
      this.currentLevel = value;
    }
  }

  public static class RealEntry {
    private W3str name;

    private float value;

    @Override
    public int hashCode() {
      return Objects.hash(getName(), getValue());
    }

    @Override
    public boolean equals(Object that) {
      if (!(that instanceof RealEntry)) {
        return false;
      }
      final RealEntry thatTyped = (RealEntry) that;
      if (!Objects.equals(getName(), thatTyped.getName())) {
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
      stringBuilder.append("getName:");
      stringBuilder.append(getName());
      stringBuilder.append(", \n");
      stringBuilder.append("getValue:");
      stringBuilder.append(getValue());
      stringBuilder.append("}");
      return stringBuilder.toString();
    }

    public W3str getName() {
      return name;
    }

    public float getValue() {
      return value;
    }

    public void setName(W3str value) {
      this.name = value;
    }

    public void setValue(float value) {
      this.value = value;
    }
  }
}
