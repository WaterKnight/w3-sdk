package w3.object.unit.mod.w3u.model;

import w3.object.common.impl.model.W3ObjModFile;

import java.io.File;

/**
 * unit modifications file for wrapping war3map.w3u
 */
public class W3U extends W3ObjModFile<UnitObj, UnitMod> {
    public final static File GAME_PATH = new File("war3map.w3u");
    public final static File CAMPAIGN_PATH = new File("war3campaign.w3u");
}
