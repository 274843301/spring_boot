package com.leong.soudsystem;

import com.leong.soudsystem.impl.SgtPpers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author leongfeng created on 2017-10-31.
 */
@Configuration
//@ComponentScan
public class CDPlayerConfig {
    /**
     * 显式装配 bean
     * @return
     */
    @Bean
    public CompactDisc setPeppers(){
        return new SgtPpers();
    }

    @Bean
    public CDPlayer getPlayer(){
        return new CDPlayer(setPeppers());
    }
}
