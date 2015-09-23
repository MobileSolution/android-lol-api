package com.mobilesolutions.lolapi.models.matchhistory;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.List;

public class MatchList implements Serializable{

    @Expose
    private int startIndex;

    @Expose
    private int endIndex;

    @Expose
    private int totalGames;

    @Expose
    private List<MatchReference> matches;


    public int getStartIndex() {
        return startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public int getTotalGames() {
        return totalGames;
    }

    public List<MatchReference> getMatches() {
        return matches;
    }
}
