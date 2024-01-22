package w3.env.placement.terrain.w3e.impl.std;

import w3.common.core.Wc3BinOutputStream;
import w3.env.placement.terrain.w3e.EncodingFormat;
import w3.env.placement.terrain.w3e.W3E;
import w3.env.placement.terrain.w3e.W3ESerializer;
import w3.env.placement.terrain.w3e.model.W3W3e;
import w3.env.placement.terrain.w3e.model.W3id;

import javax.annotation.Nonnull;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StdW3ESerializer implements W3ESerializer {
    private final Wc3BinOutputStream outputStream;
    private final EncodingFormat format;

    public StdW3ESerializer(@Nonnull Wc3BinOutputStream outputStream, EncodingFormat format) {
        this.outputStream = outputStream;
        this.format = format;
    }

    @Override
    public void serialize(W3E w3e) {
        write(w3e, format);
    }

    private void write(W3E w3e, EncodingFormat format) {
        switch (format.toEnum()) {
            case AUTO:
                format = EncodingFormat.valueOf((int) w3e.getVersion());

                if (format == null) {
                    throw new IllegalArgumentException("no writer for " + w3e.getVersion());
                }

                write(w3e, format);

                break;
            case W3E_0xB: {
                write_0xB(w3e);

                break;
            }
        }
    }

    private void write_0xB(W3E w3e) {
        outputStream.writeId(w3e.getFileId());
        outputStream.writeUInt32(w3e.getVersion());
        outputStream.writeUInt8((int) w3e.getTileset().id());
        outputStream.writeUInt32(w3e.getUseCustomTileset());
        outputStream.writeUInt32(w3e.getTileId().size());
        w3e.getTileId().forEach(outputStream::writeId);
        outputStream.writeUInt32(w3e.getCliffTileId().size());
        w3e.getCliffTileId().forEach(outputStream::writeId);
        outputStream.writeUInt32(w3e.getMapWidth());
        outputStream.writeUInt32(w3e.getMapHeight());
        outputStream.writeFloat32(w3e.getCenterOffsetX());
        outputStream.writeFloat32(w3e.getCenterOffsetY());
        w3e.getTileNode().forEach(tileNode -> {
            outputStream.writeUInt16(tileNode.getGroundHeight());
            outputStream.writeUInt16(waterHeightAndBoundaryToInt(tileNode.getWaterHeightAndBoundary()), ByteOrder.BIG_ENDIAN);
            outputStream.writeUInt8(flagsAndGroundTextureToInt(tileNode.getFlagsAndGroundTexture()));
            outputStream.writeUInt8(tileNode.getGroundAndCliffVariation());
            outputStream.writeUInt8(cliffTextureAndLayerHeightToInt(tileNode.getCliffTextureAndLayerHeight()));
        });
    }

    private int waterHeightAndBoundaryToInt(W3E.WaterHeightAndBoundary waterHeightAndBoundary) {
        return (int) (waterHeightAndBoundary.getWaterHeight() << 1 | (waterHeightAndBoundary.getFlag() ? 1 : 0));
    }

    private int flagsAndGroundTextureToInt(W3E.FlagsAndGroundTexture flagsAndGroundTexture) {
        return (int) (((flagsAndGroundTexture.getBoundary2() ? 1 : 0) << 7) | ((flagsAndGroundTexture.getWater() ? 1 : 0) << 6) | ((flagsAndGroundTexture.getBlight() ? 1 : 0) << 5) | ((flagsAndGroundTexture.getRamp() ? 1 : 0) << 4) | flagsAndGroundTexture.getTexture());
    }

    private int cliffTextureAndLayerHeightToInt(W3E.CliffTextureAndLayerHeight cliffTextureAndLayerHeight) {
        return (int) (cliffTextureAndLayerHeight.getTexture() << 4 | cliffTextureAndLayerHeight.getLayer());
    }
}
