package w3.save.w3v.model;

import java.util.stream.Collectors;

public class kaitaiToW3W3vMapper {
  public static W3W3v map(w3.save.w3v.impl.kaitai.W3W3v data) {
    if (data == null) {
      return null;
    }
    final W3W3v newData = new W3W3v();
    newData.setVersion(data.version());
    newData.setGameCache(data.gameCache().stream().map(kaitaiToGameCacheMapper::map).collect(Collectors.toList()));
    return newData;
  }

  public static class kaitaiToItemFlags2Mapper {
    public static W3W3v.ItemFlags2 map(w3.save.w3v.impl.kaitai.W3W3v.ItemFlags2 data) {
      if (data == null) {
        return null;
      }
      final W3W3v.ItemFlags2 newData = new W3W3v.ItemFlags2();
      newData.setFlag7(data.flag7());
      newData.setFlag6(data.flag6());
      newData.setPawnable(data.pawnable());
      newData.setFlag4(data.flag4());
      newData.setFlag3(data.flag3());
      newData.setDroppable(data.droppable());
      newData.setActivelyUsed(data.activelyUsed());
      newData.setFlag0(data.flag0());
      return newData;
    }
  }

  public static class kaitaiToCategoryMapper {
    public static W3W3v.Category map(w3.save.w3v.impl.kaitai.W3W3v.Category data) {
      if (data == null) {
        return null;
      }
      final W3W3v.Category newData = new W3W3v.Category();
      newData.setName(kaitaiToW3strMapper.map(data.name()));
      newData.setReservedVarTypes(data.reservedVarTypes());
      newData.setFiller(data.filler());
      newData.setIntEntry(data.intEntry().stream().map(kaitaiToIntEntryMapper::map).collect(Collectors.toList()));
      newData.setRealEntry(data.realEntry().stream().map(kaitaiToRealEntryMapper::map).collect(Collectors.toList()));
      newData.setBooleanEntry(data.booleanEntry().stream().map(kaitaiToBooleanEntryMapper::map).collect(Collectors.toList()));
      newData.setUnitEntry(data.unitEntry().stream().map(kaitaiToUnitEntryMapper::map).collect(Collectors.toList()));
      newData.setStringEntry(data.stringEntry().stream().map(kaitaiToStringEntryMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToIntEntryMapper {
    public static W3W3v.IntEntry map(w3.save.w3v.impl.kaitai.W3W3v.IntEntry data) {
      if (data == null) {
        return null;
      }
      final W3W3v.IntEntry newData = new W3W3v.IntEntry();
      newData.setName(kaitaiToW3strMapper.map(data.name()));
      newData.setValue(data.value());
      return newData;
    }
  }

  public static class kaitaiToBooleanEntryMapper {
    public static W3W3v.BooleanEntry map(w3.save.w3v.impl.kaitai.W3W3v.BooleanEntry data) {
      if (data == null) {
        return null;
      }
      final W3W3v.BooleanEntry newData = new W3W3v.BooleanEntry();
      newData.setName(kaitaiToW3strMapper.map(data.name()));
      newData.setValue(data.value());
      return newData;
    }
  }

  public static class kaitaiToItemFlagsMapper {
    public static W3W3v.ItemFlags map(w3.save.w3v.impl.kaitai.W3W3v.ItemFlags data) {
      if (data == null) {
        return null;
      }
      final W3W3v.ItemFlags newData = new W3W3v.ItemFlags();
      newData.setDropUponDeath(data.dropUponDeath());
      newData.setPerishable(data.perishable());
      newData.setFlag5(data.flag5());
      newData.setFlag4(data.flag4());
      newData.setInvulnerable(data.invulnerable());
      newData.setFlag2(data.flag2());
      newData.setFlag1(data.flag1());
      newData.setFlag0(data.flag0());
      return newData;
    }
  }

  public static class kaitaiToStringEntryMapper {
    public static W3W3v.StringEntry map(w3.save.w3v.impl.kaitai.W3W3v.StringEntry data) {
      if (data == null) {
        return null;
      }
      final W3W3v.StringEntry newData = new W3W3v.StringEntry();
      newData.setName(kaitaiToW3strMapper.map(data.name()));
      newData.setValue(kaitaiToW3strMapper.map(data.value()));
      return newData;
    }
  }

  public static class kaitaiToGameCacheMapper {
    public static W3W3v.GameCache map(w3.save.w3v.impl.kaitai.W3W3v.GameCache data) {
      if (data == null) {
        return null;
      }
      final W3W3v.GameCache newData = new W3W3v.GameCache();
      newData.setName(kaitaiToW3strMapper.map(data.name()));
      newData.setReserved(data.reserved());
      newData.setCategory(data.category().stream().map(kaitaiToCategoryMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToInventorySlotMapper {
    public static W3W3v.InventorySlot map(w3.save.w3v.impl.kaitai.W3W3v.InventorySlot data) {
      if (data == null) {
        return null;
      }
      final W3W3v.InventorySlot newData = new W3W3v.InventorySlot();
      newData.setItemId(kaitaiToW3idMapper.map(data.itemId()));
      newData.setCharges(data.charges());
      newData.setFlags(kaitaiToItemFlagsMapper.map(data.flags()));
      newData.setFlags2(kaitaiToItemFlags2Mapper.map(data.flags2()));
      newData.setFlags3(data.flags3());
      newData.setFlags4(data.flags4());
      return newData;
    }
  }

  public static class kaitaiToUnitEntryMapper {
    public static W3W3v.UnitEntry map(w3.save.w3v.impl.kaitai.W3W3v.UnitEntry data) {
      if (data == null) {
        return null;
      }
      final W3W3v.UnitEntry newData = new W3W3v.UnitEntry();
      newData.setName(kaitaiToW3strMapper.map(data.name()));
      newData.setUnitId(kaitaiToW3idMapper.map(data.unitId()));
      newData.setInventorySlot(data.inventorySlot().stream().map(kaitaiToInventorySlotMapper::map).collect(Collectors.toList()));
      newData.setExperience(data.experience());
      newData.setLevelMinusOne(data.levelMinusOne());
      newData.setUnusedSkillPoints(data.unusedSkillPoints());
      newData.setUnknown0(data.unknown0());
      newData.setHeroProperNameIndex(data.heroProperNameIndex());
      newData.setStr(data.str());
      newData.setStrPlus(data.strPlus());
      newData.setAgi(data.agi());
      newData.setMoveSpeedIncrementFromAgi(data.moveSpeedIncrementFromAgi());
      newData.setAttackSpeedIncrementFromAgi(data.attackSpeedIncrementFromAgi());
      newData.setAgiPlus(data.agiPlus());
      newData.setIntelligence(data.intelligence());
      newData.setIntPlus(data.intPlus());
      newData.setHeroSkill(data.heroSkill().stream().map(kaitaiToHeroSkillMapper::map).collect(Collectors.toList()));
      newData.setUnknown4(data.unknown4());
      newData.setLifeIncrement(data.lifeIncrement());
      newData.setManaIncrement(data.manaIncrement());
      newData.setSightRangeDay(data.sightRangeDay());
      newData.setUnknown7(data.unknown7());
      newData.setAtkIncrement1(data.atkIncrement1());
      newData.setAtkIncrement2(data.atkIncrement2());
      newData.setArmorIncrement(data.armorIncrement());
      newData.setUnknown8(data.unknown8());
      return newData;
    }
  }

  public static class kaitaiToHeroSkillMapper {
    public static W3W3v.HeroSkill map(w3.save.w3v.impl.kaitai.W3W3v.HeroSkill data) {
      if (data == null) {
        return null;
      }
      final W3W3v.HeroSkill newData = new W3W3v.HeroSkill();
      newData.setAbilityId(kaitaiToW3idMapper.map(data.abilityId()));
      newData.setCurrentLevel(data.currentLevel());
      return newData;
    }
  }

  public static class kaitaiToRealEntryMapper {
    public static W3W3v.RealEntry map(w3.save.w3v.impl.kaitai.W3W3v.RealEntry data) {
      if (data == null) {
        return null;
      }
      final W3W3v.RealEntry newData = new W3W3v.RealEntry();
      newData.setName(kaitaiToW3strMapper.map(data.name()));
      newData.setValue(data.value());
      return newData;
    }
  }
}
