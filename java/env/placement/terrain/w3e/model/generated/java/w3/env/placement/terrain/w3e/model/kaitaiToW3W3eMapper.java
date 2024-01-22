package w3.env.placement.terrain.w3e.model;

import java.util.stream.Collectors;

public class kaitaiToW3W3eMapper {
  public static W3W3e map(w3.env.placement.terrain.w3e.model.kaitai.W3W3e data) {
    if (data == null) {
      return null;
    }
    final W3W3e newData = new W3W3e();
    newData.setFileId(kaitaiToW3idMapper.map(data.fileId()));
    newData.setVersion(data.version());
    newData.setTileset(kaitaiToTilesetMapper.map(data.tileset()));
    newData.setUseCustomTileset(data.useCustomTileset());
    newData.setTileId(data.tileId().stream().map(kaitaiToW3idMapper::map).collect(Collectors.toList()));
    newData.setCliffTileId(data.cliffTileId().stream().map(kaitaiToW3idMapper::map).collect(Collectors.toList()));
    newData.setMapWidth(data.mapWidth());
    newData.setMapHeight(data.mapHeight());
    newData.setCenterOffsetX(data.centerOffsetX());
    newData.setCenterOffsetY(data.centerOffsetY());
    newData.setTileNode(data.tileNode().stream().map(kaitaiToTileNodeMapper::map).collect(Collectors.toList()));
    return newData;
  }

  public static class kaitaiToTilesetMapper {
    public static W3W3e.Tileset map(w3.env.placement.terrain.w3e.model.kaitai.W3W3e.Tileset data) {
      if (data == null) {
        return null;
      }
      return W3W3e.Tileset.valueOf(data.name());
    }
  }

  public static class kaitaiToTileNodeMapper {
    public static W3W3e.TileNode map(
        w3.env.placement.terrain.w3e.model.kaitai.W3W3e.TileNode data) {
      if (data == null) {
        return null;
      }
      final W3W3e.TileNode newData = new W3W3e.TileNode();
      newData.setGroundHeight(data.groundHeight());
      newData.setWaterHeightAndBoundary(kaitaiToWaterHeightAndBoundaryMapper.map(data.waterHeightAndBoundary()));
      newData.setFlagsAndGroundTexture(kaitaiToFlagsAndGroundTextureMapper.map(data.flagsAndGroundTexture()));
      newData.setGroundAndCliffVariation(data.groundAndCliffVariation());
      newData.setCliffTextureAndLayerHeight(kaitaiToCliffTextureAndLayerHeightMapper.map(data.cliffTextureAndLayerHeight()));
      return newData;
    }
  }

  public static class kaitaiToWaterHeightAndBoundaryMapper {
    public static W3W3e.WaterHeightAndBoundary map(
        w3.env.placement.terrain.w3e.model.kaitai.W3W3e.WaterHeightAndBoundary data) {
      if (data == null) {
        return null;
      }
      final W3W3e.WaterHeightAndBoundary newData = new W3W3e.WaterHeightAndBoundary();
      newData.setWaterHeight(data.waterHeight());
      newData.setFlag(data.flag());
      return newData;
    }
  }

  public static class kaitaiToFlagsAndGroundTextureMapper {
    public static W3W3e.FlagsAndGroundTexture map(
        w3.env.placement.terrain.w3e.model.kaitai.W3W3e.FlagsAndGroundTexture data) {
      if (data == null) {
        return null;
      }
      final W3W3e.FlagsAndGroundTexture newData = new W3W3e.FlagsAndGroundTexture();
      newData.setBoundary2(data.boundary2());
      newData.setWater(data.water());
      newData.setBlight(data.blight());
      newData.setRamp(data.ramp());
      newData.setTexture(data.texture());
      return newData;
    }
  }

  public static class kaitaiToCliffTextureAndLayerHeightMapper {
    public static W3W3e.CliffTextureAndLayerHeight map(
        w3.env.placement.terrain.w3e.model.kaitai.W3W3e.CliffTextureAndLayerHeight data) {
      if (data == null) {
        return null;
      }
      final W3W3e.CliffTextureAndLayerHeight newData = new W3W3e.CliffTextureAndLayerHeight();
      newData.setTexture(data.texture());
      newData.setLayer(data.layer());
      return newData;
    }
  }
}
