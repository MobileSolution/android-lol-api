package com.mobilesolutions.lolapi.models.statics;

import java.io.Serializable;
import java.util.Map;

public class LanguageStringsDto implements Serializable {

    private Map<String, String> data;
    private String type;
    private String version;

    public Map<String, String> getData() {
        return data;
    }

    public String getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }
}
