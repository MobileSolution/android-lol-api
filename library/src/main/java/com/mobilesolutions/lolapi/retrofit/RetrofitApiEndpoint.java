package com.mobilesolutions.lolapi.retrofit;

import com.mobilesolutions.lolapi.utls.ErrorConstants;
import com.mobilesolutions.lolapi.utls.RegionsEnum;

import retrofit.Endpoint;

/**
 * Dynamic endpoint base on region.
 * <p/>
 * Created by georgi.eftimov on 08/06/2015.
 */
public class RetrofitApiEndpoint implements Endpoint {

    private static final String ENDPOINT = "https://%s.api.pvp.net";

    private String url;
    private String region;
    private RegionsEnum regionEnum;

    public void setRegion(final String region) {
        this.region = region;
        this.url = String.format(ENDPOINT, region);
        setRegionEnum(findEnumByRegionString(region));
    }

    public String getRegion() {
        return region;
    }

    @Override
    public String getName() {
        return region;
    }

    @Override
    public String getUrl() {
        if (url == null) {
            throw new IllegalStateException(ErrorConstants.ERROR_NO_REGION_PROVIDED);
        }
        return url;
    }

    public RegionsEnum getRegionEnum() {
        return regionEnum;
    }

    public void setRegionEnum(RegionsEnum regionEnum) {
        this.regionEnum = regionEnum;
    }

    private RegionsEnum findEnumByRegionString(final String region) {
        for (RegionsEnum regionsEnum : RegionsEnum.values()) {
            if (regionsEnum.getRegion().equalsIgnoreCase(region)) {
                return regionsEnum;
            }
        }
        return RegionsEnum.DEFAULT;
    }
}
