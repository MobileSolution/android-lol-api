package com.mobilesolutions.lolapi.retrofit;

import com.mobilesolutions.lolapi.models.Champion;
import com.mobilesolutions.lolapi.models.Champions;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;
import rx.Observable;

/**
 * Interface that will be used for dynamic proxy.
 * <p/>
 * Created by georgi.eftimov on 08/06/2015.
 */
public interface RetrofitApiClient {

    @GET("/api/lol/{region}/v1.2/champion")
    Champions getAllChampions(@Query("freeToPlay") boolean freeToPlay, @Path("region") String region, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v1.2/champion")
    void getAllChampions(@Query("freeToPlay") boolean freeToPlay, @Path("region") String region, @Query("api_key") String apiKey, final Callback<Champions> callback);

    @GET("/api/lol/{region}/v1.2/champion")
    Observable<Champions> getAllChampionsRx(@Query("freeToPlay") boolean freeToPlay, @Path("region") String region, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v1.2/champion/{champion_id}")
    Champion getChampionById(@Path("champion_id") long championId, @Path("region") String region, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v1.2/champion/{champion_id}")
    void getChampionById(@Path("champion_id") long championId, @Path("region") String region, @Query("api_key") String apiKey, final Callback<Champion> callback);

    @GET("/api/lol/{region}/v1.2/champion/{champion_id}")
    Observable<Champion> getChampionByIdRx(@Path("champion_id") long championId, @Path("region") String region, @Query("api_key") String apiKey);
}
