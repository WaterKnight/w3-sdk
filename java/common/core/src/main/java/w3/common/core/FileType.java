package w3.common.core;



import w3.common.core.app.War3String;

import javax.annotation.Nonnull;
import java.io.File;

public class FileType extends War3String {
	public FileType(@Nonnull File file) {
		super(file.toString());
	}
}
