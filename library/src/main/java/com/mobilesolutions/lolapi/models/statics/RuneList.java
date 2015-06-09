package com.mobilesolutions.lolapi.models.statics;

import java.io.Serializable;
import java.util.Map;


public class RuneList implements Serializable {

    private Map<String, RuneDto> data;
    private BasicDataDto basic;
    private String type;
    private String version;

    public Map<String, RuneDto> getData() {
        return data;
    }

    public BasicDataDto getBasic() {
        return basic;
    }

    public String getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }
}
