package com.mobilesolutions.lolapi.models.statics;

import java.io.Serializable;
import java.util.List;


public class ChampionDto implements Serializable {

    private List<String> allytips;
    private List<String> enemytips;
    private List<RecommendedDto> recommended;
    private List<SkinDto> skins;
    private List<ChampionSpellDto> spells;
    private List<String> tags;
    private ImageDto image;
    private InfoDto info;
    private PassiveDto passive;
    private StatsDto stats;
    private int id;
    private String blurb;
    private String key;
    private String lore;
    private String name;
    private String partype;
    private String title;

    public List<String> getAllytips() {
        return allytips;
    }

    public List<String> getEnemytips() {
        return enemytips;
    }

    public List<RecommendedDto> getRecommended() {
        return recommended;
    }

    public List<SkinDto> getSkins() {
        return skins;
    }

    public List<ChampionSpellDto> getSpells() {
        return spells;
    }

    public List<String> getTags() {
        return tags;
    }

    public ImageDto getImage() {
        return image;
    }

    public InfoDto getInfo() {
        return info;
    }

    public PassiveDto getPassive() {
        return passive;
    }

    public StatsDto getStats() {
        return stats;
    }

    public int getId() {
        return id;
    }

    public String getBlurb() {
        return blurb;
    }

    public String getKey() {
        return key;
    }

    public String getLore() {
        return lore;
    }

    public String getName() {
        return name;
    }

    public String getPartype() {
        return partype;
    }

    public String getTitle() {
        return title;
    }
}
