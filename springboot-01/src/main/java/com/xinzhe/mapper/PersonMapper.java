package com.xinzhe.mapper;

import com.xinzhe.bean.Person;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PersonMapper {

    @Select("select * from person where pid = #{pid}")
    Person findById(int pid);

    @Select("select * from person")
    List<Person> findAll();

    @Options(useGeneratedKeys = true, keyProperty = "pid")
    @Insert("insert into person(pid, pname, addr, gender, birth) values(#{pid}, #{pname}, #{addr}, #{gender}, #{birth})")
    void insert(Person p);

    @Delete("delete from person where pid = #{pid}")
    void delete(int pid);
}