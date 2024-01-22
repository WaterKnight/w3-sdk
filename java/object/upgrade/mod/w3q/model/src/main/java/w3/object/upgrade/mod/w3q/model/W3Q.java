package w3.object.upgrade.mod.w3q.model;

import w3.object.common.impl.model.W3ObjModFile;

import java.io.File;

/**
 * upgrade modifications file for wrapping war3map.w3q
 */
public class W3Q extends W3ObjModFile<UpgradeObj, UpgradeMod> {
    public final static File GAME_PATH = new File("war3map.w3q");
    public final static File CAMPAIGN_PATH = new File("war3campaign.w3q");

}
