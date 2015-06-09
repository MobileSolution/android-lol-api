package com.mobilesolutions.lolapi.models.match;

import com.google.gson.annotations.Expose;

public class Player {

    @Expose
    private String matchHistoryUri;
    @Expose
    private int profileIcon;
    @Expose
    private long summonerId;
    @Expose
    private String summonerName;

    public String getMatchHistoryUri() {
        return matchHistoryUri;
    }

    public int getProfileIcon() {
        return profileIcon;
    }

    public long getSummonerId() {
        return summonerId;
    }

    public String getSummonerName() {
        return summonerName;
    }
}
