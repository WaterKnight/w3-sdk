package w3.object.common.core;

import w3.common.core.Id;

public class ObjId extends Id {
	protected ObjId(String idString) {
		super(idString);
	}

	public static ObjId valueOf(String idString) {
		return new ObjId(idString);
	}
}
