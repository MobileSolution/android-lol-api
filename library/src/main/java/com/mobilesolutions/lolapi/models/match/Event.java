package com.mobilesolutions.lolapi.models.match;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.List;

public class Event implements Serializable {

    @Expose
    private String ascendedType;
    @Expose
    private List<Integer> assistingParticipantIds;
    @Expose
    private String buildingType;
    @Expose
    private int creatorId;
    @Expose
    private String eventType;
    @Expose
    private int itemAfter;
    @Expose
    private int itemBefore;
    @Expose
    private int itemId;
    @Expose
    private int killerId;
    @Expose
    private String laneType;
    @Expose
    private String levelUpType;
    @Expose
    private String monsterType;
    @Expose
    private int participantId;
    @Expose
    private String pointCaptured;
    @Expose
    private Position position;
    @Expose
    private int skillSlot;
    @Expose
    private int teamId;
    @Expose
    private long timestamp;
    @Expose
    private String towerType;
    @Expose
    private int victimId;
    @Expose
    private String wardType;

    public String getAscendedType() {
        return ascendedType;
    }

    public List<Integer> getAssistingParticipantIds() {
        return assistingParticipantIds;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public String getEventType() {
        return eventType;
    }

    public int getItemAfter() {
        return itemAfter;
    }

    public int getItemBefore() {
        return itemBefore;
    }

    public int getItemId() {
        return itemId;
    }

    public int getKillerId() {
        return killerId;
    }

    public String getLaneType() {
        return laneType;
    }

    public String getLevelUpType() {
        return levelUpType;
    }

    public String getMonsterType() {
        return monsterType;
    }

    public int getParticipantId() {
        return participantId;
    }

    public String getPointCaptured() {
        return pointCaptured;
    }

    public Position getPosition() {
        return position;
    }

    public int getSkillSlot() {
        return skillSlot;
    }

    public int getTeamId() {
        return teamId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getTowerType() {
        return towerType;
    }

    public int getVictimId() {
        return victimId;
    }

    public String getWardType() {
        return wardType;
    }
}
