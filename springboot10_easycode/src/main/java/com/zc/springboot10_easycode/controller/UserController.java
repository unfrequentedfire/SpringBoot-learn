package com.zc.springboot10_easycode.controller;

import com.zc.springboot10_easycode.entity.User;
import com.zc.springboot10_easycode.service.UserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * (User)表控制层
 *
 * @author Jy
 * @since 2020-01-13 10:39:28
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    @GetMapping(value="")
    public ModelAndView login(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/{id}")
    public User selectOne(@PathVariable("id") String id){
        return this.userService.queryById(id);
    }
    
    /**
     * 新增一条数据
     *
     * @param user 对象
     * @return 新增条数
     */
    @PostMapping("/add")
    public int add(@RequestBody User user){
        return this.userService.insert(user);
    }

}