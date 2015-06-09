package com.mobilesolutions.lolapi.models.recent;

import com.google.gson.annotations.Expose;
import com.mobilesolutions.lolapi.models.recent.enums.GameMode;
import com.mobilesolutions.lolapi.models.recent.enums.GameType;
import com.mobilesolutions.lolapi.models.recent.enums.SubType;

import java.io.Serializable;
import java.util.List;

public class GameDto {

    @Expose
    private int championId;
    @Expose
    private long createDate;
    @Expose
    private List<PlayerDto> fellowPlayers;
    @Expose
    private long gameId;
    @Expose
    private GameMode gameMode;
    @Expose
    private GameType gameType;
    @Expose
    private boolean invalid;
    @Expose
    private int ipEarned;
    @Expose
    private int level;
    @Expose
    private int mapId;
    @Expose
    private int spell1;
    @Expose
    private int spell2;
    @Expose
    private RawStatsDto stats;
    @Expose
    private SubType subType;
    @Expose
    private int teamId;

    public int getChampionId() {
        return championId;
    }

    public long getCreateDate() {
        return createDate;
    }

    public List<PlayerDto> getFellowPlayers() {
        return fellowPlayers;
    }

    public long getGameId() {
        return gameId;
    }

    public GameMode getGameMode() {
        return gameMode;
    }

    public GameType getGameType() {
        return gameType;
    }

    public boolean isInvalid() {
        return invalid;
    }

    public int getIpEarned() {
        return ipEarned;
    }

    public int getLevel() {
        return level;
    }

    public int getMapId() {
        return mapId;
    }

    public int getSpell1() {
        return spell1;
    }

    public int getSpell2() {
        return spell2;
    }

    public RawStatsDto getStats() {
        return stats;
    }

    public SubType getSubType() {
        return subType;
    }

    public int getTeamId() {
        return teamId;
    }
}
