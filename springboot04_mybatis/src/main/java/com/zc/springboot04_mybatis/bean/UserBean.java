package com.zc.springboot04_mybatis.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * TODO
 *
 * @author JY
 * @date 2019/12/16 10:25
 */
@Data
@NoArgsConstructor//无参构造
@AllArgsConstructor//全参构造
public class UserBean {
    @Id
    @GeneratedValue
    private String id;

    private String name;

    private Integer age;
}
