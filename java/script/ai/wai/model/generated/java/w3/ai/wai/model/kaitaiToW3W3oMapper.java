package w3.ai.wai.model;

public class kaitaiToW3W3oMapper {
  public static W3W3o map(w3.ai.wai.model.kaitai.W3W3o data) {
    final W3W3o newData = new W3W3o();
    newData.setVersion(data.version());
    newData.setUseUnit(data.useUnit());
    newData.setUnit(kaitaiToW3W3uMapper.map(data.unit()));
    newData.setUseItem(data.useItem());
    newData.setItem(kaitaiToW3W3uMapper.map(data.item()));
    newData.setUseDestructable(data.useDestructable());
    newData.setDestructable(kaitaiToW3W3uMapper.map(data.destructable()));
    newData.setUseDoodad(data.useDoodad());
    newData.setDoodad(kaitaiToW3W3aMapper.map(data.doodad()));
    newData.setUseAbility(data.useAbility());
    newData.setAbility(kaitaiToW3W3aMapper.map(data.ability()));
    newData.setUseBuff(data.useBuff());
    newData.setBuff(kaitaiToW3W3uMapper.map(data.buff()));
    newData.setUseUpgrade(data.useUpgrade());
    newData.setUpgrade(kaitaiToW3W3aMapper.map(data.upgrade()));
    return newData;
  }
}
