package w3.object.collection.mod.w3o.model;

public class kaitaiToW3W3oMapper {
  public static W3W3o map(w3.object.collection.mod.w3o.model.kaitai.W3W3o data) {
    if (data == null) {
      return null;
    }
    final W3W3o newData = new W3W3o();
    newData.setVersion(data.version());
    newData.setUseUnit(data.useUnit());
    newData.setUnit(kaitaiToW3W3uMapper.map(data.unit()));
    newData.setUseItem(data.useItem());
    newData.setItem(kaitaiToW3W3tMapper.map(data.item()));
    newData.setUseDestructable(data.useDestructable());
    newData.setDestructable(kaitaiToW3W3bMapper.map(data.destructable()));
    newData.setUseDoodad(data.useDoodad());
    newData.setDoodad(kaitaiToW3W3dMapper.map(data.doodad()));
    newData.setUseAbility(data.useAbility());
    newData.setAbility(kaitaiToW3W3aMapper.map(data.ability()));
    newData.setUseBuff(data.useBuff());
    newData.setBuff(kaitaiToW3W3hMapper.map(data.buff()));
    newData.setUseUpgrade(data.useUpgrade());
    newData.setUpgrade(kaitaiToW3W3qMapper.map(data.upgrade()));
    return newData;
  }
}
