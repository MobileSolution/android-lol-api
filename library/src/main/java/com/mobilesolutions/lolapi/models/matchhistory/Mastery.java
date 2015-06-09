package com.mobilesolutions.lolapi.models.matchhistory;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class Mastery implements Serializable {

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
