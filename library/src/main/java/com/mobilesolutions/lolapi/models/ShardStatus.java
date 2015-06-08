package com.mobilesolutions.lolapi.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ShardStatus {

    @SerializedName("region_tag")
    @Expose
    private String regionTag;
    @Expose
    private List<Service> services = new ArrayList<Service>();
    @Expose
    private List<String> locales = new ArrayList<String>();
    @Expose
    private String name;
    @Expose
    private String hostname;
    @Expose
    private String slug;
}