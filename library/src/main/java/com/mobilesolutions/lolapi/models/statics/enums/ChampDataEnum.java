package com.mobilesolutions.lolapi.models.statics.enums;

public enum ChampDataEnum {
    ALL,
    ALLYTIPS,
    ALTIMAGES,
    BLURB,
    ENEMY_TIPS,
    IMAGE,
    INFO,
    LORE,
    PARTTYPE,
    PASSIVE,
    RECOMMENDED,
    SKINS,
    SPELLS,
    STATS,
    TAGS;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
