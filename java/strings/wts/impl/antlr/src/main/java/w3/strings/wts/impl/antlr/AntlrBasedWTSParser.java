package w3.strings.wts.impl.antlr;

import org.antlr.v4.runtime.*;
import w3.common.core.UTF8;
import w3.strings.wts.api.WTSParser;
import w3.strings.wts.model.WTS;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class AntlrBasedWTSParser implements WTSParser {
    private final byte[] bytes;

    public AntlrBasedWTSParser(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public WTS parse() {
        try (final InputStream inputStream = new ByteArrayInputStream(bytes)) {
            return read(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private WTS read(InputStream inputStream) throws IOException {
        final UTF8 reader = new UTF8(inputStream, false, true);

        final String input = reader.readAll(false);

        final CharStream antlrStream = CharStreams.fromString(input);

        final Lexer lexer = new AntlrWTSLexer(antlrStream);

        final CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        tokenStream.fill();

        final List<Token> tokens = tokenStream.getTokens();

        final AntlrWTSParser parser = new AntlrWTSParser(new CommonTokenStream(new ListTokenSource(tokens)));

        final AntlrWTSParser.RootContext rootContext = parser.root();

        return new AntlrWTSToWTSMapper().map(rootContext);
    }
}
