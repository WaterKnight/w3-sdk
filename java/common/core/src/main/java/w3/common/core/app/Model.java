package w3.common.core.app;

import w3.common.core.FileType;

import java.io.File;

public class Model extends FileType {
	public Model(File file) {
		super(file);
	}

	@Override
	public Model decode(Object val) {
		return new Model(new File(val.toString()));
	}
}
