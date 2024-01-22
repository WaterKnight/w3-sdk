import org.antlr.v4.runtime.*;
import w3.common.core.DataType;
import w3.common.core.FieldId;
import w3.common.core.Id;
import w3.common.core.UTF8;
import w3.common.core.app.War3Int;
import w3.common.core.app.War3Real;
import w3.common.core.app.War3String;
import w3.common.slk.api.SlkFileParser;
import w3.common.slk.impl.antlr.*;
import w3.common.slk.model.SlkFile;
import w3.common.slk.model.SlkRow;

import javax.annotation.Nonnull;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class AntlrBasedSlkFileParser implements SlkFileParser {
    private final SlkFile slkFile;
    private final byte[] bytes;

    public AntlrBasedSlkFileParser(SlkFile slkFile, byte[] bytes) {
        this.slkFile = slkFile;
        this.bytes = bytes;
    }

    @Override
    public SlkFile parse() {
        try {
            read(false);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return slkFile;
    }

    private void read(boolean onlyHeader) throws IOException {
        try (final InputStream inputStream = new ByteArrayInputStream(bytes)) {
            final UTF8 reader = new UTF8(inputStream, false, true);

            final String input = reader.readAll(false);

            final CharStream antlrStream = CharStreams.fromString(input);

            final Lexer lexer = new SlkLexer(antlrStream);

            final CommonTokenStream tokenStream = new CommonTokenStream(lexer);

            tokenStream.fill();

            final List<Token> tokens = tokenStream.getTokens();

            final SlkParser parser = new SlkParser(new CommonTokenStream(new ListTokenSource(tokens)));

            final SlkParser.RootContext rootContext = parser.root();

            boolean foundB = false;

            int maxX = 0;
            int maxY = 0;

            //System.out.println(tokens);

            for (final SlkParser.RecordContext record : rootContext.record()) {
                if (record.type.getText().equals("B")) {
                    int x = 0;
                    int y = 0;

                    for (final SlkParser.RecordPartContext part : record.recordPart()) {
                        final RecordPart partData = new RecordPart(part.getText());

                        if (partData.attr.equals("X")) {
                            if (partData.val instanceof War3Int) {
                                x = ((War3Int) partData.val).toInt();
                            }
                        }
                        if (partData.attr.equals("Y")) {
                            if (partData.val instanceof War3Int) {
                                y = ((War3Int) partData.val).toInt();
                            }
                        }
                    }

                    maxX = x;
                    maxY = y;
                    //System.out.println("max " + maxX+";"+maxY);
                    foundB = true;
                }
            }

            if (!foundB) {
                throw new IllegalStateException("did not find B record");
            }

            final DataType[][] data = new DataType[maxY][maxX];

            int curX = 0;
            int curY = 0;
            //System.out.println("size " + rootContext.record().size());
            for (final SlkParser.RecordContext record : rootContext.record()) {
                if (record.type.getText().equals("C")) {
                    int x = curX;
                    int y = curY;
                    DataType val = null;

                    for (SlkParser.RecordPartContext part : record.recordPart()) {
                        final RecordPart partData = new RecordPart(part.getText());

                        if (partData.attr.equals("X") && partData.val instanceof War3Int) {
                            x = ((War3Int) partData.val).toInt() - 1;
                        }
                        if (partData.attr.equals("Y") && partData.val instanceof War3Int) {
                            y = ((War3Int) partData.val).toInt() - 1;
                        }
                        if (partData.attr.equals("K")) {
                            val = partData.val;
                        }
                    }
                    //System.out.println("set " + x + ";" + y + "->" + val);
                    if (val != null) data[y][x] = val;

                    if (x > maxX) maxX = x;
                    if (y > maxY) maxY = y;

                    curX = x;
                    curY = y;
                }
            }

            slkFile.clearFields();

            final DataType[] headerData = data[0];

            for (final DataType fieldRaw : headerData) {
                if (fieldRaw == null) continue;

                final FieldId field = FieldId.valueOf(fieldRaw.toString());

                if (!slkFile.getFields().containsKey(field)) {
                    slkFile.addField(field);
                }
            }

            slkFile.setPrimaryField(FieldId.valueOf(headerData[0].toString()));

            if (onlyHeader) {
                return;
            }

            for (int i = 1; i < data.length; i++) {
                final DataType objIdRaw = data[i][0];

                if (objIdRaw == null) continue;

                final Id objId = Id.valueOf(objIdRaw.toString());

                final SlkRow slkRow = slkFile.addRow(objId);

                for (int j = 1; j < headerData.length; j++) {
                    final DataType fieldRaw = headerData[j];

                    if (fieldRaw == null) continue;

                    final FieldId field = FieldId.valueOf(fieldRaw.toString());

                    final FieldId primaryKeyField = slkFile.getPrimaryField();

                    if (primaryKeyField == null) continue;

                    if (field.equals(primaryKeyField)) continue;

                    slkRow.set(field, data[i][j]);
                }
            }
        }
    }

    private static class RecordPart {
        private final String attr;
        private DataType val;

        private RecordPart(@Nonnull String s) {
            if (s.startsWith("X") || s.startsWith("Y") || s.startsWith("K")) {
                attr = s.substring(0, 1);

                final String valS = s.substring(1);

                if (valS.startsWith("\"") && valS.endsWith("\"")) {
                    val = War3String.valueOf(valS.substring(1, s.length() - 2));
                } else {
                    try {
                        val = War3Int.valueOf(Integer.parseInt(valS));
                    } catch (NumberFormatException ignored) {
                        try {
                            val = War3Real.valueOf(Float.parseFloat(valS));
                        } catch (NumberFormatException ignored2) {
                            val = War3String.valueOf(valS);
                        }
                    }
                }
            } else {
                attr = s;
                val = null;
            }
        }
    }
}
