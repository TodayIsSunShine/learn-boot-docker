package com.xiangzi.learnbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 * author:zhangxx
 * Date:2019/9/6
 * Time:9:39
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "i am qianjiu ,please test 111";
    }

    @GetMapping("/world")
    public String world() {
        return "hello,world!";
    }

    @GetMapping("/test")
    public String test() {
        return "qianjiu,test";
    }


    @GetMapping("/qianjiu")
    public String qianjiu() {
        return "qianjiu,you are good";
    }


}
