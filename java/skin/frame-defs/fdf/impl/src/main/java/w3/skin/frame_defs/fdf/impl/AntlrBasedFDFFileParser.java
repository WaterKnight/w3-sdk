package w3.skin.frame_defs.fdf.impl;

import org.antlr.v4.runtime.*;
import w3.common.core.UTF8;
import w3.skin.frame_defs.fdf.api.FDFFileParser;
import w3.skin.frame_defs.fdf.model.FDF;
import w3.skin.frame_defs.impl.antlr.AntlrFDFLexer;
import w3.skin.frame_defs.impl.antlr.AntlrFDFParser;

import javax.annotation.Nonnull;
import javax.naming.OperationNotSupportedException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class AntlrBasedFDFFileParser implements FDFFileParser {
    private final InputStream inputStream;

    public AntlrBasedFDFFileParser(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public FDF parse() {
        try {
            return read(inputStream);
        } catch (IOException | OperationNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    private FDF read(@Nonnull InputStream inStream) throws IOException, OperationNotSupportedException {
        final UTF8 reader = new UTF8(inStream, false, true);

        final String input = reader.readAll(false);
        System.out.println("parsing...");
        System.out.println(input);
        inStream.close();

        final CharStream antlrStream = CharStreams.fromString(input);

        final Lexer lexer = new AntlrFDFLexer(antlrStream);

        final CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        tokenStream.fill();

        final List<Token> tokens = tokenStream.getTokens();

        final AntlrFDFParser parser = new AntlrFDFParser(new CommonTokenStream(new ListTokenSource(tokens)));

        final AntlrFDFParser.RootContext rootContext = parser.root();

        // TODO: implement
        throw new OperationNotSupportedException();
    }
}
