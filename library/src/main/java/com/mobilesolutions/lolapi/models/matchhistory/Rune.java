package com.mobilesolutions.lolapi.models.matchhistory;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class Rune implements Serializable {

    @Expose
    private int count;
    @Expose
    private long runeId;

    public int getCount() {
        return count;
    }

    public long getRuneId() {
        return runeId;
    }
}
