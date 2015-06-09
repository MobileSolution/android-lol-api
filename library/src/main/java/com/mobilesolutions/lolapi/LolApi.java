package com.mobilesolutions.lolapi;

import com.google.gson.Gson;
import com.mobilesolutions.lolapi.models.champion.ChampionDto;
import com.mobilesolutions.lolapi.models.champion.ChampionListDto;
import com.mobilesolutions.lolapi.models.currentgame.CurrentGameInfo;
import com.mobilesolutions.lolapi.models.featured.FeaturedGames;
import com.mobilesolutions.lolapi.models.recent.GameDto;
import com.mobilesolutions.lolapi.models.recent.GameDtoList;
import com.mobilesolutions.lolapi.retrofit.RetrofitApiClient;
import com.mobilesolutions.lolapi.retrofit.RetrofitApiEndpoint;
import com.mobilesolutions.lolapi.utls.ErrorConstants;
import com.mobilesolutions.lolapi.utls.RegionsEnum;

import java.util.List;

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
}
