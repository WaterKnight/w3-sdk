package w3.env.placement.object.doo.model;

public class kaitaiToW3idMapper {
  public static W3id map(w3.env.placement.object.doo.model.kaitai.W3id data) {
    if (data == null) {
      return null;
    }
    return new W3id(data.value());
  }
}
