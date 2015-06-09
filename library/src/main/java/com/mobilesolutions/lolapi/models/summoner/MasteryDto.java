package com.mobilesolutions.lolapi.models.summoner;

import com.google.gson.annotations.Expose;

public class MasteryDto {

    @Expose
    private int id;
    @Expose
    private int rank;

    public int getId() {
        return id;
    }

    public int getRank() {
        return rank;
    }
}
