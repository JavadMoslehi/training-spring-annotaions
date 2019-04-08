package com.me.spring.beaninheritence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Parent parent = (Parent) applicationContext.getBean("parentid");
        System.out.println(parent.toString());
    }
}
