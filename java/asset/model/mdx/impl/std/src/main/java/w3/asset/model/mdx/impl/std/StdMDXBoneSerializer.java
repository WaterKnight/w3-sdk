package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXBoneSerializer;
import w3.asset.model.mdx.api.MDXNodeSerializer;
import w3.asset.model.mdx.model.MDXBone;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXBoneSerializer implements MDXBoneSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXNodeSerializer nodeSerializer;

    public StdMDXBoneSerializer(Wc3BinOutputStream outputStream, MDXNodeSerializer nodeSerializer) {
        this.outputStream = outputStream;
        this.nodeSerializer = nodeSerializer;
    }

    @Override
    public void serialize(MDXBone data) {
        write_0x0(data);
    }

    public void write_0x0(MDXBone bone) {
        nodeSerializer.serialize(bone.getNode());
        outputStream.writeUInt32(bone.getGeosetId());
        outputStream.writeUInt32(bone.getGeosetAnimId());
    }
}
