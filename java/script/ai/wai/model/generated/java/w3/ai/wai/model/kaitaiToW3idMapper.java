package w3.ai.wai.model;

public class kaitaiToW3idMapper {
  public static W3id map(w3.ai.wai.model.kaitai.W3id data) {
    return new W3id(data.value());
  }
}
