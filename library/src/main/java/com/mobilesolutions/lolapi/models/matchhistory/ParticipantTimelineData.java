package com.mobilesolutions.lolapi.models.matchhistory;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class ParticipantTimelineData implements Serializable {

    @Expose
    private double tenToTwenty;
    @Expose
    private double thirtyToEnd;
    @Expose
    private double twentyToThirty;
    @Expose
    private double zeroToTen;

    public double getTenToTwenty() {
        return tenToTwenty;
    }

    public double getThirtyToEnd() {
        return thirtyToEnd;
    }

    public double getTwentyToThirty() {
        return twentyToThirty;
    }

    public double getZeroToTen() {
        return zeroToTen;
    }
}
