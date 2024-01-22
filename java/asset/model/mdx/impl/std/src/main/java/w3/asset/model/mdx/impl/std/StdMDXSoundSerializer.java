package w3.asset.model.mdx.impl.std;

import net.moonlightflower.wc3libs.bin.BinInputStream;
import net.moonlightflower.wc3libs.bin.BinStream;
import net.moonlightflower.wc3libs.bin.Wc3BinInputStream;
import net.moonlightflower.wc3libs.bin.Wc3BinOutputStream;
import net.moonlightflower.wc3libs.misc.model.MDX;
import w3.asset.model.mdx.model.MDX;

import javax.annotation.Nonnull;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StdMDXSoundSerializer extends MDXObject {
    public StdMDXSoundSerializer() {
    }

    @Override
    public void write_0x0(@Nonnull Wc3BinOutputStream stream, @Nonnull MDX.EncodingFormat format) throws BinStream.StreamException {
        stream.writeBytes(Arrays.copyOf(_fileName.getBytes(StandardCharsets.US_ASCII), 260));
        stream.writeFloat32(_volume);
        stream.writeFloat32(_pitch);
        stream.writeUInt32(_flags);
    }
}
