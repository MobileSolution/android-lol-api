package com.mobilesolutions.lolapi.models.summoner;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class MasteryDto implements Serializable {

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
