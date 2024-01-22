package w3.object.collection.mod.w3o.model;

public class kaitaiToW3W3aMapper {
  public static W3W3a map(w3.object.collection.mod.w3o.model.kaitai.W3W3a data) {
    if (data == null) {
      return null;
    }
    final W3W3a newData = new W3W3a();
    newData.setObjModFile(kaitaiToW3ObjModFileMapper.map(data.objModFile()));
    return newData;
  }
}
