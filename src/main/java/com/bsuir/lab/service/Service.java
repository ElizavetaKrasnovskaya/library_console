package com.bsuir.lab.service;

public interface Service<T> {
    T getById(int id);

    void save(T object);

    void deleteById(int id);

    void update(T object);
}
