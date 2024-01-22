package w3.info.w3i.model;

public class kaitaiToW3charMapper {
  public static W3char map(w3.info.w3i.model.kaitai.W3char data) {
    if (data == null) {
      return null;
    }
    final W3char newData = new W3char();
    newData.setValue(data.value());
    return newData;
  }
}
