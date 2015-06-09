package com.mobilesolutions.lolapi.models.statics;

import java.io.Serializable;


public class GoldDto implements Serializable {

    private boolean purchasable;
    private int base;
    private int sell;
    private int total;

    public boolean isPurchasable() {
        return purchasable;
    }

    public int getBase() {
        return base;
    }

    public int getSell() {
        return sell;
    }

    public int getTotal() {
        return total;
    }
}
