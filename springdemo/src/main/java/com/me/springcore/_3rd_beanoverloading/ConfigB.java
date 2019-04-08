package com.me.springcore._3rd_beanoverloading;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigB {

    @Bean(name = "Member")
    @Scope(value = "singleton")
    public Member getMember() {
        Member member = new Member();
        member.setName("Name from Config B class");
        //member.setFamily("Family from Config B class");
        return member;
    }
}
