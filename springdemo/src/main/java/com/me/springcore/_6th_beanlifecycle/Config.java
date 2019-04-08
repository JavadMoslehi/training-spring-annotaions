package com.me.springcore._6th_beanlifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Config {
//    @Bean(initMethod = "initializeMethod", destroyMethod = "destroyMethod")
//    public MemberService getMemberService() {
//        return new MemberService();
//    }
}
