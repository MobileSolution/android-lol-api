package com.mobilesolutions.lolapi.models.statics;

import java.io.Serializable;
import java.util.List;

public class RecommendedDto implements Serializable {

    private List<BlockDto> blocks;
    private String champion;
    private String map;
    private String mode;
    private String title;
    private String type;
    private boolean priority;

    public List<BlockDto> getBlocks() {
        return blocks;
    }

    public String getChampion() {
        return champion;
    }

    public String getMap() {
        return map;
    }

    public String getMode() {
        return mode;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public boolean isPriority() {
        return priority;
    }
}
