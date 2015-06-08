package com.mobilesolutions.lolapi.models.dto;

import com.google.gson.annotations.Expose;

import java.util.Set;

public class RecentGamesDto {

    @Expose
    private Set<GameDto> games;
    @Expose
    private long summonerId;

    public Set<GameDto> getGames() {
        return games;
    }

    public long getSummonerId() {
        return summonerId;
    }
}
