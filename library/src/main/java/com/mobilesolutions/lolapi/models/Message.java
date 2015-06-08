package com.mobilesolutions.lolapi.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Message {

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
    private String severity;
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

    public String getSeverity() {
        return severity;
    }

    public List<Translation> getTranslations() {
        return translations;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
