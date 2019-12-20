package com.zc.springboot02_swagger2;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * TODO
 *
 * @author JY
 * @date 2019/11/4 8:43
 */
@Configuration
// 启用 Swagger2
@EnableSwagger2
@ConditionalOnProperty(name ="enabled" ,prefix = "swagger",havingValue = "true",matchIfMissing = true)
public class Swagger2Config {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zc.springboot02_swagger2.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                //标题
                .title("springboot利用swagger构建API文档")
                //API文档描述
                .description("简单优雅的restful风格")
                //文档作者信息
                .contact(new Contact("张超","https://github.com/unfrequentedfire","1776555345@qq.com"))
                //文档版本
                .version("1.0")
                .build();
    }
}
