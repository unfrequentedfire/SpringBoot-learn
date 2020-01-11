package com.zc.springboot10_easycode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zc.springboot10_easycode.dao")
public class Springboot10EasycodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot10EasycodeApplication.class, args);
    }

}
