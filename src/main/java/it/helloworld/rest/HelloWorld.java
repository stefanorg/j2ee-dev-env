package it.helloworld.rest;

import org.json.simple.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.HashMap;

/**
 * Created by n4z4 on 04/04/17.
 */
@Path("/hello")
@Produces({"application/json"})
public class HelloWorld {

    @GET
    @Path("/world")
    public String sayWorld() {
        JSONObject res = new JSONObject();
        res.put("Hello", "World");
        return res.toJSONString();
    }

    @GET
    @Path("/echo/{word}")
    public String echo(@PathParam("word") String word) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("You said", word);
        JSONObject res = new JSONObject(map);
        return res.toJSONString();
    }

}
