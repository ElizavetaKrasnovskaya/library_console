package com.bsuir.lab.dao;

import com.bsuir.lab.model.Author;
import com.bsuir.lab.util.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AuthorDaoImpl implements Dao<Author> {
    @Override
    public Author getById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Author.class, id);
    }

    @Override
    public void save(Author author) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(author);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(int id) {
        Author author = getById(id);
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(author);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Author author) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(author);
        transaction.commit();
        session.close();
    }
}