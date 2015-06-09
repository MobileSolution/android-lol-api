package com.mobilesolutions.lolapi.models.stats;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class ChampionStatsDto implements Serializable {

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
