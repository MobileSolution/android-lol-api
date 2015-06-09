package com.mobilesolutions.lolapi.models.league;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class MiniSeriesDto implements Serializable {

    @Expose
    private String progress;
    @Expose
    private long target;
    @Expose
    private long losses;
    @Expose
    private long wins;

    public String getProgress() {
        return progress;
    }

    public long getTarget() {
        return target;
    }

    public long getLosses() {
        return losses;
    }

    public long getWins() {
        return wins;
    }
}