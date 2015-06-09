package com.mobilesolutions.lolapi.models.statics;

import java.io.Serializable;
import java.util.Map;


public class MapDataDto implements Serializable {

    private Map<String, MapDetailsDto> data;
    private String type;
    private String version;

    public Map<String, MapDetailsDto> getData() {
        return data;
    }

    public String getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }
}
