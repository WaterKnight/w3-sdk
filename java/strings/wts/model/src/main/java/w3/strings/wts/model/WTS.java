package w3.strings.wts.model;

import java.util.List;
import java.util.Objects;

public class WTS {
    public static class Block {
        public int num;
        public String text;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Block block = (Block) o;
            return num == block.num && Objects.equals(text, block.text);
        }

        @Override
        public int hashCode() {
            return Objects.hash(num, text);
        }
    }

    public List<Block> blocks;
}
