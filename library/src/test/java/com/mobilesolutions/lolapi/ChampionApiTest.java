package com.mobilesolutions.lolapi;

import com.mobilesolutions.lolapi.models.champion.ChampionDto;
import com.mobilesolutions.lolapi.models.champion.ChampionListDto;

import org.junit.Assert;
import org.junit.Test;

import retrofit.RetrofitError;

public class ChampionApiTest extends BaseTest {

    @Test
    public void testGetFreeToPlayChampions() {
        final ChampionListDto champions = LolApi.getChampions(true);
        Assert.assertEquals(champions.getChampions().size(), 10);
    }

    @Test
    public void testGetAllChampions() {
        final ChampionListDto champions = LolApi.getChampions();
        Assert.assertTrue(champions.getChampions().size() > 120);
    }

    @Test
    public void testGetAllChampionsSecond() {
        final ChampionListDto champions = LolApi.getChampions(false);
        Assert.assertTrue(champions.getChampions().size() > 120);
    }

    @Test
    public void testGetChampionById() {
        final ChampionDto champion = LolApi.getChampionById(266);
        Assert.assertNotNull(champion);
    }

    @Test(expected = RetrofitError.class)
    public void testGetChampionByIdNull() {
        LolApi.getChampionById(-1);
    }

}
