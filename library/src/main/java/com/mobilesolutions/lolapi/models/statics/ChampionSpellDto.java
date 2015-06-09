package com.mobilesolutions.lolapi.models.statics;

import java.io.Serializable;
import java.util.List;

public class ChampionSpellDto implements Serializable {

    private List<ImageDto> altimages;
    private List<Double> cooldown;
    private List<Integer> cost;
    private List<Object> effect;
    private List<String> effectBurn;
    private Object range;
    private List<SpellVarsDto> vars;
    private String cooldownBurn;
    private String costBurn;
    private String costType;
    private String description;
    private String key;
    private String name;
    private String rangeBurn;
    private String resource;
    private String sanitizedDescription;
    private String sanitizedTooltip;
    private String tooltip;
    private ImageDto image;
    private int maxrank;

    public List<ImageDto> getAltimages() {
        return altimages;
    }

    public List<Double> getCooldown() {
        return cooldown;
    }

    public List<Integer> getCost() {
        return cost;
    }

    public List<Object> getEffect() {
        return effect;
    }

    public List<String> getEffectBurn() {
        return effectBurn;
    }

    public Object getRange() {
        return range;
    }

    public List<SpellVarsDto> getVars() {
        return vars;
    }

    public String getCooldownBurn() {
        return cooldownBurn;
    }

    public String getCostBurn() {
        return costBurn;
    }

    public String getCostType() {
        return costType;
    }

    public String getDescription() {
        return description;
    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getRangeBurn() {
        return rangeBurn;
    }

    public String getResource() {
        return resource;
    }

    public String getSanitizedDescription() {
        return sanitizedDescription;
    }

    public String getSanitizedTooltip() {
        return sanitizedTooltip;
    }

    public String getTooltip() {
        return tooltip;
    }

    public ImageDto getImage() {
        return image;
    }

    public int getMaxrank() {
        return maxrank;
    }
}
