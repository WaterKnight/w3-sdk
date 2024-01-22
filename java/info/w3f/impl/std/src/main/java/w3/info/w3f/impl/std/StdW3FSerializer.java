package w3.info.w3f.impl.std;

import w3.common.core.Wc3BinOutputStream;
import w3.info.w3f.api.W3FSerializer;
import w3.info.w3f.model.*;

import java.util.Optional;

public class StdW3FSerializer implements W3FSerializer {
    private final Wc3BinOutputStream outputStream;
    private final EncodingFormat format;

    public StdW3FSerializer(Wc3BinOutputStream outputStream, EncodingFormat format) {
        this.outputStream = outputStream;
        this.format = format;
    }

    @Override
    public void serialize(W3F w3f) {
        write(w3f, format);
    }

    private void write(W3F w3f, EncodingFormat format) {
        switch (format.toEnum()) {
            case AUTO:
                format = EncodingFormat.valueOf((int) w3f.getVersion());

                if (format == null) {
                    throw new IllegalArgumentException("no writer for " + w3f.getVersion());
                }

                write(w3f, format);

                break;
            case W3F_0x1: {
                write_0x1(w3f);

                break;
            }
        }
    }

    private void write_0x1(W3F w3f) {
        outputStream.writeUInt32(w3f.getVersion());
        outputStream.writeUInt32(w3f.getSaves());
        outputStream.writeUInt32(w3f.getEditorVersion());
        outputStream.writeString(Optional.ofNullable(w3f.getName()).map(W3str::getValue).orElse(null));
        outputStream.writeString(Optional.ofNullable(w3f.getDifficulty()).map(W3str::getValue).orElse(null));
        outputStream.writeString(Optional.ofNullable(w3f.getAuthor()).map(W3str::getValue).orElse(null));
        outputStream.writeString(Optional.ofNullable(w3f.getDescription()).map(W3str::getValue).orElse(null));
        outputStream.writeUInt32(w3f.getVariableDifficultyLevelsFlagAndExpansionFlag().id());
        outputStream.writeUInt32(w3f.getBackgroundScreenIndex());
        outputStream.writeString(Optional.ofNullable(w3f.getBackgroundScreenPath()).map(W3str::getValue).orElse(null));
        outputStream.writeString(Optional.ofNullable(w3f.getMinimapPicturePath()).map(W3str::getValue).orElse(null));
        outputStream.writeUInt32(w3f.getAmbientSoundIndex());
        outputStream.writeString(Optional.ofNullable(w3f.getCustomAmbientSoundPath()).map(W3str::getValue).orElse(null));
        outputStream.writeUInt32(w3f.getUseTerrainFog());
        outputStream.writeFloat32(w3f.getFogZHeight());
        outputStream.writeFloat32(w3f.getFogZEnd());
        outputStream.writeFloat32(w3f.getFogDensity());
        outputStream.writeUInt8(w3f.getFogBlue());
        outputStream.writeUInt8(w3f.getFogGreen());
        outputStream.writeUInt8(w3f.getFogRed());
        outputStream.writeUInt8(w3f.getFogAlpha());
        outputStream.writeUInt32(w3f.getCursorRaceIndex());
        w3f.getMap().forEach(map -> {
            outputStream.writeUInt32(map.getVisibility().id());
            outputStream.writeString(Optional.ofNullable(map.getChapterTitle()).map(W3str::getValue).orElse(null));
            outputStream.writeString(Optional.ofNullable(map.getMapTitle()).map(W3str::getValue).orElse(null));
            outputStream.writeString(Optional.ofNullable(map.getPath()).map(W3str::getValue).orElse(null));
        });
        w3f.getMapOrder().forEach(mapOrder -> {
            outputStream.writeString(Optional.ofNullable(mapOrder.getUnknown()).map(W3str::getValue).orElse(null));
            outputStream.writeString(Optional.ofNullable(mapOrder.getPath()).map(W3str::getValue).orElse(null));
        });
    }
}
