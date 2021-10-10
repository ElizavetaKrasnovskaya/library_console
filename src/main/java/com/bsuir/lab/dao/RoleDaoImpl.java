package com.bsuir.lab.dao;

import com.bsuir.lab.model.Role;
import com.bsuir.lab.util.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RoleDaoImpl implements Dao<Role> {
    @Override
    public Role getById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Role.class, id);
    }

    @Override
    public void save(Role role) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(role);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(int id) {
        Role role = getById(id);
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(role);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Role role) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(role);
        transaction.commit();
        session.close();
    }
}
