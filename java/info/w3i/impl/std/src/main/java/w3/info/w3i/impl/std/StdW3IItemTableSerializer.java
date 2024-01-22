package w3.info.w3i.impl.std;

import w3.common.core.Wc3BinOutputStream;
import w3.info.w3i.api.W3IItemTableSerializer;
import w3.info.w3i.model.W3I;

import java.util.List;

public class StdW3IItemTableSerializer implements W3IItemTableSerializer {
    private final Wc3BinOutputStream outputStream;
    private final EncodingFormat format;

    public StdW3IItemTableSerializer(Wc3BinOutputStream outputStream, EncodingFormat format) {
        this.outputStream = outputStream;
        this.format = format;
    }

    public void serialize(W3I.RandomItemTable itemTable) {
        writeItemTable(itemTable);
    }

    private void writeItemTable(W3I.RandomItemTable itemTable) {
        outputStream.writeInt32((int) itemTable.getNum());

        outputStream.writeString(itemTable.getName().getValue());

        writeItemTableSets(itemTable);
    }

    private void writeItemTableSets(W3I.RandomItemTable itemTable) {
        final List<W3I.ItemSet> sets = itemTable.getSet();

        outputStream.writeInt32(sets.size());

        for (final W3I.ItemSet set : sets) {
            writeItemTableSet(set);
        }
    }

    private void writeItemTableSet(W3I.ItemSet set) {
        final List<W3I.Item> items = set.getItem();

        outputStream.writeInt32(items.size());

        for (final W3I.Item item : items) {
            writeItemTableSetItem(item);
        }
    }

    private void writeItemTableSetItem(W3I.Item item) {
        outputStream.writeInt32((int) item.getChance());

        outputStream.writeId(item.getId());
    }
}
