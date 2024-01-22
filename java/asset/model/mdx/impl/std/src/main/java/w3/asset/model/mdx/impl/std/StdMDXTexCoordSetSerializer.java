package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXTexCoordSerializer;
import w3.asset.model.mdx.api.MDXTexCoordSetSerializer;
import w3.asset.model.mdx.model.MDXTexCoord;
import w3.asset.model.mdx.model.MDXTexCoordSet;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXTexCoordSetSerializer implements MDXTexCoordSetSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXTexCoordSerializer texCoordSerializer;

    public StdMDXTexCoordSetSerializer(Wc3BinOutputStream outputStream, MDXTexCoordSerializer texCoordSerializer) {
        this.outputStream = outputStream;
        this.texCoordSerializer = texCoordSerializer;
    }

    @Override
    public void serialize(MDXTexCoordSet data) {
        write_0x0(data);
    }

    private void write_0x0(MDXTexCoordSet texCoordSet) {
        outputStream.writeId(texCoordSet.getToken());

        outputStream.writeUInt32(texCoordSet.getTexCoords().size());

        for (MDXTexCoord texCoord : texCoordSet.getTexCoords()) {
            texCoordSerializer.serialize(texCoord);
        }
    }
}
