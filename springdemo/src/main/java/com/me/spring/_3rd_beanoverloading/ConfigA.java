package com.me.spring._3rd_beanoverloading;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigA {

    @Bean(name = "Member")
    @Scope(value = "singleton")
    public Member getMember() {
        Member member = new Member();
        member.setName("Name from Config A class");
        member.setFamily("Family from Config A class");
        return member;
    }
}
