package com.mobilesolutions.lolapi.models.currentgame;

import com.google.gson.annotations.Expose;

public class Rune {

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
