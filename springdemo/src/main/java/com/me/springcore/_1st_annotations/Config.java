package com.me.springcore._1st_annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.me")
public class Config {

//    @Bean(name = "member")
//    public Member getMember() {
//        return new Member();
//    }
//    @Bean(name = "memberType")
//    public MemberType getMemberType() {
//        return new MemberType();
//    }
}
