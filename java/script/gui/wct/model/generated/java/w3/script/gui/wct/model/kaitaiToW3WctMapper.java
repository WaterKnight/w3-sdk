package w3.script.gui.wct.model;

import java.util.stream.Collectors;

public class kaitaiToW3WctMapper {
  public static W3Wct map(w3.script.gui.wct.model.kaitai.W3Wct data) {
    if (data == null) {
      return null;
    }
    final W3Wct newData = new W3Wct();
    newData.setVersion(kaitaiToVersionMapper.map(data.version()));
    newData.setHeadComment(data.headComment());
    newData.setHeadTrigger(kaitaiToTriggerMapper.map(data.headTrigger()));
    newData.setTrigger(data.trigger().stream().map(kaitaiToTriggerMapper::map).collect(Collectors.toList()));
    return newData;
  }

  public static class kaitaiToVersionMapper {
    public static W3Wct.Version map(w3.script.gui.wct.model.kaitai.W3Wct.Version data) {
      if (data == null) {
        return null;
      }
      final W3Wct.Version newData = new W3Wct.Version();
      newData.setVal(data.val());
      newData.setFirstVersion(data.firstVersion());
      newData.setSecondVersion(data.secondVersion());
      return newData;
    }
  }

  public static class kaitaiToTriggerMapper {
    public static W3Wct.Trigger map(w3.script.gui.wct.model.kaitai.W3Wct.Trigger data) {
      if (data == null) {
        return null;
      }
      final W3Wct.Trigger newData = new W3Wct.Trigger();
      newData.setLength(data.length());
      newData.setContent(data.content());
      return newData;
    }
  }
}
