package w3.env.placement.object.doo.impl.std;

import w3.common.core.Wc3BinOutputStream;
import w3.env.placement.object.doo.api.DooSerializer;
import w3.env.placement.object.doo.model.Doo;
import w3.env.placement.object.doo.model.EncodingFormat;

import javax.annotation.Nonnull;

public class StdDooSerializer implements DooSerializer {
    private final Wc3BinOutputStream outputStream;
    private final EncodingFormat format;
    private final boolean use_skin;

    public StdDooSerializer(@Nonnull Wc3BinOutputStream outputStream, EncodingFormat format, boolean use_skin) {
        this.outputStream = outputStream;
        this.format = format;
        this.use_skin = use_skin;
    }

    @Override
    public void serialize(Doo doo) {
        write(doo, format);
    }

    private void write(Doo doo, EncodingFormat format) {
        switch (format.toEnum()) {
            case AUTO:
                format = EncodingFormat.valueOf((int) doo.getVersion());

                if (format == null) {
                    throw new IllegalArgumentException("no writer for " + doo.getVersion());
                }

                write(doo, format);

                break;
            case DOO_0x8: {
                write_0x8(doo);

                break;
            }
        }
    }

    private void write_0x8(Doo doo) {
        outputStream.writeId(doo.getFileId());
        outputStream.writeUInt32(doo.getVersion());
        outputStream.writeUInt32(doo.getSubVersion());
        outputStream.writeUInt32(doo.getDoodad().size());
        doo.getDoodad().forEach(doodad -> {
            outputStream.writeId(doodad.getId());
            outputStream.writeUInt32(doodad.getVariation());
            outputStream.writeFloat32(doodad.getx());
            outputStream.writeFloat32(doodad.gety());
            outputStream.writeFloat32(doodad.getz());
            outputStream.writeFloat32(doodad.getAngle());
            outputStream.writeFloat32(doodad.getScaleX());
            outputStream.writeFloat32(doodad.getScaleY());
            outputStream.writeFloat32(doodad.getScaleZ());
            if (use_skin) {
                outputStream.writeId(doodad.getSkinId());
            }
            outputStream.writeUInt8(doodad.getFlags());
            outputStream.writeUInt8(doodad.getLife());
            outputStream.writeUInt32(doodad.getRandomItemSetPtr());
            outputStream.writeUInt32(doodad.getItemSet().size());
            doodad.getItemSet().forEach(itemSet -> {
                outputStream.writeUInt32(itemSet.getItem().size());
                itemSet.getItem().forEach(item -> {
                    outputStream.writeId(item.getId());
                    outputStream.writeUInt32(item.getChance());
                });
            });
            outputStream.writeUInt32(doodad.getEditorId());
        });
        outputStream.writeUInt32(doo.getSpecialDoodadVersion());
        outputStream.writeUInt32(doo.getSpecialDoodad().size());
        doo.getSpecialDoodad().forEach(specialDoodad -> {
            outputStream.writeId(specialDoodad.getId());
            outputStream.writeFloat32(specialDoodad.getx());
            outputStream.writeFloat32(specialDoodad.gety());
            outputStream.writeFloat32(specialDoodad.getz());
        });
    }
}
