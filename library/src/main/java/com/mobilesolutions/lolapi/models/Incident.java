package com.mobilesolutions.lolapi.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Incident {

    @Expose
    private boolean active;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @Expose
    private long id;
    @Expose
    private List<Message> updates = new ArrayList<Message>();

    public boolean isActive() {
        return active;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public long getId() {
        return id;
    }

    public List<Message> getUpdates() {
        return updates;
    }
}
