package w3.info.w3i.model;

import java.util.stream.Collectors;

public class kaitaiToW3W3iMapper {
  public static W3W3i map(w3.info.w3i.model.kaitai.W3W3i data) {
    if (data == null) {
      return null;
    }
    final W3W3i newData = new W3W3i();
    newData.setMapName(data.mapName());
    newData.setVersion(data.version());
    newData.setSaves(data.saves());
    newData.setEditorVersion(data.editorVersion());
    newData.setGameVersion(kaitaiToGameVersionMapper.map(data.gameVersion()));
    newData.setMapNameRaw(kaitaiToW3strMapper.map(data.mapNameRaw()));
    newData.setAuthor(kaitaiToW3strMapper.map(data.author()));
    newData.setDescription(kaitaiToW3strMapper.map(data.description()));
    newData.setRecommendedPlayers(kaitaiToW3strMapper.map(data.recommendedPlayers()));
    newData.setUnknownV0ToV3(kaitaiToUnknownV0ToV3Mapper.map(data.unknownV0ToV3()));
    newData.setUnknownV4ToV8(kaitaiToUnknownV4ToV8Mapper.map(data.unknownV4ToV8()));
    newData.setCameraBounds(kaitaiToCameraBoundsMapper.map(data.cameraBounds()));
    newData.setMargins(kaitaiToMarginsMapper.map(data.margins()));
    newData.setMapWidth(data.mapWidth());
    newData.setMapHeight(data.mapHeight());
    newData.setUnknownV3Int1(data.unknownV3Int1());
    newData.setFlags(kaitaiToFlagsMapper.map(data.flags()));
    newData.setTileset(kaitaiToTilesetMapper.map(data.tileset()));
    newData.setLoadingScreen(kaitaiToLoadingScreenMapper.map(data.loadingScreen()));
    newData.setGameDataSet(kaitaiToGameDataSetMapper.map(data.gameDataSet()));
    newData.setUnknownPath(kaitaiToW3strMapper.map(data.unknownPath()));
    newData.setPrologueScreen(kaitaiToPrologueScreenMapper.map(data.prologueScreen()));
    newData.setFog(kaitaiToFogMapper.map(data.fog()));
    newData.setGlobalWeatherId(kaitaiToW3idMapper.map(data.globalWeatherId()));
    newData.setSoundEnvironment(kaitaiToW3strMapper.map(data.soundEnvironment()));
    newData.setLightEnvironment(kaitaiToW3charMapper.map(data.lightEnvironment()));
    newData.setWaterColor(kaitaiToWaterColorMapper.map(data.waterColor()));
    newData.setScriptLanguage(kaitaiToScriptLanguageMapper.map(data.scriptLanguage()));
    newData.setSupportedGraphicsModes(kaitaiToGraphicsModesMapper.map(data.supportedGraphicsModes()));
    newData.setGameDataVersion(kaitaiToGameDataVersionMapper.map(data.gameDataVersion()));
    newData.setPlayersChunk(kaitaiToPlayersChunkMapper.map(data.playersChunk()));
    newData.setForcesChunk(kaitaiToForcesChunkMapper.map(data.forcesChunk()));
    newData.setUpgradesChunk(kaitaiToUpgradesChunkMapper.map(data.upgradesChunk()));
    newData.setTechsChunk(kaitaiToTechsChunkMapper.map(data.techsChunk()));
    newData.setRandomUnitTablesChunk(kaitaiToRandomUnitTablesChunkMapper.map(data.randomUnitTablesChunk()));
    newData.setRandomItemTablesChunk(kaitaiToRandomItemTablesChunkMapper.map(data.randomItemTablesChunk()));
    newData.setScriptLanguage2(data.scriptLanguage2());
    return newData;
  }

  public static class kaitaiToRandomItemTablesChunkMapper {
    public static W3W3i.RandomItemTablesChunk map(
        w3.info.w3i.model.kaitai.W3W3i.RandomItemTablesChunk data) {
      if (data == null) {
        return null;
      }
      final W3W3i.RandomItemTablesChunk newData = new W3W3i.RandomItemTablesChunk();
      newData.setTable(data.table().stream().map(kaitaiToRandomItemTableMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToGameDataSetMapper {
    public static W3W3i.GameDataSet map(w3.info.w3i.model.kaitai.W3W3i.GameDataSet data) {
      if (data == null) {
        return null;
      }
      return W3W3i.GameDataSet.valueOf(data.name());
    }
  }

  public static class kaitaiToForceFlagsMapper {
    public static W3W3i.ForceFlags map(w3.info.w3i.model.kaitai.W3W3i.ForceFlags data) {
      if (data == null) {
        return null;
      }
      final W3W3i.ForceFlags newData = new W3W3i.ForceFlags();
      newData.setBits(kaitaiToForceFlagsBitsMapper.map(data.bits()));
      return newData;
    }
  }

  public static class kaitaiToUnknownV0ToV3Mapper {
    public static W3W3i.UnknownV0ToV3 map(w3.info.w3i.model.kaitai.W3W3i.UnknownV0ToV3 data) {
      if (data == null) {
        return null;
      }
      final W3W3i.UnknownV0ToV3 newData = new W3W3i.UnknownV0ToV3();
      newData.setUnknownV0Int1(data.unknownV0Int1());
      newData.setUnknownV0Int2(data.unknownV0Int2());
      return newData;
    }
  }

  public static class kaitaiToPlayerMapper {
    public static W3W3i.Player map(w3.info.w3i.model.kaitai.W3W3i.Player data) {
      if (data == null) {
        return null;
      }
      final W3W3i.Player newData = new W3W3i.Player();
      newData.setNum(data.num());
      newData.setController(kaitaiToPlayerControllerMapper.map(data.controller()));
      newData.setRace(kaitaiToPlayerRaceMapper.map(data.race()));
      newData.setFixedPosition(data.fixedPosition());
      newData.setName(kaitaiToW3strMapper.map(data.name()));
      newData.setPosition(kaitaiToPoint2dMapper.map(data.position()));
      newData.setAllyLowPriority(kaitaiToPlayerBitmapMapper.map(data.allyLowPriority()));
      newData.setAllyHighPriority(kaitaiToPlayerBitmapMapper.map(data.allyHighPriority()));
      newData.setEnemyLowPriority(kaitaiToPlayerBitmapMapper.map(data.enemyLowPriority()));
      newData.setEnemyHighPriority(kaitaiToPlayerBitmapMapper.map(data.enemyHighPriority()));
      return newData;
    }
  }

  public static class kaitaiToFogMapper {
    public static W3W3i.Fog map(w3.info.w3i.model.kaitai.W3W3i.Fog data) {
      if (data == null) {
        return null;
      }
      final W3W3i.Fog newData = new W3W3i.Fog();
      newData.setFogType(kaitaiToFogTypeMapper.map(data.fogType()));
      newData.setFogZStart(data.fogZStart());
      newData.setFogZEnd(data.fogZEnd());
      newData.setFogDensity(data.fogDensity());
      newData.setFogColorRed(data.fogColorRed());
      newData.setFogColorGreen(data.fogColorGreen());
      newData.setFogColorBlue(data.fogColorBlue());
      newData.setFogColorAlpha(data.fogColorAlpha());
      return newData;
    }
  }

  public static class kaitaiToForceMapper {
    public static W3W3i.Force map(w3.info.w3i.model.kaitai.W3W3i.Force data) {
      if (data == null) {
        return null;
      }
      final W3W3i.Force newData = new W3W3i.Force();
      newData.setFlags(kaitaiToForceFlagsMapper.map(data.flags()));
      newData.setPlayers(kaitaiToPlayerBitmapMapper.map(data.players()));
      newData.setName(kaitaiToW3strMapper.map(data.name()));
      return newData;
    }
  }

  public static class kaitaiToLoadingScreenMapper {
    public static W3W3i.LoadingScreen map(w3.info.w3i.model.kaitai.W3W3i.LoadingScreen data) {
      if (data == null) {
        return null;
      }
      final W3W3i.LoadingScreen newData = new W3W3i.LoadingScreen();
      newData.setLoadingScreenIndex(data.loadingScreenIndex());
      newData.setCustomLoadingScreenPath(kaitaiToW3strMapper.map(data.customLoadingScreenPath()));
      newData.setLoadingScreenText(kaitaiToW3strMapper.map(data.loadingScreenText()));
      newData.setLoadingScreenTitle(kaitaiToW3strMapper.map(data.loadingScreenTitle()));
      newData.setLoadingScreenSubtitle(kaitaiToW3strMapper.map(data.loadingScreenSubtitle()));
      return newData;
    }
  }

  public static class kaitaiToForcesChunkMapper {
    public static W3W3i.ForcesChunk map(w3.info.w3i.model.kaitai.W3W3i.ForcesChunk data) {
      if (data == null) {
        return null;
      }
      final W3W3i.ForcesChunk newData = new W3W3i.ForcesChunk();
      newData.setForce(data.force().stream().map(kaitaiToForceMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToPoint2dMapper {
    public static W3W3i.Point2d map(w3.info.w3i.model.kaitai.W3W3i.Point2d data) {
      if (data == null) {
        return null;
      }
      final W3W3i.Point2d newData = new W3W3i.Point2d();
      newData.setx(data.x());
      newData.sety(data.y());
      return newData;
    }
  }

  public static class kaitaiToPlayerControllerMapper {
    public static W3W3i.PlayerController map(w3.info.w3i.model.kaitai.W3W3i.PlayerController data) {
      if (data == null) {
        return null;
      }
      return W3W3i.PlayerController.valueOf(data.name());
    }
  }

  public static class kaitaiToMarginsMapper {
    public static W3W3i.Margins map(w3.info.w3i.model.kaitai.W3W3i.Margins data) {
      if (data == null) {
        return null;
      }
      final W3W3i.Margins newData = new W3W3i.Margins();
      newData.setLeft(data.left());
      newData.setRight(data.right());
      newData.setBottom(data.bottom());
      newData.setTop(data.top());
      return newData;
    }
  }

  public static class kaitaiToGameDataVersionMapper {
    public static W3W3i.GameDataVersion map(w3.info.w3i.model.kaitai.W3W3i.GameDataVersion data) {
      if (data == null) {
        return null;
      }
      return W3W3i.GameDataVersion.valueOf(data.name());
    }
  }

  public static class kaitaiToForceFlagsBitsMapper {
    public static W3W3i.ForceFlagsBits map(w3.info.w3i.model.kaitai.W3W3i.ForceFlagsBits data) {
      if (data == null) {
        return null;
      }
      final W3W3i.ForceFlagsBits newData = new W3W3i.ForceFlagsBits();
      newData.setFlag7(data.flag7());
      newData.setFlag6(data.flag6());
      newData.setFlag5(data.flag5());
      newData.setShareAdvancedUnitControl(data.shareAdvancedUnitControl());
      newData.setShareUnitControl(data.shareUnitControl());
      newData.setShareVision(data.shareVision());
      newData.setAlliedVictory(data.alliedVictory());
      newData.setAllied(data.allied());
      newData.setRest(data.rest());
      return newData;
    }
  }

  public static class kaitaiToRandomUnitTableRowMapper {
    public static W3W3i.RandomUnitTableRow map(
        w3.info.w3i.model.kaitai.W3W3i.RandomUnitTableRow data) {
      if (data == null) {
        return null;
      }
      final W3W3i.RandomUnitTableRow newData = new W3W3i.RandomUnitTableRow();
      newData.setChance(data.chance());
      newData.setId(data.id().stream().map(kaitaiToW3idMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToPlayerRaceMapper {
    public static W3W3i.PlayerRace map(w3.info.w3i.model.kaitai.W3W3i.PlayerRace data) {
      if (data == null) {
        return null;
      }
      return W3W3i.PlayerRace.valueOf(data.name());
    }
  }

  public static class kaitaiToPlayersChunkMapper {
    public static W3W3i.PlayersChunk map(w3.info.w3i.model.kaitai.W3W3i.PlayersChunk data) {
      if (data == null) {
        return null;
      }
      final W3W3i.PlayersChunk newData = new W3W3i.PlayersChunk();
      newData.setPlayer(data.player().stream().map(kaitaiToPlayerMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToUnknownV4ToV8Mapper {
    public static W3W3i.UnknownV4ToV8 map(w3.info.w3i.model.kaitai.W3W3i.UnknownV4ToV8 data) {
      if (data == null) {
        return null;
      }
      final W3W3i.UnknownV4ToV8 newData = new W3W3i.UnknownV4ToV8();
      newData.setUnknownV4Int1(data.unknownV4Int1());
      newData.setUnknownV4Int2(data.unknownV4Int2());
      newData.setUnknownV4Int3(data.unknownV4Int3());
      newData.setUnknownV4Float1(data.unknownV4Float1());
      newData.setUnknownV4Float2(data.unknownV4Float2());
      newData.setUnknownV4Float3(data.unknownV4Float3());
      return newData;
    }
  }

  public static class kaitaiToItemSetMapper {
    public static W3W3i.ItemSet map(w3.info.w3i.model.kaitai.W3W3i.ItemSet data) {
      if (data == null) {
        return null;
      }
      final W3W3i.ItemSet newData = new W3W3i.ItemSet();
      newData.setItem(data.item().stream().map(kaitaiToItemMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToTechMapper {
    public static W3W3i.Tech map(w3.info.w3i.model.kaitai.W3W3i.Tech data) {
      if (data == null) {
        return null;
      }
      final W3W3i.Tech newData = new W3W3i.Tech();
      newData.setPlayers(data.players());
      newData.setId(kaitaiToW3idMapper.map(data.id()));
      return newData;
    }
  }

  public static class kaitaiToTechsChunkMapper {
    public static W3W3i.TechsChunk map(w3.info.w3i.model.kaitai.W3W3i.TechsChunk data) {
      if (data == null) {
        return null;
      }
      final W3W3i.TechsChunk newData = new W3W3i.TechsChunk();
      newData.setTech(data.tech().stream().map(kaitaiToTechMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToUpgradesChunkMapper {
    public static W3W3i.UpgradesChunk map(w3.info.w3i.model.kaitai.W3W3i.UpgradesChunk data) {
      if (data == null) {
        return null;
      }
      final W3W3i.UpgradesChunk newData = new W3W3i.UpgradesChunk();
      newData.setUpgrade(data.upgrade().stream().map(kaitaiToUpgradeMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToUpgradeMapper {
    public static W3W3i.Upgrade map(w3.info.w3i.model.kaitai.W3W3i.Upgrade data) {
      if (data == null) {
        return null;
      }
      final W3W3i.Upgrade newData = new W3W3i.Upgrade();
      newData.setPlayers(data.players());
      newData.setId(kaitaiToW3idMapper.map(data.id()));
      newData.setLevel(data.level());
      newData.setAvailability(data.availability());
      return newData;
    }
  }

  public static class kaitaiToScriptLanguageMapper {
    public static W3W3i.ScriptLanguage map(w3.info.w3i.model.kaitai.W3W3i.ScriptLanguage data) {
      if (data == null) {
        return null;
      }
      return W3W3i.ScriptLanguage.valueOf(data.name());
    }
  }

  public static class kaitaiToFlagsMapper {
    public static W3W3i.Flags map(w3.info.w3i.model.kaitai.W3W3i.Flags data) {
      if (data == null) {
        return null;
      }
      final W3W3i.Flags newData = new W3W3i.Flags();
      newData.setUseCustomTechs(data.useCustomTechs());
      newData.setUseCustomTeams(data.useCustomTeams());
      newData.setFixedPlayerParametersForCustomTeams(data.fixedPlayerParametersForCustomTeams());
      newData.setUnexploredAreasPartiallyVisible(data.unexploredAreasPartiallyVisible());
      newData.setNonDefaultTilesetMapSizeLargeNeverBeenReducedToMedium(data.nonDefaultTilesetMapSizeLargeNeverBeenReducedToMedium());
      newData.setMelee(data.melee());
      newData.setChangeAllyPriorities(data.changeAllyPriorities());
      newData.setHideMinimapOnPreviewScreens(data.hideMinimapOnPreviewScreens());
      newData.setUseItemClassificationSystem(data.useItemClassificationSystem());
      newData.setTftRequired(data.tftRequired());
      newData.setUseTerrainFog(data.useTerrainFog());
      newData.setShowWaterWavesOnRollingShores(data.showWaterWavesOnRollingShores());
      newData.setShowWaterWavesOnCliffShores(data.showWaterWavesOnCliffShores());
      newData.setMapPropertiesMenuOpenedAtLeastOnce(data.mapPropertiesMenuOpenedAtLeastOnce());
      newData.setUseCustomUpgrades(data.useCustomUpgrades());
      newData.setUseCustomAbilities(data.useCustomAbilities());
      newData.setCustomWaterTintColor(data.customWaterTintColor());
      newData.setFlag17(data.flag17());
      newData.setFlag18(data.flag18());
      newData.setFlag19(data.flag19());
      newData.setFlag20(data.flag20());
      newData.setUseCustomAbilitySkin(data.useCustomAbilitySkin());
      newData.setUseAccurateProbabilitiesForCalculation(data.useAccurateProbabilitiesForCalculation());
      newData.setRest(data.rest());
      return newData;
    }
  }

  public static class kaitaiToWaterColorMapper {
    public static W3W3i.WaterColor map(w3.info.w3i.model.kaitai.W3W3i.WaterColor data) {
      if (data == null) {
        return null;
      }
      final W3W3i.WaterColor newData = new W3W3i.WaterColor();
      newData.setRed(data.red());
      newData.setGreen(data.green());
      newData.setBlue(data.blue());
      newData.setAlpha(data.alpha());
      return newData;
    }
  }

  public static class kaitaiToCameraBoundsMapper {
    public static W3W3i.CameraBounds map(w3.info.w3i.model.kaitai.W3W3i.CameraBounds data) {
      if (data == null) {
        return null;
      }
      final W3W3i.CameraBounds newData = new W3W3i.CameraBounds();
      newData.setCameraBoundBottomLeft(kaitaiToPoint2dMapper.map(data.cameraBoundBottomLeft()));
      newData.setCameraBoundTopRight(kaitaiToPoint2dMapper.map(data.cameraBoundTopRight()));
      newData.setCameraBoundTopLeft(kaitaiToPoint2dMapper.map(data.cameraBoundTopLeft()));
      newData.setCameraBoundBottomRight(kaitaiToPoint2dMapper.map(data.cameraBoundBottomRight()));
      return newData;
    }
  }

  public static class kaitaiToPlayerBitmapMapper {
    public static W3W3i.PlayerBitmap map(w3.info.w3i.model.kaitai.W3W3i.PlayerBitmap data) {
      if (data == null) {
        return null;
      }
      final W3W3i.PlayerBitmap newData = new W3W3i.PlayerBitmap();
      newData.setBits(kaitaiToPlayerBitmapBitsMapper.map(data.bits()));
      return newData;
    }
  }

  public static class kaitaiToItemMapper {
    public static W3W3i.Item map(w3.info.w3i.model.kaitai.W3W3i.Item data) {
      if (data == null) {
        return null;
      }
      final W3W3i.Item newData = new W3W3i.Item();
      newData.setChance(data.chance());
      newData.setId(kaitaiToW3idMapper.map(data.id()));
      return newData;
    }
  }

  public static class kaitaiToPlayerBitmapBitsMapper {
    public static W3W3i.PlayerBitmapBits map(w3.info.w3i.model.kaitai.W3W3i.PlayerBitmapBits data) {
      if (data == null) {
        return null;
      }
      final W3W3i.PlayerBitmapBits newData = new W3W3i.PlayerBitmapBits();
      newData.setIsMember(data.isMember());
      return newData;
    }
  }

  public static class kaitaiToRandomItemTableMapper {
    public static W3W3i.RandomItemTable map(w3.info.w3i.model.kaitai.W3W3i.RandomItemTable data) {
      if (data == null) {
        return null;
      }
      final W3W3i.RandomItemTable newData = new W3W3i.RandomItemTable();
      newData.setNum(data.num());
      newData.setName(kaitaiToW3strMapper.map(data.name()));
      newData.setSet(data.set().stream().map(kaitaiToItemSetMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToGameVersionMapper {
    public static W3W3i.GameVersion map(w3.info.w3i.model.kaitai.W3W3i.GameVersion data) {
      if (data == null) {
        return null;
      }
      final W3W3i.GameVersion newData = new W3W3i.GameVersion();
      newData.setMajor(data.major());
      newData.setMinor(data.minor());
      newData.setRevision(data.revision());
      newData.setBuild(data.build());
      return newData;
    }
  }

  public static class kaitaiToPrologueScreenMapper {
    public static W3W3i.PrologueScreen map(w3.info.w3i.model.kaitai.W3W3i.PrologueScreen data) {
      if (data == null) {
        return null;
      }
      final W3W3i.PrologueScreen newData = new W3W3i.PrologueScreen();
      newData.setPrologueScreenPath(kaitaiToW3strMapper.map(data.prologueScreenPath()));
      newData.setPrologueScreenText(kaitaiToW3strMapper.map(data.prologueScreenText()));
      newData.setPrologueScreenTitle(kaitaiToW3strMapper.map(data.prologueScreenTitle()));
      newData.setPrologueScreenSubtitle(kaitaiToW3strMapper.map(data.prologueScreenSubtitle()));
      return newData;
    }
  }

  public static class kaitaiToFogTypeMapper {
    public static W3W3i.FogType map(w3.info.w3i.model.kaitai.W3W3i.FogType data) {
      if (data == null) {
        return null;
      }
      return W3W3i.FogType.valueOf(data.name());
    }
  }

  public static class kaitaiToRandomUnitTableColumnTypeMapper {
    public static W3W3i.RandomUnitTableColumnType map(
        w3.info.w3i.model.kaitai.W3W3i.RandomUnitTableColumnType data) {
      if (data == null) {
        return null;
      }
      return W3W3i.RandomUnitTableColumnType.valueOf(data.name());
    }
  }

  public static class kaitaiToTilesetMapper {
    public static W3W3i.Tileset map(w3.info.w3i.model.kaitai.W3W3i.Tileset data) {
      if (data == null) {
        return null;
      }
      return W3W3i.Tileset.valueOf(data.name());
    }
  }

  public static class kaitaiToGraphicsModesMapper {
    public static W3W3i.GraphicsModes map(w3.info.w3i.model.kaitai.W3W3i.GraphicsModes data) {
      if (data == null) {
        return null;
      }
      final W3W3i.GraphicsModes newData = new W3W3i.GraphicsModes();
      newData.setRest(data.rest());
      newData.setSd(data.sd());
      newData.setHd(data.hd());
      return newData;
    }
  }

  public static class kaitaiToRandomUnitTablesChunkMapper {
    public static W3W3i.RandomUnitTablesChunk map(
        w3.info.w3i.model.kaitai.W3W3i.RandomUnitTablesChunk data) {
      if (data == null) {
        return null;
      }
      final W3W3i.RandomUnitTablesChunk newData = new W3W3i.RandomUnitTablesChunk();
      newData.setTable(data.table().stream().map(kaitaiToRandomUnitTableMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToRandomUnitTableMapper {
    public static W3W3i.RandomUnitTable map(w3.info.w3i.model.kaitai.W3W3i.RandomUnitTable data) {
      if (data == null) {
        return null;
      }
      final W3W3i.RandomUnitTable newData = new W3W3i.RandomUnitTable();
      newData.setIndex(data.index());
      newData.setName(kaitaiToW3strMapper.map(data.name()));
      newData.setColumnType(data.columnType().stream().map(kaitaiToRandomUnitTableColumnTypeMapper::map).collect(Collectors.toList()));
      newData.setRow(data.row().stream().map(kaitaiToRandomUnitTableRowMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }
}
