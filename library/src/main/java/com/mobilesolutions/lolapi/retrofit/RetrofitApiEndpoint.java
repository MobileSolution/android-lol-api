package com.mobilesolutions.lolapi.retrofit;

import com.mobilesolutions.lolapi.utls.ErrorConstants;

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

    public void setRegion(final String region) {
        this.region = region;
        this.url = String.format(ENDPOINT, region);
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
}
