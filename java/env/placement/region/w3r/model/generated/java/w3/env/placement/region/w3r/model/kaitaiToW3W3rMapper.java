package w3.env.placement.region.w3r.model;

import java.util.stream.Collectors;

public class kaitaiToW3W3rMapper {
  public static W3W3r map(w3.env.placement.region.w3r.model.kaitai.W3W3r data) {
    if (data == null) {
      return null;
    }
    final W3W3r newData = new W3W3r();
    newData.setVersion(data.version());
    newData.setRegion(data.region().stream().map(kaitaiToRegionMapper::map).collect(Collectors.toList()));
    return newData;
  }

  public static class kaitaiToRegionMapper {
    public static W3W3r.Region map(w3.env.placement.region.w3r.model.kaitai.W3W3r.Region data) {
      if (data == null) {
        return null;
      }
      final W3W3r.Region newData = new W3W3r.Region();
      newData.setLeft(data.left());
      newData.setBottom(data.bottom());
      newData.setRight(data.right());
      newData.setTop(data.top());
      newData.setName(kaitaiToW3strMapper.map(data.name()));
      newData.setId(data.id());
      newData.setWeatherId(kaitaiToW3idMapper.map(data.weatherId()));
      newData.setAmbientSound(kaitaiToW3strMapper.map(data.ambientSound()));
      newData.setColorBlue(data.colorBlue());
      newData.setColorGreen(data.colorGreen());
      newData.setColorRed(data.colorRed());
      newData.setEndToken(data.endToken());
      return newData;
    }
  }
}
