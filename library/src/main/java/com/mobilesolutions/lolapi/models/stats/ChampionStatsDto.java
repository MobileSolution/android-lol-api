package com.mobilesolutions.lolapi.models.stats;

import com.google.gson.annotations.Expose;

public class ChampionStatsDto {

    @Expose
    private int id;
    @Expose
    private AggregatedStatsDto stats;

    public int getId() {
        return id;
    }

    public AggregatedStatsDto getStats() {
        return stats;
    }
}
