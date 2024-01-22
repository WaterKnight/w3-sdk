package w3.env.placement.region.w3r.model;

public class kaitaiToW3strMapper {
  public static W3str map(w3.env.placement.region.w3r.model.kaitai.W3str data) {
    if (data == null) {
      return null;
    }
    final W3str newData = new W3str();
    newData.setValue(data.value());
    return newData;
  }
}
