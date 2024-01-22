package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXTextureSerializer;
import w3.asset.model.mdx.model.MDXTexture;
import w3.common.core.Wc3BinOutputStream;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StdMDXTextureSerializer implements MDXTextureSerializer {
    private final Wc3BinOutputStream outputStream;

    public StdMDXTextureSerializer(Wc3BinOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(MDXTexture data) {
        write_0x0(data);
    }

    private void write_0x0(MDXTexture texture) {
        outputStream.writeUInt32(texture.getReplaceableId());
        outputStream.writeBytes(Arrays.copyOf(texture.getFileName().getBytes(StandardCharsets.US_ASCII), 260));
        outputStream.writeUInt32(texture.getFlags());
    }
}
