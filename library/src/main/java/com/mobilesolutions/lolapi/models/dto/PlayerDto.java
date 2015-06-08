package com.mobilesolutions.lolapi.models.dto;

import com.google.gson.annotations.Expose;

public class PlayerDto {

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
