package w3.ai.wai.model;

import java.util.stream.Collectors;

public class kaitaiToW3WaiMapper {
  public static W3Wai map(w3.ai.wai.model.kaitai.W3Wai data) {
    final W3Wai newData = new W3Wai();
    newData.setVersion(data.version());
    newData.setName(kaitaiToW3strMapper.map(data.name()));
    newData.setRace(kaitaiToAiRaceMapper.map(data.race()));
    newData.setFlags(kaitaiToFlagsMapper.map(data.flags()));
    newData.setGoldWorker(kaitaiToW3idMapper.map(data.goldWorker()));
    newData.setLumberWorker(kaitaiToW3idMapper.map(data.lumberWorker()));
    newData.setBaseBuilding(kaitaiToW3idMapper.map(data.baseBuilding()));
    newData.setMineBuilding(kaitaiToW3idMapper.map(data.mineBuilding()));
    newData.setUnknown(data.unknown());
    newData.setCondition(data.condition().stream().map(kaitaiToConditionMapper::map).collect(Collectors.toList()));
    newData.setFirstHero(kaitaiToW3idMapper.map(data.firstHero()));
    newData.setSecondHero(kaitaiToW3idMapper.map(data.secondHero()));
    newData.setThirdHero(kaitaiToW3idMapper.map(data.thirdHero()));
    newData.setTrainingChanceFirstSecondThird(data.trainingChanceFirstSecondThird());
    newData.setTrainingChanceFirstThirdSecond(data.trainingChanceFirstThirdSecond());
    newData.setTrainingChanceSecondFirstThird(data.trainingChanceSecondFirstThird());
    newData.setTrainingChanceSecondThirdFirst(data.trainingChanceSecondThirdFirst());
    newData.setTrainingChanceThirdFirstSecond(data.trainingChanceThirdFirstSecond());
    newData.setTrainingChanceThirdSecondFirst(data.trainingChanceThirdSecondFirst());
    newData.setSkillChunk(kaitaiToSkillChunkMapper.map(data.skillChunk()));
    newData.setBuildPriority(data.buildPriority().stream().map(kaitaiToBuildPriorityMapper::map).collect(Collectors.toList()));
    newData.setHarvestPriority(data.harvestPriority().stream().map(kaitaiToHarvestPriorityMapper::map).collect(Collectors.toList()));
    newData.setTargetPriority(data.targetPriority().stream().map(kaitaiToTargetPriorityMapper::map).collect(Collectors.toList()));
    newData.setRepeatWaves(data.repeatWaves());
    newData.setMinimumForcesAttackGroupIndex(data.minimumForcesAttackGroupIndex());
    newData.setInitialDelay(data.initialDelay());
    newData.setAttackGroup(data.attackGroup().stream().map(kaitaiToAttackGroupMapper::map).collect(Collectors.toList()));
    newData.setAttackWave(data.attackWave().stream().map(kaitaiToAttackWaveMapper::map).collect(Collectors.toList()));
    newData.setUnknown2(data.unknown2());
    newData.setGameOptions(kaitaiToGameOptionsMapper.map(data.gameOptions()));
    newData.setRegularGameSpeed(data.regularGameSpeed());
    newData.setMapPath(kaitaiToW3strMapper.map(data.mapPath()));
    newData.setPlayer(data.player().stream().map(kaitaiToPlayerMapper::map).collect(Collectors.toList()));
    newData.setUseImportObj(data.useImportObj());
    newData.setImportObj(kaitaiToImportObjMapper.map(data.importObj()));
    newData.setW3o(kaitaiToW3W3oMapper.map(data.w3o()));
    return newData;
  }

  public static class kaitaiToParameterTypeMapper {
    public static W3Wai.ParameterType map(w3.ai.wai.model.kaitai.W3Wai.ParameterType data) {
      return W3Wai.ParameterType.valueOf(data.name());
    }
  }

  public static class kaitaiToFunctionParameterExtMapper {
    public static W3Wai.FunctionParameterExt map(
        w3.ai.wai.model.kaitai.W3Wai.FunctionParameterExt data) {
      final W3Wai.FunctionParameterExt newData = new W3Wai.FunctionParameterExt();
      newData.setType(data.type());
      newData.setValue(kaitaiToW3strMapper.map(data.value()));
      newData.setBeginFunction(data.beginFunction());
      newData.setParameterList(kaitaiToParameterListMapper.map(data.parameterList()));
      newData.setEndFunction(data.endFunction());
      return newData;
    }
  }

  public static class kaitaiToAiMapper {
    public static W3Wai.Ai map(w3.ai.wai.model.kaitai.W3Wai.Ai data) {
      return W3Wai.Ai.valueOf(data.name());
    }
  }

  public static class kaitaiToConditionTypeMapper {
    public static W3Wai.ConditionType map(w3.ai.wai.model.kaitai.W3Wai.ConditionType data) {
      return W3Wai.ConditionType.valueOf(data.name());
    }
  }

  public static class kaitaiToAiDifficultyMapper {
    public static W3Wai.AiDifficulty map(w3.ai.wai.model.kaitai.W3Wai.AiDifficulty data) {
      return W3Wai.AiDifficulty.valueOf(data.name());
    }
  }

  public static class kaitaiToTargetPriorityMapper {
    public static W3Wai.TargetPriority map(w3.ai.wai.model.kaitai.W3Wai.TargetPriority data) {
      final W3Wai.TargetPriority newData = new W3Wai.TargetPriority();
      newData.setPriorityType(data.priorityType());
      newData.setTarget(kaitaiToTargetMapper.map(data.target()));
      newData.setCreepMinStrength(data.creepMinStrength());
      newData.setCreepMaxStrength(data.creepMaxStrength());
      newData.setAllowFlyers(kaitaiToAllowFlyersMapper.map(data.allowFlyers()));
      newData.setConditionIndex(kaitaiToBuildPriorityConditionIndexMapper.map(data.conditionIndex()));
      newData.setFill2(data.fill2());
      newData.setFill(data.fill());
      return newData;
    }
  }

  public static class kaitaiToTargetMapper {
    public static W3Wai.Target map(w3.ai.wai.model.kaitai.W3Wai.Target data) {
      return W3Wai.Target.valueOf(data.name());
    }
  }

  public static class kaitaiToImportObjMapper {
    public static W3Wai.ImportObj map(w3.ai.wai.model.kaitai.W3Wai.ImportObj data) {
      final W3Wai.ImportObj newData = new W3Wai.ImportObj();
      newData.setPath(kaitaiToW3strMapper.map(data.path()));
      newData.setImportTime(kaitaiToW3strMapper.map(data.importTime()));
      return newData;
    }
  }

  public static class kaitaiToHarvestTypeMapper {
    public static W3Wai.HarvestType map(w3.ai.wai.model.kaitai.W3Wai.HarvestType data) {
      return W3Wai.HarvestType.valueOf(data.name());
    }
  }

  public static class kaitaiToPlayerRaceMapper {
    public static W3Wai.PlayerRace map(w3.ai.wai.model.kaitai.W3Wai.PlayerRace data) {
      return W3Wai.PlayerRace.valueOf(data.name());
    }
  }

  public static class kaitaiToBuildPriorityTargetMapper {
    public static W3Wai.BuildPriorityTarget map(
        w3.ai.wai.model.kaitai.W3Wai.BuildPriorityTarget data) {
      return W3Wai.BuildPriorityTarget.valueOf(data.name());
    }
  }

  public static class kaitaiToAiRaceMapper {
    public static W3Wai.AiRace map(w3.ai.wai.model.kaitai.W3Wai.AiRace data) {
      return W3Wai.AiRace.valueOf(data.name());
    }
  }

  public static class kaitaiToParameterListMapper {
    public static W3Wai.ParameterList map(w3.ai.wai.model.kaitai.W3Wai.ParameterList data) {
      final W3Wai.ParameterList newData = new W3Wai.ParameterList();
      newData.setParameter(data.parameter().stream().map(kaitaiToParameterMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToBuildPriorityConditionIndexMapper {
    public static W3Wai.BuildPriorityConditionIndex map(
        w3.ai.wai.model.kaitai.W3Wai.BuildPriorityConditionIndex data) {
      return W3Wai.BuildPriorityConditionIndex.valueOf(data.name());
    }
  }

  public static class kaitaiToSkillChunkMapper {
    public static W3Wai.SkillChunk map(w3.ai.wai.model.kaitai.W3Wai.SkillChunk data) {
      final W3Wai.SkillChunk newData = new W3Wai.SkillChunk();
      newData.setFirstAsFirst(data.firstAsFirst().stream().map(kaitaiToW3idMapper::map).collect(Collectors.toList()));
      newData.setFirstAsSecond(data.firstAsSecond().stream().map(kaitaiToW3idMapper::map).collect(Collectors.toList()));
      newData.setFirstAsThird(data.firstAsThird().stream().map(kaitaiToW3idMapper::map).collect(Collectors.toList()));
      newData.setSecondAsFirst(data.secondAsFirst().stream().map(kaitaiToW3idMapper::map).collect(Collectors.toList()));
      newData.setSecondAsSecond(data.secondAsSecond().stream().map(kaitaiToW3idMapper::map).collect(Collectors.toList()));
      newData.setSecondAsThird(data.secondAsThird().stream().map(kaitaiToW3idMapper::map).collect(Collectors.toList()));
      newData.setThirdAsFirst(data.thirdAsFirst().stream().map(kaitaiToW3idMapper::map).collect(Collectors.toList()));
      newData.setThirdAsSecond(data.thirdAsSecond().stream().map(kaitaiToW3idMapper::map).collect(Collectors.toList()));
      newData.setThirdAsThird(data.thirdAsThird().stream().map(kaitaiToW3idMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToAttackWaveMapper {
    public static W3Wai.AttackWave map(w3.ai.wai.model.kaitai.W3Wai.AttackWave data) {
      final W3Wai.AttackWave newData = new W3Wai.AttackWave();
      newData.setAttackGroupIndex(data.attackGroupIndex());
      newData.setDelay(data.delay());
      return newData;
    }
  }

  public static class kaitaiToCurrentGroupMapper {
    public static W3Wai.CurrentGroup map(w3.ai.wai.model.kaitai.W3Wai.CurrentGroup data) {
      final W3Wai.CurrentGroup newData = new W3Wai.CurrentGroup();
      newData.setUnit(kaitaiToW3idMapper.map(data.unit()));
      newData.setQuantity(data.quantity());
      newData.setMaxQuantity(data.maxQuantity());
      newData.setConditionIndex(kaitaiToBuildPriorityConditionIndexMapper.map(data.conditionIndex()));
      newData.setFill(data.fill());
      return newData;
    }
  }

  public static class kaitaiToPlayerMapper {
    public static W3Wai.Player map(w3.ai.wai.model.kaitai.W3Wai.Player data) {
      final W3Wai.Player newData = new W3Wai.Player();
      newData.setIndex(data.index());
      newData.setTeamNumber(data.teamNumber());
      newData.setRace(kaitaiToPlayerRaceMapper.map(data.race()));
      newData.setColor(data.color());
      newData.setHandicap(data.handicap());
      newData.setAi(kaitaiToAiMapper.map(data.ai()));
      newData.setAiDifficulty(kaitaiToAiDifficultyMapper.map(data.aiDifficulty()));
      newData.setAiScriptPath(kaitaiToW3strMapper.map(data.aiScriptPath()));
      return newData;
    }
  }

  public static class kaitaiToOperatorFunctionParameterExtMapper {
    public static W3Wai.OperatorFunctionParameterExt map(
        w3.ai.wai.model.kaitai.W3Wai.OperatorFunctionParameterExt data) {
      final W3Wai.OperatorFunctionParameterExt newData = new W3Wai.OperatorFunctionParameterExt();
      newData.setBeginFunction(data.beginFunction());
      newData.setParameterList(kaitaiToParameterListMapper.map(data.parameterList()));
      newData.setEndFunction(data.endFunction());
      return newData;
    }
  }

  public static class kaitaiToAllowFlyersMapper {
    public static W3Wai.AllowFlyers map(w3.ai.wai.model.kaitai.W3Wai.AllowFlyers data) {
      return W3Wai.AllowFlyers.valueOf(data.name());
    }
  }

  public static class kaitaiToAttackGroupMapper {
    public static W3Wai.AttackGroup map(w3.ai.wai.model.kaitai.W3Wai.AttackGroup data) {
      final W3Wai.AttackGroup newData = new W3Wai.AttackGroup();
      newData.setIndex(data.index());
      newData.setName(kaitaiToW3strMapper.map(data.name()));
      newData.setCurrentGroup(data.currentGroup().stream().map(kaitaiToCurrentGroupMapper::map).collect(Collectors.toList()));
      return newData;
    }
  }

  public static class kaitaiToFlagsMapper {
    public static W3Wai.Flags map(w3.ai.wai.model.kaitai.W3Wai.Flags data) {
      final W3Wai.Flags newData = new W3Wai.Flags();
      newData.setDefendUsers(data.defendUsers());
      newData.setRandomPaths(data.randomPaths());
      newData.setSetPlayerName(data.setPlayerName());
      newData.setRemoveInjuries(data.removeInjuries());
      newData.setSmartArtillery(data.smartArtillery());
      newData.setAllowHomeChanges(data.allowHomeChanges());
      newData.setSlowHarvesting(data.slowHarvesting());
      newData.setTakeItems(data.takeItems());
      newData.setIgnoreInjuries(data.ignoreInjuries());
      newData.setHaveNoMercy(data.haveNoMercy());
      newData.setGroupsFlee(data.groupsFlee());
      newData.setUnitsFlee(data.unitsFlee());
      newData.setHeroesFlee(data.heroesFlee());
      newData.setRepairStructures(data.repairStructures());
      newData.setTargetHeroes(data.targetHeroes());
      newData.setMelee(data.melee());
      newData.setRest(data.rest());
      newData.setBuyItems(data.buyItems());
      return newData;
    }
  }

  public static class kaitaiToParameterMapper {
    public static W3Wai.Parameter map(w3.ai.wai.model.kaitai.W3Wai.Parameter data) {
      final W3Wai.Parameter newData = new W3Wai.Parameter();
      newData.setType(kaitaiToParameterTypeMapper.map(data.type()));
      newData.setValue(kaitaiToW3strMapper.map(data.value()));
      newData.setBeginFunction(data.beginFunction());
      newData.setParameterList(kaitaiToParameterListMapper.map(data.parameterList()));
      newData.setFunctionParameterExt(kaitaiToFunctionParameterExtMapper.map(data.functionParameterExt()));
      newData.setParameterListOp(kaitaiToParameterListMapper.map(data.parameterListOp()));
      newData.setEndFunction(data.endFunction());
      return newData;
    }
  }

  public static class kaitaiToBuildPriorityTechTypeMapper {
    public static W3Wai.BuildPriorityTechType map(
        w3.ai.wai.model.kaitai.W3Wai.BuildPriorityTechType data) {
      return W3Wai.BuildPriorityTechType.valueOf(data.name());
    }
  }

  public static class kaitaiToConditionMapper {
    public static W3Wai.Condition map(w3.ai.wai.model.kaitai.W3Wai.Condition data) {
      final W3Wai.Condition newData = new W3Wai.Condition();
      newData.setIndex(data.index());
      newData.setRest(kaitaiToConditionWithoutIndexMapper.map(data.rest()));
      return newData;
    }
  }

  public static class kaitaiToBuildPriorityMapper {
    public static W3Wai.BuildPriority map(w3.ai.wai.model.kaitai.W3Wai.BuildPriority data) {
      final W3Wai.BuildPriority newData = new W3Wai.BuildPriority();
      newData.setPriorityType(data.priorityType());
      newData.setTechType(kaitaiToBuildPriorityTechTypeMapper.map(data.techType()));
      newData.setTech(kaitaiToW3idMapper.map(data.tech()));
      newData.setTarget(kaitaiToBuildPriorityTargetMapper.map(data.target()));
      newData.setConditionIndex(kaitaiToBuildPriorityConditionIndexMapper.map(data.conditionIndex()));
      newData.setFill(data.fill());
      return newData;
    }
  }

  public static class kaitaiToConditionWithoutIndexMapper {
    public static W3Wai.ConditionWithoutIndex map(
        w3.ai.wai.model.kaitai.W3Wai.ConditionWithoutIndex data) {
      final W3Wai.ConditionWithoutIndex newData = new W3Wai.ConditionWithoutIndex();
      newData.setName(data.name());
      newData.setType(kaitaiToConditionTypeMapper.map(data.type()));
      newData.setOperatorFunctionName(kaitaiToW3strMapper.map(data.operatorFunctionName()));
      newData.setBeginFunction(data.beginFunction());
      newData.setParameterList(kaitaiToParameterListMapper.map(data.parameterList()));
      newData.setEndFunction(data.endFunction());
      return newData;
    }
  }

  public static class kaitaiToGameOptionsMapper {
    public static W3Wai.GameOptions map(w3.ai.wai.model.kaitai.W3Wai.GameOptions data) {
      final W3Wai.GameOptions newData = new W3Wai.GameOptions();
      newData.setRest(data.rest());
      newData.setDisableVictoryDefeatConditions(data.disableVictoryDefeatConditions());
      newData.setDisableFogOfWar(data.disableFogOfWar());
      newData.setRest2(data.rest2());
      return newData;
    }
  }

  public static class kaitaiToHarvestPriorityMapper {
    public static W3Wai.HarvestPriority map(w3.ai.wai.model.kaitai.W3Wai.HarvestPriority data) {
      final W3Wai.HarvestPriority newData = new W3Wai.HarvestPriority();
      newData.setHarvestPriorityType(data.harvestPriorityType());
      newData.setHarvestType(kaitaiToHarvestTypeMapper.map(data.harvestType()));
      newData.setTarget(kaitaiToBuildPriorityTargetMapper.map(data.target()));
      newData.setWorkers(data.workers());
      newData.setConditionIndex(kaitaiToBuildPriorityConditionIndexMapper.map(data.conditionIndex()));
      newData.setFill(data.fill());
      return newData;
    }
  }
}
