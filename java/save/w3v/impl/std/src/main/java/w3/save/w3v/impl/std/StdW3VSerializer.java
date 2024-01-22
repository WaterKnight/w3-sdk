package w3.save.w3v.impl.std;

import w3.common.core.ZCompression;
import w3.common.core.Wc3BinOutputStream;
import w3.save.w3v.api.W3VSerializer;
import w3.save.w3v.model.EncodingFormat;
import w3.save.w3v.model.W3V;
import w3.save.w3v.model.W3W3v;
import w3.save.w3v.model.W3str;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StdW3VSerializer implements W3VSerializer {
    private final Wc3BinOutputStream outputStream;
    private final EncodingFormat format;
    private final boolean compress;

    public StdW3VSerializer(Wc3BinOutputStream outputStream, EncodingFormat format, boolean compress) {
        this.outputStream = outputStream;
        this.format = format;
        this.compress = compress;
    }

    @Override
    public void serialize(W3V data) {
        write(data, format);
    }

    private void write(W3V w3v, EncodingFormat format) {
        switch (format.toEnum()) {
            case AUTO:
                format = EncodingFormat.valueOf((int) w3v.getVersion());

                if (format == null) {
                    throw new IllegalArgumentException("no writer for " + w3v.getVersion());
                }

                write(w3v, format);

                break;
            case W3V_0x1: {
                write_0x1(w3v);

                break;
            }
        }
    }

    public void write_0x1(W3V data) {
        final ByteArrayOutputStream uncompressedByteStream = new ByteArrayOutputStream();
        final Wc3BinOutputStream outputStream = new Wc3BinOutputStream(uncompressedByteStream);

        outputStream.writeUInt32(data.getVersion());
        outputStream.writeUInt32(data.getGameCache().size());
        data.getGameCache().forEach(gameCache -> {
            outputStream.writeString(Optional.ofNullable(gameCache.getName()).map(W3str::getValue).orElse(null));
            outputStream.writeUInt32(gameCache.getReserved());
            outputStream.writeUInt32(gameCache.getCategory().size());
            gameCache.getCategory().forEach(category -> {
                outputStream.writeString(Optional.ofNullable(category.getName()).map(W3str::getValue).orElse(null));
                category.getReservedVarTypes().forEach(outputStream::writeUInt8);
                category.getFiller().forEach(outputStream::writeUInt8);
                outputStream.writeUInt32(category.getIntEntry().size());
                category.getIntEntry().forEach(intEntry -> {
                    outputStream.writeString(Optional.ofNullable(intEntry.getName()).map(W3str::getValue).orElse(null));
                    outputStream.writeUInt32(intEntry.getValue());
                });
                outputStream.writeUInt32(category.getRealEntry().size());
                category.getRealEntry().forEach(realEntry -> {
                    outputStream.writeString(Optional.ofNullable(realEntry.getName()).map(W3str::getValue).orElse(null));
                    outputStream.writeFloat32(realEntry.getValue());
                });
                outputStream.writeUInt32(category.getBooleanEntry().size());
                category.getBooleanEntry().forEach(booleanEntry -> {
                    outputStream.writeString(Optional.ofNullable(booleanEntry.getName()).map(W3str::getValue).orElse(null));
                    outputStream.writeUInt32(booleanEntry.getValue());
                });
                outputStream.writeUInt32(category.getUnitEntry().size());
                category.getUnitEntry().forEach(unitEntry -> {
                    outputStream.writeString(Optional.ofNullable(unitEntry.getName()).map(W3str::getValue).orElse(null));
                    outputStream.writeId(unitEntry.getUnitId());
                    outputStream.writeUInt32(unitEntry.getInventorySlot().size());
                    unitEntry.getInventorySlot().forEach(inventorySlot -> {
                        outputStream.writeId(inventorySlot.getItemId());
                        outputStream.writeUInt32(inventorySlot.getCharges());
                        outputStream.writeUInt8(flagsToInt(inventorySlot.getFlags()));
                        outputStream.writeUInt8(flagsToInt(inventorySlot.getFlags2()));
                        outputStream.writeUInt8(inventorySlot.getFlags3());
                        outputStream.writeUInt8(inventorySlot.getFlags4());
                    });
                    outputStream.writeUInt32(unitEntry.getExperience());
                    outputStream.writeUInt32(unitEntry.getLevelMinusOne());
                    outputStream.writeUInt32(unitEntry.getUnusedSkillPoints());
                    outputStream.writeUInt16(unitEntry.getUnknown0());
                    outputStream.writeUInt16(unitEntry.getHeroProperNameIndex());
                    outputStream.writeUInt32(unitEntry.getStr());
                    outputStream.writeFloat32(unitEntry.getStrPlus());
                    outputStream.writeUInt32(unitEntry.getAgi());
                    outputStream.writeFloat32(unitEntry.getMoveSpeedIncrementFromAgi());
                    outputStream.writeFloat32(unitEntry.getAttackSpeedIncrementFromAgi());
                    outputStream.writeFloat32(unitEntry.getAgiPlus());
                    outputStream.writeUInt32(unitEntry.getIntelligence());
                    outputStream.writeFloat32(unitEntry.getIntPlus());
                    outputStream.writeUInt32(unitEntry.getHeroSkill().size());
                    unitEntry.getHeroSkill().forEach(heroSkill -> {
                        outputStream.writeId(heroSkill.getAbilityId());
                        outputStream.writeUInt32(heroSkill.getCurrentLevel());
                    });
                    unitEntry.getUnknown4().forEach(outputStream::writeUInt32); // may not exist
                    outputStream.writeFloat32(unitEntry.getLifeIncrement());
                    outputStream.writeFloat32(unitEntry.getManaIncrement());
                    outputStream.writeFloat32(unitEntry.getSightRangeDay());
                    unitEntry.getUnknown7().forEach(outputStream::writeUInt8);
                    outputStream.writeUInt32(unitEntry.getAtkIncrement1());
                    outputStream.writeUInt32(unitEntry.getAtkIncrement2());
                    outputStream.writeFloat32(unitEntry.getArmorIncrement());
                    unitEntry.getUnknown8().forEach(outputStream::writeUInt8);
                });
            });
        });

        try {
            outputStream.close();

            final byte[] uncompressedBytes = uncompressedByteStream.toByteArray();

            if (compress) {
                final byte[] compressedBytes = ZCompression.compress(uncompressedBytes);
                this.outputStream.writeBytes(compressedBytes);
            } else {
                this.outputStream.writeBytes(uncompressedByteStream.toByteArray());
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    private int flagsToInt(W3W3v.ItemFlags flags) {
        final List<Boolean> booleans = new ArrayList<>(Arrays.asList(
                flags.getFlag0(),
                flags.getFlag1(),
                flags.getFlag2(),
                flags.getInvulnerable(),
                flags.getFlag4(),
                flags.getFlag5(),
                flags.getPerishable(),
                flags.getDropUponDeath()
        ));
        int result = 0;
        // fill byte
        while (booleans.size() % 8 != 0) {
            booleans.add(Boolean.FALSE);
        }
        for (int i = 0; i < booleans.size(); i++) {
            final int byteReversedIndex = i / 8  * 8 + 7 - i % 8;
            if (booleans.get(byteReversedIndex)) {
                result |= (1 << i);
            }
        }
        return result;
    }

    private int flagsToInt(W3W3v.ItemFlags2 flags) {
        final List<Boolean> booleans = new ArrayList<>(Arrays.asList(
                flags.getFlag0(),
                flags.getActivelyUsed(),
                flags.getDroppable(),
                flags.getFlag3(),
                flags.getFlag4(),
                flags.getPawnable(),
                flags.getFlag6(),
                flags.getFlag7()
        ));
        int result = 0;
        // fill byte
        while (booleans.size() % 8 != 0) {
            booleans.add(Boolean.FALSE);
        }
        for (int i = 0; i < booleans.size(); i++) {
            final int byteReversedIndex = i / 8  * 8 + 7 - i % 8;
            if (booleans.get(byteReversedIndex)) {
                result |= (1 << i);
            }
        }
        return result;
    }
}
