package com.mobilesolutions.lolapi.models.recent;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class PlayerDto implements Serializable {

    @Expose
    private int championId;
    @Expose
    private long summonerId;
    @Expose
    private int teamId;

    public int getChampionId() {
        return championId;
    }

    public long getSummonerId() {
        return summonerId;
    }

    public int getTeamId() {
        return teamId;
    }
}
