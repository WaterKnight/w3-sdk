package w3.env.placement.object.units_doo.model;

import java.util.stream.Collectors;

public class kaitaiToW3DooUnitsMapper {
  public static W3DooUnits map(w3.env.placement.object.units_doo.model.kaitai.W3DooUnits data) {
    if (data == null) {
      return null;
    }
    final W3DooUnits newData = new W3DooUnits();
    newData.setFileId(kaitaiToW3idMapper.map(data.fileId()));
    newData.setVersion(data.version());
    newData.setSubVersion(data.subVersion());
    newData.setUnit(data.unit().stream().map(kaitaiToUnitMapper::map).collect(Collectors.toList()));
    newData.setUseSkin(data.useSkin());
    return newData;
  }

  public static class kaitaiToRandomBuildingItemMapper {
    public static W3DooUnits.RandomBuildingItem map(
        w3.env.placement.object.units_doo.model.kaitai.W3DooUnits.RandomBuildingItem data) {
      if (data == null) {
        return null;
      }
      final W3DooUnits.RandomBuildingItem newData = new W3DooUnits.RandomBuildingItem();
      newData.setLevel(data.level());
      newData.setUnknown1(data.unknown1());
      newData.setUnknown2(data.unknown2());
      newData.setItemClass(data.itemClass());
      return newData;
    }
  }

  public static class kaitaiToGroupUnitMapper {
    public static W3DooUnits.GroupUnit map(
        w3.env.placement.object.units_doo.model.kaitai.W3DooUnits.GroupUnit data) {
      if (data == null) {
        return null;
      }
      final W3DooUnits.GroupUnit newData = new W3DooUnits.GroupUnit();
      newData.setId(kaitaiToW3idMapper.map(data.id()));
      newData.setChance(data.chance());
      return newData;
    }
  }

  public static class kaitaiToAbilityModMapper {
    public static W3DooUnits.AbilityMod map(
        w3.env.placement.object.units_doo.model.kaitai.W3DooUnits.AbilityMod data) {
      if (data == null) {
        return null;
      }
      final W3DooUnits.AbilityMod newData = new W3DooUnits.AbilityMod();
      newData.setId(kaitaiToW3idMapper.map(data.id()));
      newData.setAutocastActive(kaitaiToAutocastActiveMapper.map(data.autocastActive()));
      newData.setLevel(data.level());
      return newData;
    }
  }

  public static class kaitaiToRandomMapper {
    public static W3DooUnits.Random map(
        w3.env.placement.object.units_doo.model.kaitai.W3DooUnits.Random data) {
      if (data == null) {
        return null;
      }
      final W3DooUnits.Random newData = new W3DooUnits.Random();
      newData.setRandomType(data.randomType());
      newData.setRandomTypeRest(data.randomTypeRest());
      try {
        newData.setValue(Class.forName(kaitaiToW3DooUnitsMapper.class.getTypeName() + "$kaitaiTo" + data.value().getClass().getSimpleName() + "Mapper").getMethod("map", data.value().getClass()).invoke(null, data.value()));
      } catch (Exception e) {
        throw new AssertionError(e);
      }
      return newData;
    }
  }

  public static class kaitaiToAutocastActiveMapper {
    public static W3DooUnits.AutocastActive map(
        w3.env.placement.object.units_doo.model.kaitai.W3DooUnits.AutocastActive data) {
      if (data == null) {
        return null;
      }
      return W3DooUnits.AutocastActive.valueOf(data.name());
    }
  }

  public static class kaitaiToUnitMapper {
    public static W3DooUnits.Unit map(
        w3.env.placement.object.units_doo.model.kaitai.W3DooUnits.Unit data) {
      if (data == null) {
        return null;
      }
      final W3DooUnits.Unit newData = new W3DooUnits.Unit();
      newData.setId(kaitaiToW3idMapper.map(data.id()));
      newData.setVariation(data.variation());
      newData.setx(data.x());
      newData.sety(data.y());
      newData.setz(data.z());
      newData.setAngle(data.angle());
      newData.setScaleX(data.scaleX());
      newData.setScaleY(data.scaleY());
      newData.setScaleZ(data.scaleZ());
      newData.setSkinId(kaitaiToW3idMapper.map(data.skinId()));
      newData.setFlags(data.flags());
      newData.setOwnerIndex(data.ownerIndex());
      newData.setUnknown1(data.unknown1());
      newData.setUnknown2(data.unknown2());
      newData.setLife(data.life());
      newData.setMana(data.mana());
      newData.setDroppedItemSetPtr(data.droppedItemSetPtr());
      newData.setDroppedItemSet(data.droppedItemSet().stream().map(kaitaiToItemSetMapper::map).collect(Collectors.toList()));
      newData.setResourcesAmount(data.resourcesAmount());
      newData.setTargetAquisition(data.targetAquisition());
      newData.setHeroLevel(data.heroLevel());
      newData.setHeroStrength(data.heroStrength());
      newData.setHeroAgility(data.heroAgility());
      newData.setHeroIntelligence(data.heroIntelligence());
      newData.setInventoryItem(data.inventoryItem().stream().map(kaitaiToInventoryItemMapper::map).collect(Collectors.toList()));
      newData.setAbilityMod(data.abilityMod().stream().map(kaitaiToAbilityModMapper::map).collect(Collectors.toList()));
      newData.setRandom(kaitaiToRandomMapper.map(data.random()));
      newData.setColor(data.color());
      newData.setWaygate(data.waygate());
      newData.setUnitId(data.unitId());
      return newData;
    }
  }

  public static class kaitaiToItemSetMapper {
    public static W3DooUnits.ItemSet map(
        w3.env.placement.object.units_doo.model.kaitai.W3DooUnits.ItemSet data) {
      if (data == null) {
        return null;
      }
      final W3DooUnits.ItemSet newData = new W3DooUnits.ItemSet();
      newData.setItem(data.item().stream().map(kaitaiToItemMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToItemMapper {
    public static W3DooUnits.Item map(
        w3.env.placement.object.units_doo.model.kaitai.W3DooUnits.Item data) {
      if (data == null) {
        return null;
      }
      final W3DooUnits.Item newData = new W3DooUnits.Item();
      newData.setId(kaitaiToW3idMapper.map(data.id()));
      newData.setChance(data.chance());
      return newData;
    }
  }

  public static class kaitaiToInventoryItemMapper {
    public static W3DooUnits.InventoryItem map(
        w3.env.placement.object.units_doo.model.kaitai.W3DooUnits.InventoryItem data) {
      if (data == null) {
        return null;
      }
      final W3DooUnits.InventoryItem newData = new W3DooUnits.InventoryItem();
      newData.setSlot(data.slot());
      newData.setId(kaitaiToW3idMapper.map(data.id()));
      return newData;
    }
  }

  public static class kaitaiToCustomGroupMapper {
    public static W3DooUnits.CustomGroup map(
        w3.env.placement.object.units_doo.model.kaitai.W3DooUnits.CustomGroup data) {
      if (data == null) {
        return null;
      }
      final W3DooUnits.CustomGroup newData = new W3DooUnits.CustomGroup();
      newData.setGroupUnit(data.groupUnit().stream().map(kaitaiToGroupUnitMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToW3iGroupMapper {
    public static W3DooUnits.W3iGroup map(
        w3.env.placement.object.units_doo.model.kaitai.W3DooUnits.W3iGroup data) {
      if (data == null) {
        return null;
      }
      final W3DooUnits.W3iGroup newData = new W3DooUnits.W3iGroup();
      newData.setIndex(data.index());
      newData.setColumnIndex(data.columnIndex());
      return newData;
    }
  }
}
