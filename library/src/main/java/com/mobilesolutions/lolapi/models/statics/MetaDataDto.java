package com.mobilesolutions.lolapi.models.statics;

import java.io.Serializable;

public class MetaDataDto implements Serializable {

    private boolean isRune;
    private String tier;
    private String type;

    public boolean isRune() {
        return isRune;
    }

    public String getTier() {
        return tier;
    }

    public String getType() {
        return type;
    }
}
