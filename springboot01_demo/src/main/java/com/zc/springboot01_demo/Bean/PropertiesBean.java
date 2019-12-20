package com.zc.springboot01_demo.Bean;

import lombok.Data;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author JY
 * @date 2019/11/7 15:38
 */
@Data
@Component
public class PropertiesBean {
    @Value("${com.zc.demo.name}")
    private String name;

    @Value("${com.zc.demo.title}")
    private String title;
}
