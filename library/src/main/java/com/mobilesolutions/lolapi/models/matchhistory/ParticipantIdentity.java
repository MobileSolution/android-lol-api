package com.mobilesolutions.lolapi.models.matchhistory;

import com.google.gson.annotations.Expose;
import com.mobilesolutions.lolapi.models.common.Player;

import java.io.Serializable;

public class ParticipantIdentity implements Serializable {

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
