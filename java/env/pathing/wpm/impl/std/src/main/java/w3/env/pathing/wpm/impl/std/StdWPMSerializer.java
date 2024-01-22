package w3.env.pathing.wpm.impl.std;

import w3.common.core.Id;
import w3.common.core.Wc3BinOutputStream;
import w3.env.pathing.wpm.WPMSerializer;
import w3.env.pathing.wpm.model.EncodingFormat;
import w3.env.pathing.wpm.model.WPM;

import javax.annotation.Nonnull;

public class StdWPMSerializer implements WPMSerializer {
    private final Wc3BinOutputStream outputStream;
    private final EncodingFormat format;

    public StdWPMSerializer(@Nonnull Wc3BinOutputStream outputStream, EncodingFormat format) {
        this.outputStream = outputStream;
        this.format = format;
    }

    @Override
    public void serialize(WPM wpm) {
        write(wpm, format);
    }

    private void write(WPM wpm, EncodingFormat format) {
        switch (format.toEnum()) {
            case AUTO:
                format = EncodingFormat.valueOf((int) wpm.getVersion());

                if (format == null) {
                    throw new IllegalArgumentException("no writer for " + wpm.getVersion());
                }

                write(wpm, format);

                break;
            case WPM_0x0: {
                write_0x0(wpm);

                break;
            }
        }
    }

    private void write_0x0(WPM wpm) {
        outputStream.writeId(Id.valueOf(wpm.getFileId().getValue()));
        outputStream.writeInt32((int) wpm.getVersion());
        outputStream.writeInt32((int) wpm.getWidth());
        outputStream.writeInt32((int) wpm.getHeight());
        wpm.getPathingNode().forEach(outputStream::writeUInt8);
    }
}
