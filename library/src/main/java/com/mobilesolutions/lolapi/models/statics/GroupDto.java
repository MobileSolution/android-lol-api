package com.mobilesolutions.lolapi.models.statics;

import java.io.Serializable;

public class GroupDto implements Serializable {

    private String MaxGroupOwnable;
    private String key;

    public String getMaxGroupOwnable() {
        return MaxGroupOwnable;
    }

    public String getKey() {
        return key;
    }
}
