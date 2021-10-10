package com.bsuir.lab.service;

import com.bsuir.lab.dao.AuthorDaoImpl;
import com.bsuir.lab.dao.Dao;
import com.bsuir.lab.model.Author;

public class AuthorServiceImpl implements Service<Author> {

    private Dao<Author> dao = new AuthorDaoImpl();

    @Override
    public Author getById(int id) {
        return dao.getById(id);
    }

    @Override
    public void save(Author author) {
        dao.save(author);
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }

    @Override
    public void update(Author author) {
        dao.update(author);
    }
}