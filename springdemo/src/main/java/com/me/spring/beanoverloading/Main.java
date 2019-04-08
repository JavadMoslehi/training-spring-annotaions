package com.me.spring.beanoverloading;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        /**
         * In this container, ConfigB class overloads on ConfigA class
         */
        ApplicationContext container1 = new AnnotationConfigApplicationContext(ConfigA.class, ConfigB.class);
//        /**
//         * In this container, ConfigA class overloads on ConfigB class
//         */
//        ApplicationContext container1 = new AnnotationConfigApplicationContext(ConfigB.class, ConfigA.class);
        Member member = container1.getBean(Member.class);
        System.out.println(member.toString());



    }
}
