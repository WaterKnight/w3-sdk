package w3.object.destructable.mod.w3b.model;

import w3.object.common.impl.model.W3ObjModFile;

import java.io.File;

/**
 * destructable modifications file for wrapping war3map.w3b
 */
public class W3B extends W3ObjModFile<DestructableObj, DestructableMod> {
    public final static File GAME_PATH = new File("war3map.w3b");
    public final static File CAMPAIGN_PATH = new File("war3campaign.w3b");
}
