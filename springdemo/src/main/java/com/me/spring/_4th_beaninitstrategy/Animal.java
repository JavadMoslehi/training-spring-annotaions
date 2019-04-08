package com.me.spring._4th_beaninitstrategy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(value = false)
public class Animal {
    public Animal() {
        System.out.println("Animal bean is created");
    }
}
