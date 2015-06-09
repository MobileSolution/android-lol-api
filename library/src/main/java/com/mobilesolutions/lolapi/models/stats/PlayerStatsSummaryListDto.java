package com.mobilesolutions.lolapi.models.stats;

import com.google.gson.annotations.Expose;

import java.util.List;

public class PlayerStatsSummaryListDto {

    @Expose
    private List<PlayerStatsSummaryDto> playerStatSummaries;
    @Expose
    private long summonerId;

    public List<PlayerStatsSummaryDto> getPlayerStatSummaries() {
        return playerStatSummaries;
    }

    public long getSummonerId() {
        return summonerId;
    }
}
