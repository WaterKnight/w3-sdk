package w3.replay.w3g.impl.kaitai;

import io.kaitai.struct.CustomDecoder;

import java.util.ArrayList;
import java.util.List;

public class BlizzardDecompress implements CustomDecoder {
    @Override
    public byte[] decode(byte[] bytes) {
        int pos = 0;
        byte mask = 0;
        final List<Byte> result = new ArrayList<>();
        while (pos < bytes.length && bytes[pos] != 0) {
            if (pos % 8 == 0) {
                mask = bytes[pos];
            } else if ((mask & (0x1 << (pos % 8))) == 0) {
                result.add((byte) (bytes[pos] - 1));
            } else {
                result.add(bytes[pos]);
            }
            pos++;
        }
        return unbox(result);
    }

    private byte[] unbox(List<Byte> bytes) {
        final byte[] result = new byte[bytes.size()];
        for (int i = 0; i < bytes.size(); i++) {
            result[i] = bytes.get(i);
        }
        return result;
    }
}
