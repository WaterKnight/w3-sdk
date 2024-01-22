package w3.env.placement.object.units_doo.impl.std;

import w3.common.core.Wc3BinOutputStream;
import w3.env.placement.object.units_doo.api.UnitsDooSerializer;
import w3.env.placement.object.units_doo.model.EncodingFormat;
import w3.env.placement.object.units_doo.model.UnitsDoo;
import w3.env.placement.object.units_doo.model.W3DooUnits;

import javax.annotation.Nonnull;

public class StdUnitsDooSerializer implements UnitsDooSerializer {
    private final Wc3BinOutputStream outputStream;
    private final EncodingFormat format;
    private final boolean use_skin;

    public StdUnitsDooSerializer(@Nonnull Wc3BinOutputStream outputStream, EncodingFormat format, boolean use_skin) {
        this.outputStream = outputStream;
        this.format = format;
        this.use_skin = use_skin;
    }

    @Override
    public void serialize(UnitsDoo unitsDoo) {
        write(unitsDoo, format);
    }

    private void write(UnitsDoo unitsDoo, EncodingFormat format) {
        switch (format.toEnum()) {
            case AUTO:
                format = EncodingFormat.valueOf((int) unitsDoo.getVersion());

                if (format == null) {
                    throw new IllegalArgumentException("no writer for " + unitsDoo.getVersion());
                }

                write(unitsDoo, format);

                break;
            case DOO_0x8: {
                write_0x8(unitsDoo);

                break;
            }
        }
    }

    private void write_0x8(UnitsDoo unitsDoo) {
        outputStream.writeId(unitsDoo.getFileId());
        outputStream.writeUInt32(unitsDoo.getVersion());
        outputStream.writeUInt32(unitsDoo.getSubVersion());
        outputStream.writeUInt32(unitsDoo.getUnit().size());
        unitsDoo.getUnit().forEach(unit -> {
            outputStream.writeId(unit.getId());
            outputStream.writeUInt32(unit.getVariation());
            outputStream.writeFloat32(unit.getx());
            outputStream.writeFloat32(unit.gety());
            outputStream.writeFloat32(unit.getz());
            outputStream.writeFloat32(unit.getAngle());
            outputStream.writeFloat32(unit.getScaleX());
            outputStream.writeFloat32(unit.getScaleY());
            outputStream.writeFloat32(unit.getScaleZ());
            if (use_skin) {
                outputStream.writeId(unit.getSkinId());
            }
            outputStream.writeUInt8(unit.getFlags());
            outputStream.writeUInt32(unit.getOwnerIndex());
            outputStream.writeUInt8(unit.getUnknown1());
            outputStream.writeUInt8(unit.getUnknown2());
            outputStream.writeUInt32(unit.getLife());
            outputStream.writeUInt32(unit.getMana());
            if (unitsDoo.getSubVersion() >= 11) {
                outputStream.writeUInt32(unit.getDroppedItemSetPtr());
            }
            outputStream.writeUInt32(unit.getDroppedItemSet().size());
            unit.getDroppedItemSet().forEach(itemSet -> {
                outputStream.writeUInt32(itemSet.getItem().size());
                itemSet.getItem().forEach(item -> {
                    outputStream.writeId(item.getId());
                    outputStream.writeUInt32(item.getChance());
                });
            });
            outputStream.writeUInt32(unit.getResourcesAmount());
            outputStream.writeFloat32(unit.getTargetAquisition());
            outputStream.writeUInt32(unit.getHeroLevel());
            if (unitsDoo.getSubVersion() >= 11) {
                outputStream.writeUInt32(unit.getHeroStrength());
                outputStream.writeUInt32(unit.getHeroAgility());
                outputStream.writeUInt32(unit.getHeroIntelligence());
            }
            outputStream.writeUInt32(unit.getInventoryItem().size());
            unit.getInventoryItem().forEach(inventoryItem -> {
                outputStream.writeUInt32(inventoryItem.getSlot());
                outputStream.writeId(inventoryItem.getId());
            });
            outputStream.writeUInt32(unit.getAbilityMod().size());
            unit.getAbilityMod().forEach(abilityMod -> {
                outputStream.writeId(abilityMod.getId());
                outputStream.writeUInt32(abilityMod.getAutocastActive().id());
                outputStream.writeUInt32(abilityMod.getLevel());
            });
            // begin random
            outputStream.writeUInt16(unit.getRandom().getRandomType());
            outputStream.writeUInt16(unit.getRandom().getRandomTypeRest());
            final Object randomValue = unit.getRandom().getValue();
            if (randomValue instanceof W3DooUnits.RandomBuildingItem) {
                outputStream.writeUInt8(((W3DooUnits.RandomBuildingItem) randomValue).getLevel());
                outputStream.writeUInt8(((W3DooUnits.RandomBuildingItem) randomValue).getUnknown1());
                outputStream.writeUInt8(((W3DooUnits.RandomBuildingItem) randomValue).getUnknown2());
                outputStream.writeUInt8(((W3DooUnits.RandomBuildingItem) randomValue).getItemClass());
            }
            if (randomValue instanceof W3DooUnits.W3iGroup) {
                outputStream.writeUInt32(((W3DooUnits.W3iGroup) randomValue).getIndex());
                outputStream.writeUInt32(((W3DooUnits.W3iGroup) randomValue).getColumnIndex());
            }
            if (randomValue instanceof W3DooUnits.CustomGroup) {
                outputStream.writeUInt32(((W3DooUnits.CustomGroup) randomValue).getGroupUnit().size());
                ((W3DooUnits.CustomGroup) randomValue).getGroupUnit().forEach(groupUnit -> {
                    outputStream.writeId(groupUnit.getId());
                    outputStream.writeUInt32(groupUnit.getChance());
                });
            }
            // end random
            outputStream.writeUInt32(unit.getColor());
            outputStream.writeUInt32(unit.getWaygate());
            outputStream.writeUInt32(unit.getUnitId());
        });
    }
}
