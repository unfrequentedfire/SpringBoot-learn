package com.zc.springboot01_demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * SpringBoot——demo
 */
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello world!";
    }

}
