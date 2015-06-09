package com.mobilesolutions.lolapi.models.summoner;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class RuneSlotDto implements Serializable {

    @Expose
    private int runeId;
    @Expose
    private int runeSlotId;

    public int getRuneId() {
        return runeId;
    }

    public int getRuneSlotId() {
        return runeSlotId;
    }
}
