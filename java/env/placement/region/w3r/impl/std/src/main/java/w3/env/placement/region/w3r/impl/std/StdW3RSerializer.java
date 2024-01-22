package w3.env.placement.region.w3r.impl.std;

import w3.common.core.Wc3BinOutputStream;
import w3.env.placement.region.w3r.api.W3RSerializer;
import w3.env.placement.region.w3r.model.EncodingFormat;
import w3.env.placement.region.w3r.model.W3R;

import javax.annotation.Nonnull;

public class StdW3RSerializer implements W3RSerializer {
    private final Wc3BinOutputStream outputStream;
    private final EncodingFormat format;

    public StdW3RSerializer(@Nonnull Wc3BinOutputStream outputStream, EncodingFormat format) {
        this.outputStream = outputStream;
        this.format = format;
    }

    @Override
    public void serialize(W3R w3r) {
        write(w3r, format);
    }

    private void write(W3R w3r, EncodingFormat format) {
        switch (format.toEnum()) {
            case AUTO:
                format = EncodingFormat.valueOf((int) w3r.getVersion());

                if (format == null) {
                    throw new IllegalArgumentException("no writer for " + w3r.getVersion());
                }

                write(w3r, format);

                break;
            case W3R_0x5: {
                write_0x5(w3r);

                break;
            }
        }
    }

    private void write_0x5(W3R w3r) {
        outputStream.writeInt32((int) w3r.getVersion());
        outputStream.writeInt32(w3r.getRegion().size());
        w3r.getRegion().forEach(region -> {
            outputStream.writeFloat32(region.getLeft());
            outputStream.writeFloat32(region.getBottom());
            outputStream.writeFloat32(region.getRight());
            outputStream.writeFloat32(region.getTop());
            outputStream.writeString(region.getName().getValue());
            outputStream.writeInt32((int) region.getId());
            outputStream.writeId(region.getWeatherId());
            outputStream.writeString(region.getAmbientSound().getValue());
            outputStream.writeUInt8(region.getColorBlue());
            outputStream.writeUInt8(region.getColorGreen());
            outputStream.writeUInt8(region.getColorRed());
            outputStream.writeUInt8(region.getEndToken());
        });
    }
}
