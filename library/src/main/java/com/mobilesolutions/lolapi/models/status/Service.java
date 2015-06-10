package com.mobilesolutions.lolapi.models.status;

import com.google.gson.annotations.Expose;
import com.mobilesolutions.lolapi.models.status.enums.ServiceStatus;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Service implements Serializable {

    //No incidents. I delete it on purpose.
    @Expose
    private ServiceStatus status;
    @Expose
    private String name;
    @Expose
    private String slug;

    public ServiceStatus getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public String getSlug() {
        return slug;
    }
}