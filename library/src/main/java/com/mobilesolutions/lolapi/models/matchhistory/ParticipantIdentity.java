package com.mobilesolutions.lolapi.models.matchhistory;

import com.google.gson.annotations.Expose;

public class ParticipantIdentity {

    @Expose
    private int participantId;
    @Expose
    private Player player;

    public int getParticipantId() {
        return participantId;
    }

    public Player getPlayer() {
        return player;
    }
}
