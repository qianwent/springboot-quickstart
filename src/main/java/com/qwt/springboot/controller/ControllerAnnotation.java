package com.qwt.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Wentao Qian on 1/17/2018.
 */
@Controller
public class ControllerAnnotation {

    @RequestMapping("/c")
    @ResponseBody
    public String index() {
        return "Regular Controller";
    }

}
