package com.mobilesolutions.lolapi.models.statics;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class ItemDto implements Serializable {

    private List<String> from;
    private List<String> into;
    private Map<String, Boolean> maps;
    private List<String> tags;
    private GoldDto gold;
    private ImageDto image;
    private MetaDataDto rune;
    private BasicDataStatsDto stats;
    private String colloq;
    private String description;
    private String group;
    private String name;
    private String plaintext;
    private String requiredChampion;
    private String sanitizedDescription;
    private boolean consumeOnFull;
    private boolean consumed;
    private boolean hideFromAll;
    private boolean inStore;
    private int depth;
    private int id;
    private int specialRecipe;
    private int stacks;

    public List<String> getFrom() {
        return from;
    }

    public List<String> getInto() {
        return into;
    }

    public Map<String, Boolean> getMaps() {
        return maps;
    }

    public List<String> getTags() {
        return tags;
    }

    public GoldDto getGold() {
        return gold;
    }

    public ImageDto getImage() {
        return image;
    }

    public MetaDataDto getRune() {
        return rune;
    }

    public BasicDataStatsDto getStats() {
        return stats;
    }

    public String getColloq() {
        return colloq;
    }

    public String getDescription() {
        return description;
    }

    public String getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    public String getPlaintext() {
        return plaintext;
    }

    public String getRequiredChampion() {
        return requiredChampion;
    }

    public String getSanitizedDescription() {
        return sanitizedDescription;
    }

    public boolean isConsumeOnFull() {
        return consumeOnFull;
    }

    public boolean isConsumed() {
        return consumed;
    }

    public boolean isHideFromAll() {
        return hideFromAll;
    }

    public boolean isInStore() {
        return inStore;
    }

    public int getDepth() {
        return depth;
    }

    public int getId() {
        return id;
    }

    public int getSpecialRecipe() {
        return specialRecipe;
    }

    public int getStacks() {
        return stacks;
    }
}
