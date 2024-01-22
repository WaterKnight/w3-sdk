package w3.asset.imports.imp.impl.std;

import w3.asset.imports.imp.api.IMPSerializer;
import w3.asset.imports.imp.model.IMP;
import w3.common.core.Wc3BinOutputStream;

public class StdIMPSerializer implements IMPSerializer {
    private final Wc3BinOutputStream outputStream;
    private final EncodingFormat format;

    public StdIMPSerializer(Wc3BinOutputStream outputStream, EncodingFormat format) {
        this.outputStream = outputStream;
        this.format = format;
    }

    @Override
    public void serialize(IMP imp) {
    }
}
