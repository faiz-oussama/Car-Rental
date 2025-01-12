package com.car.model.dao;
import java.util.List;
public interface GenericDAO<T> {

    // CRUD operations

    // Create
    int create(T t);

    // Read
    T read(long id);

    // Update
    T update(T t);

    // Delete
    int delete(long id);

    // Read all
    List<T> readAll();
}
