package com.xinzhe.controller;

import com.xinzhe.bean.Person;
import com.xinzhe.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MybatisController {

    @Autowired
    private PersonMapper personMapper;

    @RequestMapping("selectById")
    public Person selectById() {
        return personMapper.findById(1);
    }

    @RequestMapping("selectAll")
    public List<Person> selectAll() {
        return personMapper.findAll();
    }
}