package w3.asset.model.mdx.impl.std;

import net.moonlightflower.wc3libs.bin.BinInputStream;
import net.moonlightflower.wc3libs.bin.BinStream;
import net.moonlightflower.wc3libs.bin.Wc3BinInputStream;
import net.moonlightflower.wc3libs.bin.Wc3BinOutputStream;
import net.moonlightflower.wc3libs.misc.Id;
import net.moonlightflower.wc3libs.misc.ObservableLinkedHashSet;
import net.moonlightflower.wc3libs.misc.model.MDX;
import w3.asset.model.mdx.model.MDX;

import javax.annotation.Nonnull;

public class StdMDXPivotPointChunkSerializer extends StdMDXChunkSerializer {
    public static Id TOKEN = Id.valueOf("PIVT");

    @Override
    public Id getToken() {
        return TOKEN;
    }

    public StdMDXPivotPointChunkSerializer() {
    }

    @Override
    public void write(@Nonnull Wc3BinOutputStream stream, @Nonnull MDX.EncodingFormat format) throws BinStream.StreamException {
        switch (format.toEnum()) {
            case AUTO:
            case MDX_0x0:
                write_0x0(stream);

                break;
        }
    }

    private void write_0x0(@Nonnull Wc3BinOutputStream stream) throws BinStream.StreamException {
        MDXChunkHeaderWriter header = new MDXChunkHeaderWriter(outputStream);

        header.write(stream);

        for (PivotPoint pivotPoint : getPivotPoints()) {
            pivotPoint.write(stream);
        }

        header.rewrite();
    }
}
