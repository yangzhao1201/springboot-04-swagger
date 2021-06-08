package com.yang.controller;

import com.yang.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TangYuan
 * @create 2021--06--08--14:53
 * @description
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "helloSwagger";
    }

    //只要接口中的返回值存在实体类，就会扫描到swagger中
    @PostMapping("/user")
    public User user(){
        return new User();
    }
}
