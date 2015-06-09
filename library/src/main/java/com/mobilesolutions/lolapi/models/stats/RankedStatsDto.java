package com.mobilesolutions.lolapi.models.stats;

import com.google.gson.annotations.Expose;

import java.util.List;

public class RankedStatsDto {

    @Expose
    private List<ChampionStatsDto> champions;
    @Expose
    private long modifyDate;
    @Expose
    private long summonerId;

    public List<ChampionStatsDto> getChampions() {
        return champions;
    }

    public long getModifyDate() {
        return modifyDate;
    }

    public long getSummonerId() {
        return summonerId;
    }
}
