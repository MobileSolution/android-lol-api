package com.mobilesolutions.lolapi.models.statics;

import java.io.Serializable;

public class MasteryTreeItemDto implements Serializable {

    private int masteryId;
    private String prereq;

    public int getMasteryId() {
        return masteryId;
    }

    public String getPrereq() {
        return prereq;
    }
}
