package w3.info.mmp.model;

import java.util.stream.Collectors;

public class kaitaiToW3MmpMapper {
  public static W3Mmp map(w3.info.mmp.model.kaitai.W3Mmp data) {
    if (data == null) {
      return null;
    }
    final W3Mmp newData = new W3Mmp();
    newData.setVersion(data.version());
    newData.setIconsChunk(kaitaiToIconsChunkMapper.map(data.iconsChunk()));
    return newData;
  }

  public static class kaitaiToIconsChunkMapper {
    public static W3Mmp.IconsChunk map(w3.info.mmp.model.kaitai.W3Mmp.IconsChunk data) {
      if (data == null) {
        return null;
      }
      final W3Mmp.IconsChunk newData = new W3Mmp.IconsChunk();
      newData.setIcon(data.icon().stream().map(kaitaiToIconMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToColorMapper {
    public static W3Mmp.Color map(w3.info.mmp.model.kaitai.W3Mmp.Color data) {
      if (data == null) {
        return null;
      }
      final W3Mmp.Color newData = new W3Mmp.Color();
      newData.setBlue(data.blue());
      newData.setGreen(data.green());
      newData.setRed(data.red());
      newData.setAlpha(data.alpha());
      return newData;
    }
  }

  public static class kaitaiToIconMapper {
    public static W3Mmp.Icon map(w3.info.mmp.model.kaitai.W3Mmp.Icon data) {
      if (data == null) {
        return null;
      }
      final W3Mmp.Icon newData = new W3Mmp.Icon();
      newData.setIconType(kaitaiToIconTypeMapper.map(data.iconType()));
      newData.setx(data.x());
      newData.sety(data.y());
      newData.setColor(kaitaiToColorMapper.map(data.color()));
      return newData;
    }
  }

  public static class kaitaiToIconTypeMapper {
    public static W3Mmp.IconType map(w3.info.mmp.model.kaitai.W3Mmp.IconType data) {
      if (data == null) {
        return null;
      }
      return W3Mmp.IconType.valueOf(data.name());
    }
  }
}
