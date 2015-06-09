package com.mobilesolutions.lolapi.models.statics;

import java.io.Serializable;


public class ImageDto implements Serializable {

    private String full;
    private String group;
    private String sprite;
    private int h;
    private int w;
    private int x;
    private int y;

    public String getFull() {
        return full;
    }

    public String getGroup() {
        return group;
    }

    public String getSprite() {
        return sprite;
    }

    public int getH() {
        return h;
    }

    public int getW() {
        return w;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
