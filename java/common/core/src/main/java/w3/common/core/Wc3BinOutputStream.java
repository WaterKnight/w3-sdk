package w3.common.core;

import w3.common.core.app.War3String;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

public class Wc3BinOutputStream extends BinOutputStream {
    public void writeUByte(int val) {
        writeByte((byte) val);
    }

    private final static byte[] _shortBytes = new byte[2];

    private final static ByteBuffer _shortBuf = ByteBuffer.wrap(_shortBytes);

    public void writeInt8(short val) {
        writeByte((byte) (val & 0xFF));
    }

    public void writeUInt8(int val) {
        writeInt8((short) val);
    }

    public void writeInt16(short val, ByteOrder byteOrder) {
        ((Buffer) _shortBuf).rewind();
        _shortBuf.order(byteOrder);

        _shortBuf.putShort(val);

        writeBytes(_shortBytes);
    }

    public void writeInt16(short val) {
        writeInt16(val, ByteOrder.LITTLE_ENDIAN);
    }

    public void writeUInt16(int val) {
        writeInt16((short) val);
    }

    public void writeUInt16(int val, ByteOrder byteOrder) {
        writeInt16((short) val, byteOrder);
    }

    private final static byte[] _intBytes = new byte[4];

    private final static ByteBuffer _intBuf = ByteBuffer.wrap(_intBytes);

    public void writeInt32(int val) {
        ((Buffer) _intBuf).rewind();
        _intBuf.order(ByteOrder.LITTLE_ENDIAN);

        _intBuf.putInt(val);

        writeBytes(_intBytes);
    }

    public void writeUInt32(long val) {
        writeInt32((int) val);
    }

    public void writeFloat32(float val) {
        ByteBuffer buf = ByteBuffer.allocate(4);

        buf.order(ByteOrder.LITTLE_ENDIAN);

        buf.putFloat(val);

        writeBytes(buf.array());
    }

    public void writeChar(char val) {
        writeByte((byte) val);
    }

    @Nullable
    public byte[] stringToByteArray(@Nullable String val) {
        if (val == null) return null;

        return val.getBytes(StandardCharsets.UTF_8);
    }

    public void writeString(@Nullable String val) {
        if (val == null) val = "";

        byte[] valBytes = stringToByteArray(val);

        writeBytes(valBytes);

        writeByte((byte) 0);
    }

    public void writeId(@Nullable Id val) {
        if (val == null || val.toString() == null) {
            val = Id.valueOf("\0\0\0\0");
        }

        final String valString = val.toString();

        final byte[] valBytes = valString.getBytes(StandardCharsets.US_ASCII);
        final byte[] sub = new byte[4];
        System.arraycopy(valBytes, 0, sub, 0, valBytes.length);

        writeBytes(sub);
    }

    public Wc3BinOutputStream(@Nonnull OutputStream outStream) {
        super(outStream);
    }
}
