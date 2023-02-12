package com.example.last;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@MapperScan(basePackages = "com.example.mapper")
public class LastApplication {

    @ResponseBody
    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    public static void main(String[] args) {
        SpringApplication.run(LastApplication.class, args);
    }

}
