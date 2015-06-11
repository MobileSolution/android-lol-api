package com.mobilesolutions.lolapi.models.statics.enums;

public enum ItemListEnum {
    ALL("all"),
    COLLOQ("colloq"),
    CONSUMEONFULL("consumeOnFull"),
    CONSUMED("consumed"),
    DEPTH("depth"),
    FROM("from"),
    GOLD("gold"),
    GROUPS("groups"),
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
    TAGS("tags"),
    FREE("free");

    private String itemData;

    ItemListEnum(String itemData) {
        this.itemData = itemData;
    }

    public String getItemData() {
        return itemData;
    }
}
