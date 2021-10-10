package com.bsuir.lab.service;

import com.bsuir.lab.dao.Dao;
import com.bsuir.lab.dao.UserDaoImpl;
import com.bsuir.lab.model.User;

public class UserServiceImpl implements Service<User> {

    private Dao<User> dao = new UserDaoImpl();

    @Override
    public User getById(int id) {
        return dao.getById(id);
    }

    @Override
    public void save(User user) {
        dao.save(user);
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }

    @Override
    public void update(User user) {
        dao.update(user);
    }
}