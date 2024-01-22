package w3.env.placement.sound.w3s.impl.std;

import w3.common.core.Wc3BinOutputStream;
import w3.env.placement.sound.w3s.api.W3SSerializer;
import w3.env.placement.sound.w3s.model.EncodingFormat;
import w3.env.placement.sound.w3s.model.W3S;
import w3.env.placement.sound.w3s.model.W3str;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StdW3SSerializer implements W3SSerializer {
    private final Wc3BinOutputStream outputStream;
    private final EncodingFormat format;

    public StdW3SSerializer(@Nonnull Wc3BinOutputStream outputStream, EncodingFormat format) {
        this.outputStream = outputStream;
        this.format = format;
    }

    @Override
    public void serialize(W3S w3s) {
        write(w3s, format);
    }

    private void write(W3S w3s, EncodingFormat format) {
        switch (format.toEnum()) {
            case AUTO:
                format = EncodingFormat.valueOf((int) w3s.getVersion());

                if (format == null) {
                    throw new IllegalArgumentException("no writer for " + w3s.getVersion());
                }

                write(w3s, format);

                break;
            case W3S_0x1: {
                write_0x1(w3s);

                break;
            }
        }
    }

    private void write_0x1(W3S w3s) {
        outputStream.writeUInt32(w3s.getVersion());
        outputStream.writeInt32(w3s.getSound().size());
        w3s.getSound().forEach(sound -> {
            outputStream.writeString(Optional.ofNullable(sound.getName()).map(W3str::getValue).orElse(null));
            outputStream.writeString(Optional.ofNullable(sound.getPath()).map(W3str::getValue).orElse(null));
            outputStream.writeString(Optional.ofNullable(sound.getEax()).map(W3str::getValue).orElse(null));
            outputStream.writeUInt32(flagsToInt(sound.getFlags()));
            outputStream.writeUInt32(sound.getFadeInRate());
            outputStream.writeUInt32(sound.getFadeOutRate());
            outputStream.writeInt32(sound.getVolume());
            outputStream.writeFloat32(sound.getPitch());
            outputStream.writeFloat32(sound.getPitchVariance());
            outputStream.writeInt32(sound.getPriority());
            outputStream.writeInt32(Long.valueOf(sound.getChannel().id()).intValue());
            outputStream.writeFloat32(sound.getMinDistance());
            outputStream.writeFloat32(sound.getMaxDistance());
            outputStream.writeFloat32(sound.getCutoffDistance());
            outputStream.writeFloat32(sound.getConeInside());
            outputStream.writeFloat32(sound.getConeOutside());
            outputStream.writeInt32(sound.getConeOutsideVolume());
            outputStream.writeFloat32(sound.getConeOrientationX());
            outputStream.writeFloat32(sound.getConeOrientationY());
            outputStream.writeFloat32(sound.getConeOrientationZ());
            if (w3s.getVersion() >= 2) {
                outputStream.writeString(Optional.ofNullable(sound.getVarName()).map(W3str::getValue).orElse(null));
                outputStream.writeString(Optional.ofNullable(sound.getVarName()).map(W3str::getValue).orElse(null));
                outputStream.writeString(Optional.ofNullable(sound.getInternalSoundName()).map(W3str::getValue).orElse(null));
                outputStream.writeString(Optional.ofNullable(sound.getSoundPath()).map(W3str::getValue).orElse(null));
                outputStream.writeInt32(sound.getUnknown9());
                outputStream.writeString(Optional.ofNullable(sound.getUnknown10()).map(W3str::getValue).orElse(null));
                outputStream.writeInt32(sound.getUnknown11());
                outputStream.writeString(Optional.ofNullable(sound.getUnknown12()).map(W3str::getValue).orElse(null));
                outputStream.writeInt32(sound.getUnknown13());
                outputStream.writeString(Optional.ofNullable(sound.getUnknown14()).map(W3str::getValue).orElse(null));
                outputStream.writeString(Optional.ofNullable(sound.getUnknown15()).map(W3str::getValue).orElse(null));
                outputStream.writeString(Optional.ofNullable(sound.getUnknown16()).map(W3str::getValue).orElse(null));
                outputStream.writeString(Optional.ofNullable(sound.getUnknown17()).map(W3str::getValue).orElse(null));
                if (w3s.getVersion() >= 2) {
                    outputStream.writeUInt32(sound.getUnknown18());
                }
            }
        });
    }

    private int flagsToInt(W3S.Flags flags) {
        final List<Boolean> booleans = new ArrayList<>(flags.getRest());
        booleans.addAll(new ArrayList<>(Arrays.asList(flags.getIsImported(),
                flags.getIsMusic(),
                flags.getStopWhenOutOfRange(),
                flags.getIs3d(),
                flags.getIsLooping())));
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
