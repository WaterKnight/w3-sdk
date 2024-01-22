package w3.ai.wai.model;

public class kaitaiToW3strMapper {
  public static W3str map(w3.ai.wai.model.kaitai.W3str data) {
    final W3str newData = new W3str();
    newData.setValue(data.value());
    return newData;
  }
}
