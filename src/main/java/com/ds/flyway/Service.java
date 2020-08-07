package com.ds.flyway;

import java.util.List;

public interface Service<T, S> {

    public T save(S s);

    public T update(S s);

    public void delete(S s);

    public List<T> findAll();
}
