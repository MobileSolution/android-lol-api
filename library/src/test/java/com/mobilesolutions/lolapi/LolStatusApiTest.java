package com.mobilesolutions.lolapi;

import com.mobilesolutions.lolapi.models.status.Shard;
import com.mobilesolutions.lolapi.models.status.ShardStatus;

import junit.framework.Assert;

import org.junit.Test;

import java.util.List;

public class LolStatusApiTest extends BaseTest {

    @Test
    public void testGetShardsNotNull() {
        final List<Shard> shards = LolApi.getShards();
        Assert.assertNotNull(shards);
    }

    @Test
    public void testGetShards() {
        final List<Shard> shards = LolApi.getShards();
        Assert.assertTrue(shards.size() > 0);
    }

    @Test
    public void testGetShardsStatusNotNull() {
        final ShardStatus shardStatus = LolApi.getShardStatus();
        Assert.assertNotNull(shardStatus);
    }
}
