package ru.sfedu.groupappcontrolhiber.lab3.api;

import ru.sfedu.groupappcontrolhiber.Result;

public class JoinedTableDataProvider implements MetaDataProvider{
    @Override
    public <T> Result delete(T t) {
        return null;
    }

    @Override
    public <T> Result save(T t) {
        return null;
    }

    @Override
    public <T> Result<T> getById(Class<T> tClass, Long id) {
        return null;
    }
}