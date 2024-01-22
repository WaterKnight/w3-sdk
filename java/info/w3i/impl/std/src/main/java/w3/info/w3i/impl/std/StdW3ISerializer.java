package w3.info.w3i.impl.std;

import w3.common.core.Wc3BinOutputStream;
import w3.info.w3i.api.W3IItemTableSerializer;
import w3.info.w3i.api.W3ISerializer;
import w3.info.w3i.api.W3IUnitTableSerializer;
import w3.info.w3i.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StdW3ISerializer implements W3ISerializer {
    private final Wc3BinOutputStream outputStream;
    private final EncodingFormat format;
    private final W3IUnitTableSerializer unitTableSerializer;
    private final W3IItemTableSerializer itemTableSerializer;

    public StdW3ISerializer(Wc3BinOutputStream outputStream, EncodingFormat format) {
        this.outputStream = outputStream;
        this.format = format;
        this.unitTableSerializer = new StdW3IUnitTableSerializer(outputStream, format);
        this.itemTableSerializer = new StdW3IItemTableSerializer(outputStream, format);
    }

    @Override
    public void serialize(W3I w3i) {
        write(w3i, format);
    }

    private void write(W3I w3i, EncodingFormat format) {
        switch (format.toEnum()) {
            case AUTO:
                format = EncodingFormat.valueOf((int) w3i.getVersion());

                if (format == null) {
                    throw new IllegalArgumentException("no writer for " + w3i.getVersion());
                }

                write(w3i, format);

                break;
            case W3I_0x1F: {
                write_0x1F(w3i);

                break;
            }
            case W3I_0x1C: {
                write_0x1C(w3i);

                break;
            }
            case W3I_0x19: {
                write_0x19(w3i);

                break;
            }
            case W3I_0x12: {
                write_0x12(w3i);

                break;
            }
        }
    }

    private void write_0x12(W3I w3i) {
        outputStream.writeInt32(EncodingFormat.W3I_0x12.getVersion());

        writeSaves(w3i);
        writeEditorVersion(w3i);

        writeMapName(w3i);
        writeAuthor(w3i);
        writeDescription(w3i);
        writeRecommendedPlayers(w3i);

        writeCameraBounds(w3i);
        writeMargins(w3i);

        writeDimensions(w3i);

        writeFlags(w3i);

        writeTileset(w3i);

        writeLoadingScreen(w3i);

        writePrologueScreen(w3i);

        writePlayers(w3i);
        writeForces(w3i);
        writeUpgradeMods(w3i);
        writeTechMods(w3i);
        writeUnitTables(w3i);
    }

    private void write_0x19(W3I w3i) {
        outputStream.writeInt32(EncodingFormat.W3I_0x19.getVersion());

        writeSaves(w3i);
        writeEditorVersion(w3i);

        writeMapName(w3i);
        writeAuthor(w3i);
        writeDescription(w3i);
        writeRecommendedPlayers(w3i);

        writeCameraBounds(w3i);
        writeMargins(w3i);

        writeDimensions(w3i);

        writeFlags(w3i);

        writeTileset(w3i);

        writeLoadingScreen(w3i);

        writeGameDataSet(w3i);

        writePrologueScreen(w3i);

        writeFog(w3i);

        writeGlobalWeather(w3i);
        writeSoundEnvironment(w3i);
        writeLightEnvironment(w3i);

        writeWaterColor(w3i);

        writePlayers(w3i);
        writeForces(w3i);
        writeUpgradeMods(w3i);
        writeTechMods(w3i);
        writeUnitTables(w3i);
        writeItemTables(w3i);
    }


    private void write_0x1C(W3I w3i) {
        outputStream.writeInt32(EncodingFormat.W3I_0x1C.getVersion());

        writeSaves(w3i);
        writeEditorVersion(w3i);

        writeGameVersion(w3i);

        writeMapName(w3i);
        writeAuthor(w3i);
        writeDescription(w3i);
        writeRecommendedPlayers(w3i);

        writeCameraBounds(w3i);
        writeMargins(w3i);

        writeDimensions(w3i);

        writeFlags(w3i);

        writeTileset(w3i);

        writeLoadingScreen(w3i);

        writeGameDataSet(w3i);

        writePrologueScreen(w3i);

        writeFog(w3i);

        writeGlobalWeather(w3i);
        writeSoundEnvironment(w3i);
        writeLightEnvironment(w3i);

        writeWaterColor(w3i);

        writeScriptLang(w3i);

        writePlayers(w3i);
        writeForces(w3i);
        writeUpgradeMods(w3i);
        writeTechMods(w3i);
        writeUnitTables(w3i);
        writeItemTables(w3i);
    }

    private void write_0x1F(W3I w3i) {
        outputStream.writeInt32(EncodingFormat.W3I_0x1F.getVersion());

        writeSaves(w3i);
        writeEditorVersion(w3i);

        writeGameVersion(w3i);

        writeMapName(w3i);
        writeAuthor(w3i);
        writeDescription(w3i);
        writeRecommendedPlayers(w3i);

        writeCameraBounds(w3i);
        writeMargins(w3i);

        writeDimensions(w3i);

        writeFog(w3i);

        writeTileset(w3i);

        writeLoadingScreen(w3i);

        writeGameDataSet(w3i);

        writePrologueScreen(w3i);

        writeFog(w3i);

        writeGlobalWeather(w3i);
        writeSoundEnvironment(w3i);
        writeLightEnvironment(w3i);

        writeWaterColor(w3i);

        writeScriptLang(w3i);
        writeSupportedGraphicsModes(w3i);
        writeGameDataVersion(w3i);

        writePlayers(w3i);
        writeForces(w3i);
        writeUnitTables(w3i);
        writeTechMods(w3i);
        writeUnitTables(w3i);
        writeItemTables(w3i);
    }

    private void writeSaves(W3I w3i) {
        outputStream.writeInt32(w3i.getSaves().intValue());
    }

    private void writeEditorVersion(W3I w3i) {
        outputStream.writeInt32(w3i.getEditorVersion().intValue());
    }

    private void writeGameVersion(W3I w3i) {
        outputStream.writeUInt32(w3i.getGameVersion().getMajor());
        outputStream.writeUInt32(w3i.getGameVersion().getMinor());
        outputStream.writeUInt32(w3i.getGameVersion().getRevision());
        outputStream.writeUInt32(w3i.getGameVersion().getBuild());
    }

    private void writeMapName(W3I w3i) {
        outputStream.writeString(w3i.getMapName());
    }

    private void writeAuthor(W3I w3i) {
        outputStream.writeString(w3i.getAuthor().getValue());
    }

    private void writeDescription(W3I w3i) {
        outputStream.writeString(w3i.getDescription().getValue());
    }

    private void writeRecommendedPlayers(W3I w3i) {
        outputStream.writeString(w3i.getRecommendedPlayers().getValue());
    }

    private void writeCameraBounds(W3I w3i) {
        final W3I.Point2d camBoundsBottomLeft = w3i.getCameraBounds().getCameraBoundBottomLeft();
        final W3I.Point2d camBoundsTopRight = w3i.getCameraBounds().getCameraBoundTopRight();
        final W3I.Point2d camBoundsTopLeft = w3i.getCameraBounds().getCameraBoundTopLeft();
        final W3I.Point2d camBoundsBottomRight = w3i.getCameraBounds().getCameraBoundBottomRight();

        outputStream.writeFloat32(camBoundsBottomLeft.getx());
        outputStream.writeFloat32(camBoundsBottomLeft.gety());
        outputStream.writeFloat32(camBoundsTopRight.getx());
        outputStream.writeFloat32(camBoundsTopRight.gety());
        outputStream.writeFloat32(camBoundsTopLeft.getx());
        outputStream.writeFloat32(camBoundsTopLeft.gety());
        outputStream.writeFloat32(camBoundsBottomRight.getx());
        outputStream.writeFloat32(camBoundsBottomRight.gety());
    }

    private void writeDimensions(W3I w3i) {
        outputStream.writeInt32(w3i.getMapWidth().intValue());
        outputStream.writeInt32(w3i.getMapHeight().intValue());
    }

    private void writeMargins(W3I w3i) {
        outputStream.writeInt32(w3i.getMargins().getLeft()); // TODO: invert
        outputStream.writeInt32(w3i.getMargins().getRight());
        outputStream.writeInt32(w3i.getMargins().getBottom()); // TODO: invert
        outputStream.writeInt32(w3i.getMargins().getTop());
    }

    private void writeFlags(W3I w3i) {
        outputStream.writeInt32(flagsToInt(w3i.getFlags()));
    }

    private void writeTileset(W3I w3i) {
        outputStream.writeChar(tilesetToChar(w3i.getTileset()));
    }

    // TODO: replace this or extract it at least
    private char tilesetToChar(W3I.Tileset tileset) {
        switch (tileset) {
            case ASHENVALE:
                return 0x41;
            case BARRENS:
                return 0x42;
            case FELWOOD:
                return 0x43;
            case DUNGEON:
                return 0x44;
            case LORDAERON_FALL:
                return 0x46;
            case UNDERGROUND:
                return 0x47;
            case ICECROWN:
                return 0x49;
            case DALARAN_RUINS:
                return 0x4a;
            case BLACK_CITADEL:
                return 0x4b;
            case LORDAERON_SUMMER:
                return 0x4c;
            case NORTHREND:
                return 0x4e;
            case OUTLAND:
                return 0x4f;
            case VILLAGE_FALL:
                return 0x51;
            case VILLAGE:
                return 0x56;
            case LORDAERON_WINTER:
                return 0x57;
            case DALARAN:
                return 0x58;
            case CITYSCAPE:
                return 0x59;
            case SUNKEN_RUINS:
                return 0x5a;
            default:
                throw new IllegalArgumentException();
        }
    }

    private void writeLoadingScreen(W3I w3i) {
        switch (format.getVersion()) {
            case 0x12: {
                writeLoadingScreen_0x12(w3i.getLoadingScreen());
                break;
            }
            case 0x19: {
                writeLoadingScreen_0x19(w3i.getLoadingScreen());
                break;
            }
        }
    }

    private void writeLoadingScreen_0x12(W3I.LoadingScreen loadingScreen) {
        // TODO: check screen index duplication
        outputStream.writeInt32(loadingScreen.getLoadingScreenIndex());
        outputStream.writeString(loadingScreen.getLoadingScreenText().getValue());
        outputStream.writeString(loadingScreen.getLoadingScreenTitle().getValue());
        outputStream.writeString(loadingScreen.getLoadingScreenSubtitle().getValue());
        outputStream.writeInt32(loadingScreen.getLoadingScreenIndex());
    }

    private void writeLoadingScreen_0x19(W3I.LoadingScreen loadingScreen) {
        outputStream.writeInt32(loadingScreen.getLoadingScreenIndex());
        outputStream.writeString(loadingScreen.getCustomLoadingScreenPath().getValue());

        outputStream.writeString(loadingScreen.getLoadingScreenText().getValue());
        outputStream.writeString(loadingScreen.getLoadingScreenTitle().getValue());
        outputStream.writeString(loadingScreen.getLoadingScreenSubtitle().getValue());
    }

    private void writeGameDataSet(W3I w3i) {
        outputStream.writeInt32(Optional.ofNullable(w3i.getGameDataSet()).map(W3I.GameDataSet::id).orElse(0L).intValue());
    }

    private void writePrologueScreen(W3I w3i) {
        final W3I.PrologueScreen prologueScreen = w3i.getPrologueScreen();

        switch (format.getVersion()) {
            case 0x19:
            case 0x1C:
            case 0x1F: {
                outputStream.writeString(prologueScreen != null ? prologueScreen.getPrologueScreenPath().getValue() : null);
            }
        }
        outputStream.writeString(prologueScreen != null ? prologueScreen.getPrologueScreenText().getValue() : null);
        outputStream.writeString(prologueScreen != null ? prologueScreen.getPrologueScreenTitle().getValue() : null);
        outputStream.writeString(prologueScreen != null ? prologueScreen.getPrologueScreenSubtitle().getValue() : null);
    }

    private void writeFog(W3I w3i) {
        final W3I.Fog terrainFog = w3i.getFog();

        final W3I.FogType terrainFogType = terrainFog != null ? terrainFog.getFogType() : null;

        outputStream.writeInt32(terrainFogType != null ? (int) terrainFogType.id() : 0);
        outputStream.writeFloat32(terrainFog != null ? terrainFog.getFogZStart() : 0f);
        outputStream.writeFloat32(terrainFog != null ? terrainFog.getFogZEnd() : 0f);
        outputStream.writeFloat32(terrainFog != null ? terrainFog.getFogDensity() : 0f);

        outputStream.writeUByte(terrainFog != null ? terrainFog.getFogColorRed() : 0x00);
        outputStream.writeUByte(terrainFog != null ? terrainFog.getFogColorGreen() : 0x00);
        outputStream.writeUByte(terrainFog != null ? terrainFog.getFogColorBlue() : 0x00);
        outputStream.writeUByte(terrainFog != null ? terrainFog.getFogColorAlpha() : 0x00);
    }

    private void writeGlobalWeather(W3I w3i) {
        outputStream.writeId(w3i.getGlobalWeatherId());
    }

    private void writeSoundEnvironment(W3I w3i) {
        outputStream.writeString(w3i.getSoundEnvironment().getValue());
    }

    private void writeLightEnvironment(W3I w3i) {
        outputStream.writeChar(w3i.getLightEnvironment().getValue().charAt(0));
    }

    private void writeWaterColor(W3I w3i) {
        final W3I.WaterColor waterColor = w3i.getWaterColor();

        outputStream.writeUByte(waterColor.getRed());
        outputStream.writeUByte(waterColor.getGreen());
        outputStream.writeUByte(waterColor.getBlue());
        outputStream.writeUByte(waterColor.getAlpha());
    }

    private void writeScriptLang(W3I w3i) {
        outputStream.writeUInt32(w3i.getScriptLanguage().id());
    }

    private void writeSupportedGraphicsModes(W3I w3i) {
        outputStream.writeUInt32(graphicModesToInt(w3i.getSupportedGraphicsModes()));
    }

    private int graphicModesToInt(W3I.GraphicsModes graphicsModes) {
        final List<Boolean> booleans = new ArrayList<>(graphicsModes.getRest());

        booleans.addAll(Arrays.asList(new Boolean[]{
                graphicsModes.getSd(),
                graphicsModes.getHd(),
        }));
        int result = 0;
        for (int i = 0; i < booleans.size(); i++) {
            final int byteReversedIndex = i / 8  * 8 + 7 - i % 8;
            if (booleans.get(byteReversedIndex)) {
                result |= (1 << i);
            }
        }
        return result;
    }

    private void writeGameDataVersion(W3I w3i) {
        outputStream.writeUInt32(w3i.getGameDataVersion().id());
    }

    private void writePlayers(W3I w3i) {
        final List<W3I.Player> players = w3i.getPlayersChunk().getPlayer();

        outputStream.writeInt32(players.size());

        for (final W3I.Player player : players) {
            writePlayer(player);
        }
    }

    private void writePlayer(W3I.Player player) {
        switch (format.getVersion()) {
            case 0x1F: {
                writePlayer_0x1F(player);
                break;
            }
            case 0x19:
            case 0x12: {
                writePlayer_0x12(player);
                break;
            }
        }
    }

    private void writePlayer_0x12(W3I.Player player) {
        outputStream.writeInt32((int) player.getNum());

        outputStream.writeInt32((int) player.getController().id());
        outputStream.writeInt32((int) player.getRace().id());

        outputStream.writeInt32((int) player.getFixedPosition());

        outputStream.writeString(player.getName().getValue());

        final W3I.Point2d startPos = player.getPosition();

        outputStream.writeFloat32(startPos.getx());
        outputStream.writeFloat32(startPos.gety());

        outputStream.writeInt32(playerBitmapToInt(player.getAllyLowPriority()));
        outputStream.writeInt32(playerBitmapToInt(player.getAllyHighPriority()));
    }

    private void writePlayer_0x1F(W3I.Player player) {
        outputStream.writeInt32((int) player.getNum());

        outputStream.writeInt32((int) player.getController().id());
        outputStream.writeInt32((int) player.getRace().id());

        outputStream.writeInt32((int) player.getFixedPosition());

        outputStream.writeString(player.getName().getValue());

        final W3I.Point2d startPos = player.getPosition();

        outputStream.writeFloat32(startPos.getx());
        outputStream.writeFloat32(startPos.gety());

        outputStream.writeInt32(playerBitmapToInt(player.getAllyLowPriority()));
        outputStream.writeInt32(playerBitmapToInt(player.getAllyHighPriority()));

        outputStream.writeInt32(playerBitmapToInt(player.getEnemyLowPriority()));
        outputStream.writeInt32(playerBitmapToInt(player.getEnemyHighPriority()));
    }

    // TODO: replace this or extract it at least
    private int playerBitmapToInt(W3I.PlayerBitmap playerBitmap) {
        int result = 0;
        for (int i = 0; i < playerBitmap.getBits().getIsMember().size(); i++) {
            final int byteReversedIndex = i / 8  * 8 + 7 - i % 8;
            if (playerBitmap.getBits().getIsMember().get(byteReversedIndex)) {
                result |= (1 << i);
            }
        }
        return result;
    }

    private void writeForces(W3I w3i) {
        final List<W3I.Force> forces = w3i.getForcesChunk().getForce();

        outputStream.writeInt32(forces.size());

        for (final W3I.Force force : forces) {
            writeForce(force);
        }
    }

    private void writeForce(W3I.Force force) {
        outputStream.writeInt32(flagsToInt(force.getFlags()));

        long playersL = playerBitmapToInt(force.getPlayers());

        outputStream.writeUInt32(playersL);

        outputStream.writeString(force.getName().getValue());
    }

    // TODO: replace this or extract it at least
    // TODO: untested
    private int flagsToInt(W3I.Flags flags) {
        final List<Boolean> booleans = new ArrayList<>(Arrays.asList(new Boolean[]{
                flags.getUseCustomTechs(),
                flags.getUseCustomTeams(),
                flags.getFixedPlayerParametersForCustomTeams(),
                flags.getUnexploredAreasPartiallyVisible(),
                flags.getNonDefaultTilesetMapSizeLargeNeverBeenReducedToMedium(),
                flags.getMelee(),
                flags.getChangeAllyPriorities(),
                flags.getHideMinimapOnPreviewScreens(),

                flags.getUseItemClassificationSystem(),
                flags.getTftRequired(),
                flags.getUseTerrainFog(),
                flags.getShowWaterWavesOnRollingShores(),
                flags.getShowWaterWavesOnCliffShores(),
                flags.getMapPropertiesMenuOpenedAtLeastOnce(),
                flags.getUseCustomUpgrades(),
                flags.getUseCustomAbilities(),

                flags.getCustomWaterTintColor(),
                flags.getFlag17(),
                flags.getFlag18(),
                flags.getFlag19(),
                flags.getFlag20(),
                flags.getUseCustomAbilitySkin(),
                flags.getUseAccurateProbabilitiesForCalculation(),
        }));
        booleans.addAll(flags.getRest());
        int result = 0;
        // fill byte
        while (booleans.size() % 8 != 0) {
            booleans.add(Boolean.FALSE);
        }
        for (int i = 0; i < booleans.size(); i++) {
            final int byteReversedIndex = i / 8  * 8 + 7 - i % 8;
            if (booleans.get(byteReversedIndex)) {
                result |= (1 << i);
            }
        }
        return result;
    }

    private int flagsToInt(W3I.ForceFlags flags) {
        final List<Boolean> booleans = new ArrayList<>(Arrays.asList(new Boolean[]{
                flags.getBits().getFlag7(),
                flags.getBits().getFlag6(),
                flags.getBits().getFlag5(),
                flags.getBits().getShareAdvancedUnitControl(),
                flags.getBits().getShareUnitControl(),
                flags.getBits().getShareVision(),
                flags.getBits().getAlliedVictory(),
                flags.getBits().getAllied()
        }));
        booleans.addAll(flags.getBits().getRest().stream().map(i -> i != 0).collect(Collectors.toList()));
        int result = 0;
        // fill byte
        while (booleans.size() % 8 != 0) {
            booleans.add(Boolean.FALSE);
        }
        for (int i = 0; i < booleans.size(); i++) {
            final int byteReversedIndex = i / 8  * 8 + 7 - i % 8;
            if (booleans.get(byteReversedIndex)) {
                result |= (1 << i);
            }
        }
        return result;
    }

    private void writeUpgradeMods(W3I w3i) {
        final List<W3I.Upgrade> upgradeMods = w3i.getUpgradesChunk().getUpgrade();

        outputStream.writeInt32(upgradeMods.size());

        for (final W3I.Upgrade upgradeMod : upgradeMods) {
            writeUpgradeMod(upgradeMod);
        }
    }

    private void writeUpgradeMod(W3I.Upgrade upgradeMod) {
        outputStream.writeInt32((int) upgradeMod.getPlayers());

        outputStream.writeId(upgradeMod.getId());

        outputStream.writeInt32((int) upgradeMod.getLevel());

        outputStream.writeInt32((int) upgradeMod.getAvailability());
    }

    private void writeTechMods(W3I w3i) {
        final List<W3I.Tech> techMods = w3i.getTechsChunk().getTech();

        outputStream.writeInt32(techMods.size());

        for (final W3I.Tech techMod : techMods) {
            writeTechMod(techMod);
        }
    }

    private void writeTechMod(W3I.Tech techMod) {
        outputStream.writeInt32((int) techMod.getPlayers());

        outputStream.writeId(techMod.getId());
    }

    private void writeUnitTables(W3I w3i) {
        final List<W3I.RandomUnitTable> unitTables = w3i.getRandomUnitTablesChunk().getTable();

        outputStream.writeInt32(unitTables.size());

        for (final W3I.RandomUnitTable unitTable : unitTables) {
            unitTableSerializer.serialize(unitTable);
        }
    }



    private void writeItemTables(W3I w3i) {
        final List<W3I.RandomItemTable> itemTables = w3i.getRandomItemTablesChunk().getTable();

        outputStream.writeInt32(itemTables.size());

        for (final W3I.RandomItemTable itemTable : itemTables) {
            itemTableSerializer.serialize(itemTable);
        }
    }
}
