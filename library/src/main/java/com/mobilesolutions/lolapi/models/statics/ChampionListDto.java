package com.mobilesolutions.lolapi.models.statics;

import java.io.Serializable;
import java.util.Map;

public class ChampionListDto implements Serializable {


    private Map<String, ChampionDto> data;
    private Map<String, String> keys;
    private String format;
    private String type;
    private String version;

    public Map<String, ChampionDto> getData() {
        return data;
    }

    public Map<String, String> getKeys() {
        return keys;
    }

    public String getFormat() {
        return format;
    }

    public String getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }
}
