package com.bsuir.lab.service;

import com.bsuir.lab.model.Book;

public interface Service {
    Book getBookById(int id);

    void saveBook(Book book);

    void deleteBookById(int id);

    void updateBook(Book book);
}
