package com.mobilesolutions.lolapi.retrofit;

import com.mobilesolutions.lolapi.models.champion.ChampionDto;
import com.mobilesolutions.lolapi.models.champion.ChampionListDto;
import com.mobilesolutions.lolapi.models.currentgame.CurrentGameInfo;
import com.mobilesolutions.lolapi.models.featured.FeaturedGames;
import com.mobilesolutions.lolapi.models.league.LeagueDto;
import com.mobilesolutions.lolapi.models.recent.GameDtoList;

import java.util.List;
import java.util.Map;

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

    @GET("/api/lol/{region}/v1.3/game/by-summoner/{summoner_id}/recent")
    GameDtoList getRecentGames(@Path("region") String region, @Path("summoner_id") long summonerId, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v1.3/game/by-summoner/{summoner_id}/recent")
    void getRecentGames(@Path("region") String region, @Path("summoner_id") long summonerId, @Query("api_key") String apiKey, final Callback<GameDtoList> callback);

    @GET("/api/lol/{region}/v1.3/game/by-summoner/{summoner_id}/recent")
    Observable<GameDtoList> getRecentGamesRx(@Path("region") String region, @Path("summoner_id") long summonerId, @Query("api_key") String apiKey);

    @GET("/observer-mode/rest/consumer/getSpectatorGameInfo/{platformId}/{summoner_id}")
    CurrentGameInfo getCurrentGame(@Path("platformId") String platformId, @Path("summoner_id") long summonerId, @Query("api_key") String apiKey);

    @GET("/observer-mode/rest/consumer/getSpectatorGameInfo/{platformId}/{summoner_id}")
    void getCurrentGame(@Path("platformId") String platformId, @Path("summoner_id") long summonerId, @Query("api_key") String apiKey, final Callback<CurrentGameInfo> callback);

    @GET("/observer-mode/rest/consumer/getSpectatorGameInfo/{platformId}/{summoner_id}")
    Observable<CurrentGameInfo> getCurrentGameRx(@Path("platformId") String platformId, @Path("summoner_id") long summonerId, @Query("api_key") String apiKey);

    @GET("/observer-mode/rest/featured")
    FeaturedGames getFeaturedGames(@Query("api_key") String apiKey);

    @GET("/observer-mode/rest/featured")
    void getFeaturedGames(@Query("api_key") String apiKey, final Callback<FeaturedGames> callback);

    @GET("/observer-mode/rest/featured")
    Observable<FeaturedGames> getFeaturedGamesRx(@Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v2.5/league/by-summoner/{summoner_ids}")
    Map<String, List<LeagueDto>> getLeaguesBySummenrIds(@Path("region") String region, @Path("summoner_ids") String summonerIds, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v2.5/league/by-summoner/{summoner_ids}")
    void getLeaguesBySummenrIds(@Path("region") String region, @Path("summoner_ids") String summonerIds, @Query("api_key") String apiKey, final Callback<Map<String, List<LeagueDto>>> callback);

    @GET("/api/lol/{region}/v2.5/league/by-summoner/{summoner_ids}")
    Observable<Map<String, List<LeagueDto>>> getLeaguesBySummenrIdsRx(@Path("region") String region, @Path("summoner_ids") String summonerIds, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v2.5/league/by-summoner/{summoner_ids}/entry")
    Map<String, List<LeagueDto>> getLeagueEntriesBySummenrIds(@Path("region") String region, @Path("summoner_ids") String summonerIds, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v2.5/league/by-summoner/{summoner_ids}/entry")
    void getLeagueEntriesBySummenrIds(@Path("region") String region, @Path("summoner_ids") String summonerIds, @Query("api_key") String apiKey, final Callback<Map<String, List<LeagueDto>>> callback);

    @GET("/api/lol/{region}/v2.5/league/by-summoner/{summoner_ids}/entry")
    Observable<Map<String, List<LeagueDto>>> getLeagueEntriesBySummenrIdsRx(@Path("region") String region, @Path("summoner_ids") String summonerIds, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v2.5/league/by-team/{team_ids}")
    Map<String, List<LeagueDto>> getLeaguesByTeamIds(@Path("region") String region, @Path("team_ids") String teamIds, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v2.5/league/by-team/{team_ids}")
    void getLeaguesByTeamIds(@Path("region") String region, @Path("team_ids") String teamIds, @Query("api_key") String apiKey, final Callback<Map<String, List<LeagueDto>>> callback);

    @GET("/api/lol/{region}/v2.5/league/by-team/{team_ids}")
    Observable<Map<String, List<LeagueDto>>> getLeaguesByTeamIdsRx(@Path("region") String region, @Path("team_ids") String teamIds, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v2.5/league/by-team/{team_ids}/entry")
    Map<String, List<LeagueDto>> getLeagueEntriesByTeamIds(@Path("region") String region, @Path("team_ids") String teamIds, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v2.5/league/by-team/{team_ids}/entry")
    void getLeagueEntriesByTeamIds(@Path("region") String region, @Path("team_ids") String teamIds, @Query("api_key") String apiKey, final Callback<Map<String, List<LeagueDto>>> callback);

    @GET("/api/lol/{region}/v2.5/league/by-team/{team_ids}/entry")
    Observable<Map<String, List<LeagueDto>>> getLeagueEntriesByTeamIdsRx(@Path("region") String region, @Path("team_ids") String teamIds, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v2.5/league/challenger")
    LeagueDto getChallengerLeague(@Path("region") String region, @Query("type") String queue, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v2.5/league/challenger")
    void getChallengerLeague(@Path("region") String region, @Query("type") String queue, @Query("api_key") String apiKey, final Callback<LeagueDto> callback);

    @GET("/api/lol/{region}/v2.5/league/challenger")
    Observable<LeagueDto> getChallengerLeagueRx(@Path("region") String region, @Query("type") String queue, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v2.5/league/master")
    LeagueDto getMasterLeague(@Path("region") String region, @Query("type") String queue, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v2.5/league/master")
    void getMasterLeague(@Path("region") String region, @Query("type") String queue, @Query("api_key") String apiKey, final Callback<LeagueDto> callback);

    @GET("/api/lol/{region}/v2.5/league/master")
    Observable<LeagueDto> getMasterLeagueRx(@Path("region") String region, @Query("type") String queue, @Query("api_key") String apiKey);

}
