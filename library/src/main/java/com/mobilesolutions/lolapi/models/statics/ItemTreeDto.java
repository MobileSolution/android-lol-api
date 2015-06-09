package com.mobilesolutions.lolapi.models.statics;

import java.io.Serializable;
import java.util.List;

public class ItemTreeDto implements Serializable {

    private List<String> tags;
    private String header;

    public List<String> getTags() {
        return tags;
    }

    public String getHeader() {
        return header;
    }
}
