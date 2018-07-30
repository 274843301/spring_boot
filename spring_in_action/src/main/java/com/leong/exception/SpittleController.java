package com.leong.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author leongfeng created on 2017-11-01.
 */
public class SpittleController {

    @RequestMapping("/save")
    public String save(){
        //save
        return "redirect:/spittles";
    }

    @ExceptionHandler(DulicateSpittleException.class)
    public String handleException(){
        return "error/duplicate";
    }
}
