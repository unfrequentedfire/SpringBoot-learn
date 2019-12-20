package com.zc.springboot03_properties.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author JY
 * @date 2019/12/16 9:17
 */
@Data
@Component
public class PropertiesBean {
    @Value("${com.zc.demo.name}")
    private String name;

    @Value("${com.zc.demo.title}")
    private String title;

    /*@Value("${com.zc.demo.doing}")
    private String doing;*/
}
