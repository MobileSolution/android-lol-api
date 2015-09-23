package com.mobilesolutions.lolapi;

import com.mobilesolutions.lolapi.models.matchhistory.MatchList;

import junit.framework.Assert;

import org.junit.Test;

import retrofit.RetrofitError;

public class MatchReferenceHistoryTest extends BaseTest {

    @Test
    public void testGetMatchHistoryBySummonerIdNotNull(){
        final MatchList matchHistoryBySummonerId = LolApi.getMatchHistoryBySummonerId(40743772,0,15);
        Assert.assertNotNull(matchHistoryBySummonerId);
    }

    @Test(expected = RetrofitError.class)
    public void testGetMatchHistoryBySummonerIdNull(){
        final MatchList matchHistoryBySummonerId = LolApi.getMatchHistoryBySummonerId(-1,0,1);
    }

    @Test
    public void testGetMatchHistoryBySummonerId(){
        final MatchList matchHistoryBySummonerId = LolApi.getMatchHistoryBySummonerId(40743772,0,14);
        Assert.assertTrue(matchHistoryBySummonerId.getMatches().size() == 15);
    }

    @Test
    public void testGetMatchHistoryBySummonerIdIndexesSize(){
        final MatchList matchHistoryBySummonerId = LolApi.getMatchHistoryBySummonerId(40743772,0,1);
        Assert.assertTrue(matchHistoryBySummonerId.getMatches().size() == 1);
    }

    @Test(expected = RetrofitError.class)
    public void testGetMatchHistoryBySummonerIdIndexesSizeError(){
        final MatchList matchHistoryBySummonerId = LolApi.getMatchHistoryBySummonerId(40743772,3,1);
    }
}
