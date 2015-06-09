package com.mobilesolutions.lolapi.models.common;

import com.google.gson.annotations.Expose;
import com.mobilesolutions.lolapi.models.common.ParticipantStats;
import com.mobilesolutions.lolapi.models.common.ParticipantTimeline;

import java.io.Serializable;
import java.util.List;

public class Participant implements Serializable {

    @Expose
    private int championId;
    @Expose
    private String highestAchievedSeasonTier;
    @Expose
    private List<Mastery> masteries;
    @Expose
    private int participantId;
    @Expose
    private List<Rune> runes;
    @Expose
    private int spell1Id;
    @Expose
    private int spell2Id;
    @Expose
    private ParticipantStats stats;
    @Expose
    private int teamId;
    @Expose
    private ParticipantTimeline timeline;

    public int getChampionId() {
        return championId;
    }

    public String getHighestAchievedSeasonTier() {
        return highestAchievedSeasonTier;
    }

    public List<Mastery> getMasteries() {
        return masteries;
    }

    public int getParticipantId() {
        return participantId;
    }

    public List<Rune> getRunes() {
        return runes;
    }

    public int getSpell1Id() {
        return spell1Id;
    }

    public int getSpell2Id() {
        return spell2Id;
    }

    public ParticipantStats getStats() {
        return stats;
    }

    public int getTeamId() {
        return teamId;
    }

    public ParticipantTimeline getTimeline() {
        return timeline;
    }
}
