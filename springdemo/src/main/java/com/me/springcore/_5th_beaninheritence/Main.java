package com.me.springcore._5th_beaninheritence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springcore.xml");
        Parent parent = (Parent) applicationContext.getBean("parentid");
        System.out.println(parent.toString());
    }
}
