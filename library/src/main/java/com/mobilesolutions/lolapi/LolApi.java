package com.mobilesolutions.lolapi;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.mobilesolutions.lolapi.models.champion.ChampionDto;
import com.mobilesolutions.lolapi.models.champion.ChampionListDto;
import com.mobilesolutions.lolapi.models.currentgame.CurrentGameInfo;
import com.mobilesolutions.lolapi.models.featured.FeaturedGames;
import com.mobilesolutions.lolapi.models.league.LeagueDto;
import com.mobilesolutions.lolapi.models.recent.GameDtoList;
import com.mobilesolutions.lolapi.models.status.Shard;
import com.mobilesolutions.lolapi.models.status.ShardStatus;
import com.mobilesolutions.lolapi.retrofit.RetrofitApiClient;
import com.mobilesolutions.lolapi.retrofit.RetrofitApiEndpoint;
import com.mobilesolutions.lolapi.utls.ErrorConstants;
import com.mobilesolutions.lolapi.utls.Region;
import com.squareup.okhttp.Call;

import java.util.List;
import java.util.Map;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.converter.GsonConverter;
import rx.Notification;
import rx.Observable;
import rx.functions.Action0;
import rx.functions.Action1;

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
                .setLogLevel(RestAdapter.LogLevel.FULL)
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
     * Set the region to be used.
     *
     * @param region - "EUNE","NA", etc.
     */
    public static void setRegion(final Region region) {
        if (apiKey == null) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_REGION_PROVIDED);
        }
        retrofitApiEndpoint.setRegion(region.getRegion());
    }

    /**
     * Retrieve all champions.
     */
    public static ChampionListDto getChampions(final boolean freeToPlay) {
        return retrofitApiClient.getAllChampions(freeToPlay, retrofitApiEndpoint.getRegion(), apiKey);
    }

    /**
     * Retrieve all champions.
     */
    public static void getChampions(final boolean freeToPlay, final Callback<ChampionListDto> callback) {
        retrofitApiClient.getAllChampions(freeToPlay, retrofitApiEndpoint.getRegion(), apiKey, callback);
    }

    /**
     * Retrieve all champions.
     */
    public static Observable<ChampionListDto> getChampionsRx(final boolean freeToPlay) {
        return retrofitApiClient.getAllChampionsRx(freeToPlay, retrofitApiEndpoint.getRegion(), apiKey);
    }

    /**
     * Get champion by his id.
     */
    public static ChampionDto getChampionById(final long championId) {
        return retrofitApiClient.getChampionById(championId, retrofitApiEndpoint.getRegion(), apiKey);
    }

    /**
     * Get champion by his id.
     */
    public static void getChampionById(final long championId, Callback<ChampionDto> callback) {
        retrofitApiClient.getChampionById(championId, retrofitApiEndpoint.getRegion(), apiKey, callback);
    }

    /**
     * Get champion by his id.
     */
    public static Observable<ChampionDto> getChampionByIdRx(final long championId) {
        return retrofitApiClient.getChampionByIdRx(championId, retrofitApiEndpoint.getRegion(), apiKey);
    }

    /**
     * Get last recent played games by summoner id
     */
    public static GameDtoList getRecentGames(final long summonerId) {
        return retrofitApiClient.getRecentGames(retrofitApiEndpoint.getRegion(), summonerId, apiKey);
    }

    /**
     * Get last recent played games by summoner id
     */
    public static void getRecentGames(final long summonerId, Callback<GameDtoList> callback) {
        retrofitApiClient.getRecentGames(retrofitApiEndpoint.getRegion(), summonerId, apiKey, callback);
    }

    /**
     * Get last recent played games by summoner id
     */
    public static Observable<GameDtoList> getRecentGamesRx(final long summonerId) {
        return retrofitApiClient.getRecentGamesRx(retrofitApiEndpoint.getRegion(), summonerId, apiKey);
    }

    /**
     * Get current game by summoner id
     */
    public static CurrentGameInfo getCurrentGame(final long summonerId) {
        return retrofitApiClient.getCurrentGame(retrofitApiEndpoint.getPlatformId(), summonerId, apiKey);
    }

    /**
     * Get current game by summoner id
     */
    public static void getCurrentGame(final long summonerId, Callback<CurrentGameInfo> callback) {
        retrofitApiClient.getCurrentGame(retrofitApiEndpoint.getPlatformId(), summonerId, apiKey, callback);
    }

    /**
     * Get current game by summoner id
     */
    public static Observable<CurrentGameInfo> getCurrentGameRx(final long summonerId) {
        return retrofitApiClient.getCurrentGameRx(retrofitApiEndpoint.getPlatformId(), summonerId, apiKey);
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
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_TEN_TEAMS);
        }
        return retrofitApiClient.getLeaguesBySummenrIds(retrofitApiEndpoint.getRegion(), TextUtils.join(",", summonerIds), apiKey);
    }

    /**
     * Get leagues mapped by summoner ID for a given list of summoner IDs.
     */
    public static void getLeaguesBySummenrIds(final List<String> summonerIds, final Callback<Map<String, List<LeagueDto>>> callback) {
        if (summonerIds.size() > 10) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_TEN_TEAMS);
        }
        retrofitApiClient.getLeaguesBySummenrIds(retrofitApiEndpoint.getRegion(), TextUtils.join(",", summonerIds), apiKey, callback);
    }

    /**
     * Get leagues mapped by summoner ID for a given list of summoner IDs.
     */
    public static Observable<Map<String, List<LeagueDto>>> getLeaguesBySummonerIdsRx(final List<String> summonerIds) {
        if (summonerIds.size() > 10) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_TEN_TEAMS);
        }
        return retrofitApiClient.getLeaguesBySummenrIdsRx(retrofitApiEndpoint.getRegion(), TextUtils.join(",", summonerIds), apiKey);
    }

    /**
     * Get league entries mapped by summoner ID for a given list of summoner IDs.
     */
    public static Map<String, List<LeagueDto>> getLeagueEntriesBySummonerIds(final List<String> summonerIds) {
        if (summonerIds.size() > 10) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_TEN_TEAMS);
        }
        return retrofitApiClient.getLeagueEntriesBySummenrIds(retrofitApiEndpoint.getRegion(), TextUtils.join(",", summonerIds), apiKey);
    }

    /**
     * Get leagues mapped by summoner ID for a given list of summoner IDs.
     */
    public static void getLeagueEntriesBySummonerIds(final List<String> summonerIds, final Callback<Map<String, List<LeagueDto>>> callback) {
        if (summonerIds.size() > 10) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_TEN_TEAMS);
        }
        retrofitApiClient.getLeagueEntriesBySummenrIds(retrofitApiEndpoint.getRegion(), TextUtils.join(",", summonerIds), apiKey, callback);
    }

    /**
     * Get leagues mapped by summoner ID for a given list of summoner IDs.
     */
    public static Observable<Map<String, List<LeagueDto>>> getLeagueEntriesBySummenrIdsRx(final List<String> summonerIds) {
        if (summonerIds.size() > 10) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_TEN_TEAMS);
        }
        return retrofitApiClient.getLeagueEntriesBySummenrIdsRx(retrofitApiEndpoint.getRegion(), TextUtils.join(",", summonerIds), apiKey);
    }

    /**
     * Get leagues mapped by team ID for a given list of team IDs.
     */
    public static Map<String, List<LeagueDto>> getLeaguesByTeamIds(final List<String> teamIds) {
        if (teamIds.size() > 10) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_TEN_TEAMS);
        }
        return retrofitApiClient.getLeaguesByTeamIds(retrofitApiEndpoint.getRegion(), TextUtils.join(",", teamIds), apiKey);
    }

    /**
     * Get leagues mapped by team ID for a given list of team IDs.
     */
    public static void getLeaguesByTeamIds(final List<String> teamIds, final Callback<Map<String, List<LeagueDto>>> callback) {
        if (teamIds.size() > 10) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_TEN_TEAMS);
        }
        retrofitApiClient.getLeaguesByTeamIds(retrofitApiEndpoint.getRegion(), TextUtils.join(",", teamIds), apiKey, callback);
    }

    /**
     * Get leagues mapped by team ID for a given list of team IDs.
     */
    public static Observable<Map<String, List<LeagueDto>>> getLeaguesByTeamIdsRx(final List<String> teamIds) {
        if (teamIds.size() > 10) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_TEN_TEAMS);
        }
        return retrofitApiClient.getLeaguesByTeamIdsRx(retrofitApiEndpoint.getRegion(), TextUtils.join(",", teamIds), apiKey);
    }

    /**
     * Get league entries mapped by team ID for a given list of team IDs.
     */
    public static Map<String, List<LeagueDto>> getLeagueEntriesByTeamIds(final List<String> teamIds) {
        if (teamIds.size() > 10) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_TEN_TEAMS);
        }
        return retrofitApiClient.getLeagueEntriesByTeamIds(retrofitApiEndpoint.getRegion(), TextUtils.join(",", teamIds), apiKey);
    }

    /**
     * Get league entries mapped by team ID for a given list of team IDs.
     */
    public static void getLeagueEntriesByTeamIds(final List<String> teamIds, final Callback<Map<String, List<LeagueDto>>> callback) {
        if (teamIds.size() > 10) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_TEN_TEAMS);
        }
        retrofitApiClient.getLeagueEntriesByTeamIds(retrofitApiEndpoint.getRegion(), TextUtils.join(",", teamIds), apiKey, callback);
    }

    /**
     * Get league entries mapped by team ID for a given list of team IDs.
     */
    public static Observable<Map<String, List<LeagueDto>>> getLeagueEntriesByTeamIdsRx(final List<String> teamIds) {
        if (teamIds.size() > 10) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_TEN_TEAMS);
        }
        return retrofitApiClient.getLeagueEntriesByTeamIdsRx(retrofitApiEndpoint.getRegion(), TextUtils.join(",", teamIds), apiKey);
    }

    /**
     * Get challenger tier leagues.
     */
    public static LeagueDto getChallengerLeague(final String queueType) {
        return retrofitApiClient.getChallengerLeague(retrofitApiEndpoint.getRegion(), queueType, apiKey);
    }

    /**
     * Get challenger tier leagues.
     */
    public static void getChallengerLeague(final String queueType, final Callback<LeagueDto> callback) {
        retrofitApiClient.getChallengerLeague(retrofitApiEndpoint.getRegion(), queueType, apiKey, callback);
    }

    /**
     * Get challenger tier leagues.
     */
    public static Observable<LeagueDto> getChallengerLeagueRx(final String queueType) {
        return retrofitApiClient.getChallengerLeagueRx(retrofitApiEndpoint.getRegion(), queueType, apiKey);
    }

    /**
     * Get master tier leagues.
     */
    public static LeagueDto getMasterLeague(final String queueType) {
        return retrofitApiClient.getMasterLeague(retrofitApiEndpoint.getRegion(), queueType, apiKey);
    }

    /**
     * Get master tier leagues.
     */
    public static void getMasterLeague(final String queueType, final Callback<LeagueDto> callback) {
        retrofitApiClient.getMasterLeague(retrofitApiEndpoint.getRegion(), queueType, apiKey, callback);
    }

    /**
     * Get master tier leagues.
     */
    public static Observable<LeagueDto> getMasterLeagueRx(final String queueType) {
        return retrofitApiClient.getMasterLeagueRx(retrofitApiEndpoint.getRegion(), queueType, apiKey);
    }

    /**
     * Get shard list.
     */
    public static List<Shard> getShards() {
        retrofitApiEndpoint.useShardsEndpoint();
        final List<Shard> shards = retrofitApiClient.getShards();
        retrofitApiEndpoint.useRegionEndpoint();
        return shards;
    }

    /**
     * Get shard list.
     */
    public static void getShards(final Callback<List<Shard>> callback) {
        retrofitApiEndpoint.useShardsEndpoint();
        retrofitApiClient.getShards(new Callback<List<Shard>>() {
            @Override
            public void success(List<Shard> shards, Response response) {
                retrofitApiEndpoint.useRegionEndpoint();
                callback.success(shards, response);
            }

            @Override
            public void failure(RetrofitError error) {
                retrofitApiEndpoint.useRegionEndpoint();
                callback.failure(error);
            }
        });
    }

    /**
     * Get shard list.
     */
    public static Observable<List<Shard>> getShardsRx() {
        throw new UnsupportedOperationException(ErrorConstants.ERROR_NO_RX_FOR_SHARDS);
        //retrofitApiEndpoint.useShardsEndpoint();
        //return retrofitApiClient.getShardsRx();
    }

    /**
     * Get shard status. Returns the data available on the status.leagueoflegends.com website for the given region.
     */
    public static ShardStatus getShardStatus() {
        retrofitApiEndpoint.useShardsEndpoint();
        final ShardStatus shardStatus = retrofitApiClient.getShardStatus(retrofitApiEndpoint.getRegion());
        retrofitApiEndpoint.useRegionEndpoint();
        return shardStatus;
    }

    /**
     * Get shard status. Returns the data available on the status.leagueoflegends.com website for the given region.
     */
    public static void getShardStatus(final Callback<ShardStatus> callback) {
        retrofitApiEndpoint.useShardsEndpoint();
        retrofitApiClient.getShardStatus(retrofitApiEndpoint.getRegion(), new Callback<ShardStatus>() {
            @Override
            public void success(ShardStatus shardStatus, Response response) {
                retrofitApiEndpoint.useRegionEndpoint();
                callback.success(shardStatus, response);
            }

            @Override
            public void failure(RetrofitError error) {
                retrofitApiEndpoint.useRegionEndpoint();
                callback.failure(error);

            }
        });
    }

    /**
     * Get shard status. Returns the data available on the status.leagueoflegends.com website for the given region.
     */
    public static Observable<ShardStatus> getShardStatusRx() {
        throw new UnsupportedOperationException(ErrorConstants.ERROR_NO_RX_FOR_SHARDS);
        //retrofitApiEndpoint.useShardsEndpoint();
        //return retrofitApiClient.getShardStatusRx(retrofitApiEndpoint.getRegion());
    }
}
