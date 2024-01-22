package w3.env.shadow.shd.model;

public class kaitaiToW3ShdMapper {
  public static W3Shd map(w3.env.shadow.shd.model.kaitai.W3Shd data) {
    if (data == null) {
      return null;
    }
    final W3Shd newData = new W3Shd();
    newData.setShadowNode(data.shadowNode());
    return newData;
  }
}
