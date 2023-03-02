package com.example.products.repository.impl;

import com.example.products.model.SmartPhone;
import com.example.products.repository.ISmartPhoneRepository;
import com.example.products.repository.SessionUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class SmartPhoneRepository implements ISmartPhoneRepository {

    @Override
    public List<SmartPhone> findAll() {
        List<SmartPhone> smartphones = null;
        Session session = SessionUtil.sessionFactory.openSession();
        smartphones = session.createQuery("FROM SmartPhone ").getResultList();
        session.close();
        return smartphones;
    }

    @Override
    public boolean save(SmartPhone smartPhone) {
        Transaction transaction = null;
        Session session = SessionUtil.sessionFactory.openSession();
        try {
            transaction = session.beginTransaction();
            session.persist(smartPhone);
            return true;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
                return false;
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return true;
    }

    @Override
    public boolean update(SmartPhone smartPhone) {
        SmartPhone smartPhone1 = findById(smartPhone.getId());
        Session session = SessionUtil.sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            smartPhone1.setName(smartPhone.getName());
            smartPhone1.setBrand(smartPhone.getBrand());
            smartPhone1.setPrice(smartPhone.getPrice());
            session.update(smartPhone1);
            transaction.commit();
            return true;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
                return false;
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return true;
    }

    @Override
    public boolean remove(int id) {
        SmartPhone smartPhone = findById(id);
        Session session = SessionUtil.sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.remove(smartPhone);
            transaction.commit();
            return true;
        } catch (Exception e) {
            if (transaction != null || smartPhone == null) {
                assert transaction != null;
                transaction.rollback();
                return false;
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return true;
    }

    @Override
    public SmartPhone findById(int id) {
        SmartPhone smartPhone;
        Session session = SessionUtil.sessionFactory.openSession();
        smartPhone = (SmartPhone) session.createQuery("FROM SmartPhone " +
                "WHERE id = :id").setParameter("id", id).getSingleResult();
        session.close();
        return smartPhone;
    }

    @Override
    public List<SmartPhone> findByName(String name) {
        List<SmartPhone> phones = null;
        Session session = SessionUtil.sessionFactory.openSession();
        try {
            TypedQuery<SmartPhone> query
                    = session.createQuery("SELECT s FROM SmartPhone s " +
                    "WHERE s.name LIKE :name").setParameter("name", "%" + name + "%");
            phones = query.getResultList();
        } catch (Exception e) {
            if (session != null) {
                session.close();
            }
        }
        return phones;
    }
}