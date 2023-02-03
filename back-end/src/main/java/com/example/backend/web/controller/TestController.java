package com.example.backend.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HDH
 * @version 1.0
 */
@RestController
public class TestController {
    // @RequestMapping：配置path
    @RequestMapping("/test")
    public String hello(){
        return "早上好";
    }

}

