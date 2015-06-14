package com.mobilesolutions.lolapi;

import com.mobilesolutions.lolapi.models.statics.ChampionDto;
import com.mobilesolutions.lolapi.models.statics.ChampionListDto;
import com.mobilesolutions.lolapi.models.statics.enums.ChampDataEnum;
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
}
