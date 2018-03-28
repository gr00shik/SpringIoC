package com.gr00shik.beans;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Class2 {

    @Autowired
    private Class3 class3;


    public Class2() {
    }

    public Class2(Class3 class3) {
        this.class3 = class3;
    }

    public Class3 getClass3() {
        return class3;
    }

    public void setClass3(Class3 class3) {
        this.class3 = class3;
    }
@PostConstruct
    public void init(){
        System.out.println("init method");
    }
@PreDestroy
    public void destroy(){
        System.out.println("Destroy method");
    }

    @Override
    public String toString() {
        return "Class2{" +
                "class3=" + class3 +
                '}';
    }

}
