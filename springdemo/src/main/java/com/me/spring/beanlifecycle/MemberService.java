package com.me.spring.beanlifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class MemberService {
    private Member member;

    @Autowired
    public void setMember(Member member) {
        this.member = member;
    }

    @PostConstruct//After constructing.
    // If we want to set optional initializing on object which spring ioc container construct,
    // we put @PostConstruct annotation on top of the method has setting. Here settings are below 2 lines.
    // System.out.println("initMethod() is called by @PostConstruct");
    // this.member.setName("Name is set by @PostConstruct");
    public void initializeMethod() {
        System.out.println("initMethod() is called by @PostConstruct");
        this.member.setName("Name is set by @PostConstruct");
    }

    @PreDestroy//Before destroying
    // If we want to set optional initializing on object which spring ioc container construct,
    // we put @PostConstruct annotation on top of the method has setting. Here settings are below 2 lines.
    // System.out.println("initMethod() is called by @PostConstruct");
    // this.member.setName("Name is set by @PostConstruct");
    public void destroyMethod() {
        System.out.println("destroyMethod() is called by @PreDestroy");
    }
}
