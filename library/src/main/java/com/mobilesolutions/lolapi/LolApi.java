package com.mobilesolutions.lolapi;

import com.google.gson.Gson;
import com.mobilesolutions.lolapi.models.champion.ChampionDto;
import com.mobilesolutions.lolapi.models.champion.ChampionListDto;
import com.mobilesolutions.lolapi.retrofit.RetrofitApiClient;
import com.mobilesolutions.lolapi.retrofit.RetrofitApiEndpoint;
import com.mobilesolutions.lolapi.utls.ErrorConstants;

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
    public static ChampionListDto getChampions() {
        return retrofitApiClient.getAllChampions(false, retrofitApiEndpoint.getRegion(), apiKey);
    }

    /**
     * Retrieve all champions.
     */
    public static void getChampions(final Callback<ChampionListDto> callback) {
        retrofitApiClient.getAllChampions(false, retrofitApiEndpoint.getRegion(), apiKey, callback);
    }

    /**
     * Retrieve all champions.
     */
    public static Observable<ChampionListDto> getChampionsRx() {
        return retrofitApiClient.getAllChampionsRx(false, retrofitApiEndpoint.getRegion(), apiKey);
    }

    /**
     * Retrieve all champions.
     * That are free to play this week.
     */
    public static ChampionListDto getFreeToPlayChampions() {
        return retrofitApiClient.getAllChampions(true, retrofitApiEndpoint.getRegion(), apiKey);
    }

    /**
     * Retrieve all champions.
     * That are free to play this week.
     */
    public static void getFreeToPlayChampions(final Callback<ChampionListDto> callback) {
        retrofitApiClient.getAllChampions(true, retrofitApiEndpoint.getRegion(), apiKey, callback);
    }

    /**
     * Retrieve all champions.
     * That are free to play this week.
     */
    public static Observable<ChampionListDto> getFreeToPlayChampionsRx() {
        return retrofitApiClient.getAllChampionsRx(true, retrofitApiEndpoint.getRegion(), apiKey);
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
}
