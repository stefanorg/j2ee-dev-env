package it.helloworld.rest;

import it.helloworld.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by stefano on 06/04/17.
 */
@Path("users")
public class UserResource {

    @PersistenceContext(name = "AppPU")
    private EntityManager em;

    @GET
    @Produces({"application/json"})
    public User[] get() {
        User[] res = this.em.createNamedQuery("User.findAll", User.class).getResultList().toArray(new User[0]);

        return res;
    }
}
