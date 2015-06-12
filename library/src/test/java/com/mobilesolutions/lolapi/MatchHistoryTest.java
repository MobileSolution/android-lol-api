package com.mobilesolutions.lolapi;

import com.mobilesolutions.lolapi.models.match.MatchDetail;
import com.mobilesolutions.lolapi.models.matchhistory.MatchSummary;

import junit.framework.Assert;

import org.junit.Test;

import retrofit.RetrofitError;

public class MatchHistoryTest extends BaseTest {

    @Test
    public void testGetMatchHistoryBySummonerIdNotNull(){
        final MatchSummary matchHistoryBySummonerId = LolApi.getMatchHistoryBySummonerId(40743772);
        Assert.assertNotNull(matchHistoryBySummonerId);
    }

    @Test(expected = RetrofitError.class)
    public void testGetMatchHistoryBySummonerIdNull(){
        final MatchSummary matchHistoryBySummonerId = LolApi.getMatchHistoryBySummonerId(-1);
    }

    @Test
    public void testGetMatchHistoryBySummonerId(){
        final MatchSummary matchHistoryBySummonerId = LolApi.getMatchHistoryBySummonerId(40743772);
        Assert.assertTrue(matchHistoryBySummonerId.getMatches().size() == 15);
    }

    @Test
    public void testGetMatchHistoryBySummonerIdIndexesSize(){
        final MatchSummary matchHistoryBySummonerId = LolApi.getMatchHistoryBySummonerId(40743772,0,1);
        Assert.assertTrue(matchHistoryBySummonerId.getMatches().size() == 1);
    }

    @Test(expected = RetrofitError.class)
    public void testGetMatchHistoryBySummonerIdIndexesSizeError(){
        final MatchSummary matchHistoryBySummonerId = LolApi.getMatchHistoryBySummonerId(40743772,3,1);
    }
}
