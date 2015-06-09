package com.mobilesolutions.lolapi.models.team;

import com.google.gson.annotations.Expose;

import java.util.List;

public class RosterDto {

    @Expose
    private List<TeamMemberInfoDto> memberList;
    @Expose
    private long ownerId;

    public List<TeamMemberInfoDto> getMemberList() {
        return memberList;
    }

    public long getOwnerId() {
        return ownerId;
    }
}
