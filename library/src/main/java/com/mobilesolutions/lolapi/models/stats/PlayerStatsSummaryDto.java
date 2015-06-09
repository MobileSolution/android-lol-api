package com.mobilesolutions.lolapi.models.stats;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class PlayerStatsSummaryDto implements Serializable {

    @Expose
    private AggregatedStatsDto aggregatedStats;
    @Expose
    private int losses;
    @Expose
    private long modifyDate;
    @Expose
    private String playerStatSummaryType;
    @Expose
    private int wins;

    public AggregatedStatsDto getAggregatedStats() {
        return aggregatedStats;
    }

    public int getLosses() {
        return losses;
    }

    public long getModifyDate() {
        return modifyDate;
    }

    public String getPlayerStatSummaryType() {
        return playerStatSummaryType;
    }

    public int getWins() {
        return wins;
    }
}
