package com.zc.cors_server.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author JY
 * @date 2019/12/20 16:23
 */
@RestController
@RequestMapping("/cors")
@CrossOrigin
public class CorsController {

    @RequestMapping("/test")
    public String test(){
        return "hello！这是8082提供的服务，你访问到我了！！！";
    }
}
