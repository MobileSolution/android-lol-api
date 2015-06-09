package com.mobilesolutions.lolapi.models.statics;

import java.io.Serializable;
import java.util.List;


public class LevelTipDto implements Serializable {

    private List<String> effect;
    private List<String> label;

    public List<String> getEffect() {
        return effect;
    }

    public List<String> getLabel() {
        return label;
    }
}
