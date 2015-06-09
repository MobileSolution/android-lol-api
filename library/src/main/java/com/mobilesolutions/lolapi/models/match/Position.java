package com.mobilesolutions.lolapi.models.match;

import com.google.gson.annotations.Expose;

public class Position {

    @Expose
    private int x;
    @Expose
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
