package com.mobilesolutions.lolapi.models.statics;

import java.io.Serializable;
import java.util.Map;

public class SummonerSpellListDto implements Serializable {

    private Map<String, SummonerSpellDto> data;
    private String type;
    private String version;

    public Map<String, SummonerSpellDto> getData() {
        return data;
    }

    public String getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }
}
