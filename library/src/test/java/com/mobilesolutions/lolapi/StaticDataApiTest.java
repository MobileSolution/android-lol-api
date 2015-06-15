package com.mobilesolutions.lolapi;

import com.mobilesolutions.lolapi.models.statics.ChampionDto;
import com.mobilesolutions.lolapi.models.statics.ChampionListDto;
import com.mobilesolutions.lolapi.models.statics.ItemDto;
import com.mobilesolutions.lolapi.models.statics.ItemListDto;
import com.mobilesolutions.lolapi.models.statics.LanguageStringsDto;
import com.mobilesolutions.lolapi.models.statics.MapDataDto;
import com.mobilesolutions.lolapi.models.statics.MasteryDto;
import com.mobilesolutions.lolapi.models.statics.MasteryListDto;
import com.mobilesolutions.lolapi.models.statics.enums.ChampDataEnum;
import com.mobilesolutions.lolapi.models.statics.enums.ItemListEnum;
import com.mobilesolutions.lolapi.models.statics.enums.MasteryListEnum;
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
        LolApi.getMap("dsa","dsa");
    }

    @Test
    public void testGeMapWithParams() {
        final MapDataDto map = LolApi.getMap(Constants.DEFAULT_LOCALE,Constants.API_VERSION);
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
        final MasteryListDto masteryList = LolApi.getMasteryList(Constants.DEFAULT_LOCALE,Constants.API_VERSION, MasteryListEnum.ALL);
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
}
