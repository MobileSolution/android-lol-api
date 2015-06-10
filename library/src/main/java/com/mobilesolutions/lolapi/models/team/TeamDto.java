package com.mobilesolutions.lolapi.models.team;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.List;

public class TeamDto implements Serializable {

    @Expose
    private long createDate;
    @Expose
    private String fullId;
    @Expose
    private long lastGameDate;
    @Expose
    private long lastJoinDate;
    @Expose
    private long lastJoinedRankedTeamQueueDate;
    @Expose
    private List<MatchHistorySummaryDto> matchHistory;
    @Expose
    private long modifyDate;
    @Expose
    private String name;
    @Expose
    private RosterDto roster;
    @Expose
    private long secondLastJoinDate;
    @Expose
    private String status;
    @Expose
    private String tag;
    @Expose
    private List<TeamStatDetailDto> teamStatDetails;
    @Expose
    private long thirdLastJoinDate;

    public long getCreateDate() {
        return createDate;
    }

    public String getFullId() {
        return fullId;
    }

    public long getLastGameDate() {
        return lastGameDate;
    }

    public long getLastJoinDate() {
        return lastJoinDate;
    }

    public long getLastJoinedRankedTeamQueueDate() {
        return lastJoinedRankedTeamQueueDate;
    }

    public List<MatchHistorySummaryDto> getMatchHistory() {
        return matchHistory;
    }

    public long getModifyDate() {
        return modifyDate;
    }

    public String getName() {
        return name;
    }

    public RosterDto getRoster() {
        return roster;
    }

    public long getSecondLastJoinDate() {
        return secondLastJoinDate;
    }

    public String getStatus() {
        return status;
    }

    public String getTag() {
        return tag;
    }

    public List<TeamStatDetailDto> getTeamStatDetails() {
        return teamStatDetails;
    }

    public long getThirdLastJoinDate() {
        return thirdLastJoinDate;
    }
}
