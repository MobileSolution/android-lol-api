package com.mobilesolutions.lolapi.models.match;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class BannedChampion implements Serializable {

    @Expose
    private long championId;
    @Expose
    private long pickTurn;
    @Expose
    private long teamId;

    public long getChampionId() {
        return championId;
    }

    public long getPickTurn() {
        return pickTurn;
    }

    public long getTeamId() {
        return teamId;
    }
}
