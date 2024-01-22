package w3.script.gui.wct.model;

public class kaitaiToW3idMapper {
  public static W3id map(w3.script.gui.wct.model.kaitai.W3id data) {
    if (data == null) {
      return null;
    }
    return new W3id(data.value());
  }
}
