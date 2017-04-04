package it.helloworld.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by n4z4 on 04/04/17.
 */
@Path("/hello")
@Produces({"application/json"})
public class HelloWorld {

    @GET
    @Path("/world")
    public String sayWorld() {
        return "{ \"Hello\": \"World\" }";
    }

}
