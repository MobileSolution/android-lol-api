package com.mobilesolutions.lolapi.statics.datadragon;

import com.mobilesolutions.lolapi.statics.StaticService;
import com.mobilesolutions.lolapi.statics.datadragon.version.HardCodedDataDragonVersionGetter;

/**
 * Data dragon implementation for getting statics data.
 * <p/>
 * Created by georgi.eftimov on 12/06/2015.
 */
public class DataDragonStaticService implements StaticService {

    private String version;

    public static DataDragonStaticService forVersion(final String version) {
        if (version == null) {
            throw new IllegalArgumentException("verion should not be null in DataDragonStaticService.forVersion(version).");
        }
        final DataDragonVersionGetter dataDragonVersionGetter = new HardCodedDataDragonVersionGetter(version);
        return new DataDragonStaticService(dataDragonVersionGetter);
    }

    public DataDragonStaticService(final DataDragonVersionGetter dataDragonVersionGetter) {
        version = dataDragonVersionGetter.getVersion();
    }

    @Override
    public String getChampionImage(final String champion) {
        if (champion == null) {
            return null;
        }
        return String.format("http://ddragon.leagueoflegends.com/cdn/%s/img/champion/%s", version, checkForSuffix(champion));
    }

    @Override
    public String getSpellImage(final String spell) {
        if (spell == null) {
            return null;
        }
        return String.format("http://ddragon.leagueoflegends.com/cdn/%s/img/spell/%s", version, checkForSuffix(spell));
    }

    @Override
    public String getChampionItemImage(final String item) {
        if (item == null) {
            return null;
        }
        return String.format("http://ddragon.leagueoflegends.com/cdn/%s/img/item/%s", version, checkForSuffix(item));
    }

    @Override
    public String getProfileIconImage(final String imageId) {
        if (imageId == null) {
            return null;
        }
        return String.format("http://ddragon.leagueoflegends.com/cdn/%s/img/profileicon/%s", version, checkForSuffix(imageId));
    }

    @Override
    public String getChampionSplashImage(int skinId) {
        return null;
    }

    @Override
    public String getChampionLoginImage(int skinId) {
        return null;
    }

    @Override
    public String getChampionPassiveImage(String passive) {
        return null;
    }

    @Override
    public String getChampionMasteryImage(String mastery) {
        return null;
    }

    @Override
    public String getChampionRuneImage(String rune) {
        return null;
    }

    @Override
    public String getSpriteImage(String sprite) {
        return null;
    }

    @Override
    public String getChampionOriginalSummonerRiftMapImage() {
        return null;
    }

    @Override
    public String getChampionCurrentTwistedTreelineMapImage() {
        return null;
    }

    @Override
    public String getChampionCurrentSummonerRiftMapImage() {
        return null;
    }

    @Override
    public String getChampionHowlingAbyssMapImage() {
        return null;
    }

    @Override
    public String getMiniIconChampionImage() {
        return null;
    }

    @Override
    public String getMiniIconGoldImage() {
        return null;
    }

    @Override
    public String getMiniIconItemsImage() {
        return null;
    }

    @Override
    public String getMiniIconMinionImage() {
        return null;
    }

    @Override
    public String getMiniIconScoreImage() {
        return null;
    }

    @Override
    public String getMiniIconSpellsImage() {
        return null;
    }

    private String checkForSuffix(final String string) {
        return string.endsWith(".png") ? string : string + ".png";
    }
}