package w3.save.w3v.impl.kaitai;

import w3.save.w3v.model.W3V;
import w3.save.w3v.model.W3id;
import w3.save.w3v.model.W3str;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class W3W3vToW3VMapper {
    public W3V map(w3.save.w3v.impl.kaitai.W3W3v w3W3v) {
        final W3V w3v = new W3V();

        w3v.setVersion(w3v.getVersion());
        w3v.setGameCache(w3W3v.gameCache().stream().map(this::mapGameCache).collect(Collectors.toList()));

        return w3v;
    }

    private w3.save.w3v.model.W3W3v.GameCache mapGameCache(W3W3v.GameCache w3w3vGameCache) {
        final w3.save.w3v.model.W3W3v.GameCache gameCache = new w3.save.w3v.model.W3W3v.GameCache();

        gameCache.setCategory(w3w3vGameCache.category().stream().map(this::mapCategory).collect(Collectors.toList()));
        final W3str name = new W3str();
        name.setValue(w3w3vGameCache.name().value());
        gameCache.setName(name);
        gameCache.setReserved(w3w3vGameCache.reserved());

        return gameCache;
    }

    private w3.save.w3v.model.W3W3v.Category mapCategory(W3W3v.Category w3w3vCategory) {
        final w3.save.w3v.model.W3W3v.Category category = new w3.save.w3v.model.W3W3v.Category();

        category.setFiller(w3w3vCategory.filler());
        final W3str name = new W3str();
        name.setValue(w3w3vCategory.name().value());
        category.setName(name);
        category.setBooleanEntry(w3w3vCategory.booleanEntry().stream().map(this::mapBooleanEntry).collect(Collectors.toList()));
        category.setIntEntry(w3w3vCategory.intEntry().stream().map(this::mapIntEntry).collect(Collectors.toList()));
        category.setRealEntry(w3w3vCategory.realEntry().stream().map(this::mapRealEntry).collect(Collectors.toList()));
        category.setReservedVarTypes(w3w3vCategory.reservedVarTypes());
        category.setStringEntry(w3w3vCategory.stringEntry().stream().map(this::mapStringEntry).collect(Collectors.toList()));
        category.setUnitEntry(w3w3vCategory.unitEntry().stream().map(this::mapUnitEntry).collect(Collectors.toList()));

        return category;
    }

    private w3.save.w3v.model.W3W3v.BooleanEntry mapBooleanEntry(W3W3v.BooleanEntry w3w3vBooleanEntry) {
        final w3.save.w3v.model.W3W3v.BooleanEntry booleanEntry = new w3.save.w3v.model.W3W3v.BooleanEntry();

        final W3str name = new W3str();
        name.setValue(w3w3vBooleanEntry.name().value());
        booleanEntry.setName(name);
        booleanEntry.setValue(w3w3vBooleanEntry.value());

        return booleanEntry;
    }

    private w3.save.w3v.model.W3W3v.IntEntry mapIntEntry(W3W3v.IntEntry w3w3vIntEntry) {
        final w3.save.w3v.model.W3W3v.IntEntry intEntry = new w3.save.w3v.model.W3W3v.IntEntry();

        final W3str name = new W3str();
        name.setValue(w3w3vIntEntry.name().value());
        intEntry.setName(name);
        intEntry.setValue(w3w3vIntEntry.value());

        return intEntry;
    }

    private w3.save.w3v.model.W3W3v.RealEntry mapRealEntry(W3W3v.RealEntry w3w3vRealEntry) {
        final w3.save.w3v.model.W3W3v.RealEntry realEntry = new w3.save.w3v.model.W3W3v.RealEntry();

        final W3str name = new W3str();
        name.setValue(w3w3vRealEntry.name().value());
        realEntry.setName(name);
        realEntry.setValue(w3w3vRealEntry.value());

        return realEntry;
    }

    private w3.save.w3v.model.W3W3v.StringEntry mapStringEntry(W3W3v.StringEntry w3w3vStringEntry) {
        final w3.save.w3v.model.W3W3v.StringEntry stringEntry = new w3.save.w3v.model.W3W3v.StringEntry();

        final W3str name = new W3str();
        name.setValue(w3w3vStringEntry.name().value());
        stringEntry.setName(name);
        final W3str value = new W3str();
        name.setValue(w3w3vStringEntry.value().value());
        stringEntry.setValue(value);

        return stringEntry;
    }

    private w3.save.w3v.model.W3W3v.UnitEntry mapUnitEntry(W3W3v.UnitEntry w3w3vUnitEntry) {
        final w3.save.w3v.model.W3W3v.UnitEntry unitEntry = new w3.save.w3v.model.W3W3v.UnitEntry();

        //w3.save.w3v.model.W3W3v.
        final W3id unitId = new W3id(w3w3vUnitEntry.unitId().value());
        unitEntry.setUnitId(unitId);
        unitEntry.setAgi(w3w3vUnitEntry.agi());
        unitEntry.setAgiPlus(w3w3vUnitEntry.agiPlus());
        unitEntry.setExperience(w3w3vUnitEntry.experience());
        unitEntry.setArmorIncrement(w3w3vUnitEntry.armorIncrement());
        unitEntry.setAtkIncrement1(w3w3vUnitEntry.atkIncrement1());
        unitEntry.setAtkIncrement2(w3w3vUnitEntry.atkIncrement2());
        unitEntry.setIntelligence(w3w3vUnitEntry.intelligence());
        unitEntry.setIntPlus(w3w3vUnitEntry.intPlus());
        unitEntry.setStr(w3w3vUnitEntry.str());
        unitEntry.setStrPlus(w3w3vUnitEntry.strPlus());
        unitEntry.setAttackSpeedIncrementFromAgi(w3w3vUnitEntry.attackSpeedIncrementFromAgi());
        unitEntry.setHeroProperNameIndex(w3w3vUnitEntry.heroProperNameIndex());
        unitEntry.setMoveSpeedIncrementFromAgi(w3w3vUnitEntry.moveSpeedIncrementFromAgi());
        unitEntry.setLevelMinusOne(w3w3vUnitEntry.levelMinusOne());
        unitEntry.setLifeIncrement(w3w3vUnitEntry.lifeIncrement());
        unitEntry.setManaIncrement(w3w3vUnitEntry.manaIncrement());
        unitEntry.setSightRangeDay(w3w3vUnitEntry.sightRangeDay());
        final W3str name = new W3str();
        name.setValue(w3w3vUnitEntry.name().value());
        unitEntry.setName(name);
        unitEntry.setUnusedSkillPoints(w3w3vUnitEntry.unusedSkillPoints());
        unitEntry.setUnknown0(w3w3vUnitEntry.unknown0());
        unitEntry.setUnknown4(w3w3vUnitEntry.unknown4());
        unitEntry.setUnknown7(w3w3vUnitEntry.unknown7());
        unitEntry.setUnknown8(w3w3vUnitEntry.unknown8());

        unitEntry.setHeroSkill(w3w3vUnitEntry.heroSkill().stream().map(this::mapHeroSkill).collect(Collectors.toList()));
        unitEntry.setInventorySlot(w3w3vUnitEntry.inventorySlot().stream().map(this::mapInventorySlot).collect(Collectors.toList()));

        return unitEntry;
    }

    private w3.save.w3v.model.W3W3v.HeroSkill mapHeroSkill(W3W3v.HeroSkill w3w3vHeroSkill) {
        final w3.save.w3v.model.W3W3v.HeroSkill heroSkill = new w3.save.w3v.model.W3W3v.HeroSkill();

        heroSkill.setAbilityId(new W3id(w3w3vHeroSkill.abilityId().value()));
        heroSkill.setCurrentLevel(w3w3vHeroSkill.currentLevel());

        return heroSkill;
    }

    private w3.save.w3v.model.W3W3v.InventorySlot mapInventorySlot(W3W3v.InventorySlot w3w3vInventorySlot) {
        final w3.save.w3v.model.W3W3v.InventorySlot inventorySlot = new w3.save.w3v.model.W3W3v.InventorySlot();

        inventorySlot.setCharges(w3w3vInventorySlot.charges());
        inventorySlot.setFlags(mapItemFlags(w3w3vInventorySlot.flags()));
        inventorySlot.setFlags2(mapItemFlags2(w3w3vInventorySlot.flags2()));
        inventorySlot.setFlags3(w3w3vInventorySlot.flags3());
        inventorySlot.setFlags4(w3w3vInventorySlot.flags4());
        inventorySlot.setItemId(new W3id(w3w3vInventorySlot.itemId().value()));

        return inventorySlot;
    }

    private w3.save.w3v.model.W3W3v.ItemFlags mapItemFlags(W3W3v.ItemFlags w3w3vItemFlags) {
        final w3.save.w3v.model.W3W3v.ItemFlags itemFlags = new w3.save.w3v.model.W3W3v.ItemFlags();

        itemFlags.setFlag0(w3w3vItemFlags.flag0());
        itemFlags.setFlag1(w3w3vItemFlags.flag1());
        itemFlags.setFlag2(w3w3vItemFlags.flag2());
        itemFlags.setFlag4(w3w3vItemFlags.flag4());
        itemFlags.setFlag5(w3w3vItemFlags.flag5());
        itemFlags.setDropUponDeath(w3w3vItemFlags.dropUponDeath());
        itemFlags.setInvulnerable(w3w3vItemFlags.invulnerable());
        itemFlags.setPerishable(w3w3vItemFlags.perishable());

        return itemFlags;
    }

    private w3.save.w3v.model.W3W3v.ItemFlags2 mapItemFlags2(W3W3v.ItemFlags2 w3w3vItemFlags) {
        final w3.save.w3v.model.W3W3v.ItemFlags2 itemFlags = new w3.save.w3v.model.W3W3v.ItemFlags2();

        itemFlags.setFlag0(w3w3vItemFlags.flag0());
        itemFlags.setFlag3(w3w3vItemFlags.flag3());
        itemFlags.setFlag4(w3w3vItemFlags.flag4());
        itemFlags.setFlag6(w3w3vItemFlags.flag6());
        itemFlags.setFlag7(w3w3vItemFlags.flag7());
        itemFlags.setActivelyUsed(w3w3vItemFlags.activelyUsed());
        itemFlags.setDroppable(w3w3vItemFlags.droppable());
        itemFlags.setPawnable(w3w3vItemFlags.pawnable());

        return itemFlags;
    }
}
