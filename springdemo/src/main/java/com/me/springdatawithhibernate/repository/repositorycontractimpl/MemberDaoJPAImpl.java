package com.me.springdatawithhibernate.repository.repositorycontractimpl;

import com.me.springdatawithhibernate.model.Member;
import com.me.springdatawithhibernate.repository.repositorycontract.MemberDao;
import org.springframework.stereotype.Repository;

import javax.persistence.*;


@Repository
public class MemberDaoJPAImpl implements MemberDao {
    /**
     * @PersistenceContext is same @Autowired but it's optional for database beans
     * If exist a transaction, @PersistenceUnit connects this.entityManagerFactory to current transaction.
     * If does not exist any transaction, at first @PersistenceUnit create a transaction and hence connects this.entityManagerFactory to created transaction.
     */
    @PersistenceContext
    private EntityManagerFactory entityManagerFactory;

    public void save(Member member) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(member);
        transaction.commit();
        entityManager.close();
    }
}
