package com.zc.springboot10_easycode.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-01-11 16:28:31
 */
public class User implements Serializable {
    private static final long serialVersionUID = -77068439142871068L;
    
    private String id;
    
    private String name;
    
    private Integer age;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}