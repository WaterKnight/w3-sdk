package w3.info.mmp.impl.std;

import w3.common.core.Id;
import w3.common.core.Wc3BinOutputStream;
import w3.info.mmp.api.MMPSerializer;
import w3.info.mmp.model.EncodingFormat;
import w3.info.mmp.model.MMP;
import w3.info.mmp.model.W3Mmp;

public class StdMMPSerializer implements MMPSerializer {
    private final Wc3BinOutputStream outputStream;
    private final EncodingFormat format;

    public StdMMPSerializer(Wc3BinOutputStream outputStream, EncodingFormat format) {
        this.outputStream = outputStream;
        this.format = format;
    }

    @Override
    public void serialize(MMP mmp) {
        write(mmp, format);
    }

    private void write(MMP mmp, EncodingFormat format) {
        switch (format.toEnum()) {
            case AUTO:
                format = EncodingFormat.valueOf((int) mmp.getVersion());

                if (format == null) {
                    throw new IllegalArgumentException("no writer for " + mmp.getVersion());
                }

                write(mmp, format);

                break;
            case MMP_0x0: {
                write_0x0(mmp);

                break;
            }
        }
    }

    private void write_0x0(MMP mmp) {
        outputStream.writeUInt32(mmp.getVersion());
        outputStream.writeUInt32(mmp.getIconsChunk().getIcon().size());
        mmp.getIconsChunk().getIcon().forEach(icon -> {
            outputStream.writeUInt32(icon.getIconType().id());
            outputStream.writeUInt32(icon.getx());
            outputStream.writeUInt32(icon.gety());
            final W3Mmp.Color color = icon.getColor();
            outputStream.writeUInt8(color.getBlue());
            outputStream.writeUInt8(color.getGreen());
            outputStream.writeUInt8(color.getRed());
            outputStream.writeUInt8(color.getAlpha());
        });
    }
}
