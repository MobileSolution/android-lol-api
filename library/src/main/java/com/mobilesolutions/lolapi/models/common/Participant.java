package com.mobilesolutions.lolapi.models.common;

import com.google.gson.annotations.Expose;
import com.mobilesolutions.lolapi.models.common.ParticipantStats;
import com.mobilesolutions.lolapi.models.common.ParticipantTimeline;
import com.mobilesolutions.lolapi.models.statics.ChampionDto;
import com.mobilesolutions.lolapi.models.statics.SummonerSpellDto;

import java.io.Serializable;
import java.util.List;

public class Participant implements Serializable {

    @Expose
    private int championId;
    @Expose
    private String highestAchievedSeasonTier;
    @Expose
    private List<Mastery> masteries;
    @Expose
    private int participantId;
    @Expose
    private List<Rune> runes;
    @Expose
    private int spell1Id;
    @Expose
    private int spell2Id;
    @Expose
    private ParticipantStats stats;
    @Expose
    private int teamId;
    @Expose
    private ParticipantTimeline timeline;
    private ChampionDto champion;
    private SummonerSpellDto spell1;
    private SummonerSpellDto spell2;

    public int getChampionId() {
        return championId;
    }

    public String getHighestAchievedSeasonTier() {
        return highestAchievedSeasonTier;
    }

    public List<Mastery> getMasteries() {
        return masteries;
    }

    public int getParticipantId() {
        return participantId;
    }

    public List<Rune> getRunes() {
        return runes;
    }

    public int getSpell1Id() {
        return spell1Id;
    }

    public int getSpell2Id() {
        return spell2Id;
    }

    public ParticipantStats getStats() {
        return stats;
    }

    public int getTeamId() {
        return teamId;
    }

    public ParticipantTimeline getTimeline() {
        return timeline;
    }

    public ChampionDto getChampion() {
        return champion;
    }

    public void setChampion(ChampionDto champion) {
        this.champion = champion;
    }

    public SummonerSpellDto getSpell1() {
        return spell1;
    }

    public void setSpell1(SummonerSpellDto spell1) {
        this.spell1 = spell1;
    }

    public SummonerSpellDto getSpell2() {
        return spell2;
    }

    public void setSpell2(SummonerSpellDto spell2) {
        this.spell2 = spell2;
    }
}
