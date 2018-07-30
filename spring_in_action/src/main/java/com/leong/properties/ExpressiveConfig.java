package com.leong.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author leongfeng created on 2017-10-31.
 */
@Component
@PropertySource("classpath:app.properties")
public class ExpressiveConfig {
    @Autowired
    Environment env;
}
