package com.mobilesolutions.lolapi.models.status;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Shard implements Serializable {

    @SerializedName("region_tag")
    @Expose
    private String regionTag;
    @Expose
    private List<String> locales = new ArrayList<String>();
    @Expose
    private String name;
    @Expose
    private String hostname;
    @Expose
    private String slug;

    public String getRegionTag() {
        return regionTag;
    }

    public List<String> getLocales() {
        return locales;
    }

    public String getName() {
        return name;
    }

    public String getHostname() {
        return hostname;
    }

    public String getSlug() {
        return slug;
    }
}