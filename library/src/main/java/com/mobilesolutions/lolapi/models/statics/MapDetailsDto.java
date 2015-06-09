package com.mobilesolutions.lolapi.models.statics;

import java.io.Serializable;
import java.util.List;


public class MapDetailsDto implements Serializable {

    private int mapId;
    private List<Integer> unpurchasableItemList;
    private ImageDto image;
    private String mapName;

    public int getMapId() {
        return mapId;
    }

    public List<Integer> getUnpurchasableItemList() {
        return unpurchasableItemList;
    }

    public ImageDto getImage() {
        return image;
    }

    public String getMapName() {
        return mapName;
    }
}
