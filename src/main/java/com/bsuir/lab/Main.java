package com.bsuir.lab;

import com.bsuir.lab.model.Book;
import com.bsuir.lab.service.BookServiceImpl;
import com.bsuir.lab.service.Service;

public class Main {
    public static void main(String[] args) {
        Service service = new BookServiceImpl();
        service.deleteBookById(3);
        service.deleteBookById(4);
        System.out.println(service.getBookById(3));
    }
}
