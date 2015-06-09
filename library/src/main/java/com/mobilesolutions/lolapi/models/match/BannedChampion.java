package com.mobilesolutions.lolapi.models.match;

import com.google.gson.annotations.Expose;

public class BannedChampion {

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
