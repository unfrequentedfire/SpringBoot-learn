package com.zc.springboot01_demo.controller;

import com.zc.springboot01_demo.Bean.PeopleBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * LomBok——demo
 *
 * @author JY
 * @date 2019/11/1 17:27
 */
@RestController
@RequestMapping("/people")
public class PeopleController {

    @GetMapping(value = "/testLombok")
    public PeopleBean getPeople(){
        PeopleBean peopleBean = new PeopleBean();
        peopleBean.setPeopleId("10000001");
        peopleBean.setAge("24");
        peopleBean.setName("张三");

        return peopleBean;
    }

}
