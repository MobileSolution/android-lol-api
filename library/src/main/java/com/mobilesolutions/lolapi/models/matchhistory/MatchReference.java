package com.mobilesolutions.lolapi.models.matchhistory;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class MatchReference implements Serializable {

    @Expose
    private long timestamp;
    @Expose
    private int champion;
    @Expose
    private String queue;
    @Expose
    private String season;
    @Expose
    private long matchId;
    @Expose
    private String role;
    @Expose
    private String platformId;
    @Expose
    private String lane;

    public long getTimestamp() {
        return timestamp;
    }

    public int getChampion() {
        return champion;
    }

    public String getQueue() {
        return queue;
    }

    public String getSeason() {
        return season;
    }

    public long getMatchId() {
        return matchId;
    }

    public String getRole() {
        return role;
    }

    public String getPlatformId() {
        return platformId;
    }

    public String getLane() {
        return lane;
    }
}
