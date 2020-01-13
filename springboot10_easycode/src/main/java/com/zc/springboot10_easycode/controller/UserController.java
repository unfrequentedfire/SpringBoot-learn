package com.zc.springboot10_easycode.controller;

import com.zc.springboot10_easycode.entity.User;
import com.zc.springboot10_easycode.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (User)表控制层
 *
 * @author Jy
 * @since 2020-01-13 09:03:13
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(String id) {
        return this.userService.queryById(id);
    }

}