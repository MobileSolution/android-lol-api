package com.mobilesolutions.lolapi.models.team;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.List;

public class RosterDto implements Serializable {

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
