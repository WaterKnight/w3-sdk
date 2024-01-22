package w3.info.w3i.model;

public class kaitaiToW3idMapper {
  public static W3id map(w3.info.w3i.model.kaitai.W3id data) {
    if (data == null) {
      return null;
    }
    return new W3id(data.value());
  }
}
