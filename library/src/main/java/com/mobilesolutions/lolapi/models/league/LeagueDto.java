package com.mobilesolutions.lolapi.models.league;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.List;

public class LeagueDto implements Serializable {

    @Expose
    private String queue;
    @Expose
    private String name;
    @Expose
    private List<LeagueEntryDto> entries;
    @Expose
    private String tier;
    @Expose
    private String participantId;

    public String getQueue() {
        return queue;
    }

    public String getName() {
        return name;
    }

    public List<LeagueEntryDto> getEntries() {
        return entries;
    }

    public String getTier() {
        return tier;
    }

    public String getParticipantId() {
        return participantId;
    }
}
