import w3.object.common.ObjId;

public class AbilCode extends ObjId {
	protected AbilCode(String idString) {
		super(idString);
	}

	public static AbilCode valueOf(ObjId id) {
		return new AbilCode(id.toString());
	}
}
