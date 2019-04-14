package com.me.springdatawithhibernate.controller;

import com.me.springdatawithhibernate.repository.JPAConfig;
import com.me.springdatawithhibernate.model.Member;
import com.me.springdatawithhibernate.service.servicecontract.MemberService;
import com.me.springdatawithhibernate.service.servicecontractimpl.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        //============================================================================================
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JPAConfig.class);
        //============================================================================================
        MemberService memberService = applicationContext.getBean(MemberServiceImpl.class);
        Member member = applicationContext.getBean(Member.class);
        member.setName("1st name");
        member.setFamily("1st family");
        memberService.save(member);
    }
}
