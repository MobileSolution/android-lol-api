package com.mobilesolutions.lolapi.models.matchhistory;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.List;

public class PlayerHistory implements Serializable {

    @Expose
    private List<MatchSummary> matches;

    public List<MatchSummary> getMatches() {
        return matches;
    }
}
