package com.leong.web;

import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * @author leongfeng created on 2017-11-01.
 */
public class HomeController {


    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@Valid Spitter spitter, Errors errors){
        if (errors.hasErrors()){
            return "home";
        }
        return "success";
    }
}
