package com.yang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author TangYuan
 * @create 2021--06--08--14:54
 * @description
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    //配置swagger 的 docket实例
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                //配置分组
                .groupName("汤圆")
                //配置扫描包
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.yang.controller"))
                .build();
    }

    //配置apiInfo的信息
    private ApiInfo apiInfo(){
        Contact contact = new Contact("汤圆", "http://tangyuan.com/", "tangyuan@gmail.com");
        return new ApiInfo(
                "汤圆学习Swagger", // 标题
                "学习演示如何配置Swagger", // 描述
                "v1.0", // 版本
                "http://tangyuan.com/", // 组织链接
                contact, // 联系人信息
                "Apach 2.0 许可", // 许可
                "许可链接", // 许可连接
                new ArrayList<>()// 扩展
        );
    }

    //多个分组
    @Bean
    public Docket docket01() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("yz");
    }
    @Bean
    public Docket docket02() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("niuniu");
    }
    @Bean
    public Docket docket03() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("laifu");
    }
}
