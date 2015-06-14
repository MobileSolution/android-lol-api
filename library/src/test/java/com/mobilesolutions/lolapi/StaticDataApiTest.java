package com.mobilesolutions.lolapi;

import com.mobilesolutions.lolapi.models.statics.ChampionDto;
import com.mobilesolutions.lolapi.models.statics.ChampionListDto;
import com.mobilesolutions.lolapi.models.statics.ItemDto;
import com.mobilesolutions.lolapi.models.statics.ItemListDto;
import com.mobilesolutions.lolapi.models.statics.enums.ChampDataEnum;
import com.mobilesolutions.lolapi.models.statics.enums.ItemListEnum;
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
        final ItemListDto itemList = LolApi.getItemList("zzzz" ,"dfs", ItemListEnum.ALL);
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
        final ItemDto itemById = LolApi.getItemById(3260 ,"fsa","sda",ItemListEnum.ALL);
    }

    @Test
    public void testGetItemsByIdWithParams() {
        final ItemDto itemById = LolApi.getItemById(3260, Constants.DEFAULT_LOCALE, Constants.API_VERSION, ItemListEnum.ALL);
        Assert.assertNotNull(itemById);
    }
}
