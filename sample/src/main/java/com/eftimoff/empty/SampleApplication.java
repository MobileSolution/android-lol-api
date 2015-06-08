package com.eftimoff.empty;

import android.app.Application;

import com.mobilesolutions.lolapi.LolApi;

public class SampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        final String apiKey = "1fcc2cda-891d-4042-a454-a61a2c79fa4b";
        LolApi.init(apiKey);
    }
}
