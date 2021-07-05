package com.xinzhe.mapper;

import com.xinzhe.bean.Person;

import java.util.List;

public interface PersonMapper {

    Person findById(int pid);

    List<Person> findAll();

    void insert(Person p);

    void delete(int pid);
}