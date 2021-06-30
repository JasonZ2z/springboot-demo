package com.xinzhe.controller;

import com.xinzhe.bean.Acme;
import com.xinzhe.bean.MyProperties;
import com.xinzhe.bean.TestProp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Acme acme;

    @Autowired
    private MyProperties properties;

    @Autowired
    private TestProp test;

    @RequestMapping("hello")
    public String hello(){
        return "Hello World!";
    }

    @RequestMapping("acme")
    public Acme acme(){
        return acme;
    }

    @RequestMapping("prop")
    public MyProperties prop(){
        return properties;
    }

    @RequestMapping("test")
    public TestProp test(){
        return test;
    }
}