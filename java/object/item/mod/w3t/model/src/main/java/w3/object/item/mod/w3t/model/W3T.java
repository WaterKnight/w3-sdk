package w3.object.item.mod.w3t.model;

import w3.object.common.impl.model.W3ObjModFile;

import java.io.File;

/**
 * item modifications file for wrapping war3map.w3t
 */
public class W3T extends W3ObjModFile<ItemObj, ItemMod> {
    public final static File GAME_PATH = new File("war3map.w3t");
    public final static File CAMPAIGN_PATH = new File("war3campaign.w3t");
}
