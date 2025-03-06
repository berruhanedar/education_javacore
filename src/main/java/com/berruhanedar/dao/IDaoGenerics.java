package com.berruhanedar.dao;

import java.sql.Connection;
import java.util.ArrayList;

public interface IDaoGenerics<T> {
    // CRUD

    // CREATE
    public T create(T t);

    // FIND BY NAME
    public T findByName(String name);

    // LIST
    public ArrayList<T> list();

    // UPDATE
    public T update(int id, T t);

    // DELETE
    public T delete(int id);

    // CHOOISE
    public void chooise();

    // BODY Method
    default Connection getInterfaceConnection() {
        return null;
    }
}
