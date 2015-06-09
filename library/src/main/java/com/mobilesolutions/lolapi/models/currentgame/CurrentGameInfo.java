package com.mobilesolutions.lolapi.models.currentgame;

import com.google.gson.annotations.Expose;
import com.mobilesolutions.lolapi.models.featured.Observer;

import java.util.List;

public class CurrentGameInfo {

    @Expose
    private List<BannedChampion> bannedChampions;
    @Expose
    private long gameId;
    @Expose
    private long gameLength;
    @Expose
    private String gameMode;
    @Expose
    private long gameQueueConfigId;
    @Expose
    private long gameStartTime;
    @Expose
    private String gameType;
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

    public String getGameMode() {
        return gameMode;
    }

    public long getGameQueueConfigId() {
        return gameQueueConfigId;
    }

    public long getGameStartTime() {
        return gameStartTime;
    }

    public String getGameType() {
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
