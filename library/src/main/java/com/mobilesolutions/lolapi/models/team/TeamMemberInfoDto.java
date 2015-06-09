package com.mobilesolutions.lolapi.models.team;

import com.google.gson.annotations.Expose;

public class TeamMemberInfoDto {

    @Expose
    private long inviteDate;
    @Expose
    private long joinDate;
    @Expose
    private long playerId;
    @Expose
    private String status;

    public long getInviteDate() {
        return inviteDate;
    }

    public long getJoinDate() {
        return joinDate;
    }

    public long getPlayerId() {
        return playerId;
    }

    public String getStatus() {
        return status;
    }
}
