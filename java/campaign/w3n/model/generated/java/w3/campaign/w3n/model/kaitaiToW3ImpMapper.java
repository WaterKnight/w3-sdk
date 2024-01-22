package w3.campaign.w3n.model;

import java.util.stream.Collectors;

public class kaitaiToW3ImpMapper {
  public static W3Imp map(w3.campaign.w3n.model.kaitai.W3Imp data) {
    final W3Imp newData = new W3Imp();
    newData.setVersion(data.version());
    newData.setImportObj(data.importObj().stream().map(kaitaiToImportObjMapper::map).collect(Collectors.toList()));
    return newData;
  }

  public static class kaitaiToImportObjMapper {
    public static W3Imp.ImportObj map(w3.campaign.w3n.model.kaitai.W3Imp.ImportObj data) {
      final W3Imp.ImportObj newData = new W3Imp.ImportObj();
      newData.setFlags(data.flags());
      newData.setPath(kaitaiToW3strMapper.map(data.path()));
      return newData;
    }
  }
}
