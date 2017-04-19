package it.helloworld.service;

import it.helloworld.entity.User;

import java.util.List;

/**
 * Created by stefano on 07/04/17.
 */
public interface IBaseDAO<T> {
    List<T> findAll();

    T get(int id);
}
