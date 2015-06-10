package com.mobilesolutions.lolapi;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.mobilesolutions.lolapi.models.champion.ChampionDto;
import com.mobilesolutions.lolapi.models.champion.ChampionListDto;
import com.mobilesolutions.lolapi.models.currentgame.CurrentGameInfo;
import com.mobilesolutions.lolapi.models.featured.FeaturedGames;
import com.mobilesolutions.lolapi.models.league.LeagueDto;
import com.mobilesolutions.lolapi.models.matchhistory.Match;
import com.mobilesolutions.lolapi.models.matchhistory.MatchSummary;
import com.mobilesolutions.lolapi.models.recent.GameDtoList;
import com.mobilesolutions.lolapi.models.statics.ItemDto;
import com.mobilesolutions.lolapi.models.statics.ItemListDto;
import com.mobilesolutions.lolapi.models.statics.LanguageStringsDto;
import com.mobilesolutions.lolapi.models.statics.MapDataDto;
import com.mobilesolutions.lolapi.models.statics.MasteryDto;
import com.mobilesolutions.lolapi.models.statics.MasteryListDto;
import com.mobilesolutions.lolapi.models.statics.RealmDto;
import com.mobilesolutions.lolapi.models.statics.RuneDto;
import com.mobilesolutions.lolapi.models.statics.RuneList;
import com.mobilesolutions.lolapi.models.statics.SummonerSpellDto;
import com.mobilesolutions.lolapi.models.statics.SummonerSpellListDto;
import com.mobilesolutions.lolapi.models.status.Shard;
import com.mobilesolutions.lolapi.models.status.ShardStatus;
import com.mobilesolutions.lolapi.models.summoner.MasteryPagesDto;
import com.mobilesolutions.lolapi.models.summoner.RunePagesDto;
import com.mobilesolutions.lolapi.models.summoner.SummonerDto;
import com.mobilesolutions.lolapi.models.team.TeamDto;
import com.mobilesolutions.lolapi.retrofit.RetrofitApiClient;
import com.mobilesolutions.lolapi.retrofit.RetrofitApiEndpoint;
import com.mobilesolutions.lolapi.utls.ErrorConstants;
import com.mobilesolutions.lolapi.utls.Region;

import java.util.List;
import java.util.Map;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
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

    /**
     * Retrieves champion list.
     */
    public static com.mobilesolutions.lolapi.models.statics.ChampionListDto getChampionList() {
        return retrofitApiClient.getChampionList(retrofitApiEndpoint.getRegion(), apiKey);
    }

    /**
     * Retrieves champion list.
     */
    public static void getChampionList(final Callback<com.mobilesolutions.lolapi.models.statics.ChampionListDto> callback) {
        retrofitApiClient.getChampionList(retrofitApiEndpoint.getRegion(), apiKey, callback);
    }

    /**
     * Retrieves champion list.
     */
    public static Observable<com.mobilesolutions.lolapi.models.statics.ChampionListDto> getChampionListRx() {
        return retrofitApiClient.getChampionListRx(retrofitApiEndpoint.getRegion(), apiKey);
    }

    /**
     * Retrieves a champion by its id.
     */
    public static com.mobilesolutions.lolapi.models.statics.ChampionDto getChampionDataById(final long id) {
        return retrofitApiClient.getChampionById(retrofitApiEndpoint.getRegion(), id, apiKey);
    }

    /**
     * Retrieves a champion by its id.
     */
    public static void getChampionDataById(final long id, final Callback<com.mobilesolutions.lolapi.models.statics.ChampionDto> callback) {
        retrofitApiClient.getChampionById(retrofitApiEndpoint.getRegion(), id, apiKey, callback);
    }

    /**
     * Retrieves a champion by its id.
     */
    public static Observable<com.mobilesolutions.lolapi.models.statics.ChampionDto> getChampionDataByIdRx(final long id) {
        return retrofitApiClient.getChampionByIdRx(retrofitApiEndpoint.getRegion(), id, apiKey);
    }

    /**
     * Retrieves item list
     */
    public static ItemListDto getItemList() {
        return retrofitApiClient.getItemList(retrofitApiEndpoint.getRegion(), apiKey);
    }

    /**
     * Retrieves item list
     */
    public static void getItemList(final Callback<ItemListDto> callback) {
        retrofitApiClient.getItemList(retrofitApiEndpoint.getRegion(), apiKey, callback);
    }

    /**
     * Retrieves item list
     */
    public static Observable<ItemListDto> getItemListRx() {
        return retrofitApiClient.getItemListRx(retrofitApiEndpoint.getRegion(), apiKey);
    }

    /**
     * Retrieves item by its unique id.
     */
    public static ItemDto getItemById(final long id) {
        return retrofitApiClient.getItemById(retrofitApiEndpoint.getRegion(), id, apiKey);
    }

    /**
     * Retrieves item by its unique id.
     */
    public static void getItemById(final long id, final Callback<ItemDto> callback) {
        retrofitApiClient.getItemById(retrofitApiEndpoint.getRegion(), id, apiKey, callback);
    }

    /**
     * Retrieves item by its unique id.
     */
    public static Observable<ItemDto> getItemByIdRx(final long id) {
        return retrofitApiClient.getItemByIdRx(retrofitApiEndpoint.getRegion(), id, apiKey);
    }

    /**
     * Retrieve language strings data.
     */
    public static LanguageStringsDto getLanguageStrings() {
        return retrofitApiClient.getLanguageStrings(retrofitApiEndpoint.getRegion(), apiKey);
    }

    /**
     * Retrieve language strings data.
     */
    public static void getLanguageStrings(final Callback<LanguageStringsDto> callback) {
        retrofitApiClient.getLanguageStrings(retrofitApiEndpoint.getRegion(), apiKey, callback);
    }

    /**
     * Retrieve language strings data.
     */
    public static Observable<LanguageStringsDto> getLanguageStringsRx() {
        return retrofitApiClient.getLanguageStringsRx(retrofitApiEndpoint.getRegion(), apiKey);
    }

    /**
     * Retrieve supported languages data.
     */
    public static String[] getLanguages() {
        return retrofitApiClient.getLanguages(retrofitApiEndpoint.getRegion(), apiKey);
    }

    /**
     * Retrieve supported languages data.
     */
    public static void getLanguages(final Callback<String[]> callback) {
        retrofitApiClient.getLanguages(retrofitApiEndpoint.getRegion(), apiKey, callback);
    }

    /**
     * Retrieve supported languages data.
     */
    public static Observable<String[]> getLanguagesRx() {
        return retrofitApiClient.getLanguagesRx(retrofitApiEndpoint.getRegion(), apiKey);
    }

    /**
     * Retrieve map data.
     */
    public static MapDataDto getMap() {
        return retrofitApiClient.getMap(retrofitApiEndpoint.getRegion(), apiKey);
    }

    /**
     * Retrieve map data.
     */
    public static void getMap(final Callback<MapDataDto> callback) {
        retrofitApiClient.getMap(retrofitApiEndpoint.getRegion(), apiKey, callback);
    }

    /**
     * Retrieve map data.
     */
    public static Observable<MapDataDto> getMapRx() {
        return retrofitApiClient.getMapRx(retrofitApiEndpoint.getRegion(), apiKey);
    }

    /**
     * Retrieves mastery list.
     */
    public static MasteryListDto getMasteryList() {
        return retrofitApiClient.getMasteryList(retrofitApiEndpoint.getRegion(), apiKey);
    }

    /**
     * Retrieves mastery list.
     */
    public static void getMasteryList(final Callback<MasteryListDto> callback) {
        retrofitApiClient.getMasteryList(retrofitApiEndpoint.getRegion(), apiKey, callback);
    }

    /**
     * Retrieves mastery list.
     */
    public static Observable<MasteryListDto> getMasteryListRx() {
        return retrofitApiClient.getMasteryListRx(retrofitApiEndpoint.getRegion(), apiKey);
    }

    /**
     * Retrieves mastery item by its unique id.
     */
    public static MasteryDto getMasteryById(final long id) {
        return retrofitApiClient.getMasteryById(retrofitApiEndpoint.getRegion(), id, apiKey);
    }

    /**
     * Retrieves mastery item by its unique id.
     */
    public static void getMasteryById(final long id, final Callback<MasteryDto> callback) {
        retrofitApiClient.getMasteryById(retrofitApiEndpoint.getRegion(), id, apiKey, callback);
    }

    /**
     * Retrieves mastery item by its unique id.
     */
    public static Observable<MasteryDto> getMasteryByIdRx(final long id) {
        return retrofitApiClient.getMasteryByIdRx(retrofitApiEndpoint.getRegion(), id, apiKey);
    }

    /**
     * Retrieve realm data.
     */
    public static RealmDto getRealm() {
        return retrofitApiClient.getRealm(retrofitApiEndpoint.getRegion(), apiKey);
    }

    /**
     * Retrieve realm data.
     */
    public static void getRealm(final Callback<RealmDto> callback) {
        retrofitApiClient.getRealm(retrofitApiEndpoint.getRegion(), apiKey, callback);
    }

    /**
     * Retrieve realm data.
     */
    public static Observable<RealmDto> getRealmRx() {
        return retrofitApiClient.getRealmRx(retrofitApiEndpoint.getRegion(), apiKey);
    }


    /**
     * Retrieves rune list.
     */
    public static RuneList getRuneList() {
        return retrofitApiClient.getRuneList(retrofitApiEndpoint.getRegion(), apiKey);
    }

    /**
     * Retrieves rune list.
     */
    public static void getRuneList(final Callback<RuneList> callback) {
        retrofitApiClient.getRuneList(retrofitApiEndpoint.getRegion(), apiKey, callback);
    }

    /**
     * Retrieves rune list.
     */
    public static Observable<RuneList> getRuneListRx() {
        return retrofitApiClient.getRuneListRx(retrofitApiEndpoint.getRegion(), apiKey);
    }

    /**
     * Retrieves rune by its unique id.
     */
    public static RuneDto getRuneById(final long id) {
        return retrofitApiClient.getRuneById(retrofitApiEndpoint.getRegion(), id, apiKey);
    }

    /**
     * Retrieves rune by its unique id.
     */
    public static void getRuneById(final long id, final Callback<RuneDto> callback) {
        retrofitApiClient.getRuneById(retrofitApiEndpoint.getRegion(), id, apiKey, callback);
    }

    /**
     * Retrieves rune by its unique id.
     */
    public static Observable<RuneDto> getRuneByIdRx(final long id) {
        return retrofitApiClient.getRuneByIdRx(retrofitApiEndpoint.getRegion(), id, apiKey);
    }

    /**
     * Retrieves summoner spell list.
     */
    public static SummonerSpellListDto getSummonerSpellList() {
        return retrofitApiClient.getSummonerSpellList(retrofitApiEndpoint.getRegion(), apiKey);
    }

    /**
     * Retrieves summoner spell list.
     */
    public static void getSummonerSpellList(final Callback<SummonerSpellListDto> callback) {
        retrofitApiClient.getSummonerSpellList(retrofitApiEndpoint.getRegion(), apiKey, callback);
    }

    /**
     * Retrieves summoner spell list.
     */
    public static Observable<SummonerSpellListDto> getSummonerSpellListRx() {
        return retrofitApiClient.getSummonerSpellListRx(retrofitApiEndpoint.getRegion(), apiKey);
    }

    /**
     * Retrieves summoner spell by its unique id.
     */
    public static SummonerSpellDto getSummonerSpellById(final long id) {
        return retrofitApiClient.getSummonerSpellById(retrofitApiEndpoint.getRegion(), id, apiKey);
    }

    /**
     * Retrieves summoner spell by its unique id.
     */
    public static void getSummonerSpellById(final long id, final Callback<SummonerSpellDto> callback) {
        retrofitApiClient.getSummonerSpellById(retrofitApiEndpoint.getRegion(), id, apiKey, callback);
    }

    /**
     * Retrieves summoner spell by its unique id.
     */
    public static Observable<SummonerSpellDto> getSummonerSpellByIdRx(final long id) {
        return retrofitApiClient.getSummonerSpellByIdRx(retrofitApiEndpoint.getRegion(), id, apiKey);
    }

    /**
     * Retrieve version data.
     */
    public static String[] getVersions() {
        return retrofitApiClient.getVersions(retrofitApiEndpoint.getRegion(), apiKey);
    }

    /**
     * Retrieve version data.
     */
    public static void getVersions(final Callback<String[]> callback) {
        retrofitApiClient.getVersions(retrofitApiEndpoint.getRegion(), apiKey, callback);
    }

    /**
     * Retrieve version data.
     */
    public static Observable<String[]> getVersionsRx() {
        return retrofitApiClient.getVersionsRx(retrofitApiEndpoint.getRegion(), apiKey);
    }

    /**
     * Get summoner objects mapped by standardized summoner name for a given list of summoner names.
     */
    public static Map<String, SummonerDto> getSummonersByNamesList(final List<String> summonerNames) {
        if (summonerNames.size() > 40) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_FOURTY_NAMES);
        }
        return retrofitApiClient.getSummonersByNamesList(retrofitApiEndpoint.getRegion(), TextUtils.join(",", summonerNames), apiKey);
    }

    /**
     * Get summoner objects mapped by standardized summoner name for a given list of summoner names.
     */
    public static void getSummonersByNamesList(final List<String> summonerNames, final Callback<Map<String, SummonerDto>> callback) {
        if (summonerNames.size() > 40) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_FOURTY_NAMES);
        }
        retrofitApiClient.getSummonersByNamesList(retrofitApiEndpoint.getRegion(), TextUtils.join(",", summonerNames), apiKey, callback);
    }

    /**
     * Get summoner objects mapped by standardized summoner name for a given list of summoner names.
     */
    public static Observable<Map<String, SummonerDto>> getSummonersByNamesListRx(final List<String> summonerNames) {
        if (summonerNames.size() > 40) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_FOURTY_NAMES);
        }
        return retrofitApiClient.getSummonersByNamesListRx(retrofitApiEndpoint.getRegion(), TextUtils.join(",", summonerNames), apiKey);
    }

    /**
     * Get summoner objects mapped by summoner ID for a given list of summoner IDs.
     */
    public static Map<String, SummonerDto> getSummonersByIds(final List<String> summonerIds) {
        if (summonerIds.size() > 40) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_FOURTY_NAMES);
        }
        return retrofitApiClient.getSummonersByIds(retrofitApiEndpoint.getRegion(), TextUtils.join(",", summonerIds), apiKey);
    }

    /**
     * Get summoner objects mapped by summoner ID for a given list of summoner IDs.
     */
    public static void getSummonersByIds(final List<String> summonerIds, final Callback<Map<String, SummonerDto>> callback) {
        if (summonerIds.size() > 40) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_FOURTY_NAMES);
        }
        retrofitApiClient.getSummonersByIds(retrofitApiEndpoint.getRegion(), TextUtils.join(",", summonerIds), apiKey, callback);
    }

    /**
     * Get summoner objects mapped by summoner ID for a given list of summoner IDs.
     */
    public static Observable<Map<String, SummonerDto>> getSummonersByIdsRx(final List<String> summonerIds) {
        if (summonerIds.size() > 40) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_FOURTY_NAMES);
        }
        return retrofitApiClient.getSummonersByIdsRx(retrofitApiEndpoint.getRegion(), TextUtils.join(",", summonerIds), apiKey);
    }

    /**
     * Get mastery pages mapped by summoner ID for a given list of summoner IDs
     */
    public static Map<String, MasteryPagesDto> getMasteryPagesBySummonerIds(final List<String> summonerIds) {
        if (summonerIds.size() > 40) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_FOURTY_NAMES);
        }
        return retrofitApiClient.getMasteryPagesBySummonerIds(retrofitApiEndpoint.getRegion(), TextUtils.join(",", summonerIds), apiKey);
    }

    /**
     * Get mastery pages mapped by summoner ID for a given list of summoner IDs
     */
    public static void getMasteryPagesBySummonerIds(final List<String> summonerIds, final Callback<Map<String, MasteryPagesDto>> callback) {
        if (summonerIds.size() > 40) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_FOURTY_NAMES);
        }
        retrofitApiClient.getMasteryPagesBySummonerIds(retrofitApiEndpoint.getRegion(), TextUtils.join(",", summonerIds), apiKey, callback);
    }

    /**
     * Get mastery pages mapped by summoner ID for a given list of summoner IDs
     */
    public static Observable<Map<String, MasteryPagesDto>> getMasteryPagesBySummonerIdsRx(final List<String> summonerIds) {
        if (summonerIds.size() > 40) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_FOURTY_NAMES);
        }
        return retrofitApiClient.getMasteryPagesBySummonerIdsRx(retrofitApiEndpoint.getRegion(), TextUtils.join(",", summonerIds), apiKey);
    }

    /**
     * Get summoner names mapped by summoner ID for a given list of summoner IDs.
     */
    public static Map<String, String> getSummonerNameByIds(final List<String> summonerIds) {
        if (summonerIds.size() > 40) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_FOURTY_NAMES);
        }
        return retrofitApiClient.getSummonerNameByIds(retrofitApiEndpoint.getRegion(), TextUtils.join(",", summonerIds), apiKey);
    }

    /**
     * Get summoner names mapped by summoner ID for a given list of summoner IDs.
     */
    public static void getSummonerNameByIds(final List<String> summonerIds, final Callback<Map<String, String>> callback) {
        if (summonerIds.size() > 40) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_FOURTY_NAMES);
        }
        retrofitApiClient.getSummonerNameByIds(retrofitApiEndpoint.getRegion(), TextUtils.join(",", summonerIds), apiKey, callback);
    }

    /**
     * Get summoner names mapped by summoner ID for a given list of summoner IDs.
     */
    public static Observable<Map<String, String>> getSummonerNameByIdsRx(final List<String> summonerIds) {
        if (summonerIds.size() > 40) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_FOURTY_NAMES);
        }
        return retrofitApiClient.getSummonerNameByIdsRx(retrofitApiEndpoint.getRegion(), TextUtils.join(",", summonerIds), apiKey);
    }

    /**
     * Get rune pages mapped by summoner ID for a given list of summoner IDs.
     */
    public static Map<String, RunePagesDto> getRunePagesBySummonerIds(final List<String> summonerIds) {
        if (summonerIds.size() > 40) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_FOURTY_NAMES);
        }
        return retrofitApiClient.getRunePagesBySummonerIds(retrofitApiEndpoint.getRegion(), TextUtils.join(",", summonerIds), apiKey);
    }

    /**
     * Get rune pages mapped by summoner ID for a given list of summoner IDs.
     */
    public static void getRunePagesBySummonerIds(final List<String> summonerIds, final Callback<Map<String, RunePagesDto>> callback) {
        if (summonerIds.size() > 40) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_FOURTY_NAMES);
        }
        retrofitApiClient.getRunePagesBySummonerIds(retrofitApiEndpoint.getRegion(), TextUtils.join(",", summonerIds), apiKey, callback);
    }

    /**
     * Get rune pages mapped by summoner ID for a given list of summoner IDs.
     */
    public static Observable<Map<String, RunePagesDto>> getRunePagesBySummonerIdsRx(final List<String> summonerIds) {
        if (summonerIds.size() > 40) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_FOURTY_NAMES);
        }
        return retrofitApiClient.getRunePagesBySummonerIdsRx(retrofitApiEndpoint.getRegion(), TextUtils.join(",", summonerIds), apiKey);
    }

    /**
     * Get teams mapped by summoner ID for a given list of summoner IDs.
     */
    public static Map<String, List<TeamDto>> getTeamsBySummonerIds(final List<String> summonerIds) {
        if (summonerIds.size() > 10) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_TEN_SUMMONERS);
        }
        return retrofitApiClient.getTeamsBySummonerIds(retrofitApiEndpoint.getRegion(), TextUtils.join(",", summonerIds), apiKey);
    }

    /**
     * Get teams mapped by summoner ID for a given list of summoner IDs.
     */
    public static void getTeamsBySummonerIds(final List<String> summonerIds, final Callback<Map<String, List<TeamDto>>> callback) {
        if (summonerIds.size() > 10) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_TEN_SUMMONERS);
        }
        retrofitApiClient.getTeamsBySummonerIds(retrofitApiEndpoint.getRegion(), TextUtils.join(",", summonerIds), apiKey, callback);
    }

    /**
     * Get teams mapped by summoner ID for a given list of summoner IDs.
     */
    public static Observable<Map<String, List<TeamDto>>> getTeamsBySummonerIdsRx(final List<String> summonerIds) {
        if (summonerIds.size() > 10) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_TEN_SUMMONERS);
        }
        return retrofitApiClient.getTeamsBySummonerIdsRx(retrofitApiEndpoint.getRegion(), TextUtils.join(",", summonerIds), apiKey);
    }

    /**
     * Get teams mapped by team ID for a given list of team IDs.
     */
    public static Map<String, TeamDto> getTeamsByTeamIds(final List<String> summonerIds) {
        if (summonerIds.size() > 10) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_TEN_SUMMONERS);
        }
        return retrofitApiClient.getTeamsByTeamIds(retrofitApiEndpoint.getRegion(), TextUtils.join(",", summonerIds), apiKey);
    }

    /**
     * Get teams mapped by team ID for a given list of team IDs.
     */
    public static void getTeamsByTeamIds(final List<String> summonerIds, final Callback<Map<String, TeamDto>> callback) {
        if (summonerIds.size() > 10) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_TEN_SUMMONERS);
        }
        retrofitApiClient.getTeamsByTeamIds(retrofitApiEndpoint.getRegion(), TextUtils.join(",", summonerIds), apiKey, callback);
    }

    /**
     * Get teams mapped by team ID for a given list of team IDs.
     */
    public static Observable<Map<String, TeamDto>> getTeamsByTeamIdsRx(final List<String> summonerIds) {
        if (summonerIds.size() > 10) {
            throw new IllegalArgumentException(ErrorConstants.ERROR_NO_MORE_THAN_TEN_SUMMONERS);
        }
        return retrofitApiClient.getTeamsByTeamIdsRx(retrofitApiEndpoint.getRegion(), TextUtils.join(",", summonerIds), apiKey);
    }

    /**
     * Retrieve match history by summoner ID.
     */
    public static MatchSummary getMatchHistoryBySummonerId(final long summonerId) {
        return retrofitApiClient.getMatchHistoryBySummonerId(retrofitApiEndpoint.getRegion(), summonerId, apiKey);
    }

    /**
     * Retrieve match history by summoner ID.
     */
    public static void getMatchHistoryBySummonerId(final long summonerId, final Callback<MatchSummary> callback) {
        retrofitApiClient.getMatchHistoryBySummonerId(retrofitApiEndpoint.getRegion(), summonerId, apiKey, callback);
    }

    /**
     * Retrieve match history by summoner ID.
     */
    public static Observable<MatchSummary> getMatchHistoryBySummonerIdRx(final long summonerId) {
        return retrofitApiClient.getMatchHistoryBySummonerIdRx(retrofitApiEndpoint.getRegion(), summonerId, apiKey);
    }
}
