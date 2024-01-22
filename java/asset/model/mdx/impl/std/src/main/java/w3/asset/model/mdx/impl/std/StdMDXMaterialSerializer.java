package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXLayerSerializer;
import w3.asset.model.mdx.api.MDXMaterialSerializer;
import w3.asset.model.mdx.model.LayersChunk;
import w3.asset.model.mdx.model.MDXChunk;
import w3.asset.model.mdx.model.MDXLayer;
import w3.asset.model.mdx.model.MDXMaterial;
import w3.common.core.Id;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXMaterialSerializer implements MDXMaterialSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXLayerSerializer layerSerializer;

    public StdMDXMaterialSerializer(Wc3BinOutputStream outputStream, MDXLayerSerializer layerSerializer) {
        this.outputStream = outputStream;
        this.layerSerializer = layerSerializer;
    }

    @Override
    public void serialize(MDXMaterial data) {
        write_0x0(data);
    }

    private void write_0x0(MDXMaterial material) {
        final MDXChunkSizeWriter sizeWriter = new MDXChunkSizeWriter(outputStream);

        sizeWriter.write();

        outputStream.writeUInt32(material.getPriorityPlane());
        outputStream.writeUInt32(material.getFlags());

        outputStream.writeId(new LayersChunk().getToken());

        outputStream.writeUInt32(material.getLayers().size());

        for (MDXLayer layer : material.getLayers()) {
            layerSerializer.serialize(layer);
        }

        sizeWriter.rewrite();
    }
}
