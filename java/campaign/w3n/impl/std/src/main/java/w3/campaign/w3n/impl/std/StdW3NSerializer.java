package w3.campaign.w3n.impl.std;

import w3.campaign.w3n.api.W3NSerializer;
import w3.campaign.w3n.model.W3N;
import w3.common.core.Wc3BinOutputStream;

public class StdW3NSerializer implements W3NSerializer {
    private final Wc3BinOutputStream outputStream;
    private final EncodingFormat format;

    public StdW3NSerializer(Wc3BinOutputStream outputStream, EncodingFormat format) {
        this.outputStream = outputStream;
        this.format = format;
    }

    @Override
    public void serialize(W3N w3n) {
    }
}
