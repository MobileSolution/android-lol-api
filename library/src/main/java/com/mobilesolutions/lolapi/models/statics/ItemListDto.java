package com.mobilesolutions.lolapi.models.statics;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


public class ItemListDto implements Serializable {

    private List<GroupDto> groups;
    private List<ItemTreeDto> tree;
    private Map<String, ItemDto> data;
    private BasicDataDto basic;
    private String type;
    private String version;

    public List<GroupDto> getGroups() {
        return groups;
    }

    public List<ItemTreeDto> getTree() {
        return tree;
    }

    public Map<String, ItemDto> getData() {
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
