package com.mobilesolutions.lolapi;

import com.mobilesolutions.lolapi.models.team.TeamDto;

import junit.framework.Assert;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import retrofit.RetrofitError;

public class TeamApiTest extends BaseTest{

    @Test(expected = RetrofitError.class)
    public void testGetTeamsBySummonerIdsError() {
        List<String> list = new ArrayList<>();
        list.add("40743772");
        list.add("55266115");
        LolApi.getTeamsBySummonerIds(list);
    }

    @Test
    public void testGetTeamsBySummonerIdsSize() {
        List<String> list = new ArrayList<>();
        list.add("23782227");
        list.add("24441434");
        final Map<String, List<TeamDto>> teamsBySummonerIds = LolApi.getTeamsBySummonerIds(list);
        Assert.assertTrue(teamsBySummonerIds.size() > 0);
    }

    @Test(expected = RetrofitError.class)
    public void testGetTeamsByTeamIdsError() {
        List<String> list = new ArrayList<>();
        list.add("TEA1");
        LolApi.getTeamsByTeamIds(list);
    }

    @Test
    public void testGetTeamsByTeamIdsSize() {
        List<String> list = new ArrayList<>();
        list.add("TEAM-916c1660-00c7-11e5-a8f9-782bcb48f791");
        final Map<String, TeamDto> teamsByTeamIds = LolApi.getTeamsByTeamIds(list);
        Assert.assertTrue(teamsByTeamIds.size() > 0);
    }
}