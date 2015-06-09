package com.mobilesolutions.lolapi.models.summoner;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.List;

public class MasteryPageDto implements Serializable {

    @Expose
    private boolean current;
    @Expose
    private long id;
    @Expose
    private List<MasteryDto> masteries;
    @Expose
    private long name;

    public boolean isCurrent() {
        return current;
    }

    public long getId() {
        return id;
    }

    public List<MasteryDto> getMasteries() {
        return masteries;
    }

    public long getName() {
        return name;
    }
}
