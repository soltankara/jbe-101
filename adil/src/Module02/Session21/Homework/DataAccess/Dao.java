package Module02.Session21.Homework.DataAccess;

import Module02.Session21.Homework.Model.Grade;

import java.util.List;

public interface Dao<T> {
    void save(T t);

    List<T> findAll();
}
