package com.mobilesolutions.lolapi.models.champion;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class ChampionDto implements Serializable {

    @Expose
    private boolean botMmEnabled;
    @Expose
    private long id;
    @Expose
    private boolean rankedPlayEnabled;
    @Expose
    private boolean botEnabled;
    @Expose
    private boolean active;
    @Expose
    private boolean freeToPlay;

    /**
     * @return The botMmEnabled
     */
    public boolean isBotMmEnabled() {
        return botMmEnabled;
    }

    /**
     * @param botMmEnabled The botMmEnabled
     */
    public void setBotMmEnabled(boolean botMmEnabled) {
        this.botMmEnabled = botMmEnabled;
    }

    /**
     * @return The id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return The rankedPlayEnabled
     */
    public boolean isRankedPlayEnabled() {
        return rankedPlayEnabled;
    }

    /**
     * @param rankedPlayEnabled The rankedPlayEnabled
     */
    public void setRankedPlayEnabled(boolean rankedPlayEnabled) {
        this.rankedPlayEnabled = rankedPlayEnabled;
    }

    /**
     * @return The botEnabled
     */
    public boolean isBotEnabled() {
        return botEnabled;
    }

    /**
     * @param botEnabled The botEnabled
     */
    public void setBotEnabled(boolean botEnabled) {
        this.botEnabled = botEnabled;
    }

    /**
     * @return The active
     */
    public boolean isActive() {
        return active;
    }

    /**
     * @param active The active
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * @return The freeToPlay
     */
    public boolean isFreeToPlay() {
        return freeToPlay;
    }

    /**
     * @param freeToPlay The freeToPlay
     */
    public void setFreeToPlay(boolean freeToPlay) {
        this.freeToPlay = freeToPlay;
    }

}