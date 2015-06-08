package com.mobilesolutions.lolapi.models;

import com.google.gson.annotations.Expose;

import java.util.List;

public class CurrentGameParticipant {

    @Expose
    private boolean bot;
    @Expose
    private long championId;
    @Expose
    private List<Mastery> masteries;
    @Expose
    private long profileIconId;
    @Expose
    private List<Rune> runes;
    @Expose
    private long spell1Id;
    @Expose
    private long spell2Id;
    @Expose
    private long summonerId;
    @Expose
    private String summonerName;
    @Expose
    private long teamId;

    public boolean isBot() {
        return bot;
    }

    public long getChampionId() {
        return championId;
    }

    public List<Mastery> getMasteries() {
        return masteries;
    }

    public long getProfileIconId() {
        return profileIconId;
    }

    public List<Rune> getRunes() {
        return runes;
    }

    public long getSpell1Id() {
        return spell1Id;
    }

    public long getSpell2Id() {
        return spell2Id;
    }

    public long getSummonerId() {
        return summonerId;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public long getTeamId() {
        return teamId;
    }
}
