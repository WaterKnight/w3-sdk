package w3.object.buff.mod.w3h.model;

import w3.object.common.impl.model.W3ObjModFile;

import java.io.File;

/**
 * buff modifications file for wrapping war3map.w3h
 */
public class W3H extends W3ObjModFile<BuffObj, BuffMod> {
    public final static File GAME_PATH = new File("war3map.w3h");
    public final static File CAMPAIGN_PATH = new File("war3campaign.w3h");
}
