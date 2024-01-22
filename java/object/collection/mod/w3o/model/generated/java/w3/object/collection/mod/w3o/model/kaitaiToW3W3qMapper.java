package w3.object.collection.mod.w3o.model;

public class kaitaiToW3W3qMapper {
  public static W3W3q map(w3.object.collection.mod.w3o.model.kaitai.W3W3q data) {
    if (data == null) {
      return null;
    }
    final W3W3q newData = new W3W3q();
    newData.setObjModFile(kaitaiToW3ObjModFileMapper.map(data.objModFile()));
    return newData;
  }
}
