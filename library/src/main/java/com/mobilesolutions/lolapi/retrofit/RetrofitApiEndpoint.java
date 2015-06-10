package com.mobilesolutions.lolapi.retrofit;

import com.mobilesolutions.lolapi.utls.ErrorConstants;
import com.mobilesolutions.lolapi.utls.Region;

import retrofit.Endpoint;

/**
 * Dynamic endpoint base on region.
 * <p/>
 * Created by georgi.eftimov on 08/06/2015.
 */
public class RetrofitApiEndpoint implements Endpoint {

    private static final String ENDPOINT = "https://%s.api.pvp.net";
    private static final String SHARDS_ENDPOINT = "http://status.leagueoflegends.com/";

    private String url;
    private Region regionEnum;

    public void setRegion(final String region) {
        this.url = String.format(ENDPOINT, region);
        this.regionEnum = findEnumByRegionString(region);
    }

    public String getRegion() {
        return regionEnum.getRegion();
    }

    public String getPlatformId() {
        return regionEnum.getPlatformId();
    }

    @Override
    public String getName() {
        return regionEnum.getRegion();
    }

    @Override
    public String getUrl() {
        if (url == null) {
            throw new IllegalStateException(ErrorConstants.ERROR_NO_REGION_PROVIDED);
        }
        return url;
    }

    public void useShardsEndpoint() {
        this.url = SHARDS_ENDPOINT;
    }

    public void useRegionEndpoint() {
        this.url = String.format(ENDPOINT, regionEnum.getRegion());
    }

    private Region findEnumByRegionString(final String region) {
        for (Region regionsEnum : Region.values()) {
            if (regionsEnum.getRegion().equalsIgnoreCase(region)) {
                return regionsEnum;
            }
        }
        return Region.DEFAULT;
    }
}
