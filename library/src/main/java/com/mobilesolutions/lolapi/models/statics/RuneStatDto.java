package com.mobilesolutions.lolapi.models.statics;

import java.io.Serializable;

public class RuneStatDto implements Serializable {

    private String type;
    private double value;

    public String getType() {
        return type;
    }

    public double getValue() {
        return value;
    }

    protected void setType(String type) {
        this.type = type;
    }

    protected void setValue(double value) {
        this.value = value;
    }

}
