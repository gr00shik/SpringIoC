package com.gr00shik;

import com.gr00shik.beans.Class1;
import com.gr00shik.beans.Class2;
import com.gr00shik.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.registerShutdownHook();
        context.register(Config.class);
        context.refresh();
        Class2 class2 = context.getBean("class2", Class2.class);
        System.out.println(class2.toString());

        Class1 class1 = context.getBean("class1", Class1.class);
        System.out.println(class1.toString());
    }
}
