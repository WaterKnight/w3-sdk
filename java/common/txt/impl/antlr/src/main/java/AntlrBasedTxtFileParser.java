package w3.common.txt.impl;

import org.antlr.v4.runtime.*;
import w3.common.core.Id;
import w3.common.core.UTF8;
import w3.common.txt.api.TxtFileParser;
import w3.common.txt.impl.antlr.*;
import w3.common.txt.model.TxtFile;
import w3.common.txt.model.TxtFileCategory;
import w3.common.txt.model.TxtFileLine;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;

public class AntlrBasedTxtFileParser implements TxtFileParser {
    private final byte[] bytes;

    public AntlrBasedTxtFileParser(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public TxtFile parse() {
        try (final InputStream inputStream = new ByteArrayInputStream(bytes)) {
            final UTF8 reader = new UTF8(inputStream, false, true);

            final String input = reader.readAll(false);

            final CharStream antlrStream = CharStreams.fromString(input);

            final Lexer lexer = new txtLexer(antlrStream);

            final CommonTokenStream tokenStream = new CommonTokenStream(lexer);

            tokenStream.fill();

            final List<Token> tokens = tokenStream.getTokens();

            final txtParser parser = new txtParser(new CommonTokenStream(new ListTokenSource(tokens)));

            final txtParser.RootContext rootContext = parser.root();

            final TxtFile txtFile = new TxtFile();

            rootContext.block().forEach(blockContext -> {
                final TxtFileCategory txtFileCategory = new TxtFileCategory();

                txtFile.getTxtFileCategories().add(txtFileCategory);

                txtFileCategory.setId(Id.valueOf(blockContext.category.getText()));

                blockContext.line().forEach(lineContext -> {
                    final TxtFileLine txtFileLine = new TxtFileLine(lineContext.key.getText(), lineContext.values.stream().map(Token::getText).collect(Collectors.toList()));
                    txtFileCategory.getTxtFileLines().add(txtFileLine);
                });
            });

            return txtFile;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
