package com.gr00shik.beans;

public class Class2 {

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

    public void init(){
        System.out.println("init method");
    }

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
