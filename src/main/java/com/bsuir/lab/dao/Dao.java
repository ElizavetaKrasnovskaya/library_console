package com.bsuir.lab.dao;

public interface Dao<T> {
    T getById(int id);

    void save(T object);

    void deleteById(int id);

    void update(T object);
}
