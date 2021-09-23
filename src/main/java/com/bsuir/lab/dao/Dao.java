package com.bsuir.lab.dao;

import com.bsuir.lab.model.Book;

public interface Dao {
    Book getBookById(int id);

    void saveBook(Book book);

    void deleteBookById(int id);

    void updateBook(Book book);
}
