package com.mobilesolutions.lolapi;

import com.mobilesolutions.lolapi.models.currentgame.CurrentGameInfo;

import org.junit.Test;

import retrofit.RetrofitError;

public class CurrentGameApiTest extends BaseTest {

    @Test(expected = RetrofitError.class)
    public void testCurrentGameIdNull() {
        final CurrentGameInfo currentGame = LolApi.getCurrentGame(-1);
    }
}
