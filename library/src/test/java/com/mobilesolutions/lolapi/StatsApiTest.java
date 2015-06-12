package com.mobilesolutions.lolapi;

import com.mobilesolutions.lolapi.models.statics.enums.SeasonEnum;
import com.mobilesolutions.lolapi.models.stats.RankedStatsDto;

import junit.framework.Assert;

import org.junit.Test;

import retrofit.RetrofitError;

public class StatsApiTest extends BaseTest {

    @Test(expected = RetrofitError.class)
    public void testRankedStatsBySummonerIdNull() {
        final RankedStatsDto rankedStatsBySummnoerId = LolApi.getRankedStatsBySummnoerId(-1);
    }

    @Test
    public void testRankedStatsBySummonerIdNotNull() {
        final RankedStatsDto rankedStatsBySummnoerId = LolApi.getRankedStatsBySummnoerId(40743772);
        Assert.assertNotNull(rankedStatsBySummnoerId);
    }

    @Test
    public void testRankedStatsBySummonerIdSeasonNotNull() {
        final RankedStatsDto rankedStatsBySummnoerId = LolApi.getRankedStatsBySummnoerId(40743772, SeasonEnum.SEASON2015);
        Assert.assertNotNull(rankedStatsBySummnoerId);
    }

    @Test(expected = RetrofitError.class)
    public void testSummaryStatsBySummonerIdNull() {
        final RankedStatsDto rankedStatsBySummnoerId = LolApi.getRankedStatsBySummnoerId(-1);
    }

    @Test
    public void testSummaryStatsBySummonerIdNotNull() {
        final RankedStatsDto rankedStatsBySummnoerId = LolApi.getRankedStatsBySummnoerId(40743772);
        Assert.assertNotNull(rankedStatsBySummnoerId);
    }

    @Test
    public void testSummaryStatsBySummonerIdSeasonNotNull() {
        final RankedStatsDto rankedStatsBySummnoerId = LolApi.getRankedStatsBySummnoerId(40743772, SeasonEnum.SEASON2015);
        Assert.assertNotNull(rankedStatsBySummnoerId);
    }
}
