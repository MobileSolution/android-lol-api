package com.mobilesolutions.lolapi.models;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.List;

public class Champions implements Serializable {

    @Expose
    private List<Champion> champions;

    public List<Champion> getChampions() {
        return champions;
    }

    public void setChampions(List<Champion> champions) {
        this.champions = champions;
    }
}
