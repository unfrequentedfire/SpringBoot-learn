package com.zc.springboot01_demo.controller;

import com.zc.springboot01_demo.Bean.PropertiesBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 读取配置文件——demo
 *
 * @author JY
 * @date 2019/11/7 15:44
 */
@RestController
@RequestMapping(value = "/properties")
public class PropertiesController {
    @Resource
    private PropertiesBean bean;

    @RequestMapping("/test")
    public PropertiesBean test(){
        System.out.println(bean.getName());
        return bean;
    }
}
