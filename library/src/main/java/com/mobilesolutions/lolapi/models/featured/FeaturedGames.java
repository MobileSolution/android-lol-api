package com.mobilesolutions.lolapi.models.featured;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.List;

public class FeaturedGames implements Serializable {

    @Expose
    private long clientRefreshInterval;
    @Expose
    private List<FeaturedGameInfo> gameList;

    public long getClientRefreshInterval() {
        return clientRefreshInterval;
    }

    public List<FeaturedGameInfo> getGameList() {
        return gameList;
    }
}
