package com.example.springbootdemo_001;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConroller {
    @RequestMapping("/hello")

    public String hello(){
        System.out.println("hello");
        System.out.println("hello");

        System.out.println("hello");






        return "hello";
    }










}
