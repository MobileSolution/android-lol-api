package com.mobilesolutions.lolapi.models.status;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Service implements Serializable {

    @Expose
    private List<Incident> incidents = new ArrayList<Incident>();
    @Expose
    private String status;
    @Expose
    private String name;
    @Expose
    private String slug;

    public List<Incident> getIncidents() {
        return incidents;
    }

    public String getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public String getSlug() {
        return slug;
    }
}