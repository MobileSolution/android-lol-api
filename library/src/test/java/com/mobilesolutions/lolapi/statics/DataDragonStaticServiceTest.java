package com.mobilesolutions.lolapi.statics;

import com.mobilesolutions.lolapi.statics.datadragon.DataDragonStaticService;

import org.junit.Assert;
import org.junit.Test;

public class DataDragonStaticServiceTest {

    @Test(expected = IllegalArgumentException.class)
    public void testChampionNullVersion() {
        final DataDragonStaticService dataDragonStaticService = DataDragonStaticService.forVersion(null);
        final String championImage = dataDragonStaticService.getChampionImage("Aatrox");
        Assert.assertEquals("http://ddragon.leagueoflegends.com/cdn/5.9.1/img/champion/Aatrox.png", championImage);
    }

    @Test
    public void testChampionImage() {
        final DataDragonStaticService dataDragonStaticService = DataDragonStaticService.forVersion("5.9.1");
        final String championImage = dataDragonStaticService.getChampionImage("Aatrox");
        Assert.assertEquals("http://ddragon.leagueoflegends.com/cdn/5.9.1/img/champion/Aatrox.png", championImage);
    }

    @Test
    public void testChampionImageWithSuffix() {
        final DataDragonStaticService dataDragonStaticService = DataDragonStaticService.forVersion("5.9.1");
        final String championImage = dataDragonStaticService.getChampionImage("Aatrox.png");
        Assert.assertEquals("http://ddragon.leagueoflegends.com/cdn/5.9.1/img/champion/Aatrox.png", championImage);
    }

    @Test
    public void testChampionImageWithNull() {
        final DataDragonStaticService dataDragonStaticService = DataDragonStaticService.forVersion("5.9.1");
        final String championImage = dataDragonStaticService.getChampionImage(null);
        Assert.assertNull(championImage);
    }

    @Test
    public void testChampionSpellImage() {
        final DataDragonStaticService dataDragonStaticService = DataDragonStaticService.forVersion("5.9.1");
        final String championSpellImage = dataDragonStaticService.getSpellImage("SummonerFlash");
        Assert.assertEquals("http://ddragon.leagueoflegends.com/cdn/5.9.1/img/spell/SummonerFlash.png", championSpellImage);
    }

    @Test
    public void testChampionSpellImageWithSuffix() {
        final DataDragonStaticService dataDragonStaticService = DataDragonStaticService.forVersion("5.9.1");
        final String championSpellImage = dataDragonStaticService.getSpellImage("SummonerFlash.png");
        Assert.assertEquals("http://ddragon.leagueoflegends.com/cdn/5.9.1/img/spell/SummonerFlash.png", championSpellImage);
    }

    @Test
    public void testChampionSpellImageNull() {
        final DataDragonStaticService dataDragonStaticService = DataDragonStaticService.forVersion("5.9.1");
        final String championSpellImage = dataDragonStaticService.getSpellImage(null);
        Assert.assertNull(championSpellImage);
    }

    @Test
    public void testChampionItemImage() {
        final DataDragonStaticService dataDragonStaticService = DataDragonStaticService.forVersion("5.9.1");
        final String championItemImage = dataDragonStaticService.getChampionItemImage("1001");
        Assert.assertEquals("http://ddragon.leagueoflegends.com/cdn/5.9.1/img/item/1001.png", championItemImage);
    }

    @Test
    public void testChampionItemImageWithSuffix() {
        final DataDragonStaticService dataDragonStaticService = DataDragonStaticService.forVersion("5.9.1");
        final String championItemImage = dataDragonStaticService.getChampionItemImage("1001.png");
        Assert.assertEquals("http://ddragon.leagueoflegends.com/cdn/5.9.1/img/item/1001.png", championItemImage);
    }

    @Test
    public void testChampionItemImageNull() {
        final DataDragonStaticService dataDragonStaticService = DataDragonStaticService.forVersion("5.9.1");
        final String championItemImage = dataDragonStaticService.getChampionItemImage(null);
        Assert.assertNull(championItemImage);
    }

}
