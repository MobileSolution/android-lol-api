package com.mobilesolutions.lolapi.models.common;

import com.google.gson.annotations.Expose;

public class ParticipantTimelineData {

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
