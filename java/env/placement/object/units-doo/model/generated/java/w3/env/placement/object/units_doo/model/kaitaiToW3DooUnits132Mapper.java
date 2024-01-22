package w3.env.placement.object.units_doo.model;

public class kaitaiToW3DooUnits132Mapper {
  public static W3DooUnits132 map(
      w3.env.placement.object.units_doo.model.kaitai.W3DooUnits132 data) {
    if (data == null) {
      return null;
    }
    final W3DooUnits132 newData = new W3DooUnits132();
    newData.setValue(kaitaiToW3DooUnitsMapper.map(data.value()));
    return newData;
  }
}
