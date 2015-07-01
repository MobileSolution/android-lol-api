package com.mobilesolutions.lolapi.retrofit;

import com.mobilesolutions.lolapi.models.champion.ChampionDto;
import com.mobilesolutions.lolapi.models.champion.ChampionListDto;
import com.mobilesolutions.lolapi.models.currentgame.CurrentGameInfo;
import com.mobilesolutions.lolapi.models.featured.FeaturedGames;
import com.mobilesolutions.lolapi.models.league.LeagueDto;
import com.mobilesolutions.lolapi.models.match.MatchDetail;
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
import com.mobilesolutions.lolapi.models.stats.PlayerStatsSummaryListDto;
import com.mobilesolutions.lolapi.models.stats.RankedStatsDto;
import com.mobilesolutions.lolapi.models.status.Shard;
import com.mobilesolutions.lolapi.models.status.ShardStatus;
import com.mobilesolutions.lolapi.models.summoner.MasteryPagesDto;
import com.mobilesolutions.lolapi.models.summoner.RunePagesDto;
import com.mobilesolutions.lolapi.models.summoner.SummonerDto;
import com.mobilesolutions.lolapi.models.team.TeamDto;

import java.util.List;
import java.util.Map;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Headers;
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

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/champion")
    com.mobilesolutions.lolapi.models.statics.ChampionListDto getChampionList(@Path("region") String region, @Query("locale") String locale, @Query("version") String version, @Query("dataById") boolean dataById, @Query("champData") String champData, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/champion")
    void getChampionList(@Path("region") String region, @Query("locale") String locale, @Query("version") String version, @Query("dataById") boolean dataById, @Query("champData") String champData, @Query("api_key") String apiKey, final Callback<com.mobilesolutions.lolapi.models.statics.ChampionListDto> callback);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/champion")
    Observable<com.mobilesolutions.lolapi.models.statics.ChampionListDto> getChampionListRx(@Path("region") String region, @Query("locale") String locale, @Query("version") String version, @Query("dataById") boolean dataById, @Query("champData") String champData, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/champion/{id}")
    com.mobilesolutions.lolapi.models.statics.ChampionDto getChampionById(@Path("region") String region, @Path("id") long id, @Query("champData") String champData, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/champion/{id}")
    void getChampionById(@Path("region") String region, @Path("id") long id, @Query("champData") String champData, @Query("api_key") String apiKey, final Callback<com.mobilesolutions.lolapi.models.statics.ChampionDto> callback);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/champion/{id}")
    Observable<com.mobilesolutions.lolapi.models.statics.ChampionDto> getChampionByIdRx(@Path("region") String region, @Path("id") long id, @Query("champData") String champData, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/champion/{id}")
    com.mobilesolutions.lolapi.models.statics.ChampionDto getChampionById(@Path("region") String region, @Path("id") long id, @Query("locale") String locale, @Query("version") String version, @Query("champData") String champData, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/champion/{id}")
    void getChampionById(@Path("region") String region, @Path("id") long id, @Query("locale") String locale, @Query("version") String version, @Query("champData") String champData, @Query("api_key") String apiKey, final Callback<com.mobilesolutions.lolapi.models.statics.ChampionDto> callback);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/champion/{id}")
    Observable<com.mobilesolutions.lolapi.models.statics.ChampionDto> getChampionByIdRx(@Path("region") String region, @Path("id") long id, @Query("locale") String locale, @Query("version") String version, @Query("champData") String champData, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/item")
    ItemListDto getItemList(@Path("region") String region, @Query("locale") String locale, @Query("version") String version, @Query("itemListData") String itemListData, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/item")
    void getItemList(@Path("region") String region, @Query("locale") String locale, @Query("version") String version, @Query("itemListData") String itemListData, @Query("api_key") String apiKey, final Callback<ItemListDto> callback);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/item")
    Observable<ItemListDto> getItemListRx(@Path("region") String region, @Query("locale") String locale, @Query("version") String version, @Query("itemListData") String itemListData, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/item/{id}")
    ItemDto getItemById(@Path("region") String region, @Path("id") long id, @Query("locale") String locale, @Query("version") String version, @Query("itemListData") String itemListData, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/item/{id}")
    void getItemById(@Path("region") String region, @Path("id") long id, @Query("locale") String locale, @Query("version") String version, @Query("itemListData") String itemListData, @Query("api_key") String apiKey, final Callback<ItemDto> callback);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/item/{id}")
    Observable<ItemDto> getItemByIdRx(@Path("region") String region, @Path("id") long id, @Query("locale") String locale, @Query("version") String version, @Query("itemListData") String itemListData, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/language-strings")
    LanguageStringsDto getLanguageStrings(@Path("region") String region, @Query("locale") String locale, @Query("version") String version, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/language-strings")
    void getLanguageStrings(@Path("region") String region, @Query("locale") String locale, @Query("version") String version, @Query("api_key") String apiKey, final Callback<LanguageStringsDto> callback);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/language-strings")
    Observable<LanguageStringsDto> getLanguageStringsRx(@Path("region") String region, @Query("locale") String locale, @Query("version") String version, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/languages")
    String[] getLanguages(@Path("region") String region, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/languages")
    void getLanguages(@Path("region") String region, @Query("api_key") String apiKey, final Callback<String[]> callback);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/languages")
    Observable<String[]> getLanguagesRx(@Path("region") String region, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/map")
    MapDataDto getMap(@Path("region") String region, @Query("locale") String locale, @Query("version") String version, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/map")
    void getMap(@Path("region") String region, @Query("locale") String locale, @Query("version") String version, @Query("api_key") String apiKey, final Callback<MapDataDto> callback);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/map")
    Observable<MapDataDto> getMapRx(@Path("region") String region, @Query("locale") String locale, @Query("version") String version, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/mastery")
    MasteryListDto getMasteryList(@Path("region") String region, @Query("locale") String locale, @Query("version") String version, @Query("masteryListData") String masteryListData, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/mastery")
    void getMasteryList(@Path("region") String region, @Query("locale") String locale, @Query("version") String version, @Query("masteryListData") String masteryListData, @Query("api_key") String apiKey, final Callback<MasteryListDto> callback);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/mastery")
    Observable<MasteryListDto> getMasteryListRx(@Path("region") String region, @Query("locale") String locale, @Query("version") String version, @Query("masteryListData") String masteryListData, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/mastery/{id}")
    MasteryDto getMasteryById(@Path("region") String region, @Path("id") long id, @Query("locale") String locale, @Query("version") String version, @Query("masteryListData") String masteryListData, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/mastery/{id}")
    void getMasteryById(@Path("region") String region, @Path("id") long id, @Query("locale") String locale, @Query("version") String version, @Query("masteryListData") String masteryListData, @Query("api_key") String apiKey, final Callback<MasteryDto> callback);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/mastery/{id}")
    Observable<MasteryDto> getMasteryByIdRx(@Path("region") String region, @Path("id") long id, @Query("locale") String locale, @Query("version") String version, @Query("masteryListData") String masteryListData, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/realm")
    RealmDto getRealm(@Path("region") String region, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/realm")
    void getRealm(@Path("region") String region, @Query("api_key") String apiKey, final Callback<RealmDto> callback);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/realm")
    Observable<RealmDto> getRealmRx(@Path("region") String region, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/rune")
    RuneList getRuneList(@Path("region") String region, @Query("locale") String locale, @Query("version") String version, @Query("runeListData") String runeListData, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/rune")
    void getRuneList(@Path("region") String region, @Query("locale") String locale, @Query("version") String version, @Query("runeListData") String runeListData, @Query("api_key") String apiKey, final Callback<RuneList> callback);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/rune")
    Observable<RuneList> getRuneListRx(@Path("region") String region, @Query("locale") String locale, @Query("version") String version, @Query("runeListData") String runeListData, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/rune/{id}")
    RuneDto getRuneById(@Path("region") String region, @Path("id") long id, @Query("locale") String locale, @Query("version") String version, @Query("runeListData") String runeListData, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/rune/{id}")
    void getRuneById(@Path("region") String region, @Path("id") long id, @Query("locale") String locale, @Query("version") String version, @Query("runeListData") String runeListData, @Query("api_key") String apiKey, final Callback<RuneDto> callback);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/rune/{id}")
    Observable<RuneDto> getRuneByIdRx(@Path("region") String region, @Path("id") long id, @Query("locale") String locale, @Query("version") String version, @Query("runeListData") String runeListData, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/summoner-spell")
    SummonerSpellListDto getSummonerSpellList(@Path("region") String region, @Query("locale") String locale, @Query("version") String version, @Query("dataById") boolean dataById, @Query("spellData") String spellData, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/summoner-spell")
    void getSummonerSpellList(@Path("region") String region, @Query("locale") String locale, @Query("version") String version, @Query("dataById") boolean dataById, @Query("spellData") String spellData, @Query("api_key") String apiKey, final Callback<SummonerSpellListDto> callback);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/summoner-spell")
    Observable<SummonerSpellListDto> getSummonerSpellListRx(@Path("region") String region, @Query("locale") String locale, @Query("version") String version, @Query("dataById") boolean dataById, @Query("spellData") String spellData, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/summoner-spell/{id}")
    SummonerSpellDto getSummonerSpellById(@Path("region") String region, @Path("id") long id, @Query("locale") String locale, @Query("version") String version, @Query("spellData") String spellData, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/summoner-spell/{id}")
    void getSummonerSpellById(@Path("region") String region, @Path("id") long id, @Query("locale") String locale, @Query("version") String version, @Query("spellData") String spellData, @Query("api_key") String apiKey, final Callback<SummonerSpellDto> callback);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/summoner-spell/{id}")
    Observable<SummonerSpellDto> getSummonerSpellByIdRx(@Path("region") String region, @Path("id") long id, @Query("locale") String locale, @Query("version") String version, @Query("spellData") String spellData, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/versions")
    String[] getVersions(@Path("region") String region, @Query("api_key") String apiKey);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/versions")
    void getVersions(@Path("region") String region, @Query("api_key") String apiKey, final Callback<String[]> callback);

    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000")
    @GET("/api/lol/static-data/{region}/v1.2/versions")
    Observable<String[]> getVersionsRx(@Path("region") String region, @Query("api_key") String apiKey);

    @GET("/shards")
    List<Shard> getShards();

    @GET("/shards")
    void getShards(final Callback<List<Shard>> callback);

    @GET("/shards")
    Observable<List<Shard>> getShardsRx();

    @GET("/shards/{region}")
    ShardStatus getShardStatus(@Path("region") String region);

    @GET("/shards/{region}")
    void getShardStatus(@Path("region") String region, final Callback<ShardStatus> callback);

    @GET("/shards/{region}")
    Observable<ShardStatus> getShardStatusRx(@Path("region") String region);

    @GET("/api/lol/{region}/v1.4/summoner/by-name/{summoner_names}")
    Map<String, SummonerDto> getSummonersByNamesList(@Path("region") String region, @Path("summoner_names") String summonerNames, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v1.4/summoner/by-name/{summoner_names}")
    void getSummonersByNamesList(@Path("region") String region, @Path("summoner_names") String summonerNames, @Query("api_key") String apiKey, final Callback<Map<String, SummonerDto>> callback);

    @GET("/api/lol/{region}/v1.4/summoner/by-name/{summoner_names}")
    Observable<Map<String, SummonerDto>> getSummonersByNamesListRx(@Path("region") String region, @Path("summoner_names") String summonerNames, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v1.4/summoner/{summoner_ids}")
    Map<String, SummonerDto> getSummonersByIds(@Path("region") String region, @Path("summoner_ids") String summonerIds, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v1.4/summoner/{summoner_ids}")
    void getSummonersByIds(@Path("region") String region, @Path("summoner_ids") String summonerIds, @Query("api_key") String apiKey, final Callback<Map<String, SummonerDto>> callback);

    @GET("/api/lol/{region}/v1.4/summoner/{summoner_ids}")
    Observable<Map<String, SummonerDto>> getSummonersByIdsRx(@Path("region") String region, @Path("summoner_ids") String summonerIds, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v1.4/summoner/{summoner_ids}/masteries")
    Map<String, MasteryPagesDto> getMasteryPagesBySummonerIds(@Path("region") String region, @Path("summoner_ids") String summonerIds, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v1.4/summoner/{summoner_ids}/masteries")
    void getMasteryPagesBySummonerIds(@Path("region") String region, @Path("summoner_ids") String summonerIds, @Query("api_key") String apiKey, final Callback<Map<String, MasteryPagesDto>> callback);

    @GET("/api/lol/{region}/v1.4/summoner/{summoner_ids}/masteries")
    Observable<Map<String, MasteryPagesDto>> getMasteryPagesBySummonerIdsRx(@Path("region") String region, @Path("summoner_ids") String summonerIds, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v1.4/summoner/{summoner_ids}/name")
    Map<String, String> getSummonerNameByIds(@Path("region") String region, @Path("summoner_ids") String summonerIds, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v1.4/summoner/{summoner_ids}/name")
    void getSummonerNameByIds(@Path("region") String region, @Path("summoner_ids") String summonerIds, @Query("api_key") String apiKey, final Callback<Map<String, String>> callback);

    @GET("/api/lol/{region}/v1.4/summoner/{summoner_ids}/name")
    Observable<Map<String, String>> getSummonerNameByIdsRx(@Path("region") String region, @Path("summoner_ids") String summonerIds, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v1.4/summoner/{summoner_ids}/runes")
    Map<String, RunePagesDto> getRunePagesBySummonerIds(@Path("region") String region, @Path("summoner_ids") String summonerIds, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v1.4/summoner/{summoner_ids}/runes")
    void getRunePagesBySummonerIds(@Path("region") String region, @Path("summoner_ids") String summonerIds, @Query("api_key") String apiKey, final Callback<Map<String, RunePagesDto>> callback);

    @GET("/api/lol/{region}/v1.4/summoner/{summoner_ids}/runes")
    Observable<Map<String, RunePagesDto>> getRunePagesBySummonerIdsRx(@Path("region") String region, @Path("summoner_ids") String summonerIds, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v2.4/team/by-summoner/{summoner_ids}")
    Map<String, List<TeamDto>> getTeamsBySummonerIds(@Path("region") String region, @Path("summoner_ids") String summonerIds, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v2.4/team/by-summoner/{summoner_ids}")
    void getTeamsBySummonerIds(@Path("region") String region, @Path("summoner_ids") String summonerIds, @Query("api_key") String apiKey, final Callback<Map<String, List<TeamDto>>> callback);

    @GET("/api/lol/{region}/v2.4/team/by-summoner/{summoner_ids}")
    Observable<Map<String, List<TeamDto>>> getTeamsBySummonerIdsRx(@Path("region") String region, @Path("summoner_ids") String summonerIds, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v2.4/team/{team_ids}")
    Map<String, TeamDto> getTeamsByTeamIds(@Path("region") String region, @Path("team_ids") String teamIds, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v2.4/team/{team_ids}")
    void getTeamsByTeamIds(@Path("region") String region, @Path("team_ids") String teamIds, @Query("api_key") String apiKey, final Callback<Map<String, TeamDto>> callback);

    @GET("/api/lol/{region}/v2.4/team/{team_ids}")
    Observable<Map<String, TeamDto>> getTeamsByTeamIdsRx(@Path("region") String region, @Path("team_ids") String teamIds, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v2.2/matchhistory/{summoner_id}")
    MatchSummary getMatchHistoryBySummonerId(@Path("region") String region, @Path("summoner_id") long summonerId, @Query("beginIndex") int beginIndex, @Query("endIndex") int endIndex, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v2.2/matchhistory/{summoner_id}")
    void getMatchHistoryBySummonerId(@Path("region") String region, @Path("summoner_id") long summonerId, @Query("beginIndex") int beginIndex, @Query("endIndex") int endIndex, @Query("api_key") String apiKey, final Callback<MatchSummary> callback);

    @GET("/api/lol/{region}/v2.2/matchhistory/{summoner_id}")
    Observable<MatchSummary> getMatchHistoryBySummonerIdRx(@Path("region") String region, @Path("summoner_id") long summonerId, @Query("beginIndex") int beginIndex, @Query("endIndex") int endIndex, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v1.3/stats/by-summoner/{summoner_id}/ranked")
    RankedStatsDto getRankedStatsBySummnoerId(@Path("region") String region, @Path("summoner_id") long summonerId, @Query("season") String season, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v1.3/stats/by-summoner/{summoner_id}/ranked")
    void getRankedStatsBySummnoerId(@Path("region") String region, @Path("summoner_id") long summonerId, @Query("season") String season, @Query("api_key") String apiKey, final Callback<RankedStatsDto> callback);

    @GET("/api/lol/{region}/v1.3/stats/by-summoner/{summoner_id}/ranked")
    Observable<RankedStatsDto> getRankedStatsBySummnoerIdRx(@Path("region") String region, @Path("summoner_id") long summonerId, @Query("season") String season, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v1.3/stats/by-summoner/{summoner_id}/summary")
    PlayerStatsSummaryListDto getStatsSummariesBySummonerId(@Path("region") String region, @Path("summoner_id") long summonerId, @Query("season") String season, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v1.3/stats/by-summoner/{summoner_id}/summary")
    void getStatsSummariesBySummonerId(@Path("region") String region, @Path("summoner_id") long summonerId, @Query("season") String season, @Query("api_key") String apiKey, final Callback<PlayerStatsSummaryListDto> callback);

    @GET("/api/lol/{region}/v1.3/stats/by-summoner/{summoner_id}/summary")
    Observable<PlayerStatsSummaryListDto> getStatsSummariesBySummonerIdRx(@Path("region") String region, @Path("summoner_id") long summonerId, @Query("season") String season, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v2.2/match/{match_id}")
    MatchDetail getMatchByMatchId(@Path("region") String region, @Path("match_id") long matchId, @Query("includeTimeline") boolean includeTimeline, @Query("api_key") String apiKey);

    @GET("/api/lol/{region}/v2.2/match/{match_id}")
    void getMatchByMatchId(@Path("region") String region, @Path("match_id") long matchId, @Query("includeTimeline") boolean includeTimeline, @Query("api_key") String apiKey, final Callback<MatchDetail> callback);

    @GET("/api/lol/{region}/v2.2/match/{match_id}")
    Observable<MatchDetail> getMatchByMatchIdRx(@Path("region") String region, @Path("match_id") long matchId, @Query("includeTimeline") boolean includeTimeline, @Query("api_key") String apiKey);

}

