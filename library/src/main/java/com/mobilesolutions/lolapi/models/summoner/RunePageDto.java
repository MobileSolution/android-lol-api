package com.mobilesolutions.lolapi.models.summoner;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.Set;

public class RunePageDto implements Serializable {

    @Expose
    private boolean current;
    @Expose
    private long id;
    @Expose
    private long name;
    @Expose
    private Set<RuneSlotDto> slots;

    public boolean isCurrent() {
        return current;
    }

    public long getId() {
        return id;
    }

    public long getName() {
        return name;
    }

    public Set<RuneSlotDto> getSlots() {
        return slots;
    }
}
