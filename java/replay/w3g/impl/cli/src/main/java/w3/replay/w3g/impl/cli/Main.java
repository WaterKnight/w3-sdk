package w3.replay.w3g.impl.cli;

import picocli.CommandLine;

public class Main {
    public static void main(String[] args) {
        new CommandLine(new ConvertCommand()).execute(args);
    }
}
