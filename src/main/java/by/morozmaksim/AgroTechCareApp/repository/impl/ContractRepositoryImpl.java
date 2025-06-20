package by.morozmaksim.AgroTechCareApp.repository.impl;

import by.morozmaksim.AgroTechCareApp.repository.ContractRepository;
import by.morozmaksim.AgroTechCareApp.domain.contract.Contract;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ContractRepositoryImpl implements ContractRepository {

    private final SessionFactory sessionFactory;

    @Override
    public Contract findById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Contract contract = session.get(Contract.class, id);
        session.getTransaction().commit();
        return contract;
    }

    @Override
    public List<Contract> findAll() {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        List<Contract> contracts = session.createQuery("from Contract", Contract.class).getResultList();
        session.getTransaction().commit();
        return contracts;
    }

    @Override
    public Contract create(Contract contract) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.persist(contract);
        session.getTransaction().commit();
        return contract;
    }

    @Override
    public Contract update(Contract contract) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.merge(contract);
        session.getTransaction().commit();
        session.close();
        return contract;
    }

    @Override
    public void delete(Contract contract) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.remove(contract);
        session.getTransaction().commit();
    }
}
