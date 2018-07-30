package com.leong.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author leongfeng created on 2017-11-01.
 */
@ControllerAdvice
public class AppWideExceptionHandler {

    @ExceptionHandler(DulicateSpittleException.class)
    public String duplicateSpittleHandler(){
        return "error/duplicate";
    }
}
