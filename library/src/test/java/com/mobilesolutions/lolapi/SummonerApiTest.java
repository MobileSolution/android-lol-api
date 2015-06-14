package com.mobilesolutions.lolapi;

import com.mobilesolutions.lolapi.models.summoner.MasteryPagesDto;
import com.mobilesolutions.lolapi.models.summoner.RunePagesDto;
import com.mobilesolutions.lolapi.models.summoner.SummonerDto;

import junit.framework.Assert;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import retrofit.RetrofitError;

public class SummonerApiTest extends BaseTest {

    @Test(expected = RetrofitError.class)
    public void testGetSummonerByIdsError() {
        List<String> list = new ArrayList<>();
        list.add("214das");
        list.add("czxsc");
        LolApi.getSummonerNameByIds(list);
    }

    @Test
    public void testGetSummonerByIdsSize() {
        List<String> list = new ArrayList<>();
        list.add("40743772");
        list.add("55266115");
        final Map<String, String> summonerNameByIds = LolApi.getSummonerNameByIds(list);
        Assert.assertTrue(summonerNameByIds.size() > 0);
    }

    @Test(expected = RetrofitError.class)
    public void testGetSummonerByNamesError() {
        List<String> list = new ArrayList<>();
        list.add("214das");
        list.add("czxsc");
        LolApi.getSummonersByIds(list);
    }

    @Test
    public void testGetSummonerByNamesSize() {
        List<String> list = new ArrayList<>();
        list.add("40743772");
        list.add("55266115");
        final Map<String, SummonerDto> summonersByIds = LolApi.getSummonersByIds(list);
        Assert.assertTrue(summonersByIds.size() > 0);
    }

    @Test(expected = RetrofitError.class)
    public void testGetMasteriesBySummonerIdsError() {
        List<String> list = new ArrayList<>();
        list.add("214das");
        list.add("czxsc");
        LolApi.getMasteryPagesBySummonerIds(list);
    }

    @Test
    public void testGetMasteriesBySummonerIdsSize() {
        List<String> list = new ArrayList<>();
        list.add("40743772");
        list.add("55266115");
        final Map<String, MasteryPagesDto> masteryPagesBySummonerIds = LolApi.getMasteryPagesBySummonerIds(list);
        Assert.assertTrue(masteryPagesBySummonerIds.size() > 0);
    }

    @Test(expected = RetrofitError.class)
    public void testGetSummonersByNamesListError() {
        List<String> list = new ArrayList<>();
        list.add("214das");
        list.add("czxsc");
        LolApi.getSummonersByNamesList(list);
    }

    @Test
    public void testGetSummonersByNamesListSize() {
        List<String> list = new ArrayList<>();
        list.add("JokataVR");
        list.add("ShisheMastika");
        final Map<String, SummonerDto> summonersByNamesList = LolApi.getSummonersByNamesList(list);
        Assert.assertTrue(summonersByNamesList.size() > 0);
    }

    @Test(expected = RetrofitError.class)
    public void testGetRunePagesBySummonerIds() {
        List<String> list = new ArrayList<>();
        list.add("214das");
        list.add("czxsc");
        LolApi.getRunePagesBySummonerIds(list);
    }

    @Test
    public void testGetRunePagesBySummonerIdsSize() {
        List<String> list = new ArrayList<>();
        list.add("40743772");
        list.add("55266115");
        final Map<String, RunePagesDto> runePagesBySummonerIds = LolApi.getRunePagesBySummonerIds(list);
        Assert.assertTrue(runePagesBySummonerIds.size() > 0);
    }
}

