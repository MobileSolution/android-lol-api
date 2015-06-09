package com.mobilesolutions.lolapi.models.statics;

import java.io.Serializable;
import java.util.List;


public class MasteryTreeListDto implements Serializable {

    private List<MasteryTreeItemDto> masteryTreeItems;

    public List<MasteryTreeItemDto> getMasteryTreeItems() {
        return masteryTreeItems;
    }
}
