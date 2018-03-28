package com.gr00shik.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Class1 {

    @Autowired
    @Qualifier("name")
    private String name;

    @Autowired
    @Qualifier("sname")
    private String sname;

    @Autowired
    @Qualifier("age")
    private Integer age;

    public Class1() {
    }

    public Class1(String name, String sname, Integer age) {
        this.name = name;
        this.sname = sname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Class1{" +
                "name='" + name + '\'' +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                '}';
    }



}
