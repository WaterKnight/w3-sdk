package w3.save.w3v.model;

public class kaitaiToW3idMapper {
  public static W3id map(w3.save.w3v.impl.kaitai.W3id data) {
    if (data == null) {
      return null;
    }
    return new W3id(data.value());
  }
}
