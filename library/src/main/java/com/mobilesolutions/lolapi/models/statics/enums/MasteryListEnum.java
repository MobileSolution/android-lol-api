package com.mobilesolutions.lolapi.models.statics.enums;

public enum MasteryListEnum {
    ALL("all"),
    IMAGE("image"),
    MASTERY_TREE("masteryTree"),
    PEREQ("pereq"),
    RANKS("ranks"),
    SANITIZED_DESCRIPTION("sanitizedDescription"),
    TREE("tree");

    private String masteryData;

    MasteryListEnum(String masteryData) {
        this.masteryData = masteryData;
    }

    public String getMasteryData() {
        return masteryData;
    }
}
