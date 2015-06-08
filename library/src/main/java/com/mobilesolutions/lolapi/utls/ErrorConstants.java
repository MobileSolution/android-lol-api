package com.mobilesolutions.lolapi.utls;

/**
 * Error constants in the api.
 * <p/>
 * Created by georgi.eftimov on 08/06/2015.
 */
public class ErrorConstants {

    private ErrorConstants() {
        //no instances.
    }

    public static final String ERROR_NO_REGION_PROVIDED = "No region provided. Please call LolApi.setRegion(region).";
    public static final String ERROR_NO_API_KEY_PROVIDED = "Api key should not be null. Please call LolApi.init(apiKey) with not null reference.";
}
