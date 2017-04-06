package it.helloworld.rest;

import it.helloworld.entity.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

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

    @GET
    @Path("/{id}")
    @Produces({"application/json"})
    public User get(@PathParam("id") int id) {
        return this.em.find(User.class, id);
    }
}
