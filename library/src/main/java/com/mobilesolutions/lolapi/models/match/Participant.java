package com.mobilesolutions.lolapi.models.match;

import com.google.gson.annotations.Expose;

public class Participant {

    @Expose
    private boolean bot;
    @Expose
    private long championId;
    @Expose
    private long profileIconId;
    @Expose
    private long spell1Id;
    @Expose
    private long spell2Id;
    @Expose
    private long summonerName;
    @Expose
    private long teamId;

}
