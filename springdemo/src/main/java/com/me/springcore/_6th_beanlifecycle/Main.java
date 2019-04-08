package com.me.springcore._6th_beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("============Constructing spring container==========");
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        System.out.println("============spring container is created============");

        System.out.println("{\n\t\t\t============Getting a bean MemberService class from spring container============");
        MemberService memberService = applicationContext.getBean(MemberService.class);
        System.out.println("\t\t\t============Calling toString() method on gotten bean MemberService class=========");
        System.out.println("\t\t\t            "+memberService.toString()+"         \n}");

        System.out.println("============spring container will be closed========");
        applicationContext.close();
        System.out.println("============spring container was closed============");
    }
}
