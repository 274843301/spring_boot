package com.leong.web;

import lombok.Data;
import org.springframework.context.support.MessageSourceResourceBundle;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author leongfeng created on 2017-11-01.
 */
@Data
public class Spitter {

    private Long id;
    @NotNull
    @Size(min = 5, max = 16)
    private String username;
    @NotNull
    @Size(min = 5, max = 25)
    private String password;

}
