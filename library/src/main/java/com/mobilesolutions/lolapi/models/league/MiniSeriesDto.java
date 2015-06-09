package com.mobilesolutions.lolapi.models.league;

import com.google.gson.annotations.Expose;

public class MiniSeriesDto {

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