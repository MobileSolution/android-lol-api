package com.mobilesolutions.lolapi.models.currentgame;

import com.google.gson.annotations.Expose;
import com.mobilesolutions.lolapi.models.common.BannedChampion;
import com.mobilesolutions.lolapi.models.common.Observer;
import com.mobilesolutions.lolapi.models.common.enums.GameMode;
import com.mobilesolutions.lolapi.models.common.enums.GameType;

import java.io.Serializable;
import java.util.List;

public class CurrentGameInfo implements Serializable {

    @Expose
    private List<BannedChampion> bannedChampions;
    @Expose
    private long gameId;
    @Expose
    private long gameLength;
    @Expose
    private GameMode gameMode;
    @Expose
    private long gameQueueConfigId;
    @Expose
    private long gameStartTime;
    @Expose
    private GameType gameType;
    @Expose
    private long mapId;
    @Expose
    private Observer observers;
    @Expose
    private List<CurrentGameParticipant> participants;
    @Expose
    private String platformId;

    public List<BannedChampion> getBannedChampions() {
        return bannedChampions;
    }

    public long getGameId() {
        return gameId;
    }

    public long getGameLength() {
        return gameLength;
    }

    public GameMode getGameMode() {
        return gameMode;
    }

    public long getGameQueueConfigId() {
        return gameQueueConfigId;
    }

    public long getGameStartTime() {
        return gameStartTime;
    }

    public GameType getGameType() {
        return gameType;
    }

    public long getMapId() {
        return mapId;
    }

    public Observer getObservers() {
        return observers;
    }

    public List<CurrentGameParticipant> getParticipants() {
        return participants;
    }

    public String getPlatformId() {
        return platformId;
    }
}
