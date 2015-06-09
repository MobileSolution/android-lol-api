package com.mobilesolutions.lolapi.models.match;

import com.google.gson.annotations.Expose;

public class ParticipantFrame {

    @Expose
    private int currentGold;
    @Expose
    private int dominionScore;
    @Expose
    private int jungleMinionsKilled;
    @Expose
    private int level;
    @Expose
    private int minionsKilled;
    @Expose
    private int participantId;
    @Expose
    private Position position;
    @Expose
    private int teamScore;
    @Expose
    private int totalGold;
    @Expose
    private int xp;

    public int getCurrentGold() {
        return currentGold;
    }

    public int getDominionScore() {
        return dominionScore;
    }

    public int getJungleMinionsKilled() {
        return jungleMinionsKilled;
    }

    public int getLevel() {
        return level;
    }

    public int getMinionsKilled() {
        return minionsKilled;
    }

    public int getParticipantId() {
        return participantId;
    }

    public Position getPosition() {
        return position;
    }

    public int getTeamScore() {
        return teamScore;
    }

    public int getTotalGold() {
        return totalGold;
    }

    public int getXp() {
        return xp;
    }
}
