package com.mobilesolutions.lolapi.models.matchhistory;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MatchSummary implements Serializable {

    @Expose
    private List<Match> matches = new ArrayList<Match>();

    public List<Match> getMatches() {
        return matches;
    }
}
