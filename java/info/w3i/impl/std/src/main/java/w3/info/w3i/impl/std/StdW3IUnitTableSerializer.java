package w3.info.w3i.impl.std;

import w3.common.core.Id;
import w3.common.core.Wc3BinOutputStream;
import w3.info.w3i.api.W3IUnitTableSerializer;
import w3.info.w3i.model.W3I;

public class StdW3IUnitTableSerializer implements W3IUnitTableSerializer {
    private final Wc3BinOutputStream outputStream;
    private final EncodingFormat format;

    public StdW3IUnitTableSerializer(Wc3BinOutputStream outputStream, EncodingFormat format) {
        this.outputStream = outputStream;
        this.format = format;
    }

    @Override
    public void serialize(W3I.RandomUnitTable unitTable) {
        writeUnitTable(unitTable);
    }

    private void writeUnitTable(W3I.RandomUnitTable unitTable) {
        final int columnTypesCount = unitTable.getColumnType().size();

        outputStream.writeInt32(columnTypesCount);

        for (int i = 0; i < columnTypesCount; i++) {
            outputStream.writeInt32((int) unitTable.getColumnType().get(i).id());
        }

        for (final W3I.RandomUnitTableRow row : unitTable.getRow()) {
            writeUnitTableSet(row, columnTypesCount);
        }
    }

    private void writeUnitTableSet(W3I.RandomUnitTableRow row, int columnTypesCount) {
        outputStream.writeInt32((int) row.getChance());

        for (int i = 0; i < columnTypesCount; i++) {
            outputStream.writeId(Id.valueOf(row.getId().get(i).getValue()));
        }
    }
}
