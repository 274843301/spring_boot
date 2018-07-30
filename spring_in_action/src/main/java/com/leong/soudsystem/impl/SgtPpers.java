package com.leong.soudsystem.impl;

import com.leong.soudsystem.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * @author leongfeng created on 2017-10-31.
 */
@Component
public class SgtPpers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";
    @Override
    public void play() {
        System.out.println("------------------------------------------------------");
        System.out.println("Playing " + title + " by " + artist);
    }
}
