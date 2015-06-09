package com.mobilesolutions.lolapi.models.match;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class ParticipantTimeline implements Serializable {

    @Expose
    private ParticipantTimelineData ancientGolemAssistsPerMinCounts;
    @Expose
    private ParticipantTimelineData ancientGolemKillsPerMinCounts;
    @Expose
    private ParticipantTimelineData assistedLaneDeathsPerMinDeltas;
    @Expose
    private ParticipantTimelineData assistedLaneKillsPerMinDeltas;
    @Expose
    private ParticipantTimelineData baronAssistsPerMinCounts;
    @Expose
    private ParticipantTimelineData baronKillsPerMinCounts;
    @Expose
    private ParticipantTimelineData creepsPerMinDeltas;
    @Expose
    private ParticipantTimelineData csDiffPerMinDeltas;
    @Expose
    private ParticipantTimelineData damageTakenDiffPerMinDeltas;
    @Expose
    private ParticipantTimelineData damageTakenPerMinDeltas;
    @Expose
    private ParticipantTimelineData dragonAssistsPerMinCounts;
    @Expose
    private ParticipantTimelineData dragonKillsPerMinCounts;
    @Expose
    private ParticipantTimelineData elderLizardAssistsPerMinCounts;
    @Expose
    private ParticipantTimelineData elderLizardKillsPerMinCounts;
    @Expose
    private ParticipantTimelineData goldPerMinDeltas;
    @Expose
    private ParticipantTimelineData inhibitorAssistsPerMinCounts;
    @Expose
    private ParticipantTimelineData inhibitorKillsPerMinCounts;
    @Expose
    private String lane;
    @Expose
    private String role;
    @Expose
    private ParticipantTimelineData towerAssistsPerMinCounts;
    @Expose
    private ParticipantTimelineData towerKillsPerMinCounts;
    @Expose
    private ParticipantTimelineData towerKillsPerMinDeltas;
    @Expose
    private ParticipantTimelineData vilemawAssistsPerMinCounts;
    @Expose
    private ParticipantTimelineData vilemawKillsPerMinCounts;
    @Expose
    private ParticipantTimelineData wardsPerMinDeltas;
    @Expose
    private ParticipantTimelineData xpDiffPerMinDeltas;
    @Expose
    private ParticipantTimelineData xpPerMinDeltas;
}
