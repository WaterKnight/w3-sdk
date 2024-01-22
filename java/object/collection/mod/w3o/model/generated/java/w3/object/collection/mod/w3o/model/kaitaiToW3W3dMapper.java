package w3.object.collection.mod.w3o.model;

public class kaitaiToW3W3dMapper {
  public static W3W3d map(w3.object.collection.mod.w3o.model.kaitai.W3W3d data) {
    if (data == null) {
      return null;
    }
    final W3W3d newData = new W3W3d();
    newData.setObjModFile(kaitaiToW3ObjModFileMapper.map(data.objModFile()));
    return newData;
  }
}
