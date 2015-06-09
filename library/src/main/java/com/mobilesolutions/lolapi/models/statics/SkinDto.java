package com.mobilesolutions.lolapi.models.statics;

import java.io.Serializable;


public class SkinDto implements Serializable {

    private int id;
    private int num;
    private String name;

    public int getId() {
        return id;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }
}
