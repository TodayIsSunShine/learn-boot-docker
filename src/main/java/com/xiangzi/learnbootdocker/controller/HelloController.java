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
        return "hello,docker!";
    }

    @GetMapping("/world")
    public String world() {
        return "hello,world!";
    }

    @GetMapping("/test")
    public String test() {
        return "qianjiu,test";
    }


}
