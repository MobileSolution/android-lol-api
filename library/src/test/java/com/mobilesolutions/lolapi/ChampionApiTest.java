package com.mobilesolutions.lolapi;

import com.mobilesolutions.lolapi.LolApi;
import com.mobilesolutions.lolapi.models.champion.ChampionListDto;

import org.junit.Assert;
import org.junit.Before;

import retrofit.RestAdapter;

public class ChampionApiTest extends BaseTest {


    @org.junit.Test
    public void testGetFreeToPlayChampions() {
        final ChampionListDto champions = LolApi.getChampions(true);
        Assert.assertEquals(champions.getChampions().size(), 10);
    }

    @org.junit.Test
    public void testGetAllChampions() {
        final ChampionListDto champions = LolApi.getChampions();
        Assert.assertTrue(champions.getChampions().size() > 120);
    }
}
