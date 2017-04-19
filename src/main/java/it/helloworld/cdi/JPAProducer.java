package it.helloworld.cdi;

import it.helloworld.entity.User;
import it.helloworld.service.BaseDAO;
import it.helloworld.service.UserDBService;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Resource Producer patter: CDI injection entrypoint
 *
 * Created by stefano on 07/04/17.
 */
public class JPAProducer {

    @PersistenceContext
    @Produces
    private EntityManager em;


    @Produces
    public UserDBService getUserServiceFactory() {
        return new UserDBService(User.class);
    }
}
