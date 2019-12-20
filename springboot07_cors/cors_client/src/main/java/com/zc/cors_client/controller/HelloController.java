package com.zc.cors_client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * TODO
 *
 * @author JY
 * @date 2019/12/20 16:30
 */
@RestController
public class HelloController {
    @RequestMapping("/index")
    public ModelAndView index(){
        //传入的是视图文件名
        ModelAndView mv = new ModelAndView("index");

        //添加属性
        mv.addObject("msg", "hello Spring MVC");
        return mv;
    }
}
