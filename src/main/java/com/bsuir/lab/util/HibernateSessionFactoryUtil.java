package com.bsuir.lab.util;

import com.bsuir.lab.model.Author;
import com.bsuir.lab.model.Book;
import com.bsuir.lab.model.Role;
import com.bsuir.lab.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class HibernateSessionFactoryUtil {
    private static SessionFactory sessionFactory;

    private HibernateSessionFactoryUtil() {
    }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(Book.class);
                configuration.addAnnotatedClass(Author.class);
                configuration.addAnnotatedClass(Role.class);
                configuration.addAnnotatedClass(User.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());

            } catch (Exception e) {
                System.out.println("Exception: " + Arrays.toString(e.getStackTrace()));
            }
        }
        return sessionFactory;
    }
}
