package w3.asset.model.mdx.impl.std;

public class StdMDXRibbonEmitterChunkSerializer extends StdMDXChunkSerializer implements MDXRibbonEmitterChunkSerializer {
    public void write() {
        switch (format.toEnum()) {
            case AUTO:
            case MDX_0x0:
                write_0x0(stream);

                break;
        }
    }

    private void write_0x0() {
        MDXChunkHeaderWriter header = new MDXChunkHeaderWriter(outputStream);

        header.write(stream);

        for (StdMDXRibbonEmitterSerializer ribbonEmitter : getRibbonEmitters()) {
            ribbonEmitter.write(stream);
        }

        header.rewrite();
    }
}
