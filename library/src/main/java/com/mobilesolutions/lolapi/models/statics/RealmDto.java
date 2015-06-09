package com.mobilesolutions.lolapi.models.statics;

import java.io.Serializable;
import java.util.Map;


public class RealmDto implements Serializable {

    private Map<String, String> n;
    private String cdn;
    private String css;
    private String dd;
    private String l;
    private String lg;
    private String store;
    private String v;
    private int profileiconmax;

    public Map<String, String> getN() {
        return n;
    }

    public String getCdn() {
        return cdn;
    }

    public String getCss() {
        return css;
    }

    public String getDd() {
        return dd;
    }

    public String getL() {
        return l;
    }

    public String getLg() {
        return lg;
    }

    public String getStore() {
        return store;
    }

    public String getV() {
        return v;
    }

    public int getProfileiconmax() {
        return profileiconmax;
    }
}
