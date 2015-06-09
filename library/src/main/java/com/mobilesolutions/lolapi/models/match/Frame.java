package com.mobilesolutions.lolapi.models.match;

import com.google.gson.annotations.Expose;

import java.util.List;
import java.util.Map;

public class Frame {

    @Expose
    private List<Event> events;
    @Expose
    private Map<String, ParticipantFrame> participantFrames;
    @Expose
    private long timestamp;

    public List<Event> getEvents() {
        return events;
    }

    public Map<String, ParticipantFrame> getParticipantFrames() {
        return participantFrames;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
