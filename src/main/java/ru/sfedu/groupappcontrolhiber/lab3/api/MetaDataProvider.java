package ru.sfedu.groupappcontrolhiber.lab3.api;

import ru.sfedu.groupappcontrolhiber.Result;
import ru.sfedu.groupappcontrolhiber.lab3.api.*;

public interface MetaDataProvider {
    <T> Result delete(T t);
    <T> Result save(T t);
    <T> Result<T> getById(Class <T> tClass,Long id);

}
