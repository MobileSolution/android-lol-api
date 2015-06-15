package com.mobilesolutions.lolapi;

import com.mobilesolutions.lolapi.models.statics.ChampionDto;
import com.mobilesolutions.lolapi.models.statics.ChampionListDto;
import com.mobilesolutions.lolapi.models.statics.ItemDto;
import com.mobilesolutions.lolapi.models.statics.ItemListDto;
import com.mobilesolutions.lolapi.models.statics.LanguageStringsDto;
import com.mobilesolutions.lolapi.models.statics.MapDataDto;
import com.mobilesolutions.lolapi.models.statics.MasteryDto;
import com.mobilesolutions.lolapi.models.statics.MasteryListDto;
import com.mobilesolutions.lolapi.models.statics.RealmDto;
import com.mobilesolutions.lolapi.models.statics.RuneDto;
import com.mobilesolutions.lolapi.models.statics.RuneList;
import com.mobilesolutions.lolapi.models.statics.RuneStatDto;
import com.mobilesolutions.lolapi.models.statics.SummonerSpellDto;
import com.mobilesolutions.lolapi.models.statics.SummonerSpellListDto;
import com.mobilesolutions.lolapi.models.statics.enums.ChampDataEnum;
import com.mobilesolutions.lolapi.models.statics.enums.ItemListEnum;
import com.mobilesolutions.lolapi.models.statics.enums.MasteryListEnum;
import com.mobilesolutions.lolapi.models.statics.enums.RuneListEnum;
import com.mobilesolutions.lolapi.models.statics.enums.SpellDataEnum;
import com.mobilesolutions.lolapi.utls.Constants;

import junit.framework.Assert;

import org.junit.Test;

import retrofit.RetrofitError;

public class StaticDataApiTest extends BaseTest {

    @Test
    public void testGetChampionList() {
        final ChampionListDto championList = LolApi.getChampionList();
        Assert.assertTrue(championList.getData().size() > 120);
    }

    @Test(expected = RetrofitError.class)
    public void testGetChampionListError() {
        final ChampionListDto championList = LolApi.getChampionList("sdad", "sad", true, ChampDataEnum.ALLYTIPS);
    }

    @Test
    public void testGetChampionListWithParams() {
        final ChampionListDto championList = LolApi.getChampionList(Constants.DEFAULT_LOCALE, Constants.API_VERSION, true, ChampDataEnum.ALL);
        Assert.assertTrue(championList.getData().size() > 120);
    }

    @Test
    public void testGetChampionById() {
        final ChampionDto championDataById = LolApi.getChampionDataById(23);
        Assert.assertNotNull(championDataById);
    }

    @Test(expected = RetrofitError.class)
    public void testGetChampionByIdError() {
        final ChampionDto championDataById = LolApi.getChampionDataById(23, "sdad", "sad", ChampDataEnum.ALLYTIPS);
    }

    @Test
    public void testGetChampionByIdWithParams() {
        final ChampionDto championDataById = LolApi.getChampionDataById(23, Constants.DEFAULT_LOCALE, Constants.API_VERSION, ChampDataEnum.ALL);
        Assert.assertNotNull(championDataById);
    }

    @Test
    public void testGetItemsList() {
        final ItemListDto itemList = LolApi.getItemList();
        Assert.assertTrue(itemList.getData().size() > 40);
    }

    @Test(expected = RetrofitError.class)
    public void testGetItemsListError() {
        final ItemListDto itemList = LolApi.getItemList("zzzz", "dfs", ItemListEnum.ALL);
    }

    @Test
    public void testGetItemsListWithParams() {
        final ItemListDto itemList = LolApi.getItemList(Constants.DEFAULT_LOCALE, Constants.API_VERSION, ItemListEnum.ALL);
        Assert.assertTrue(itemList.getData().size() > 40);
    }

    @Test
    public void testGetItemsById() {
        final ItemDto itemById = LolApi.getItemById(3260);
        Assert.assertNotNull(itemById);
    }

    @Test(expected = RetrofitError.class)
    public void testGetItemsByIdError() {
        final ItemDto itemById = LolApi.getItemById(3260, "fsa", "sda", ItemListEnum.ALL);
    }

    @Test
    public void testGetItemsByIdWithParams() {
        final ItemDto itemById = LolApi.getItemById(3260, Constants.DEFAULT_LOCALE, Constants.API_VERSION, ItemListEnum.ALL);
        Assert.assertNotNull(itemById);
    }

    @Test
    public void testGetLanguagesStrings() {
        final LanguageStringsDto languageStrings = LolApi.getLanguageStrings();
        Assert.assertNotNull(languageStrings);
    }

    @Test(expected = RetrofitError.class)
    public void testGetLanguagesStringsError() {
        final LanguageStringsDto languageStrings = LolApi.getLanguageStrings("dsa", "dsa");
    }

    @Test
    public void testGetLanguagesStringsErrorWithParams() {
        final LanguageStringsDto languageStrings = LolApi.getLanguageStrings(Constants.DEFAULT_LOCALE, Constants.API_VERSION);
        Assert.assertNotNull(languageStrings);
    }

    @Test
    public void testGetLanguages() {
        final String[] languages = LolApi.getLanguages();
        Assert.assertTrue(languages.length > 5);
    }

    @Test
    public void testGeMap() {
        final MapDataDto map = LolApi.getMap();
        Assert.assertNotNull(map);
    }

    @Test(expected = RetrofitError.class)
    public void testGeMapError() {
        LolApi.getMap("dsa", "dsa");
    }

    @Test
    public void testGeMapWithParams() {
        final MapDataDto map = LolApi.getMap(Constants.DEFAULT_LOCALE, Constants.API_VERSION);
        Assert.assertNotNull(map);
    }

    @Test
    public void testGetMasteryList() {
        final MasteryListDto masteryList = LolApi.getMasteryList();
        Assert.assertTrue(masteryList.getData().size() > 10);
    }

    @Test(expected = RetrofitError.class)
    public void testGetMasteryListError() {
        LolApi.getMasteryList("sdad", "sad", MasteryListEnum.ALL);
    }

    @Test
    public void testGetMasteryListWithParams() {
        final MasteryListDto masteryList = LolApi.getMasteryList(Constants.DEFAULT_LOCALE, Constants.API_VERSION, MasteryListEnum.ALL);
        Assert.assertTrue(masteryList.getData().size() > 10);
    }

    @Test
    public void testGetMasteryById() {
        final MasteryDto masteryById = LolApi.getMasteryById(4352);
        Assert.assertNotNull(masteryById);
    }

    @Test(expected = RetrofitError.class)
    public void testGetMasteryByIdError() {
        final MasteryDto masteryById = LolApi.getMasteryById(4352, "sdad", "sad", MasteryListEnum.ALL);
    }

    @Test
    public void testGetMasteryByIdWithParams() {
        final MasteryDto masteryById = LolApi.getMasteryById(4352, Constants.DEFAULT_LOCALE, Constants.API_VERSION, MasteryListEnum.ALL);
        Assert.assertNotNull(masteryById);
    }

    @Test
    public void testGetRealm() {
        final RealmDto realm = LolApi.getRealm();
        Assert.assertNotNull(realm);
    }

    @Test
    public void testGetRuneList() {
        final RuneList runeList = LolApi.getRuneList();
        Assert.assertTrue(runeList.getData().size() > 10);
    }

    @Test(expected = RetrofitError.class)
    public void testGetRuneListError() {
        LolApi.getRuneList("sdad", "sad", RuneListEnum.ALL);
    }

    @Test
    public void testGetRuneListWithParams() {
        final RuneList runeList = LolApi.getRuneList(Constants.DEFAULT_LOCALE, Constants.API_VERSION, RuneListEnum.ALL);
        Assert.assertTrue(runeList.getData().size() > 10);
    }

    @Test
    public void testGetRuneById() {
        final RuneDto runeById = LolApi.getRuneById(5235);
        Assert.assertNotNull(runeById);
    }

    @Test(expected = RetrofitError.class)
    public void testGetRuneByIdError() {
        final RuneDto runeById = LolApi.getRuneById(5235, "sdad", "sad", RuneListEnum.ALL);
    }

    @Test
    public void testGetRuneByIdWithParams() {
        final RuneDto runeById = LolApi.getRuneById(5235, Constants.DEFAULT_LOCALE, Constants.API_VERSION, RuneListEnum.ALL);
        Assert.assertNotNull(runeById);
    }

    @Test
    public void testGetSummonerSpellList() {
        final SummonerSpellListDto summonerSpellList = LolApi.getSummonerSpellList();
        Assert.assertTrue(summonerSpellList.getData().size() > 10);
    }

    @Test(expected = RetrofitError.class)
    public void testGetSummonerSpellListError() {
        LolApi.getSummonerSpellList("sdad", "sady", true, SpellDataEnum.ALL);
    }

    @Test
    public void testGetSummonerSpellListWithParams() {
        final SummonerSpellListDto summonerSpellList = LolApi.getSummonerSpellList(Constants.DEFAULT_LOCALE, Constants.API_VERSION, true, SpellDataEnum.ALL);
        Assert.assertTrue(summonerSpellList.getData().size() > 10);
    }

    @Test
    public void testGetSummonerSpellById() {
        final SummonerSpellDto summonerSpellById = LolApi.getSummonerSpellById(12);
        Assert.assertNotNull(summonerSpellById);
    }

    @Test(expected = RetrofitError.class)
    public void testGetSummonerSpellByIdError() {
        LolApi.getSummonerSpellById(12, "sdad", "sad", SpellDataEnum.ALL);
    }

    @Test
    public void testGetSummonerSpellByIdWithParams() {
        final SummonerSpellDto summonerSpellById = LolApi.getSummonerSpellById(12, Constants.DEFAULT_LOCALE, Constants.API_VERSION, SpellDataEnum.ALL);
        Assert.assertNotNull(summonerSpellById);
    }

    @Test
    public void testGetVersions() {
        final String[] versions = LolApi.getVersions();
        Assert.assertTrue(versions.length > 20);
    }
}
