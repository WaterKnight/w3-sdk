package w3.asset.model.mdx.impl.std;

import w3.common.core.Wc3BinOutputStream;

class MDXChunkSizeWriter {
    private final Wc3BinOutputStream outputStream;

    public MDXChunkSizeWriter(Wc3BinOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    private long size = 0L;

    public long getSize() {
        return size;
    }

    private long sizePos = 0L;

    public void write() {
        write_0x0();
    }

    public void rewrite() {
        long endPos = outputStream.getPos();

        outputStream.setPos(sizePos);

        outputStream.writeUInt32(endPos - sizePos);

        outputStream.setPos(endPos);
    }

    private void write_0x0() {
        sizePos = outputStream.getPos();

        outputStream.writeUInt32(size);
    }
}
