package com.mobilesolutions.lolapi.models.league;

import com.google.gson.annotations.Expose;
import com.mobilesolutions.lolapi.models.league.enums.QueueEnum;
import com.mobilesolutions.lolapi.models.league.enums.TierEnum;

import java.io.Serializable;
import java.util.List;

public class LeagueDto implements Serializable {

    @Expose
    private QueueEnum queue;
    @Expose
    private String name;
    @Expose
    private List<LeagueEntryDto> entries;
    @Expose
    private TierEnum tier;
    @Expose
    private String participantId;

    public QueueEnum getQueue() {
        return queue;
    }

    public String getName() {
        return name;
    }

    public List<LeagueEntryDto> getEntries() {
        return entries;
    }

    public TierEnum getTier() {
        return tier;
    }

    public String getParticipantId() {
        return participantId;
    }
}
