package com.mobilesolutions.lolapi.models.matchhistory;

import com.google.gson.annotations.Expose;

import java.util.List;

public class MatchSummary {

    @Expose
    private int mapId;
    @Expose
    private long matchCreation;
    @Expose
    private long matchDuration;
    @Expose
    private long matchId;
    @Expose
    private String matchMode;
    @Expose
    private String matchType;
    @Expose
    private String matchVersion;
    @Expose
    private List<ParticipantIdentity> participantIdentities;
    @Expose
    private List<Participant> participants;
    @Expose
    private String platformId;
    @Expose
    private String queueType;
    @Expose
    private String region;
    @Expose
    private String season;

    public int getMapId() {
        return mapId;
    }

    public long getMatchCreation() {
        return matchCreation;
    }

    public long getMatchDuration() {
        return matchDuration;
    }

    public long getMatchId() {
        return matchId;
    }

    public String getMatchMode() {
        return matchMode;
    }

    public String getMatchType() {
        return matchType;
    }

    public String getMatchVersion() {
        return matchVersion;
    }

    public List<ParticipantIdentity> getParticipantIdentities() {
        return participantIdentities;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public String getPlatformId() {
        return platformId;
    }

    public String getQueueType() {
        return queueType;
    }

    public String getRegion() {
        return region;
    }

    public String getSeason() {
        return season;
    }
}
