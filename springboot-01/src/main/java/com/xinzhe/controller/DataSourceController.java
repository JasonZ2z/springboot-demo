package com.xinzhe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class DataSourceController {

    @Autowired
    private DataSource dataSource;

    @RequestMapping("print")
    public String print() {
        return dataSource.toString();
    }
}