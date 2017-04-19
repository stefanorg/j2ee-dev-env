package it.helloworld.service;

import it.helloworld.entity.User;

import javax.enterprise.context.SessionScoped;

/**
 * Created by stefano on 11/04/17.
 */
public class UserDBService extends BaseDAO<User>{

    public UserDBService(Class<User> entityType) {
        super(entityType);
    }
}
