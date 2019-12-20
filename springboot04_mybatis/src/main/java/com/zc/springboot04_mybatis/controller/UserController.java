package com.zc.springboot04_mybatis.controller;

import com.zc.springboot04_mybatis.bean.UserBean;
import com.zc.springboot04_mybatis.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * TODO
 *
 * @author JY
 * @date 2019/12/16 14:01
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService service;

    @PostMapping("/")
    public int add(@RequestBody UserBean bean){
        return service.create(bean);
    }

    @PutMapping("/{id}")
    public int updateStudent(@PathVariable("id") String id, @RequestParam UserBean bean){
        bean.setId(id);
        return service.update(bean);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("id") String id){
        service.delete(id);
    }

    @GetMapping("/{id}")
    public UserBean findStudentById(@PathVariable("id") String id){
        return service.get(id);
    }

    @GetMapping("/list")
    public List<UserBean> findStudentList(@RequestParam HashMap<String,Object> map){
        return service.findList(map);
    }
}
