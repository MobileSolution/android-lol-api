package com.mobilesolutions.lolapi.models.statics.enums;

public enum RuneListEnum {
    ALL("all"),
    BASIC("basic"),
    COLLOQ("colloq"),
    CONSUMEONFULL("consumeOnFull"),
    CONSUMED("consumed"),
    DEPTH("depth"),
    FROM("from"),
    GOLD("gold"),
    HIDEFROMALL("hideFromAll"),
    IMAGE("image"),
    INSTORE("inStore"),
    INTO("into"),
    MAPS("maps"),
    REQUIREDCHAMPION("requiredChampion"),
    SANITIZEDDESCRIPTION("sanitizedDescription"),
    SPECIALRECIPE("specialRecipe"),
    STACKS("stcks"),
    STATS("stats"),
    TAGS("tags");

    private String runeData;

    RuneListEnum(String runeData) {
        this.runeData = runeData;
    }

    public String getRuneData() {
        return runeData;
    }
}
