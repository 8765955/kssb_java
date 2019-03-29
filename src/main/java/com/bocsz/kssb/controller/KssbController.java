package com.bocsz.kssb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhengj
 * @create 2019-03-29 15:33
 */
@Controller
public class KssbController {

    @ResponseBody
    @RequestMapping("/hello")
    public String test(){
        return "hello world";
    }
}
