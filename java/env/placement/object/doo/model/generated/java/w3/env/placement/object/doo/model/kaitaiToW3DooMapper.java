package w3.env.placement.object.doo.model;

import java.util.stream.Collectors;

public class kaitaiToW3DooMapper {
  public static W3Doo map(w3.env.placement.object.doo.model.kaitai.W3Doo data) {
    if (data == null) {
      return null;
    }
    final W3Doo newData = new W3Doo();
    newData.setFileId(kaitaiToW3idMapper.map(data.fileId()));
    newData.setVersion(data.version());
    newData.setSubVersion(data.subVersion());
    newData.setDoodad(data.doodad().stream().map(kaitaiToDoodadMapper::map).collect(Collectors.toList()));
    newData.setSpecialDoodadVersion(data.specialDoodadVersion());
    newData.setSpecialDoodad(data.specialDoodad().stream().map(kaitaiToSpecialDoodadMapper::map).collect(Collectors.toList()));
    newData.setUseSkin(data.useSkin());
    return newData;
  }

  public static class kaitaiToItemMapper {
    public static W3Doo.Item map(w3.env.placement.object.doo.model.kaitai.W3Doo.Item data) {
      if (data == null) {
        return null;
      }
      final W3Doo.Item newData = new W3Doo.Item();
      newData.setId(kaitaiToW3idMapper.map(data.id()));
      newData.setChance(data.chance());
      return newData;
    }
  }

  public static class kaitaiToSpecialDoodadMapper {
    public static W3Doo.SpecialDoodad map(
        w3.env.placement.object.doo.model.kaitai.W3Doo.SpecialDoodad data) {
      if (data == null) {
        return null;
      }
      final W3Doo.SpecialDoodad newData = new W3Doo.SpecialDoodad();
      newData.setId(kaitaiToW3idMapper.map(data.id()));
      newData.setx(data.x());
      newData.sety(data.y());
      newData.setz(data.z());
      return newData;
    }
  }

  public static class kaitaiToItemSetMapper {
    public static W3Doo.ItemSet map(w3.env.placement.object.doo.model.kaitai.W3Doo.ItemSet data) {
      if (data == null) {
        return null;
      }
      final W3Doo.ItemSet newData = new W3Doo.ItemSet();
      newData.setItem(data.item().stream().map(kaitaiToItemMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToDoodadMapper {
    public static W3Doo.Doodad map(w3.env.placement.object.doo.model.kaitai.W3Doo.Doodad data) {
      if (data == null) {
        return null;
      }
      final W3Doo.Doodad newData = new W3Doo.Doodad();
      newData.setId(kaitaiToW3idMapper.map(data.id()));
      newData.setVariation(data.variation());
      newData.setx(data.x());
      newData.sety(data.y());
      newData.setz(data.z());
      newData.setAngle(data.angle());
      newData.setScaleX(data.scaleX());
      newData.setScaleY(data.scaleY());
      newData.setScaleZ(data.scaleZ());
      newData.setSkinId(kaitaiToW3idMapper.map(data.skinId()));
      newData.setFlags(data.flags());
      newData.setLife(data.life());
      newData.setRandomItemSetPtr(data.randomItemSetPtr());
      newData.setItemSet(data.itemSet().stream().map(kaitaiToItemSetMapper::map).collect(Collectors.toList()));
      newData.setEditorId(data.editorId());
      return newData;
    }
  }
}
