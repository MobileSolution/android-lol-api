package com.mobilesolutions.lolapi.models.statics;

import java.io.Serializable;

public class InfoDto implements Serializable {

    private int attack;
    private int defense;
    private int difficulty;
    private int magic;

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public int getMagic() {
        return magic;
    }
}
