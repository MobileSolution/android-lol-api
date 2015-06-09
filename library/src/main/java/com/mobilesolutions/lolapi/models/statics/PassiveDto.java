package com.mobilesolutions.lolapi.models.statics;

import java.io.Serializable;

public class PassiveDto implements Serializable {

    private String description;
    private String name;
    private String sanitizedDescription;
    private ImageDto image;

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getSanitizedDescription() {
        return sanitizedDescription;
    }

    public ImageDto getImage() {
        return image;
    }
}
