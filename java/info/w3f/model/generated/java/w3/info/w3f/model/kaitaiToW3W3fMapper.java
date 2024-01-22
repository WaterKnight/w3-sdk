package w3.info.w3f.model;

import java.util.stream.Collectors;

public class kaitaiToW3W3fMapper {
  public static W3W3f map(w3.info.w3f.model.kaitai.W3W3f data) {
    if (data == null) {
      return null;
    }
    final W3W3f newData = new W3W3f();
    newData.setVersion(data.version());
    newData.setSaves(data.saves());
    newData.setEditorVersion(data.editorVersion());
    newData.setName(kaitaiToW3strMapper.map(data.name()));
    newData.setDifficulty(kaitaiToW3strMapper.map(data.difficulty()));
    newData.setAuthor(kaitaiToW3strMapper.map(data.author()));
    newData.setDescription(kaitaiToW3strMapper.map(data.description()));
    newData.setVariableDifficultyLevelsFlagAndExpansionFlag(kaitaiToVariableDifficultyLevelsFlagAndExpansionFlagMapper.map(data.variableDifficultyLevelsFlagAndExpansionFlag()));
    newData.setBackgroundScreenIndex(data.backgroundScreenIndex());
    newData.setBackgroundScreenPath(kaitaiToW3strMapper.map(data.backgroundScreenPath()));
    newData.setMinimapPicturePath(kaitaiToW3strMapper.map(data.minimapPicturePath()));
    newData.setAmbientSoundIndex(data.ambientSoundIndex());
    newData.setCustomAmbientSoundPath(kaitaiToW3strMapper.map(data.customAmbientSoundPath()));
    newData.setUseTerrainFog(data.useTerrainFog());
    newData.setFogZHeight(data.fogZHeight());
    newData.setFogZEnd(data.fogZEnd());
    newData.setFogDensity(data.fogDensity());
    newData.setFogRed(data.fogRed());
    newData.setFogGreen(data.fogGreen());
    newData.setFogBlue(data.fogBlue());
    newData.setFogAlpha(data.fogAlpha());
    newData.setCursorRaceIndex(data.cursorRaceIndex());
    newData.setMap(data.map().stream().map(kaitaiToW3MapMapper::map).collect(Collectors.toList()));
    newData.setMapOrder(data.mapOrder().stream().map(kaitaiToW3MapOrderMapper::map).collect(Collectors.toList()));
    return newData;
  }

  public static class kaitaiToVariableDifficultyLevelsFlagAndExpansionFlagMapper {
    public static W3W3f.VariableDifficultyLevelsFlagAndExpansionFlag map(
        w3.info.w3f.model.kaitai.W3W3f.VariableDifficultyLevelsFlagAndExpansionFlag data) {
      if (data == null) {
        return null;
      }
      return W3W3f.VariableDifficultyLevelsFlagAndExpansionFlag.valueOf(data.name());
    }
  }

  public static class kaitaiToW3MapMapper {
    public static W3W3f.W3Map map(w3.info.w3f.model.kaitai.W3W3f.W3Map data) {
      if (data == null) {
        return null;
      }
      final W3W3f.W3Map newData = new W3W3f.W3Map();
      newData.setVisibility(kaitaiToMapVisibilityMapper.map(data.visibility()));
      newData.setChapterTitle(kaitaiToW3strMapper.map(data.chapterTitle()));
      newData.setMapTitle(kaitaiToW3strMapper.map(data.mapTitle()));
      newData.setPath(kaitaiToW3strMapper.map(data.path()));
      return newData;
    }
  }

  public static class kaitaiToMapVisibilityMapper {
    public static W3W3f.MapVisibility map(w3.info.w3f.model.kaitai.W3W3f.MapVisibility data) {
      if (data == null) {
        return null;
      }
      return W3W3f.MapVisibility.valueOf(data.name());
    }
  }

  public static class kaitaiToW3MapOrderMapper {
    public static W3W3f.W3MapOrder map(w3.info.w3f.model.kaitai.W3W3f.W3MapOrder data) {
      if (data == null) {
        return null;
      }
      final W3W3f.W3MapOrder newData = new W3W3f.W3MapOrder();
      newData.setUnknown(kaitaiToW3strMapper.map(data.unknown()));
      newData.setPath(kaitaiToW3strMapper.map(data.path()));
      return newData;
    }
  }
}
