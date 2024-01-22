package w3.skin.frame_defs.fdf.impl;

import w3.skin.frame_defs.fdf.api.FDFFileSerializer;
import w3.skin.frame_defs.fdf.model.FDF;

import javax.naming.OperationNotSupportedException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

public class StdFDFFileSerializer implements FDFFileSerializer {
    private final File file;

    private final BufferedWriter writer;

    public StdFDFFileSerializer(File file, BufferedWriter writer) {
        this.file = file;
        this.writer = writer;
    }

    @Override
    public void serialize(FDF fdf) {
        try {
            exec(fdf);
        } catch (IOException | OperationNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void exec(FDF fdf) throws IOException, OperationNotSupportedException {
        // TODO: implement
        throw new OperationNotSupportedException();
    }
}
