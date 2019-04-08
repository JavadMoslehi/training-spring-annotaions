package com.me.spring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main (String[] args ) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        //Member member = (Member) applicationContext.getBean("member");
        Member member = applicationContext.getBean(Member.class);
        member.setName("Javad");
        member.setFamily("Moslehi");
        //MemberType memberType = (MemberType) applicationContext.getBean("memberType");
        //MemberType memberType = applicationContext.getBean(MemberType.class);
//        memberType.setDetails("Java Standard Edition");
//        memberType.setTitle("Java");
        //member.setMemberType(memberType);
        System.out.println(member.toString());
    }
}
