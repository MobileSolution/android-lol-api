package com.mobilesolutions.lolapi.models.featured;

import com.google.gson.annotations.Expose;

public class Participant {

    @Expose
    private boolean bot;
    @Expose
    private long championId;
    @Expose
    private long profileIconId;
    @Expose
    private long spell1Id;
    @Expose
    private long spell2Id;
    @Expose
    private long summonerName;
    @Expose
    private long teamId;

    public boolean isBot() {
        return bot;
    }

    public long getChampionId() {
        return championId;
    }

    public long getProfileIconId() {
        return profileIconId;
    }

    public long getSpell1Id() {
        return spell1Id;
    }

    public long getSpell2Id() {
        return spell2Id;
    }

    public long getSummonerName() {
        return summonerName;
    }

    public long getTeamId() {
        return teamId;
    }
}
