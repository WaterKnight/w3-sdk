package w3.object.collection.mod.w3o.model;

public class kaitaiToW3W3hMapper {
  public static W3W3h map(w3.object.collection.mod.w3o.model.kaitai.W3W3h data) {
    if (data == null) {
      return null;
    }
    final W3W3h newData = new W3W3h();
    newData.setObjModFile(kaitaiToW3ObjModFileMapper.map(data.objModFile()));
    return newData;
  }
}
