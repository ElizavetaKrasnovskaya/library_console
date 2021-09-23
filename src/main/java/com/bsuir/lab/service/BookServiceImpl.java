package com.bsuir.lab.service;

import com.bsuir.lab.dao.BookDaoImpl;
import com.bsuir.lab.dao.Dao;
import com.bsuir.lab.model.Book;

public class BookServiceImpl implements Service {

    private Dao dao = new BookDaoImpl();

    @Override
    public Book getBookById(int id) {
        return dao.getBookById(id);
    }

    @Override
    public void saveBook(Book book) {
        dao.saveBook(book);
    }

    @Override
    public void deleteBookById(int id) {
        dao.deleteBookById(id);
    }

    @Override
    public void updateBook(Book book) {
        dao.updateBook(book);
    }
}
