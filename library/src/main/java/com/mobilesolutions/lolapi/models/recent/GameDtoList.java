package com.mobilesolutions.lolapi.models.recent;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.List;

public class GameDtoList {

    @Expose
    private long summonerId;
    @Expose
    private  List<GameDto> games;

    public long getSummonerId() {
        return summonerId;
    }

    public List<GameDto> getGames() {
        return games;
    }
}
