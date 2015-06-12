package com.mobilesolutions.lolapi;

import com.mobilesolutions.lolapi.models.currentgame.CurrentGameInfo;
import com.mobilesolutions.lolapi.models.league.LeagueDto;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import retrofit.RetrofitError;

public class LeagueApiTest extends BaseTest {

    @Test(expected = RetrofitError.class)
    public void testGetLeagueBySummonerIdsInvalid() {
        final List<String> list = new ArrayList<>();
        list.add("-1");
        list.add("554645654654dfgdfsagasetrtf");
        final Map<String, List<LeagueDto>> leaguesBySummenrIds = LolApi.getLeaguesBySummenrIds(list);
    }

    @Test(expected = NullPointerException.class)
    public void testGetLeagueBySummonerIdsNull() {
        final Map<String, List<LeagueDto>> leaguesBySummenrIds = LolApi.getLeaguesBySummenrIds(null);
    }

    @Test
    public void testGetLeagueBySummonerIdsAssertNotNull() {
        final List<String> list = new ArrayList<>();
        list.add("40743772");
        final Map<String, List<LeagueDto>> leaguesBySummenrIds = LolApi.getLeaguesBySummenrIds(list);
        final List<LeagueDto> leagueDtos = leaguesBySummenrIds.get(list.get(0));
        Assert.assertTrue(leagueDtos.size() > 0);

    }

    @Test(expected = RetrofitError.class)
    public void testGetLeagueEntryBySummonerIdsInvalid() {
        final List<String> list = new ArrayList<>();
        list.add("-1");
        list.add("фасфасф");
        final Map<String, List<LeagueDto>> leaguesBySummenrIds = LolApi.getLeagueEntriesBySummonerIds(list);
    }

    @Test(expected = NullPointerException.class)
    public void testGetLeagueEntryBySummonerIdsNull() {
        final Map<String, List<LeagueDto>> leaguesBySummenrIds = LolApi.getLeagueEntriesBySummonerIds(null);
    }

    @Test
    public void testGetLeagueEntryBySummonerIdsAssertNotNull() {
        final List<String> list = new ArrayList<>();
        list.add("40743772");
        final Map<String, List<LeagueDto>> leaguesBySummenrIds = LolApi.getLeagueEntriesBySummonerIds(list);
        Assert.assertTrue(leaguesBySummenrIds.size() > 0);
    }

    @Test(expected = RetrofitError.class)
    public void testGetLeagueByTeamIdsInvalid() {
        final List<String> list = new ArrayList<>();
        list.add("-1");
        list.add("фасфасф");
        final Map<String, List<LeagueDto>> leaguesBySummenrIds = LolApi.getLeaguesByTeamIds(list);
    }

    @Test(expected = NullPointerException.class)
    public void testGetLeagueByTeamIdsNull() {
        final Map<String, List<LeagueDto>> leaguesBySummenrIds = LolApi.getLeaguesByTeamIds(null);
    }

    @Test
    public void testGetLeagueByTeamIds() {
        final List<String> list = new ArrayList<>();
        list.add("TEAM-c7730b20-094f-11e5-8e2b-782bcb46f3e4");
        final Map<String, List<LeagueDto>> leaguesBySummenrIds = LolApi.getLeaguesByTeamIds(list);
        Assert.assertTrue(leaguesBySummenrIds.size() > 0);
    }

    @Test(expected = RetrofitError.class)
    public void testGetLeagueEntryByTeamIdsInvalid() {
        final List<String> list = new ArrayList<>();
        list.add("-1");
        list.add("фасфасф");
        final Map<String, List<LeagueDto>> leaguesBySummenrIds = LolApi.getLeagueEntriesByTeamIds(list);
    }

    @Test(expected = NullPointerException.class)
    public void testGetLeagueEntryByTeamIdsNull() {
        final Map<String, List<LeagueDto>> leaguesBySummenrIds = LolApi.getLeagueEntriesByTeamIds(null);
    }

    @Test
    public void testGetLeagueEntryByTeamIds() {
        final List<String> list = new ArrayList<>();
        list.add("TEAM-c7730b20-094f-11e5-8e2b-782bcb46f3e4");
        final Map<String, List<LeagueDto>> leaguesBySummenrIds = LolApi.getLeagueEntriesByTeamIds(list);
        Assert.assertTrue(leaguesBySummenrIds.size() > 0);
    }

    @Test
    public void testGetChallengerLeague() {
        final LeagueDto challengerLeague = LolApi.getChallengerLeague();
        Assert.assertTrue(challengerLeague.getEntries().size() > 0);
    }

    @Test
    public void testGetChallengerLeagueNotNull() {
        final LeagueDto challengerLeague = LolApi.getChallengerLeague();
        Assert.assertNotNull(challengerLeague);
    }

    @Test
    public void testGetMasterLeague() {
        final LeagueDto masterLeague = LolApi.getMasterLeague();
        Assert.assertTrue(masterLeague.getEntries().size() > 0);
    }

    @Test
    public void testGetMasterLeagueNotNull() {
        final LeagueDto masterLeague = LolApi.getMasterLeague();
        Assert.assertNotNull(masterLeague);
    }
}
