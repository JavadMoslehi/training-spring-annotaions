package com.me.springdatawithhibernate.service.servicecontractimpl;

import com.me.springdatawithhibernate.model.Member;
import com.me.springdatawithhibernate.repository.repositorycontract.MemberDao;
import com.me.springdatawithhibernate.service.servicecontract.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Service is same @Component but uses for beans of service layer which is connected to use cases
 * in other words @Service shows beans which are in service (business logic) layer
 */
@Service
/**
 * @Transactional shows a transaction begins from this layer
 */
@Transactional
public class MemberServiceImpl implements MemberService {
    //@Autowired
    private MemberDao memberDao;

    /**
     * Setter injection
     * @param memberDao
     */
    @Autowired
    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    @Override
    public void save(Member member) {
        memberDao.save(member);
    }
}
