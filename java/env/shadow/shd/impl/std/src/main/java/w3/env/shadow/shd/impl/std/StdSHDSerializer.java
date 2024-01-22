package w3.env.shadow.shd.impl.std;

import w3.common.core.Wc3BinOutputStream;
import w3.env.shadow.shd.api.SHDSerializer;
import w3.env.shadow.shd.model.SHD;

import javax.annotation.Nonnull;

public class StdSHDSerializer implements SHDSerializer {
    private final Wc3BinOutputStream outputStream;

    public StdSHDSerializer(@Nonnull Wc3BinOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(SHD shd) {
        write(shd);
    }

    private void write(SHD shd) {
        shd.getShadowNode().forEach(outputStream::writeUInt8);
    }
}
