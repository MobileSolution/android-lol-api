package com.mobilesolutions.lolapi;

import org.junit.Before;

/**
 * The base test for all tests.
 * <p/>
 * Created by georgi.eftimov on 12/06/2015.
 */
public class BaseTest {

    protected static final String API_KEY = "1fcc2cda-891d-4042-a454-a61a2c79fa4b";

    @Before
    public void init() {
        LolApi.init(API_KEY);
        LolApi.setRegion("eune");
    }
}
