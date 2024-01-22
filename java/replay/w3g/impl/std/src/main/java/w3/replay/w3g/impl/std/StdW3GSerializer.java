package w3.replay.w3g.impl.std;

import w3.common.core.Wc3BinOutputStream;
import w3.replay.w3g.api.W3GSerializer;
import w3.replay.w3g.model.EncodingFormat;
import w3.replay.w3g.model.W3G;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StdW3GSerializer implements W3GSerializer {
    private final Wc3BinOutputStream outputStream;
    private final EncodingFormat format;

    public StdW3GSerializer(Wc3BinOutputStream outputStream, EncodingFormat format) {
        this.outputStream = outputStream;
        this.format = format;
    }

    @Override
    public void serialize(W3G w3g) {
    }
}
