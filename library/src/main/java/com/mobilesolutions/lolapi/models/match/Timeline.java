package com.mobilesolutions.lolapi.models.match;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.List;

public class Timeline implements Serializable {

    @Expose
    private long frameInterval;
    @Expose
    private List<Frame> frames;

    public long getFrameInterval() {
        return frameInterval;
    }

    public List<Frame> getFrames() {
        return frames;
    }
}
