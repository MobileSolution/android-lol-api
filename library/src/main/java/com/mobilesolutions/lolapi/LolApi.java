package com.mobilesolutions.lolapi;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.mobilesolutions.lolapi.models.champion.ChampionDto;
import com.mobilesolutions.lolapi.models.champion.ChampionListDto;
import com.mobilesolutions.lolapi.models.currentgame.CurrentGameInfo;
import com.mobilesolutions.lolapi.models.featured.FeaturedGames;
import com.mobilesolutions.lolapi.models.league.LeagueDto;
import com.mobilesolutions.lolapi.models.recent.GameDtoList;
import com.mobilesolutions.lolapi.retrofit.RetrofitApiClient;
import com.mobilesolutions.lolapi.retrofit.RetrofitApiEndpoint;
import com.mobilesolutions.lolapi.utls.ErrorConstants;

import java.util.List;
import java.util.Map;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;
import rx.Observable;

public class LolApi {

    private static LolApi instance = null;
    private static String apiKey = null;
    private static RetrofitApiEndpoint retrofitApiEndpoint = null;
    private static RetrofitApiClient retrofitApiClient;

    private LolApi(final String apiKeys) {
        if (apiKeys == null) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_API_KEY_PROVIDED);
        }
        apiKey = apiKeys;
        retrofitApiEndpoint = new RetrofitApiEndpoint();
        final RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(retrofitApiEndpoint)
                .setConverter(new GsonConverter(new Gson()))
                .build();
        retrofitApiClient = restAdapter.create(RetrofitApiClient.class);
    }

    /**
     * Init the the api.
     * It is better to init in the Application.onCreate().
     *
     * @param apiKey String - the api key from https://developer.riotgames.com
     */
    public static LolApi init(final String apiKey) {
        if (instance == null) {
            synchronized (LolApi.class) {
                if (instance == null) {
                    instance = new LolApi(apiKey);
                }
            }
        }
        return instance;
    }

    /**
     * Set the region to be used.
     *
     * @param region - "EUNE","NA", etc.
     */
    public static void setRegion(final String region) {
        if (apiKey == null) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_REGION_PROVIDED);
        }
        retrofitApiEndpoint.setRegion(region);
    }

    /**
     * Retrieve all champions.
     */
    public static ChampionListDto getChampions(final boolean freeToPlay) {
        return retrofitApiClient.getAllChampions(freeToPlay, retrofitApiEndpoint.getRegionEnum().getRegion(), apiKey);
    }

    /**
     * Retrieve all champions.
     */
    public static void getChampions(final boolean freeToPlay, final Callback<ChampionListDto> callback) {
        retrofitApiClient.getAllChampions(freeToPlay, retrofitApiEndpoint.getRegionEnum().getRegion(), apiKey, callback);
    }

    /**
     * Retrieve all champions.
     */
    public static Observable<ChampionListDto> getChampionsRx(final boolean freeToPlay) {
        return retrofitApiClient.getAllChampionsRx(freeToPlay, retrofitApiEndpoint.getRegionEnum().getRegion(), apiKey);
    }

    /**
     * Get champion by his id.
     */
    public static ChampionDto getChampionById(final long championId) {
        return retrofitApiClient.getChampionById(championId, retrofitApiEndpoint.getRegionEnum().getRegion(), apiKey);
    }

    /**
     * Get champion by his id.
     */
    public static void getChampionById(final long championId, Callback<ChampionDto> callback) {
        retrofitApiClient.getChampionById(championId, retrofitApiEndpoint.getRegionEnum().getRegion(), apiKey, callback);
    }

    /**
     * Get champion by his id.
     */
    public static Observable<ChampionDto> getChampionByIdRx(final long championId) {
        return retrofitApiClient.getChampionByIdRx(championId, retrofitApiEndpoint.getRegionEnum().getRegion(), apiKey);
    }

    /**
     * Get last recent played games by summoner id
     */
    public static GameDtoList getRecentGames(final long summonerId) {
        return retrofitApiClient.getRecentGames(retrofitApiEndpoint.getRegionEnum().getRegion(), summonerId, apiKey);
    }

    /**
     * Get last recent played games by summoner id
     */
    public static void getRecentGames(final long summonerId, Callback<GameDtoList> callback) {
        retrofitApiClient.getRecentGames(retrofitApiEndpoint.getRegionEnum().getRegion(), summonerId, apiKey, callback);
    }

    /**
     * Get last recent played games by summoner id
     */
    public static Observable<GameDtoList> getRecentGamesRx(final long summonerId) {
        return retrofitApiClient.getRecentGamesRx(retrofitApiEndpoint.getRegionEnum().getRegion(), summonerId, apiKey);
    }

    /**
     * Get current game by summoner id
     */
    public static CurrentGameInfo getCurrentGame(final long summonerId) {
        return retrofitApiClient.getCurrentGame(retrofitApiEndpoint.getRegionEnum().getPlatformId(), summonerId, apiKey);
    }

    /**
     * Get current game by summoner id
     */
    public static void getCurrentGame(final long summonerId, Callback<CurrentGameInfo> callback) {
        retrofitApiClient.getCurrentGame(retrofitApiEndpoint.getRegionEnum().getPlatformId(), summonerId, apiKey, callback);
    }

    /**
     * Get current game by summoner id
     */
    public static Observable<CurrentGameInfo> getCurrentGameRx(final long summonerId) {
        return retrofitApiClient.getCurrentGameRx(retrofitApiEndpoint.getRegionEnum().getPlatformId(), summonerId, apiKey);
    }

    /**
     * Get list of featured games.
     */
    public static FeaturedGames getFeaturedGames() {
        return retrofitApiClient.getFeaturedGames(apiKey);
    }

    /**
     * Get list of featured games.
     */
    public static void getFeaturedGames(Callback<FeaturedGames> callback) {
        retrofitApiClient.getFeaturedGames(apiKey, callback);
    }

    /**
     * Get list of featured games.
     */
    public static Observable<FeaturedGames> getFeaturedGamesRx() {
        return retrofitApiClient.getFeaturedGamesRx(apiKey);
    }

    /**
     * Get leagues mapped by summoner ID for a given list of summoner IDs.
     */
    public static Map<String, List<LeagueDto>> getLeaguesBySummenrIds(final List<String> summonerIds) {
        if (summonerIds.size() > 10) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_LEAGUES_MORE_TEAMS);
        }
        return retrofitApiClient.getLeaguesBySummenrIds(retrofitApiEndpoint.getRegionEnum().getRegion(), TextUtils.join(",", summonerIds), apiKey);
    }

    /**
     * Get leagues mapped by summoner ID for a given list of summoner IDs.
     */
    public static void getLeaguesBySummenrIds(final List<String> summonerIds, final Callback<Map<String, List<LeagueDto>>> callback) {
        if (summonerIds.size() > 10) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_LEAGUES_MORE_TEAMS);
        }
        retrofitApiClient.getLeaguesBySummenrIds(retrofitApiEndpoint.getRegionEnum().getRegion(), TextUtils.join(",", summonerIds), apiKey, callback);
    }

    /**
     * Get leagues mapped by summoner ID for a given list of summoner IDs.
     */
    public static Observable<Map<String, List<LeagueDto>>> getLeaguesBySummenrIdsRx(final List<String> summonerIds) {
        if (summonerIds.size() > 10) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_LEAGUES_MORE_TEAMS);
        }
        return retrofitApiClient.getLeaguesBySummenrIdsRx(retrofitApiEndpoint.getRegionEnum().getRegion(), TextUtils.join(",", summonerIds), apiKey);
    }

    /**
     * Get league entries mapped by summoner ID for a given list of summoner IDs.
     */
    public static Map<String, List<LeagueDto>> getLeagueEntriesBySummenrIds(final List<String> summonerIds) {
        if (summonerIds.size() > 10) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_LEAGUES_MORE_TEAMS);
        }
        return retrofitApiClient.getLeagueEntriesBySummenrIds(retrofitApiEndpoint.getRegionEnum().getRegion(), TextUtils.join(",", summonerIds), apiKey);
    }

    /**
     * Get leagues mapped by summoner ID for a given list of summoner IDs.
     */
    public static void getLeagueEntriesBySummenrIds(final List<String> summonerIds, final Callback<Map<String, List<LeagueDto>>> callback) {
        if (summonerIds.size() > 10) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_LEAGUES_MORE_TEAMS);
        }
        retrofitApiClient.getLeagueEntriesBySummenrIds(retrofitApiEndpoint.getRegionEnum().getRegion(), TextUtils.join(",", summonerIds), apiKey, callback);
    }

    /**
     * Get leagues mapped by summoner ID for a given list of summoner IDs.
     */
    public static Observable<Map<String, List<LeagueDto>>> getLeagueEntriesBySummenrIdsRx(final List<String> summonerIds) {
        if (summonerIds.size() > 10) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_LEAGUES_MORE_TEAMS);
        }
        return retrofitApiClient.getLeagueEntriesBySummenrIdsRx(retrofitApiEndpoint.getRegionEnum().getRegion(), TextUtils.join(",", summonerIds), apiKey);
    }

    /**
     * Get leagues mapped by team ID for a given list of team IDs.
     */
    public static Map<String, List<LeagueDto>> getLeaguesByTeamIds(final List<String> teamIds) {
        if (teamIds.size() > 10) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_LEAGUES_MORE_TEAMS);
        }
        return retrofitApiClient.getLeaguesByTeamIds(retrofitApiEndpoint.getRegionEnum().getRegion(), TextUtils.join(",", teamIds), apiKey);
    }

    /**
     * Get leagues mapped by team ID for a given list of team IDs.
     */
    public static void getLeaguesByTeamIds(final List<String> teamIds, final Callback<Map<String, List<LeagueDto>>> callback) {
        if (teamIds.size() > 10) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_LEAGUES_MORE_TEAMS);
        }
        retrofitApiClient.getLeaguesByTeamIds(retrofitApiEndpoint.getRegionEnum().getRegion(), TextUtils.join(",", teamIds), apiKey, callback);
    }

    /**
     * Get leagues mapped by team ID for a given list of team IDs.
     */
    public static Observable<Map<String, List<LeagueDto>>> getLeaguesByTeamIdsRx(final List<String> teamIds) {
        if (teamIds.size() > 10) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_LEAGUES_MORE_TEAMS);
        }
        return retrofitApiClient.getLeaguesByTeamIdsRx(retrofitApiEndpoint.getRegionEnum().getRegion(), TextUtils.join(",", teamIds), apiKey);
    }

    /**
     * Get league entries mapped by team ID for a given list of team IDs.
     */
    public static Map<String, List<LeagueDto>> getLeagueEntriesByTeamIds(final List<String> teamIds) {
        if (teamIds.size() > 10) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_LEAGUES_MORE_TEAMS);
        }
        return retrofitApiClient.getLeagueEntriesByTeamIds(retrofitApiEndpoint.getRegionEnum().getRegion(), TextUtils.join(",", teamIds), apiKey);
    }

    /**
     * Get league entries mapped by team ID for a given list of team IDs.
     */
    public static void getLeagueEntriesByTeamIds(final List<String> teamIds, final Callback<Map<String, List<LeagueDto>>> callback) {
        if (teamIds.size() > 10) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_LEAGUES_MORE_TEAMS);
        }
        retrofitApiClient.getLeagueEntriesByTeamIds(retrofitApiEndpoint.getRegionEnum().getRegion(), TextUtils.join(",", teamIds), apiKey, callback);
    }

    /**
     * Get league entries mapped by team ID for a given list of team IDs.
     */
    public static Observable<Map<String, List<LeagueDto>>> getLeagueEntriesByTeamIdsRx(final List<String> teamIds) {
        if (teamIds.size() > 10) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_LEAGUES_MORE_TEAMS);
        }
        return retrofitApiClient.getLeagueEntriesByTeamIdsRx(retrofitApiEndpoint.getRegionEnum().getRegion(), TextUtils.join(",", teamIds), apiKey);
    }

    /**
     * Get challenger tier leagues.
     */
    public static LeagueDto getChallengerLeague(final String queueType) {
        return retrofitApiClient.getChallengerLeague(retrofitApiEndpoint.getRegionEnum().getRegion(), queueType, apiKey);
    }

    /**
     * Get challenger tier leagues.
     */
    public static void getChallengerLeague(final String queueType, final Callback<LeagueDto> callback) {
        retrofitApiClient.getChallengerLeague(retrofitApiEndpoint.getRegionEnum().getRegion(), queueType, apiKey, callback);
    }

    /**
     * Get challenger tier leagues.
     */
    public static Observable<LeagueDto> getChallengerLeagueRx(final String queueType) {
        return retrofitApiClient.getChallengerLeagueRx(retrofitApiEndpoint.getRegionEnum().getRegion(), queueType, apiKey);
    }

    /**
     * Get master tier leagues.
     */
    public static LeagueDto getMasterLeague(final String queueType) {
        return retrofitApiClient.getMasterLeague(retrofitApiEndpoint.getRegionEnum().getRegion(), queueType, apiKey);
    }

    /**
     * Get master tier leagues.
     */
    public static void getMasterLeague(final String queueType, final Callback<LeagueDto> callback) {
        retrofitApiClient.getMasterLeague(retrofitApiEndpoint.getRegionEnum().getRegion(), queueType, apiKey, callback);
    }

    /**
     * Get master tier leagues.
     */
    public static Observable<LeagueDto> getMasterLeagueRx(final String queueType) {
        return retrofitApiClient.getMasterLeagueRx(retrofitApiEndpoint.getRegionEnum().getRegion(), queueType, apiKey);
    }

    /**
     * Retrieves champion list.
     */
    public static com.mobilesolutions.lolapi.models.statics.ChampionListDto getChampionList() {
        return retrofitApiClient.getChampionList(retrofitApiEndpoint.getRegionEnum().getRegion(), apiKey);
    }

    /**
     * Retrieves champion list.
     */
    public static void getChampionList(final Callback<com.mobilesolutions.lolapi.models.statics.ChampionListDto> callback) {
        retrofitApiClient.getChampionList(retrofitApiEndpoint.getRegionEnum().getRegion(), apiKey, callback);
    }

    /**
     * Retrieves champion list.
     */
    public static Observable<com.mobilesolutions.lolapi.models.statics.ChampionListDto> getChampionListRx() {
        return retrofitApiClient.getChampionListRx(retrofitApiEndpoint.getRegionEnum().getRegion(), apiKey);
    }

    /**
     * Retrieves a champion by its id.
     */
    public static com.mobilesolutions.lolapi.models.statics.ChampionDto getChampionDataById(final long id) {
        return retrofitApiClient.getChampionById(retrofitApiEndpoint.getRegionEnum().getRegion(), id, apiKey);
    }

    /**
     * Retrieves a champion by its id.
     */
    public static void getChampionDataById(final long id, final Callback<com.mobilesolutions.lolapi.models.statics.ChampionDto> callback) {
        retrofitApiClient.getChampionById(retrofitApiEndpoint.getRegionEnum().getRegion(), id, apiKey, callback);
    }

    /**
     * Retrieves a champion by its id.
     */
    public static Observable<com.mobilesolutions.lolapi.models.statics.ChampionDto> getChampionDataByIdRx(final long id) {
        return retrofitApiClient.getChampionByIdRx(retrofitApiEndpoint.getRegionEnum().getRegion(), id, apiKey);
    }

}
