package com.mobilesolutions.lolapi.models.statics;

import java.io.Serializable;
import java.util.List;


public class MasteryTreeDto implements Serializable {

    private List<MasteryTreeListDto> Defense;
    private List<MasteryTreeListDto> Offense;
    private List<MasteryTreeListDto> Utility;

    public List<MasteryTreeListDto> getDefense() {
        return Defense;
    }

    public List<MasteryTreeListDto> getOffense() {
        return Offense;
    }

    public List<MasteryTreeListDto> getUtility() {
        return Utility;
    }
}
