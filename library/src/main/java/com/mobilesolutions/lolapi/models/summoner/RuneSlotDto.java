package com.mobilesolutions.lolapi.models.summoner;

import com.google.gson.annotations.Expose;

public class RuneSlotDto {

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
