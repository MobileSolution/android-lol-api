package com.mobilesolutions.lolapi.statics;

/**
 * Interface for static things in league of legends.
 * <p/>
 * Created by geftimov on 12/06/15.
 */
public interface StaticService {

    /**
     * Get the url image of the champion.
     */
    String getChampionImage(final String champion);

    /**
     * Get the url image of the champion spell.
     *
     * @param spell - You can find the filename for each champion's abilities in the Static Data API champion endpoint or the individual champion Data Dragon file. The JSON spells property contains an array of objects which includes image data. The filename is indicated by the full property:
     */
    String getSpellImage(final String spell);

    /**
     * Get the url image of the champion item.
     */
    String getChampionItemImage(final String item);

    /**
     * Get the url image of the players profile.
     */
    String getProfileIconImage(final String imageId);

    /**
     * Get the url image of the champion.
     *
     * @param skinId - You can find the skin number for each skin in the Static Data API champion endpoint or the file for each individual champion in Data Dragon. Each champion contains a skins property and the skin number is indicated by the num property:
     */
    String getChampionSplashImage(final int skinId);

    /**
     * Get the url image of the champion.
     *
     * @param skinId - You can find the skin number for each skin in the Static Data API champion endpoint or the file for each individual champion in Data Dragon. Each champion contains a skins property and the skin number is indicated by the num property:
     */
    String getChampionLoginImage(final int skinId);

    /**
     * Get the url image of the champion passive.
     *
     * @param passive - You can find the filename for each champion's passive in the Static Data API champion endpoint or the individual champion Data Dragon file. The JSON contains a passive property with image data. The filename is indicated by the full property:
     */
    String getChampionPassiveImage(final String passive);

    /**
     * Get the url image of the champion mastery.
     */
    String getChampionMasteryImage(final String mastery);

    /**
     * Get the url image of the champion rune.
     */
    String getChampionRuneImage(final String rune);

    /**
     * Get the url image of the sprite.
     */
    String getSpriteImage(final String sprite);

    /**
     * Get the url image of the map.
     */
    String getChampionOriginalSummonerRiftMapImage();

    /**
     * Get the url image of the map.
     */
    String getChampionCurrentTwistedTreelineMapImage();

    /**
     * Get the url image of the map.
     */
    String getChampionCurrentSummonerRiftMapImage();

    /**
     * Get the url image of the map.
     */
    String getChampionHowlingAbyssMapImage();

    /**
     * Get the url image of the mini icon of champion.
     */
    String getMiniIconChampionImage();

    /**
     * Get the url image of the mini icon of gold.
     */
    String getMiniIconGoldImage();

    /**
     * Get the url image of the mini icon of items.
     */
    String getMiniIconItemsImage();

    /**
     * Get the url image of the mini icon of minion.
     */
    String getMiniIconMinionImage();

    /**
     * Get the url image of the mini icon of score.
     */
    String getMiniIconScoreImage();

    /**
     * Get the url image of the mini icon of spells.
     */
    String getMiniIconSpellsImage();
}