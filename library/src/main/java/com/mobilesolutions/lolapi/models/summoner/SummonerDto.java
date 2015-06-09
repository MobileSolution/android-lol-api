package com.mobilesolutions.lolapi.models.summoner;

import com.google.gson.annotations.Expose;

public class SummonerDto {

    @Expose
    private long id;
    @Expose
    private String name;
    @Expose
    private int profileIconId;
    @Expose
    private long revisionDate;
    @Expose
    private long summonerLevel;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getProfileIconId() {
        return profileIconId;
    }

    public long getRevisionDate() {
        return revisionDate;
    }

    public long getSummonerLevel() {
        return summonerLevel;
    }
}
