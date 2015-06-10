package com.mobilesolutions.lolapi.models.status;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.mobilesolutions.lolapi.models.status.enums.Severity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Message implements Serializable {

    @Expose
    private String author;
    @Expose
    private String content;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @Expose
    private long id;
    @Expose
    private Severity severity;
    @Expose
    private List<Translation> translations = new ArrayList<Translation>();
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public long getId() {
        return id;
    }

    public Severity getSeverity() {
        return severity;
    }

    public List<Translation> getTranslations() {
        return translations;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}