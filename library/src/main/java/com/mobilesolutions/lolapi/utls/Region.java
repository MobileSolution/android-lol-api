package com.mobilesolutions.lolapi.utls;

public enum Region {
    BR("BR", "BR1"),
    EUNE("EUNE", "EUN1"),
    EUW("EUW", "EUW1"),
    KR("KR", "KR"),
    LAN("LAN", "LA1"),
    LAS("LAS", "LA2"),
    NA("NA", "NA1"),
    OCE("OCE", "OC1"),
    PBE("PBE", "PBE1"),
    RU("RU", "RU"),
    TR("TR", "TR1"),
    DEFAULT("Global","");

    private final String region;
    private final String platformId;

    Region(final String region, final String platformId) {
        this.region = region;
        this.platformId = platformId;
    }

    public String getRegion() {
        return region.toLowerCase();
    }

    public String getPlatformId() {
        return platformId;
    }
}
