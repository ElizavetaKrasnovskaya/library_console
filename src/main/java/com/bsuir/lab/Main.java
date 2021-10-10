package com.bsuir.lab;

import com.bsuir.lab.model.Author;
import com.bsuir.lab.model.Book;
import com.bsuir.lab.model.Role;
import com.bsuir.lab.model.User;
import com.bsuir.lab.service.AuthorServiceImpl;
import com.bsuir.lab.service.BookServiceImpl;
import com.bsuir.lab.service.RoleServiceImpl;
import com.bsuir.lab.service.Service;
import com.bsuir.lab.service.UserServiceImpl;

import java.util.HashSet;
import java.util.Set;

public class Main {

    private static Service<Book> bookService = new BookServiceImpl();
    private static Service<Author> authorService = new AuthorServiceImpl();
    private static Service<Role> roleService = new RoleServiceImpl();
    private static Service<User> userService = new UserServiceImpl();

    public static void main(String[] args) {
        workWithRole();
        workWithAuthors();
        workWithBook();
        workWithUser();
    }

    private static void workWithRole(){
        Role role = new Role("librarian");
        roleService.save(role);
        System.out.println(roleService.getById(1));
    }

    private static void workWithAuthors(){
        Author author = new Author("surname", "name", "second_name");
        authorService.save(author);
        System.out.println(authorService.getById(1));
    }

    private static void workWithBook(){
        Set<Author> set = new HashSet<>();
        set.add(authorService.getById(1));
        Book book = new Book("title", "genre", 2020, true, "specification", set);
        bookService.save(book);
        System.out.println(bookService.getById(1));
    }



    private static void workWithUser(){
        Role role = roleService.getById(1);
        User user = new User("surname", "name", "second_name", "login", "pasword", role);
        userService.save(user);
        System.out.println(userService.getById(1));
    }
}
