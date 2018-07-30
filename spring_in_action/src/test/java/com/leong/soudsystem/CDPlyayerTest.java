package com.leong.soudsystem;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author leongfeng created on 2017-10-31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
//@SpringBootTest
public class CDPlyayerTest {

    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    CDPlayer player;

    @Test
    public void cdShouldNotBeNull(){
        Assert.assertNotNull(compactDisc);
    }

    @Test
    public void testPlay(){
        player.play();
    }

}
