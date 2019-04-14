package com.me.springdatawithhibernate.repository.repositorycontract;

import com.me.springdatawithhibernate.model.Member;

public interface MemberDao {
    void save(Member member);
}
