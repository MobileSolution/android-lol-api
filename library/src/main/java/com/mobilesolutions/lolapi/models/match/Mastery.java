package com.mobilesolutions.lolapi.models.match;

import com.google.gson.annotations.Expose;

public class Mastery {

    @Expose
    private long masteryId;
    @Expose
    private int rank;

    public long getMasteryId() {
        return masteryId;
    }

    public int getRank() {
        return rank;
    }
}
