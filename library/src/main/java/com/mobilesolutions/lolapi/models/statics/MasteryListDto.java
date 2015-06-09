package com.mobilesolutions.lolapi.models.statics;

import java.io.Serializable;
import java.util.Map;


public class MasteryListDto implements Serializable {

    private Map<String, MasteryDto> data;
    private MasteryTreeDto tree;
    private String type;
    private String version;

    public Map<String, MasteryDto> getData() {
        return data;
    }

    public MasteryTreeDto getTree() {
        return tree;
    }

    public String getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }
}
