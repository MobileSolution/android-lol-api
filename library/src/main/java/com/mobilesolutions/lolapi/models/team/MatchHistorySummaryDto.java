package com.mobilesolutions.lolapi.models.team;

import com.google.gson.annotations.Expose;

public class MatchHistorySummaryDto {

    @Expose
    private int assists;
    @Expose
    private long date;
    @Expose
    private int deaths;
    @Expose
    private long gameId;
    @Expose
    private String gameMode;
    @Expose
    private boolean invalid;
    @Expose
    private int kills;
    @Expose
    private int mapId;
    @Expose
    private int opposingTeamKills;
    @Expose
    private String opposingTeamName;
    @Expose
    private boolean win;

    public int getAssists() {
        return assists;
    }

    public long getDate() {
        return date;
    }

    public int getDeaths() {
        return deaths;
    }

    public long getGameId() {
        return gameId;
    }

    public String getGameMode() {
        return gameMode;
    }

    public boolean isInvalid() {
        return invalid;
    }

    public int getKills() {
        return kills;
    }

    public int getMapId() {
        return mapId;
    }

    public int getOpposingTeamKills() {
        return opposingTeamKills;
    }

    public String getOpposingTeamName() {
        return opposingTeamName;
    }

    public boolean isWin() {
        return win;
    }
}
