package com.gr00shik.config;

import com.gr00shik.beans.Class2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.gr00shik")

public class Config {

    @Bean(name = "class2")
    public Class2 class2(){
    return new Class2();
    }

//    @Bean
//    public Class3 class3(){
//        return new Class3();
//    }

    @Bean
    public String name(){
        return "NAME";
    }

    @Bean
    public String sname(){
        return "SNAME";
    }

    @Bean
    public Integer age(){
        return 100;
    }
    @Bean
    public CommonAnnotationBeanPostProcessor processor(){
        return new CommonAnnotationBeanPostProcessor();
    }




}
