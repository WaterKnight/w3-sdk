import w3.common.core.DataType;
import w3.common.core.FieldId;
import w3.common.core.Id;
import w3.common.core.app.War3String;
import w3.common.slk.api.SlkFileSerializer;
import w3.common.slk.model.SlkFile;
import w3.common.slk.model.SlkRow;

import javax.annotation.Nullable;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class StdSlkSerializer implements SlkFileSerializer {
    private final OutputStream outputStream;

    public StdSlkSerializer(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(SlkFile slkFile) {
        try {
            write(slkFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private int _slkCurX;
    private int _slkCurY;

    public void write(SlkFile slkFile) throws IOException {
        try (final BufferedWriter outputStream = new BufferedWriter(new OutputStreamWriter(this.outputStream))) {
            final FieldId primaryKeyField = slkFile.getPrimaryField();

            if (primaryKeyField == null) throw new RuntimeException("pivotField is null");

            outputStream.write("ID;PWXL;N;E");

            outputStream.newLine();

            final var fields = slkFile.getFields();
            final var rows = slkFile.getRows();

            outputStream.write("B;X" + (fields.size() + (fields.containsKey(primaryKeyField) ? 0 : 1)) + ";Y" + (rows.size() + 1) + ";D0");

            Map<FieldId, Integer> fieldX = new LinkedHashMap<>();
            Map<Integer, FieldId> fieldsByX = new LinkedHashMap<>();

            fieldX.put(primaryKeyField, 1);

            int fieldC = 1;

            for (FieldId field : fields.keySet()) {
                if (field.equals(primaryKeyField)) continue;

                fieldC++;

                fieldX.put(field, fieldC);
                fieldsByX.put(fieldC, field);
            }

            _slkCurX = 0;
            _slkCurY = 0;

            writeCell(outputStream, 1, 1, War3String.valueOf(primaryKeyField.toString()));

            for (final Map.Entry<Integer, FieldId> entry : fieldsByX.entrySet()) {
                writeCell(outputStream, entry.getKey(), 1, War3String.valueOf(entry.getValue().toString()));
            }

            int y = 1;

            for (final Map.Entry<Id, SlkRow> entry : rows.entrySet()) {
                final Id rowId = entry.getKey();
                final SlkRow row = entry.getValue();

                y++;

                writeCell(outputStream, 1, y, rowId);

                for (final Map.Entry<Integer, FieldId> fieldEntry : fieldsByX.entrySet()) {
                    final int x = fieldEntry.getKey();
                    final FieldId field = fieldEntry.getValue();

                    DataType val = row.get(field);

                    if (val == null) val = fields.get(field).getDefaultValue();

                    if (val == null) continue;

                    writeCell(outputStream, x, y, val);
                }
            }

            outputStream.newLine();

            outputStream.write("E\n");

            outputStream.close();
        }
    }

    private void writeCell(BufferedWriter writer, int x, int y, @Nullable DataType slkVal) throws IOException {
        if (slkVal == null) return;

        Object val = null;//slkVal.toSLKVal();

        if (val == null) return;

        val = formatVal(val);

        if (val == null) return;

        final List<String> t = new ArrayList<>();

        t.add("C");

        if (x != _slkCurX) {
            t.add("X" + x);

            _slkCurX = x;
        }

        if (y != _slkCurY) {
            t.add("Y" + y);

            _slkCurY = y;
        }

        t.add("K" + val.toString());

        writer.newLine();

        writer.write(String.join(";", t));
    }

    @Nullable
    private Object formatVal(@Nullable Object val) {
        if (val == null) return null;

        try {
            return Integer.parseInt(val.toString());
        } catch (NumberFormatException ignored) {
        }
        try {
            return Float.parseFloat(val.toString());
        } catch (NumberFormatException ignored) {
        }
        try {
            return Double.parseDouble(val.toString());
        } catch (NumberFormatException ignored) {
        }

        if (val instanceof Boolean) {
            if ((Boolean) val) return 1;
        } else if (val instanceof Integer) {
            if (((Integer) val) != 0) return val;
        } else if (val instanceof Float) {
            if (((Float) val) != 0F) return val;
        } else if (val instanceof Double) {
            if (((Double) val) != 0D) return val;
        } else {
            val = val.toString();

            if (val.toString().isEmpty()) return null;
            if (val.equals("")) return null;
            if (val.equals("\"\"")) return null;

            return "\"" + val + "\"";
        }

        return null;
    }
}
