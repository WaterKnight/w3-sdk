package w3.env.placement.object.doo.model;

public class kaitaiToW3DooPre132Mapper {
  public static W3DooPre132 map(w3.env.placement.object.doo.model.kaitai.W3DooPre132 data) {
    if (data == null) {
      return null;
    }
    final W3DooPre132 newData = new W3DooPre132();
    newData.setValue(kaitaiToW3DooMapper.map(data.value()));
    return newData;
  }
}
