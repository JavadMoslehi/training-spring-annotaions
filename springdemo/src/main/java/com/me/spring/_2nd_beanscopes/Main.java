package com.me.spring._2nd_beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container1 = new AnnotationConfigApplicationContext(Config.class);
        MyMessage myMessage1 = (MyMessage) container1.getBean("singletonScope");
        myMessage1.setMessage("This is first Message");
        System.out.println(myMessage1.toString());

        MyMessage myMessage2 = (MyMessage) container1.getBean("prototypeScope");
        System.out.println(myMessage2.toString());

    }
}
