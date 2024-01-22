package w3.env.placement.camera.w3c.impl.std;

import w3.common.core.Wc3BinOutputStream;
import w3.env.placement.camera.w3c.model.EncodingFormat;
import w3.env.placement.camera.w3c.model.W3C;
import w3.placement.camera.w3c.api.W3CSerializer;

import javax.annotation.Nonnull;

public class StdW3CSerializer implements W3CSerializer {
    private final Wc3BinOutputStream outputStream;
    private final EncodingFormat format;

    public StdW3CSerializer(@Nonnull Wc3BinOutputStream outputStream, EncodingFormat format) {
        this.outputStream = outputStream;
        this.format = format;
    }

    @Override
    public void serialize(W3C w3c) {
        write(w3c, format);
    }

    private void write(W3C w3c, EncodingFormat format) {
        switch (format.toEnum()) {
            case AUTO:
                format = EncodingFormat.valueOf((int) w3c.getVersion());

                if (format == null) {
                    throw new IllegalArgumentException("no writer for " + w3c.getVersion());
                }

                write(w3c, format);

                break;
            case W3C_0x0: {
                write_0x0(w3c);

                break;
            }
        }
    }

    private void write_0x0(W3C w3c) {
        outputStream.writeInt32((int) w3c.getVersion());
        outputStream.writeInt32(w3c.getCamera().size());
        w3c.getCamera().forEach(camera -> {
            outputStream.writeFloat32(camera.getTargetX());
            outputStream.writeFloat32(camera.getTargetY());
            outputStream.writeFloat32(camera.getTargetZ());
            outputStream.writeFloat32(camera.getAngle());
            outputStream.writeFloat32(camera.getAngleOfAttack());
            outputStream.writeFloat32(camera.getDistance());
            outputStream.writeFloat32(camera.getRoll());
            outputStream.writeFloat32(camera.getFieldOfView());
            outputStream.writeFloat32(camera.getFarClipping());
            outputStream.writeFloat32(camera.getUnknown());
            outputStream.writeString(camera.getName().getValue());
        });
    }
}
