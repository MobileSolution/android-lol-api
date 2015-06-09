package com.mobilesolutions.lolapi.models.team;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class TeamStatDetailDto implements Serializable {

    @Expose
    private int averageGamesPlayed;
    @Expose
    private int losses;
    @Expose
    private String teamStatType;
    @Expose
    private int wins;

    public int getAverageGamesPlayed() {
        return averageGamesPlayed;
    }

    public int getLosses() {
        return losses;
    }

    public String getTeamStatType() {
        return teamStatType;
    }

    public int getWins() {
        return wins;
    }
}
