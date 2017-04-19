package it.helloworld.rest;

import it.helloworld.entity.User;
import it.helloworld.service.UserDBService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import java.util.List;

@Path("users")
public class UserController {

    @Inject
    private UserDBService userDbService;

    @Context
    private UriInfo $context;

    @GET
    @Produces({"application/json"})
    public List<User> get() {
        return this.userDbService.findAll();
    }

    @GET
    @Path("/{id}")
    @Produces({"application/json"})
    public User get(@PathParam("id") int id) {
        return this.userDbService.get(id);
    }
}
