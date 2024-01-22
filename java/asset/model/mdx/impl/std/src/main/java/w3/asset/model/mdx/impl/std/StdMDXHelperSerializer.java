package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXHelperSerializer;
import w3.asset.model.mdx.api.MDXNodeSerializer;
import w3.asset.model.mdx.model.MDXHelper;

public class StdMDXHelperSerializer extends MDXObject implements MDXHelperSerializer {
    private final MDXNodeSerializer nodeSerializer;

    public StdMDXHelperSerializer(MDXNodeSerializer nodeSerializer) {
        this.nodeSerializer = nodeSerializer;
    }

    @Override
    public void serialize(MDXHelper data) {
        write(data);
    }

    private void write_0x0(MDXHelper helper) {
        nodeSerializer.serialize(helper.getNode());
    }
}
