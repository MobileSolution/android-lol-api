package com.mobilesolutions.lolapi.models.status;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Translation implements Serializable {

    @Expose
    private String content;
    @Expose
    private String locale;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    public String getContent() {
        return content;
    }

    public String getLocale() {
        return locale;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
