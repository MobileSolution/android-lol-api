package com.mobilesolutions.lolapi.retrofit;

import com.mobilesolutions.lolapi.models.champion.ChampionDto;
import com.mobilesolutions.lolapi.models.champion.ChampionListDto;

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
    ChampionListDto getAllChampions(@Query("freeToPlay") boolean freeToPlay, @Path("region") String region, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v1.2/champion")
    void getAllChampions(@Query("freeToPlay") boolean freeToPlay, @Path("region") String region, @Query("api_key") String apiKey, final Callback<ChampionListDto> callback);

    @GET("/api/lol/{region}/v1.2/champion")
    Observable<ChampionListDto> getAllChampionsRx(@Query("freeToPlay") boolean freeToPlay, @Path("region") String region, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v1.2/champion/{champion_id}")
    ChampionDto getChampionById(@Path("champion_id") long championId, @Path("region") String region, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v1.2/champion/{champion_id}")
    void getChampionById(@Path("champion_id") long championId, @Path("region") String region, @Query("api_key") String apiKey, final Callback<ChampionDto> callback);

    @GET("/api/lol/{region}/v1.2/champion/{champion_id}")
    Observable<ChampionDto> getChampionByIdRx(@Path("champion_id") long championId, @Path("region") String region, @Query("api_key") String apiKey);
}
