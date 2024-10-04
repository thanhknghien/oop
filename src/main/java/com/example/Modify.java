package com.example;

import java.io.IOException;

public interface Modify<T> {
    void add(T obj) throws IOException;
    void edit(String id, T newObj) throws IOException;
    void delete(String id) throws IOException;
    void importData(String path, T obj) throws IOException;
    void export(String path, T obj);
}
