package com.gr00shik;

import com.gr00shik.beans.Class1;
import com.gr00shik.beans.Class2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        context.registerShutdownHook();
        Class1 class1 = context.getBean("class1", Class1.class);
        System.out.println(class1.toString());
        Class2 class2 = context.getBean("class2", Class2.class);
        System.out.println(class2.toString());
    }
}
