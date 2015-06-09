package com.mobilesolutions.lolapi.models.league;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class LeagueEntryDto implements Serializable {

    @Expose
    private long leaguePoints;
    @Expose
    private boolean isFreshBlood;
    @Expose
    private boolean isHotStreak;
    @Expose
    private String division;
    @Expose
    private boolean isInactive;
    @Expose
    private MiniSeriesDto miniSeries;
    @Expose
    private boolean isVeteran;
    @Expose
    private long losses;
    @Expose
    private String playerOrTeamName;
    @Expose
    private String playerOrTeamId;
    @Expose
    private long wins;

    public long getLeaguePoints() {
        return leaguePoints;
    }

    public boolean isFreshBlood() {
        return isFreshBlood;
    }

    public boolean isHotStreak() {
        return isHotStreak;
    }

    public String getDivision() {
        return division;
    }

    public boolean isInactive() {
        return isInactive;
    }

    public MiniSeriesDto getMiniSeries() {
        return miniSeries;
    }

    public boolean isVeteran() {
        return isVeteran;
    }

    public long getLosses() {
        return losses;
    }

    public String getPlayerOrTeamName() {
        return playerOrTeamName;
    }

    public String getPlayerOrTeamId() {
        return playerOrTeamId;
    }

    public long getWins() {
        return wins;
    }
}