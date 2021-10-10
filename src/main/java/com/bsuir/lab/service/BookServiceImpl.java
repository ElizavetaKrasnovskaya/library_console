package com.bsuir.lab.service;

import com.bsuir.lab.dao.BookDaoImpl;
import com.bsuir.lab.dao.Dao;
import com.bsuir.lab.model.Book;

public class BookServiceImpl implements Service<Book> {

    private Dao<Book> dao = new BookDaoImpl();

    @Override
    public Book getById(int id) {
        return dao.getById(id);
    }

    @Override
    public void save(Book book) {
        dao.save(book);
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }

    @Override
    public void update(Book book) {
        dao.update(book);
    }
}
