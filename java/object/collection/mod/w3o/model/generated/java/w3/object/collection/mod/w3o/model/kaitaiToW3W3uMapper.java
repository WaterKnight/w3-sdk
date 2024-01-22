package w3.object.collection.mod.w3o.model;

public class kaitaiToW3W3uMapper {
  public static W3W3u map(w3.object.collection.mod.w3o.model.kaitai.W3W3u data) {
    if (data == null) {
      return null;
    }
    final W3W3u newData = new W3W3u();
    newData.setObjModFile(kaitaiToW3ObjModFileMapper.map(data.objModFile()));
    return newData;
  }
}
