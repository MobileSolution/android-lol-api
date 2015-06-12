package com.mobilesolutions.lolapi;

import com.mobilesolutions.lolapi.models.featured.FeaturedGames;
import com.mobilesolutions.lolapi.models.recent.GameDtoList;

import org.junit.Assert;
import org.junit.Test;

import retrofit.RetrofitError;

public class GameApiTest extends BaseTest {

    @Test
    public void testGetGamesRealSummoner() {
        final GameDtoList recentGames = LolApi.getRecentGames(40743772);
        Assert.assertEquals(10, recentGames.getGames().size());
    }

    @Test
    public void testGetGamesRealSummonerId() {
        final GameDtoList recentGames = LolApi.getRecentGames(40743772);
        Assert.assertEquals(40743772, recentGames.getSummonerId());
    }

    @Test(expected = RetrofitError.class)
    public void testGetGamesInvalidSummoner() {
        LolApi.getRecentGames(-1);
    }
}