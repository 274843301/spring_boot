package com.leong.soudsystem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author leongfeng created on 2017-10-31.
 */
@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }

    public void play(){
        cd.play();
    }

}
