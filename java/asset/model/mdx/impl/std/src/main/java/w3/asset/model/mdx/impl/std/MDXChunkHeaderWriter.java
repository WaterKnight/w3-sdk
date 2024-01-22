package w3.asset.model.mdx.impl.std;

import w3.common.core.Id;
import w3.common.core.Wc3BinOutputStream;

class MDXChunkHeaderWriter {
    private final Wc3BinOutputStream outputStream;

    private long sizePos;
    private long afterPos;

    public MDXChunkHeaderWriter(Wc3BinOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void write(Id token) {
        outputStream.writeId(token);

        sizePos = outputStream.getPos();

        outputStream.writeUInt32(0);

        afterPos = outputStream.getPos();
    }

    public void rewrite() {
        long endPos = outputStream.getPos();

        outputStream.setPos(sizePos);

        outputStream.writeUInt32(endPos - afterPos);

        outputStream.setPos(endPos);
    }
}
