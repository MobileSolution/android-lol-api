package com.mobilesolutions.lolapi.models.champion;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.List;

public class ChampionListDto implements Serializable {

    @Expose
    private List<ChampionDto> champions;

    public List<ChampionDto> getChampions() {
        return champions;
    }

    public void setChampions(List<ChampionDto> champions) {
        this.champions = champions;
    }
}
