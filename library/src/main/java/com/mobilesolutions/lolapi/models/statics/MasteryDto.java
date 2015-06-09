package com.mobilesolutions.lolapi.models.statics;

import java.io.Serializable;
import java.util.List;


public class MasteryDto implements Serializable {

    private List<String> description;
    private List<String> sanitizedDescription;
    private ImageDto image;
    private int id;
    private int ranks;
    private String name;
    private String prereq;
    private String masteryTree;

    public List<String> getDescription() {
        return description;
    }

    public List<String> getSanitizedDescription() {
        return sanitizedDescription;
    }

    public ImageDto getImage() {
        return image;
    }

    public int getId() {
        return id;
    }

    public int getRanks() {
        return ranks;
    }

    public String getName() {
        return name;
    }

    public String getPrereq() {
        return prereq;
    }

    public String getMasteryTree() {
        return masteryTree;
    }
}
