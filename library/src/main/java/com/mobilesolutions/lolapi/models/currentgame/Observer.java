package com.mobilesolutions.lolapi.models.currentgame;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class Observer implements Serializable {

    @Expose
    private String encryptionKey;

    public String getEncryptionKey() {
        return encryptionKey;
    }
}
