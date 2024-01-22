package w3.object.collection.mod.w3o.model;

public class kaitaiToW3idMapper {
  public static W3id map(w3.object.collection.mod.w3o.model.kaitai.W3id data) {
    if (data == null) {
      return null;
    }
    return new W3id(data.value());
  }
}
