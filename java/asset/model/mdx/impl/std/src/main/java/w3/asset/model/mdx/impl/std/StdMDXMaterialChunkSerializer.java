package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXMaterialChunkSerializer;
import w3.asset.model.mdx.api.MDXMaterialSerializer;
import w3.asset.model.mdx.model.MDXMaterial;
import w3.asset.model.mdx.model.MDXMaterialChunk;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXMaterialChunkSerializer extends StdMDXChunkSerializer implements MDXMaterialChunkSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXMaterialSerializer materialSerializer;

    public StdMDXMaterialChunkSerializer(Wc3BinOutputStream outputStream, MDXMaterialSerializer materialSerializer) {
        this.outputStream = outputStream;
        this.materialSerializer = materialSerializer;
    }

    @Override
    public void serialize(MDXMaterialChunk data) {
        write(data);
    }

    private void write(MDXMaterialChunk materialChunk) {
        switch (format.toEnum()) {
            case AUTO:
            case MDX_0x0:
                write_0x0(materialChunk);

                break;
        }
    }

    private void write_0x0(MDXMaterialChunk materialChunk) {
        final MDXChunkHeaderWriter header = new MDXChunkHeaderWriter(outputStream);

        header.write(materialChunk.getToken());

        for (MDXMaterial material : materialChunk.getMaterials()) {
            materialSerializer.serialize(material);
        }

        header.rewrite();
    }
}
