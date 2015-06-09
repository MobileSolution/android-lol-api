package com.mobilesolutions.lolapi.models.summoner;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.Set;

public class RunePagesDto implements Serializable {

    @Expose
    private Set<RunePageDto> pages;
    @Expose
    private long summonerId;

    public Set<RunePageDto> getPages() {
        return pages;
    }

    public long getSummonerId() {
        return summonerId;
    }
}
