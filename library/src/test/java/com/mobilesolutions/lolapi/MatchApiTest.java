package com.mobilesolutions.lolapi;

import com.mobilesolutions.lolapi.models.match.MatchDetail;

import junit.framework.Assert;

import org.junit.Test;

import retrofit.RetrofitError;

public class MatchApiTest extends BaseTest {

    @Test
    public void testGetMatchByIdNotNull(){
        final MatchDetail matchByMatchId = LolApi.getMatchByMatchId(1177580756, false);
        Assert.assertNotNull(matchByMatchId);
    }

    @Test(expected = RetrofitError.class)
    public void testGetMatchByIdNull(){
        final MatchDetail matchByMatchId = LolApi.getMatchByMatchId(-1, false);
    }

    @Test
    public void testGetMatchByIdTimelineNotNull(){
        final MatchDetail matchByMatchId = LolApi.getMatchByMatchId(1177580756, true);
        Assert.assertNotNull(matchByMatchId.getTimeline());
    }

}
