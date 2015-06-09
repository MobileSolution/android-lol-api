package com.mobilesolutions.lolapi.models.statics;

import java.io.Serializable;
import java.util.List;


public class BlockDto implements Serializable {

    private List<BlockItemDto> items;
    private boolean recMath;
    private String type;

    public List<BlockItemDto> getItems() {
        return items;
    }

    public boolean isRecMath() {
        return recMath;
    }

    public String getType() {
        return type;
    }
}
