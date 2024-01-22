package w3.env.placement.object.doo.model;

public class kaitaiToW3Doo132Mapper {
  public static W3Doo132 map(w3.env.placement.object.doo.model.kaitai.W3Doo132 data) {
    if (data == null) {
      return null;
    }
    final W3Doo132 newData = new W3Doo132();
    newData.setValue(kaitaiToW3DooMapper.map(data.value()));
    return newData;
  }
}
