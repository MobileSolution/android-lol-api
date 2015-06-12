package com.mobilesolutions.lolapi;

import com.mobilesolutions.lolapi.models.champion.ChampionListDto;
import com.mobilesolutions.lolapi.models.featured.FeaturedGames;

import org.junit.Assert;
import org.junit.Test;

public class FeaturedApiTest extends BaseTest {

    @Test
    public void testGetFreeToPlayChampions() {
        final FeaturedGames featuredGames = LolApi.getFeaturedGames();
        Assert.assertEquals(5, featuredGames.getGameList().size());
    }
}
