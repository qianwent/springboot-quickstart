package com.qwt.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Wentao Qian on 1/17/2018.
 */
@RestController
public class RestControllerAnnotation {

    @RequestMapping("/restc")
    public String index() {
        return "Rest Controller";
    }

}
