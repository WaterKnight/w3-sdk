package w3.env.placement.object.units_doo.model;

public class kaitaiToW3DooUnitsPre132Mapper {
  public static W3DooUnitsPre132 map(
      w3.env.placement.object.units_doo.model.kaitai.W3DooUnitsPre132 data) {
    if (data == null) {
      return null;
    }
    final W3DooUnitsPre132 newData = new W3DooUnitsPre132();
    newData.setValue(kaitaiToW3DooUnitsMapper.map(data.value()));
    return newData;
  }
}
