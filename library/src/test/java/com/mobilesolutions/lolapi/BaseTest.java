package com.mobilesolutions.lolapi;

import android.content.Context;
import android.test.ServiceTestCase;

import junit.framework.TestCase;

import org.junit.Before;

import java.lang.reflect.Method;

import retrofit.RestAdapter;

/**
 * The base test for all tests.
 * <p/>
 * Created by georgi.eftimov on 12/06/2015.
 */
public class BaseTest  extends TestCase {

    protected static final String API_KEY = "1fcc2cda-891d-4042-a454-a61a2c79fa4b";

    /**
     * @return The {@link Context} of the test project.
     */
    private Context getTestContext()
    {
        try
        {
            Method getTestContext = ServiceTestCase.class.getMethod("getTestContext");
            return (Context) getTestContext.invoke(this);
        }
        catch (final Exception exception)
        {
            exception.printStackTrace();
            return null;
        }
    }

    @Before
    public void init() {
        LolApi.init(API_KEY, RestAdapter.LogLevel.FULL,getTestContext());
        LolApi.setRegion("eune");
    }
}
