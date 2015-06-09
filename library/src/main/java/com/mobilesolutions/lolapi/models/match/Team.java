package com.mobilesolutions.lolapi.models.match;

import com.google.gson.annotations.Expose;
import com.mobilesolutions.lolapi.models.common.BannedChampion;

import java.io.Serializable;
import java.util.List;

public class Team implements Serializable {

    @Expose
    private List<BannedChampion> bans;
    @Expose
    private int baronKills;
    @Expose
    private long dominionVictoryScore;
    @Expose
    private int dragonKills;
    @Expose
    private boolean firstBaron;
    @Expose
    private boolean firstBlood;
    @Expose
    private boolean firstDragon;
    @Expose
    private boolean firstInhibitor;
    @Expose
    private boolean firstTower;
    @Expose
    private int inhibitorKills;
    @Expose
    private int teamId;
    @Expose
    private int towerKills;
    @Expose
    private int vilemawKills;
    @Expose
    private int winner;
    @Expose
    private boolean championId;

    public List<BannedChampion> getBans() {
        return bans;
    }

    public int getBaronKills() {
        return baronKills;
    }

    public long getDominionVictoryScore() {
        return dominionVictoryScore;
    }

    public int getDragonKills() {
        return dragonKills;
    }

    public boolean isFirstBaron() {
        return firstBaron;
    }

    public boolean isFirstBlood() {
        return firstBlood;
    }

    public boolean isFirstDragon() {
        return firstDragon;
    }

    public boolean isFirstInhibitor() {
        return firstInhibitor;
    }

    public boolean isFirstTower() {
        return firstTower;
    }

    public int getInhibitorKills() {
        return inhibitorKills;
    }

    public int getTeamId() {
        return teamId;
    }

    public int getTowerKills() {
        return towerKills;
    }

    public int getVilemawKills() {
        return vilemawKills;
    }

    public int getWinner() {
        return winner;
    }

    public boolean isChampionId() {
        return championId;
    }
}
