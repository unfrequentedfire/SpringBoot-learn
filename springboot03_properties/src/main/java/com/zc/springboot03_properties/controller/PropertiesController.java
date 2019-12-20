package com.zc.springboot03_properties.controller;

import com.zc.springboot03_properties.bean.PropertiesBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @author JY
 * @date 2019/12/16 9:17
 */
@RestController
@RequestMapping(value = "/properties")
public class PropertiesController {
    @Resource
    private PropertiesBean bean;

    @RequestMapping("/test")
    public PropertiesBean test(){
        return bean;
    }
}
