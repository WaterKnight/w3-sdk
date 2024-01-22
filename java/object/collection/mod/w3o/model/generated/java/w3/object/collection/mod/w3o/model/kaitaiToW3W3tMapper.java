package w3.object.collection.mod.w3o.model;

public class kaitaiToW3W3tMapper {
  public static W3W3t map(w3.object.collection.mod.w3o.model.kaitai.W3W3t data) {
    if (data == null) {
      return null;
    }
    final W3W3t newData = new W3W3t();
    newData.setObjModFile(kaitaiToW3ObjModFileMapper.map(data.objModFile()));
    return newData;
  }
}
