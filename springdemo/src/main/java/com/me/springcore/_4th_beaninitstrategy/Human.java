package com.me.springcore._4th_beaninitstrategy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(value = true)
public class Human {
    public Human() {
        System.out.println("Human bean is created");
    }
}
