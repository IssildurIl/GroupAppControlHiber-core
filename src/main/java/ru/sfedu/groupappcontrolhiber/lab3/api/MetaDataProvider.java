package ru.sfedu.groupappcontrolhiber.lab3.api;

import ru.sfedu.groupappcontrolhiber.Result;

public interface MetaDataProvider {
    <T> Result<T> delete(T t);
    <T> Result<T> save(T t);
    <T> Result<T> getById(Class <T> tClass,Long id);
    <T> Result<T> update(T t);

}
