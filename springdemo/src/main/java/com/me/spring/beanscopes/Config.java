package com.me.spring.beanscopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan
public class Config {

    @Bean(name = "singletonScope")
    @Scope(value = "singleton")
    public MyMessage getMyMessage1() {
        return new MyMessage();
    }

    @Bean(name = "prototypeScope")
    @Scope(value = "prototype")
    public MyMessage getMyMessage2() {
        return new MyMessage();
    }
}
