package com.me.springcore._6th_beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class MemberService implements InitializingBean, DisposableBean {
    private Member member;

    @Autowired
    public void setMember(Member member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return "MemberService{" +
                "member=" + member +
                '}';
    }

    /**
     * If we want to set optional commands for an object when spring core container construct it,
     * we use @PostConstruct annotation with putting it on top of our defined method which has our optional commands.
     * for example here we defined initializeMethod() for performing some commands by spring container when constructing
     * object
     *      System.out.println("initializeMethod() for MemberService object is called by @PostConstruct annotation");
     *      this.member.setName("Name is set by @PostConstruct");
     */
    @PostConstruct//After constructing.
    public void initializeMethod() {
        System.out.println("initializeMethod() for MemberService object is called by @PostConstruct annotation");
        this.member.setName("Name is set by @PostConstruct");
    }

    /**
     * If we want to set optional commands for an object when spring core container deconstruct it (with using method calling close() on container)
     * we use @PreDestroy annotation with putting it on top of our defined method which has our optional commands.
     * for example here we defined initializeMethod() for performing some commands by spring container when constructing
     * object
     *      System.out.println("destroyMethod() is called by @PreDestroy");
     */
    @PreDestroy//Before destroying
    public void destroyMethod() {
        System.out.println("destroyMethod() for MemberService object is called by @PreDestroy annotation");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Related to InitializingBean interface");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Related to DisposableBean interface");
    }
}