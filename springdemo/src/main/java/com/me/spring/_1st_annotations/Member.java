package com.me.spring._1st_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Member {
    private String name;
    private String family;
    private MemberType memberType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public MemberType getMemberType() {
        return memberType;
    }

    @Autowired
    public void setMemberType(MemberType memberType) {
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", memberType=" + memberType +
                '}';
    }
}