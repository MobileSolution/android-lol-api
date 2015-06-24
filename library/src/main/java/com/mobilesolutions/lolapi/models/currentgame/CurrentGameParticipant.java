package com.mobilesolutions.lolapi.models.currentgame;

import com.google.gson.annotations.Expose;
import com.mobilesolutions.lolapi.models.common.Mastery;
import com.mobilesolutions.lolapi.models.common.Rune;
import com.mobilesolutions.lolapi.models.statics.ChampionDto;
import com.mobilesolutions.lolapi.models.statics.SummonerSpellDto;

import java.io.Serializable;
import java.util.List;

public class CurrentGameParticipant implements Serializable {

    @Expose
    private boolean bot;
    @Expose
    private long championId;
    @Expose
    private List<Mastery> masteries;
    @Expose
    private long profileIconId;
    @Expose
    private List<Rune> runes;
    @Expose
    private long spell1Id;
    @Expose
    private long spell2Id;
    @Expose
    private long summonerId;
    @Expose
    private String summonerName;
    @Expose
    private long teamId;

    private ChampionDto champion;
    private SummonerSpellDto spell1;
    private SummonerSpellDto spell2;

    public boolean isBot() {
        return bot;
    }

    public long getChampionId() {
        return championId;
    }

    public List<Mastery> getMasteries() {
        return masteries;
    }

    public long getProfileIconId() {
        return profileIconId;
    }

    public List<Rune> getRunes() {
        return runes;
    }

    public long getSpell1Id() {
        return spell1Id;
    }

    public long getSpell2Id() {
        return spell2Id;
    }

    public long getSummonerId() {
        return summonerId;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public long getTeamId() {
        return teamId;
    }

    public ChampionDto getChampion() {
        return champion;
    }

    public void setChampion(ChampionDto champion) {
        this.champion = champion;
    }

    public SummonerSpellDto getSpell1() {
        return spell1;
    }

    public void setSpell1(SummonerSpellDto spell1) {
        this.spell1 = spell1;
    }

    public SummonerSpellDto getSpell2() {
        return spell2;
    }

    public void setSpell2(SummonerSpellDto spell2) {
        this.spell2 = spell2;
    }
}
