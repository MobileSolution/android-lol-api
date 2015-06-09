package com.mobilesolutions.lolapi.models.matchhistory;

import com.google.gson.annotations.Expose;

import java.util.List;

public class PlayerHistory {

    @Expose
    private List<MatchSummary> matches;

    public List<MatchSummary> getMatches() {
        return matches;
    }
}
