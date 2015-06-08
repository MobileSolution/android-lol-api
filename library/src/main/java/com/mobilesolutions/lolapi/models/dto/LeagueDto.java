package com.mobilesolutions.lolapi.models.dto;

import com.google.gson.annotations.Expose;

import java.util.List;

public class LeagueDto {

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
