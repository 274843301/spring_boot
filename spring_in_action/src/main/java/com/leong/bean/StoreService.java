package com.leong.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author leongfeng created on 2017-10-31.
 */
@Component
public class StoreService {

    @Autowired
    private ShoppingCart shoppingCart;
}
