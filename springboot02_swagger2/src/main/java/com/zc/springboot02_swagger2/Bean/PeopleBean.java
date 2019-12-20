package com.zc.springboot02_swagger2.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO
 *
 * @author JY
 * @date 2019/11/1 17:16
 */
@Data//自动生成setter、getter、toString、equals、hashcod方法
@NoArgsConstructor//生成不带参数的构造方法
@AllArgsConstructor//生成带所有参数的构造方法
public class PeopleBean {
    private String peopleId;
    private String name;
    private String age;
}
