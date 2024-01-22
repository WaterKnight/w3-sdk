package w3.object.collection.mod.w3o.model;

public class kaitaiToW3W3bMapper {
  public static W3W3b map(w3.object.collection.mod.w3o.model.kaitai.W3W3b data) {
    if (data == null) {
      return null;
    }
    final W3W3b newData = new W3W3b();
    newData.setObjModFile(kaitaiToW3ObjModFileMapper.map(data.objModFile()));
    return newData;
  }
}
