package w3.replay.w3g.model;

import java.util.stream.Collectors;

public class kaitaiToW3W3gMapper {
  public static W3W3g map(w3.replay.w3g.impl.kaitai.W3W3g data) {
    if (data == null) {
      return null;
    }
    final W3W3g newData = new W3W3g();
    newData.setPrivPublic(kaitaiToPrivatePublicEnumMapper.map(data.privPublic()));
    newData.setVersionOrSmth(data.versionOrSmth());
    newData.setPlayer(kaitaiToPlayerMapper.map(data.player()));
    newData.setGameName(data.gameName());
    newData.setNullByte(data.nullByte());
    newData.setCompressedArea(kaitaiToCompressedAreaMapper.map(data.compressedArea()));
    newData.setPlayerCount(data.playerCount());
    newData.setGameType(data.gameType());
    newData.setPriv(data.priv());
    newData.setFill(data.fill());
    newData.setLanguageId(data.languageId());
    newData.setPlayerOr0x19(kaitaiToPlayerOr0x19Mapper.map(data.playerOr0x19()));
    newData.setRecordsHeader(kaitaiToRecordsHeaderMapper.map(data.recordsHeader()));
    newData.setRecord(kaitaiToRecordChunkMapper.map(data.record()));
    newData.setRandomSeed(data.randomSeed());
    newData.setSelectMode(data.selectMode());
    newData.setBlock(kaitaiToBlockMapper.map(data.block()));
    return newData;
  }

  public static class kaitaiToRecordChunkMapper {
    public static W3W3g.RecordChunk map(w3.replay.w3g.impl.kaitai.W3W3g.RecordChunk data) {
      if (data == null) {
        return null;
      }
      final W3W3g.RecordChunk newData = new W3W3g.RecordChunk();
      newData.setRecord(data.record().stream().map(kaitaiToRecordMapper::map).collect(Collectors.toList()));
      newData.setRecordSize(data.recordSize());
      return newData;
    }
  }

  public static class kaitaiToActionCheatIocainePowderPayloadMapper {
    public static W3W3g.ActionCheatIocainePowderPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionCheatIocainePowderPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionCheatIocainePowderPayload newData = new W3W3g.ActionCheatIocainePowderPayload();
      newData.setNothing(data.nothing());
      return newData;
    }
  }

  public static class kaitaiToChangeSelectionModeMapper {
    public static W3W3g.ChangeSelectionMode map(
        w3.replay.w3g.impl.kaitai.W3W3g.ChangeSelectionMode data) {
      if (data == null) {
        return null;
      }
      return W3W3g.ChangeSelectionMode.valueOf(data.name());
    }
  }

  public static class kaitaiToActionMinimapSignalPayloadMapper {
    public static W3W3g.ActionMinimapSignalPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionMinimapSignalPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionMinimapSignalPayload newData = new W3W3g.ActionMinimapSignalPayload();
      newData.setx(data.x());
      newData.sety(data.y());
      newData.setUnknown(data.unknown());
      return newData;
    }
  }

  public static class kaitaiToActionUnitBuildingAbilityWithTargetPositionAndObjectPayloadMapper {
    public static W3W3g.ActionUnitBuildingAbilityWithTargetPositionAndObjectPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionUnitBuildingAbilityWithTargetPositionAndObjectPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionUnitBuildingAbilityWithTargetPositionAndObjectPayload newData = new W3W3g.ActionUnitBuildingAbilityWithTargetPositionAndObjectPayload();
      newData.setAbilityFlags(data.abilityFlags());
      newData.setOrderId(kaitaiToOrderIdMapper.map(data.orderId()));
      newData.setUnknownA(data.unknownA());
      newData.setUnknownB(data.unknownB());
      newData.setx(data.x());
      newData.sety(data.y());
      newData.setObjectId1(data.objectId1());
      newData.setObjectId2(data.objectId2());
      return newData;
    }
  }

  public static class kaitaiToActionUnknown0x7bPayloadMapper {
    public static W3W3g.ActionUnknown0x7bPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionUnknown0x7bPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionUnknown0x7bPayload newData = new W3W3g.ActionUnknown0x7bPayload();
      newData.setx(data.x());
      newData.sety(data.y());
      newData.setOrderId1(kaitaiToOrderIdMapper.map(data.orderId1()));
      newData.setOrderId2(kaitaiToOrderIdMapper.map(data.orderId2()));
      return newData;
    }
  }

  public static class kaitaiToActionPauseGamePayloadMapper {
    public static W3W3g.ActionPauseGamePayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionPauseGamePayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionPauseGamePayload newData = new W3W3g.ActionPauseGamePayload();
      newData.setNothing(data.nothing());
      return newData;
    }
  }

  public static class kaitaiToActionCheatGreedIsGoodPayloadMapper {
    public static W3W3g.ActionCheatGreedIsGoodPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionCheatGreedIsGoodPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionCheatGreedIsGoodPayload newData = new W3W3g.ActionCheatGreedIsGoodPayload();
      newData.setUnknown(data.unknown());
      newData.setAmount(data.amount());
      return newData;
    }
  }

  public static class kaitaiToActionSelectGroundItemPayloadMapper {
    public static W3W3g.ActionSelectGroundItemPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionSelectGroundItemPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionSelectGroundItemPayload newData = new W3W3g.ActionSelectGroundItemPayload();
      newData.setUnknown(data.unknown());
      newData.setObjectId1(data.objectId1());
      newData.setObjectId2(data.objectId2());
      return newData;
    }
  }

  public static class kaitaiToActionUnknown0x21PayloadMapper {
    public static W3W3g.ActionUnknown0x21Payload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionUnknown0x21Payload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionUnknown0x21Payload newData = new W3W3g.ActionUnknown0x21Payload();
      newData.setUnknownA(data.unknownA());
      newData.setUnknownB(data.unknownB());
      return newData;
    }
  }

  public static class kaitaiToActionGiveOrDropItemPayloadMapper {
    public static W3W3g.ActionGiveOrDropItemPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionGiveOrDropItemPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionGiveOrDropItemPayload newData = new W3W3g.ActionGiveOrDropItemPayload();
      newData.setAbilityFlags(data.abilityFlags());
      newData.setOrderId(kaitaiToOrderIdMapper.map(data.orderId()));
      newData.setUnknownA(data.unknownA());
      newData.setUnknownB(data.unknownB());
      newData.setx(data.x());
      newData.sety(data.y());
      newData.setTargetObjectId1(data.targetObjectId1());
      newData.setTargetObjectId2(data.targetObjectId2());
      newData.setItemObjectId1(data.itemObjectId1());
      newData.setItemObjectId2(data.itemObjectId2());
      return newData;
    }
  }

  public static class kaitaiToActionEscPressedPayloadMapper {
    public static W3W3g.ActionEscPressedPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionEscPressedPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionEscPressedPayload newData = new W3W3g.ActionEscPressedPayload();
      newData.setNothing(data.nothing());
      return newData;
    }
  }

  public static class kaitaiToActionTransferResourcesPayloadMapper {
    public static W3W3g.ActionTransferResourcesPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionTransferResourcesPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionTransferResourcesPayload newData = new W3W3g.ActionTransferResourcesPayload();
      newData.setPlayerSlotIndex(data.playerSlotIndex());
      newData.setGoldAmount(data.goldAmount());
      newData.setLumberAmount(data.lumberAmount());
      return newData;
    }
  }

  public static class kaitaiToActionBlockMapper {
    public static W3W3g.ActionBlock map(w3.replay.w3g.impl.kaitai.W3W3g.ActionBlock data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionBlock newData = new W3W3g.ActionBlock();
      newData.setAction(data.action().stream().map(kaitaiToActionMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToActionCheatStrengthAndHonorPayloadMapper {
    public static W3W3g.ActionCheatStrengthAndHonorPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionCheatStrengthAndHonorPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionCheatStrengthAndHonorPayload newData = new W3W3g.ActionCheatStrengthAndHonorPayload();
      newData.setNothing(data.nothing());
      return newData;
    }
  }

  public static class kaitaiToActionPreSubselectionPayloadMapper {
    public static W3W3g.ActionPreSubselectionPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionPreSubselectionPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionPreSubselectionPayload newData = new W3W3g.ActionPreSubselectionPayload();
      newData.setNothing(data.nothing());
      return newData;
    }
  }

  public static class kaitaiToPlayerMetaDataMapper {
    public static W3W3g.PlayerMetaData map(w3.replay.w3g.impl.kaitai.W3W3g.PlayerMetaData data) {
      if (data == null) {
        return null;
      }
      final W3W3g.PlayerMetaData newData = new W3W3g.PlayerMetaData();
      newData.setSize(data.size());
      newData.setFill(data.fill());
      newData.setId(data.id());
      newData.setFill2(data.fill2());
      newData.setLenIntName(data.lenIntName());
      newData.setName(data.name());
      newData.setTerminator(data.terminator());
      newData.setLenIntClan(data.lenIntClan());
      newData.setClan(data.clan());
      newData.setClanTerminator(data.clanTerminator());
      newData.setLenIntExtra(data.lenIntExtra());
      newData.setEnd(data.end());
      return newData;
    }
  }

  public static class kaitaiToActionIncreaseGameSpeedPayloadMapper {
    public static W3W3g.ActionIncreaseGameSpeedPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionIncreaseGameSpeedPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionIncreaseGameSpeedPayload newData = new W3W3g.ActionIncreaseGameSpeedPayload();
      newData.setNothing(data.nothing());
      return newData;
    }
  }

  public static class kaitaiToActionMapper {
    public static W3W3g.Action map(w3.replay.w3g.impl.kaitai.W3W3g.Action data) {
      if (data == null) {
        return null;
      }
      final W3W3g.Action newData = new W3W3g.Action();
      newData.setActionId(kaitaiToActionIdMapper.map(data.actionId()));
      newData.setActionPayload(new W3W3g.ActionPayload(data.actionPayload()));
      return newData;
    }
  }

  public static class kaitaiToPlayerMetaDataLoopMapper {
    public static W3W3g.PlayerMetaDataLoop map(
        w3.replay.w3g.impl.kaitai.W3W3g.PlayerMetaDataLoop data) {
      if (data == null) {
        return null;
      }
      final W3W3g.PlayerMetaDataLoop newData = new W3W3g.PlayerMetaDataLoop();
      newData.setDiscriminator(data.discriminator());
      newData.setPlayerMetaData(kaitaiToPlayerMetaDataMapper.map(data.playerMetaData()));
      newData.setNext(kaitaiToPlayerMetaDataLoopMapper.map(data.next()));
      return newData;
    }
  }

  public static class kaitaiToActionResumeGamePayloadMapper {
    public static W3W3g.ActionResumeGamePayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionResumeGamePayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionResumeGamePayload newData = new W3W3g.ActionResumeGamePayload();
      newData.setNothing(data.nothing());
      return newData;
    }
  }

  public static class kaitaiToPlayerListMapper {
    public static W3W3g.PlayerList map(w3.replay.w3g.impl.kaitai.W3W3g.PlayerList data) {
      if (data == null) {
        return null;
      }
      final W3W3g.PlayerList newData = new W3W3g.PlayerList();
      newData.setMember(kaitaiToPlayerListPlayerMapper.map(data.member()));
      newData.setFill(data.fill());
      return newData;
    }
  }

  public static class kaitaiToActionEnterChooseHeroSkillSubmenuPayloadMapper {
    public static W3W3g.ActionEnterChooseHeroSkillSubmenuPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionEnterChooseHeroSkillSubmenuPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionEnterChooseHeroSkillSubmenuPayload newData = new W3W3g.ActionEnterChooseHeroSkillSubmenuPayload();
      newData.setNothing(data.nothing());
      return newData;
    }
  }

  public static class kaitaiToPlayerOr0x19LoopMapper {
    public static W3W3g.PlayerOr0x19Loop map(
        w3.replay.w3g.impl.kaitai.W3W3g.PlayerOr0x19Loop data) {
      if (data == null) {
        return null;
      }
      final W3W3g.PlayerOr0x19Loop newData = new W3W3g.PlayerOr0x19Loop();
      newData.setDiscriminator(data.discriminator());
      newData.setPlayer(kaitaiToPlayerMapper.map(data.player()));
      newData.setNext(kaitaiToPlayerOr0x19LoopMapper.map(data.next()));
      newData.setPlayerMetaDataChunk(kaitaiToPlayerMetaDataChunkMapper.map(data.playerMetaDataChunk()));
      newData.setPreviousDiscriminator(data.previousDiscriminator());
      return newData;
    }
  }

  public static class kaitaiToPrivatePublicEnumMapper {
    public static W3W3g.PrivatePublicEnum map(
        w3.replay.w3g.impl.kaitai.W3W3g.PrivatePublicEnum data) {
      if (data == null) {
        return null;
      }
      return W3W3g.PrivatePublicEnum.valueOf(data.name());
    }
  }

  public static class kaitaiToActionAssignGroupHotkeyPayloadItemMapper {
    public static W3W3g.ActionAssignGroupHotkeyPayloadItem map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionAssignGroupHotkeyPayloadItem data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionAssignGroupHotkeyPayloadItem newData = new W3W3g.ActionAssignGroupHotkeyPayloadItem();
      newData.setObjectId1(data.objectId1());
      newData.setObjectId2(data.objectId2());
      return newData;
    }
  }

  public static class kaitaiToActionContinueGameAfterWinOrDefeat2PayloadMapper {
    public static W3W3g.ActionContinueGameAfterWinOrDefeat2Payload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionContinueGameAfterWinOrDefeat2Payload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionContinueGameAfterWinOrDefeat2Payload newData = new W3W3g.ActionContinueGameAfterWinOrDefeat2Payload();
      newData.seta(data.a());
      newData.setb(data.b());
      newData.setc(data.c());
      newData.setd(data.d());
      return newData;
    }
  }

  public static class kaitaiToActionScenarioTriggerPayloadMapper {
    public static W3W3g.ActionScenarioTriggerPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionScenarioTriggerPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionScenarioTriggerPayload newData = new W3W3g.ActionScenarioTriggerPayload();
      newData.setUnknownA(data.unknownA());
      newData.setUnknownB(data.unknownB());
      newData.setUnknownCounter(data.unknownCounter());
      return newData;
    }
  }

  public static class kaitaiToRecordsHeaderMapper {
    public static W3W3g.RecordsHeader map(w3.replay.w3g.impl.kaitai.W3W3g.RecordsHeader data) {
      if (data == null) {
        return null;
      }
      final W3W3g.RecordsHeader newData = new W3W3g.RecordsHeader();
      newData.setRecordSize(data.recordSize());
      return newData;
    }
  }

  public static class kaitaiToAbilityFlagsMapper {
    public static W3W3g.AbilityFlags map(w3.replay.w3g.impl.kaitai.W3W3g.AbilityFlags data) {
      if (data == null) {
        return null;
      }
      final W3W3g.AbilityFlags newData = new W3W3g.AbilityFlags();
      newData.setQueueCommand(data.queueCommand());
      newData.setApplyToAllUnitsInSubgroup(data.applyToAllUnitsInSubgroup());
      newData.setAreaEffect(data.areaEffect());
      newData.setApplyToAllUnitsInSelection(data.applyToAllUnitsInSelection());
      newData.setMoveGroupWithoutFormation(data.moveGroupWithoutFormation());
      newData.setUnknown(data.unknown());
      newData.setSubgroupCommand(data.subgroupCommand());
      newData.setUnknown2(data.unknown2());
      newData.setAutocast(data.autocast());
      return newData;
    }
  }

  public static class kaitaiToTimeSlotMapper {
    public static W3W3g.TimeSlot map(w3.replay.w3g.impl.kaitai.W3W3g.TimeSlot data) {
      if (data == null) {
        return null;
      }
      final W3W3g.TimeSlot newData = new W3W3g.TimeSlot();
      newData.setn(data.n());
      newData.setTimeIncrementMs(data.timeIncrementMs());
      newData.setCommandData(kaitaiToCommandDataMapper.map(data.commandData()));
      return newData;
    }
  }

  public static class kaitaiToActionCheatDayLightSavingsPayloadMapper {
    public static W3W3g.ActionCheatDayLightSavingsPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionCheatDayLightSavingsPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionCheatDayLightSavingsPayload newData = new W3W3g.ActionCheatDayLightSavingsPayload();
      newData.setTime(data.time());
      return newData;
    }
  }

  public static class kaitaiToOrderIdMapper {
    public static W3W3g.OrderId map(w3.replay.w3g.impl.kaitai.W3W3g.OrderId data) {
      if (data == null) {
        return null;
      }
      final W3W3g.OrderId newData = new W3W3g.OrderId();
      newData.setOrderId(data.orderId());
      newData.setAbilityId(data.abilityId());
      newData.setRawBytes(data.rawBytes());
      return newData;
    }
  }

  public static class kaitaiToActionCheatItVexesMePayloadMapper {
    public static W3W3g.ActionCheatItVexesMePayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionCheatItVexesMePayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionCheatItVexesMePayload newData = new W3W3g.ActionCheatItVexesMePayload();
      newData.setNothing(data.nothing());
      return newData;
    }
  }

  public static class kaitaiToActionCheatWhosYourDaddyPayloadMapper {
    public static W3W3g.ActionCheatWhosYourDaddyPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionCheatWhosYourDaddyPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionCheatWhosYourDaddyPayload newData = new W3W3g.ActionCheatWhosYourDaddyPayload();
      newData.setNothing(data.nothing());
      return newData;
    }
  }

  public static class kaitaiToActionSelectGroupHotkeyPayloadMapper {
    public static W3W3g.ActionSelectGroupHotkeyPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionSelectGroupHotkeyPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionSelectGroupHotkeyPayload newData = new W3W3g.ActionSelectGroupHotkeyPayload();
      newData.setGroupIndex(data.groupIndex());
      newData.setUnknown(data.unknown());
      return newData;
    }
  }

  public static class kaitaiToActionUnitBuildingAbilityWithTargetPositionMapper {
    public static W3W3g.ActionUnitBuildingAbilityWithTargetPosition map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionUnitBuildingAbilityWithTargetPosition data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionUnitBuildingAbilityWithTargetPosition newData = new W3W3g.ActionUnitBuildingAbilityWithTargetPosition();
      newData.setAbilityFlags(data.abilityFlags());
      newData.setOrderId(kaitaiToOrderIdMapper.map(data.orderId()));
      newData.setUnknownA(data.unknownA());
      newData.setUnknownB(data.unknownB());
      newData.setx(data.x());
      newData.sety(data.y());
      return newData;
    }
  }

  public static class kaitaiToActionUnknown0x75PayloadMapper {
    public static W3W3g.ActionUnknown0x75Payload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionUnknown0x75Payload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionUnknown0x75Payload newData = new W3W3g.ActionUnknown0x75Payload();
      newData.setUnknown(data.unknown());
      return newData;
    }
  }

  public static class kaitaiToBlockMapper {
    public static W3W3g.Block map(w3.replay.w3g.impl.kaitai.W3W3g.Block data) {
      if (data == null) {
        return null;
      }
      final W3W3g.Block newData = new W3W3g.Block();
      newData.setBlockId(data.blockId());
      newData.setLeaveGame(kaitaiToLeaveGameMapper.map(data.leaveGame()));
      newData.setFill(data.fill());
      newData.setTimeSlot(kaitaiToTimeSlotMapper.map(data.timeSlot()));
      newData.setChat(kaitaiToChatMapper.map(data.chat()));
      newData.setFill2(data.fill2());
      newData.setFill3(data.fill3());
      newData.setCountdown(kaitaiToCountdownMapper.map(data.countdown()));
      return newData;
    }
  }

  public static class kaitaiToReasonMapper {
    public static W3W3g.Reason map(w3.replay.w3g.impl.kaitai.W3W3g.Reason data) {
      if (data == null) {
        return null;
      }
      return W3W3g.Reason.valueOf(data.name());
    }
  }

  public static class kaitaiToActionEnterChooseBuildingSubmenuPayloadMapper {
    public static W3W3g.ActionEnterChooseBuildingSubmenuPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionEnterChooseBuildingSubmenuPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionEnterChooseBuildingSubmenuPayload newData = new W3W3g.ActionEnterChooseBuildingSubmenuPayload();
      newData.setNothing(data.nothing());
      return newData;
    }
  }

  public static class kaitaiToActionUnknown0x1bPayloadMapper {
    public static W3W3g.ActionUnknown0x1bPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionUnknown0x1bPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionUnknown0x1bPayload newData = new W3W3g.ActionUnknown0x1bPayload();
      newData.seta(data.a());
      newData.setb(data.b());
      newData.setc(data.c());
      return newData;
    }
  }

  public static class kaitaiToChatTargetMapper {
    public static W3W3g.ChatTarget map(w3.replay.w3g.impl.kaitai.W3W3g.ChatTarget data) {
      if (data == null) {
        return null;
      }
      return W3W3g.ChatTarget.valueOf(data.name());
    }
  }

  public static class kaitaiToActionNothingTakeRestMapper {
    public static W3W3g.ActionNothingTakeRest map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionNothingTakeRest data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionNothingTakeRest newData = new W3W3g.ActionNothingTakeRest();
      newData.setNothing(data.nothing());
      return newData;
    }
  }

  public static class kaitaiToActionCheatWhoIsJohnGaltPayloadMapper {
    public static W3W3g.ActionCheatWhoIsJohnGaltPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionCheatWhoIsJohnGaltPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionCheatWhoIsJohnGaltPayload newData = new W3W3g.ActionCheatWhoIsJohnGaltPayload();
      newData.setNothing(data.nothing());
      return newData;
    }
  }

  public static class kaitaiToCommandDataMapper {
    public static W3W3g.CommandData map(w3.replay.w3g.impl.kaitai.W3W3g.CommandData data) {
      if (data == null) {
        return null;
      }
      final W3W3g.CommandData newData = new W3W3g.CommandData();
      newData.setPlayerId(data.playerId());
      newData.setLenActionBlock(data.lenActionBlock());
      newData.setActionBlock(kaitaiToActionBlockMapper.map(data.actionBlock()));
      return newData;
    }
  }

  public static class kaitaiToLeaveGameMapper {
    public static W3W3g.LeaveGame map(w3.replay.w3g.impl.kaitai.W3W3g.LeaveGame data) {
      if (data == null) {
        return null;
      }
      final W3W3g.LeaveGame newData = new W3W3g.LeaveGame();
      newData.setPre(data.pre());
      newData.setReason(kaitaiToReasonMapper.map(data.reason()));
      newData.setPlayerId(data.playerId());
      newData.setRes(data.res());
      newData.setUnknownFlag(data.unknownFlag());
      return newData;
    }
  }

  public static class kaitaiToActionSaveGameFinishedPayloadMapper {
    public static W3W3g.ActionSaveGameFinishedPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionSaveGameFinishedPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionSaveGameFinishedPayload newData = new W3W3g.ActionSaveGameFinishedPayload();
      newData.setUnknown(data.unknown());
      return newData;
    }
  }

  public static class kaitaiToPlayerMapper {
    public static W3W3g.Player map(w3.replay.w3g.impl.kaitai.W3W3g.Player data) {
      if (data == null) {
        return null;
      }
      final W3W3g.Player newData = new W3W3g.Player();
      newData.setCustomOrLadderEnum(kaitaiToCustomOrLadderMapper.map(data.customOrLadderEnum()));
      newData.setNonHost(data.nonHost());
      newData.setPlayerId(data.playerId());
      newData.setName(data.name());
      newData.setCustomOrLadder(data.customOrLadder());
      newData.setFill(data.fill());
      newData.setRuntime(data.runtime());
      newData.setIdRaceFlag(data.idRaceFlag());
      return newData;
    }
  }

  public static class kaitaiToActionChangeSelectionPayloadMapper {
    public static W3W3g.ActionChangeSelectionPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionChangeSelectionPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionChangeSelectionPayload newData = new W3W3g.ActionChangeSelectionPayload();
      newData.setMode(kaitaiToChangeSelectionModeMapper.map(data.mode()));
      newData.setUnit(data.unit().stream().map(kaitaiToActionChangeSelectionPayloadUnitMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToActionCheatSomebodySetUpUsTheBombPayloadMapper {
    public static W3W3g.ActionCheatSomebodySetUpUsTheBombPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionCheatSomebodySetUpUsTheBombPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionCheatSomebodySetUpUsTheBombPayload newData = new W3W3g.ActionCheatSomebodySetUpUsTheBombPayload();
      newData.setNothing(data.nothing());
      return newData;
    }
  }

  public static class kaitaiToActionCancelHeroRevivalPayloadMapper {
    public static W3W3g.ActionCancelHeroRevivalPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionCancelHeroRevivalPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionCancelHeroRevivalPayload newData = new W3W3g.ActionCancelHeroRevivalPayload();
      newData.setUnitId1(data.unitId1());
      newData.setUnitId2(data.unitId2());
      return newData;
    }
  }

  public static class kaitaiToPlayerMetaDataChunkMapper {
    public static W3W3g.PlayerMetaDataChunk map(
        w3.replay.w3g.impl.kaitai.W3W3g.PlayerMetaDataChunk data) {
      if (data == null) {
        return null;
      }
      final W3W3g.PlayerMetaDataChunk newData = new W3W3g.PlayerMetaDataChunk();
      newData.setToMeta(data.toMeta());
      newData.setPlayerMetaDataLoop(kaitaiToPlayerMetaDataLoopMapper.map(data.playerMetaDataLoop()));
      return newData;
    }
  }

  public static class kaitaiToActionContinueGameAfterWinOrDefeatPayloadMapper {
    public static W3W3g.ActionContinueGameAfterWinOrDefeatPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionContinueGameAfterWinOrDefeatPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionContinueGameAfterWinOrDefeatPayload newData = new W3W3g.ActionContinueGameAfterWinOrDefeatPayload();
      newData.seta(data.a());
      newData.setb(data.b());
      newData.setc(data.c());
      newData.setd(data.d());
      return newData;
    }
  }

  public static class kaitaiToActionCheatSynergyPayloadMapper {
    public static W3W3g.ActionCheatSynergyPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionCheatSynergyPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionCheatSynergyPayload newData = new W3W3g.ActionCheatSynergyPayload();
      newData.setNothing(data.nothing());
      return newData;
    }
  }

  public static class kaitaiToActionCheatTheDudeAbidesPayloadMapper {
    public static W3W3g.ActionCheatTheDudeAbidesPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionCheatTheDudeAbidesPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionCheatTheDudeAbidesPayload newData = new W3W3g.ActionCheatTheDudeAbidesPayload();
      newData.setNothing(data.nothing());
      return newData;
    }
  }

  public static class kaitaiToActionDecreaseGameSpeedPayloadMapper {
    public static W3W3g.ActionDecreaseGameSpeedPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionDecreaseGameSpeedPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionDecreaseGameSpeedPayload newData = new W3W3g.ActionDecreaseGameSpeedPayload();
      newData.setNothing(data.nothing());
      return newData;
    }
  }

  public static class kaitaiToActionSetGameSpeedPayloadMapper {
    public static W3W3g.ActionSetGameSpeedPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionSetGameSpeedPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionSetGameSpeedPayload newData = new W3W3g.ActionSetGameSpeedPayload();
      newData.setSpeed(kaitaiToSetGameSpeedSpeedMapper.map(data.speed()));
      return newData;
    }
  }

  public static class kaitaiToActionUnitBuildingAbilityPayloadMapper {
    public static W3W3g.ActionUnitBuildingAbilityPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionUnitBuildingAbilityPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionUnitBuildingAbilityPayload newData = new W3W3g.ActionUnitBuildingAbilityPayload();
      newData.setAbilityFlags(data.abilityFlags());
      newData.setOrderId(kaitaiToOrderIdMapper.map(data.orderId()));
      newData.setUnknownA(data.unknownA());
      newData.setUnknownB(data.unknownB());
      return newData;
    }
  }

  public static class kaitaiToActionCheatLeafitToMePayloadMapper {
    public static W3W3g.ActionCheatLeafitToMePayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionCheatLeafitToMePayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionCheatLeafitToMePayload newData = new W3W3g.ActionCheatLeafitToMePayload();
      newData.setUnknown(data.unknown());
      newData.setAmount(data.amount());
      return newData;
    }
  }

  public static class kaitaiToActionChangeSelectionPayloadUnitMapper {
    public static W3W3g.ActionChangeSelectionPayloadUnit map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionChangeSelectionPayloadUnit data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionChangeSelectionPayloadUnit newData = new W3W3g.ActionChangeSelectionPayloadUnit();
      newData.setObjectId1(data.objectId1());
      newData.setObjectId2(data.objectId2());
      return newData;
    }
  }

  public static class kaitaiToActionCheatISeeDeadPeoplePayloadMapper {
    public static W3W3g.ActionCheatISeeDeadPeoplePayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionCheatISeeDeadPeoplePayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionCheatISeeDeadPeoplePayload newData = new W3W3g.ActionCheatISeeDeadPeoplePayload();
      newData.setNothing(data.nothing());
      return newData;
    }
  }

  public static class kaitaiToCustomOrLadderMapper {
    public static W3W3g.CustomOrLadder map(w3.replay.w3g.impl.kaitai.W3W3g.CustomOrLadder data) {
      if (data == null) {
        return null;
      }
      return W3W3g.CustomOrLadder.valueOf(data.name());
    }
  }

  public static class kaitaiToActionCheatPointBreakPayloadMapper {
    public static W3W3g.ActionCheatPointBreakPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionCheatPointBreakPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionCheatPointBreakPayload newData = new W3W3g.ActionCheatPointBreakPayload();
      newData.setNothing(data.nothing());
      return newData;
    }
  }

  public static class kaitaiToActionAssignGroupHotkeyPayloadMapper {
    public static W3W3g.ActionAssignGroupHotkeyPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionAssignGroupHotkeyPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionAssignGroupHotkeyPayload newData = new W3W3g.ActionAssignGroupHotkeyPayload();
      newData.setGroupIndex(data.groupIndex());
      newData.setItem(data.item().stream().map(kaitaiToActionAssignGroupHotkeyPayloadItemMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToActionUnitBuildingAbilityWithTwoTargetPositionsAndTwoItemIdsPayloadMapper {
    public static W3W3g.ActionUnitBuildingAbilityWithTwoTargetPositionsAndTwoItemIdsPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionUnitBuildingAbilityWithTwoTargetPositionsAndTwoItemIdsPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionUnitBuildingAbilityWithTwoTargetPositionsAndTwoItemIdsPayload newData = new W3W3g.ActionUnitBuildingAbilityWithTwoTargetPositionsAndTwoItemIdsPayload();
      newData.setAbilityFlags(data.abilityFlags());
      newData.setOrderIdA(kaitaiToOrderIdMapper.map(data.orderIdA()));
      newData.setUnknownA(data.unknownA());
      newData.setUnknownB(data.unknownB());
      newData.setXA(data.xA());
      newData.setYA(data.yA());
      newData.setOrderIdB(kaitaiToOrderIdMapper.map(data.orderIdB()));
      newData.setUnknown(data.unknown());
      newData.setXB(data.xB());
      newData.setYB(data.yB());
      return newData;
    }
  }

  public static class kaitaiToActionMapTriggerChatCommandPayloadMapper {
    public static W3W3g.ActionMapTriggerChatCommandPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionMapTriggerChatCommandPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionMapTriggerChatCommandPayload newData = new W3W3g.ActionMapTriggerChatCommandPayload();
      newData.setUnknownA(data.unknownA());
      newData.setUnknownB(data.unknownB());
      newData.setChatCommandOrTriggerName(data.chatCommandOrTriggerName());
      return newData;
    }
  }

  public static class kaitaiToActionCheatThereIsNoSpoonPayloadMapper {
    public static W3W3g.ActionCheatThereIsNoSpoonPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionCheatThereIsNoSpoonPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionCheatThereIsNoSpoonPayload newData = new W3W3g.ActionCheatThereIsNoSpoonPayload();
      newData.setNothing(data.nothing());
      return newData;
    }
  }

  public static class kaitaiToPlayerOr0x19Mapper {
    public static W3W3g.PlayerOr0x19 map(w3.replay.w3g.impl.kaitai.W3W3g.PlayerOr0x19 data) {
      if (data == null) {
        return null;
      }
      final W3W3g.PlayerOr0x19 newData = new W3W3g.PlayerOr0x19();
      newData.setPlayerOr0x19Loop(kaitaiToPlayerOr0x19LoopMapper.map(data.playerOr0x19Loop()));
      return newData;
    }
  }

  public static class kaitaiToChangeAllyOptionsFlagsMapper {
    public static W3W3g.ChangeAllyOptionsFlags map(
        w3.replay.w3g.impl.kaitai.W3W3g.ChangeAllyOptionsFlags data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ChangeAllyOptionsFlags newData = new W3W3g.ChangeAllyOptionsFlags();
      newData.setAlliedWithPlayer(data.alliedWithPlayer());
      newData.setVisionShared(data.visionShared());
      newData.setSharedControl(data.sharedControl());
      newData.setUnknown(data.unknown());
      newData.setAlliedVictory(data.alliedVictory());
      return newData;
    }
  }

  public static class kaitaiToActionCheatAllYourBaseAreBelongToUsPayloadMapper {
    public static W3W3g.ActionCheatAllYourBaseAreBelongToUsPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionCheatAllYourBaseAreBelongToUsPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionCheatAllYourBaseAreBelongToUsPayload newData = new W3W3g.ActionCheatAllYourBaseAreBelongToUsPayload();
      newData.setNothing(data.nothing());
      return newData;
    }
  }

  public static class kaitaiToActionCheatKeyserSozePayloadMapper {
    public static W3W3g.ActionCheatKeyserSozePayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionCheatKeyserSozePayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionCheatKeyserSozePayload newData = new W3W3g.ActionCheatKeyserSozePayload();
      newData.setUnknown(data.unknown());
      newData.setAmount(data.amount());
      return newData;
    }
  }

  public static class kaitaiToActionChangeAllyOptionsPayloadMapper {
    public static W3W3g.ActionChangeAllyOptionsPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionChangeAllyOptionsPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionChangeAllyOptionsPayload newData = new W3W3g.ActionChangeAllyOptionsPayload();
      newData.setPlayerSlotIndex(data.playerSlotIndex());
      newData.setFlags(kaitaiToChangeAllyOptionsFlagsMapper.map(data.flags()));
      return newData;
    }
  }

  public static class kaitaiToActionCheatSharpAndShinyPayloadMapper {
    public static W3W3g.ActionCheatSharpAndShinyPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionCheatSharpAndShinyPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionCheatSharpAndShinyPayload newData = new W3W3g.ActionCheatSharpAndShinyPayload();
      newData.setNothing(data.nothing());
      return newData;
    }
  }

  public static class kaitaiToChatMapper {
    public static W3W3g.Chat map(w3.replay.w3g.impl.kaitai.W3W3g.Chat data) {
      if (data == null) {
        return null;
      }
      final W3W3g.Chat newData = new W3W3g.Chat();
      newData.setPlayerSenderId(data.playerSenderId());
      newData.setSize(data.size());
      newData.setFlags(data.flags());
      newData.setChatRecipientIndex(data.chatRecipientIndex());
      newData.setMessage(data.message());
      return newData;
    }
  }

  public static class kaitaiToActionSaveGamePayloadMapper {
    public static W3W3g.ActionSaveGamePayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionSaveGamePayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionSaveGamePayload newData = new W3W3g.ActionSaveGamePayload();
      newData.setName(data.name());
      return newData;
    }
  }

  public static class kaitaiToActionIdMapper {
    public static W3W3g.ActionId map(w3.replay.w3g.impl.kaitai.W3W3g.ActionId data) {
      if (data == null) {
        return null;
      }
      return W3W3g.ActionId.valueOf(data.name());
    }
  }

  public static class kaitaiToSetGameSpeedSpeedMapper {
    public static W3W3g.SetGameSpeedSpeed map(
        w3.replay.w3g.impl.kaitai.W3W3g.SetGameSpeedSpeed data) {
      if (data == null) {
        return null;
      }
      return W3W3g.SetGameSpeedSpeed.valueOf(data.name());
    }
  }

  public static class kaitaiToCountdownMapper {
    public static W3W3g.Countdown map(w3.replay.w3g.impl.kaitai.W3W3g.Countdown data) {
      if (data == null) {
        return null;
      }
      final W3W3g.Countdown newData = new W3W3g.Countdown();
      newData.setPre(data.pre());
      newData.setMode(data.mode());
      newData.setSecs(data.secs());
      return newData;
    }
  }

  public static class kaitaiToRecordMapper {
    public static W3W3g.Record map(w3.replay.w3g.impl.kaitai.W3W3g.Record data) {
      if (data == null) {
        return null;
      }
      final W3W3g.Record newData = new W3W3g.Record();
      newData.setPlayerId(data.playerId());
      newData.setPlayerIdFill(data.playerIdFill());
      newData.setStatus(data.status());
      newData.setController(data.controller());
      newData.setTeam(data.team());
      newData.setColor(data.color());
      newData.setRace(data.race());
      newData.setAiStrength(data.aiStrength());
      newData.setHandicap(data.handicap());
      newData.setRecSize(data.recSize());
      return newData;
    }
  }

  public static class kaitaiToCompressedAreaMapper {
    public static W3W3g.CompressedArea map(w3.replay.w3g.impl.kaitai.W3W3g.CompressedArea data) {
      if (data == null) {
        return null;
      }
      final W3W3g.CompressedArea newData = new W3W3g.CompressedArea();
      newData.setContent(data.content());
      return newData;
    }
  }

  public static class kaitaiToActionRemoveUnitFromBuildingQueuePayloadMapper {
    public static W3W3g.ActionRemoveUnitFromBuildingQueuePayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionRemoveUnitFromBuildingQueuePayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionRemoveUnitFromBuildingQueuePayload newData = new W3W3g.ActionRemoveUnitFromBuildingQueuePayload();
      newData.setSlotIndex(data.slotIndex());
      newData.setItemId(data.itemId());
      return newData;
    }
  }

  public static class kaitaiToPlayerListPlayerMapper {
    public static W3W3g.PlayerListPlayer map(
        w3.replay.w3g.impl.kaitai.W3W3g.PlayerListPlayer data) {
      if (data == null) {
        return null;
      }
      final W3W3g.PlayerListPlayer newData = new W3W3g.PlayerListPlayer();
      newData.setCustomOrLadderEnum(kaitaiToCustomOrLadderMapper.map(data.customOrLadderEnum()));
      newData.setNonHost(data.nonHost());
      newData.setPlayerId(data.playerId());
      newData.setName(data.name());
      newData.setCustomOrLadder(data.customOrLadder());
      newData.setRuntime(data.runtime());
      newData.setIdRaceFlag(data.idRaceFlag());
      return newData;
    }
  }

  public static class kaitaiToActionCheatWarpTenPayloadMapper {
    public static W3W3g.ActionCheatWarpTenPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionCheatWarpTenPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionCheatWarpTenPayload newData = new W3W3g.ActionCheatWarpTenPayload();
      newData.setNothing(data.nothing());
      return newData;
    }
  }

  public static class kaitaiToActionSelectSubgroupPayloadMapper {
    public static W3W3g.ActionSelectSubgroupPayload map(
        w3.replay.w3g.impl.kaitai.W3W3g.ActionSelectSubgroupPayload data) {
      if (data == null) {
        return null;
      }
      final W3W3g.ActionSelectSubgroupPayload newData = new W3W3g.ActionSelectSubgroupPayload();
      newData.setItemId(data.itemId());
      newData.setObjectId1(data.objectId1());
      newData.setObjectId2(data.objectId2());
      return newData;
    }
  }
}
