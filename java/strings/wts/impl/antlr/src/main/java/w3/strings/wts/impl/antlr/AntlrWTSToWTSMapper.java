package w3.strings.wts.impl.antlr;

import w3.strings.wts.model.WTS;

import java.util.stream.Collectors;

public class AntlrWTSToWTSMapper {
    public WTS map(AntlrWTSParser.RootContext antlrWTS) {
        final WTS newWTS = new WTS();

        newWTS.blocks = antlrWTS.block().stream().map(this::mapBlock).collect(Collectors.toList());

        return newWTS;
    }

    private WTS.Block mapBlock(AntlrWTSParser.BlockContext block) {
        final WTS.Block newBlock = new WTS.Block();

        newBlock.num = Integer.parseInt(block.num.getText());
        newBlock.text = block.str.getText();

        return newBlock;
    }
}
