package com.mobilesolutions.lolapi.models.matchhistory;

import com.google.gson.annotations.Expose;
import com.mobilesolutions.lolapi.models.common.Participant;
import com.mobilesolutions.lolapi.models.common.ParticipantIdentity;
import com.mobilesolutions.lolapi.models.statics.ChampionDto;
import com.mobilesolutions.lolapi.models.statics.SummonerSpellDto;

import java.io.Serializable;
import java.util.List;

public class Match implements Serializable {

    @Expose
    private int mapId;
    @Expose
    private long matchCreation;
    @Expose
    private long matchDuration;
    @Expose
    private long matchId;
    @Expose
    private String matchMode;
    @Expose
    private String matchType;
    @Expose
    private String matchVersion;
    @Expose
    private List<ParticipantIdentity> participantIdentities;
    @Expose
    private List<Participant> participants;
    @Expose
    private String platformId;
    @Expose
    private String queueType;
    @Expose
    private String region;
    @Expose
    private String season;
    private ChampionDto champion;
    private SummonerSpellDto spell1;
    private SummonerSpellDto spell2;

    public int getMapId() {
        return mapId;
    }

    public long getMatchCreation() {
        return matchCreation;
    }

    public long getMatchDuration() {
        return matchDuration;
    }

    public long getMatchId() {
        return matchId;
    }

    public String getMatchMode() {
        return matchMode;
    }

    public String getMatchType() {
        return matchType;
    }

    public String getMatchVersion() {
        return matchVersion;
    }

    public List<ParticipantIdentity> getParticipantIdentities() {
        return participantIdentities;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public String getPlatformId() {
        return platformId;
    }

    public String getQueueType() {
        return queueType;
    }

    public String getRegion() {
        return region;
    }

    public String getSeason() {
        return season;
    }

    public void setChampion(ChampionDto champion) {
        this.champion = champion;
    }

    public void setSpell1(SummonerSpellDto spell1) {
        this.spell1 = spell1;
    }

    public void setSpell2(SummonerSpellDto spell2) {
        this.spell2 = spell2;
    }

    public ChampionDto getChampion() {
        return champion;
    }

    public SummonerSpellDto getSpell1() {
        return spell1;
    }

    public SummonerSpellDto getSpell2() {
        return spell2;
    }
}
