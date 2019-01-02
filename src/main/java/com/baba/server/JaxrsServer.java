package com.baba.server;

import com.baba.entity.User;

import javax.ws.rs.*;
import java.util.List;

/**
 * @Author: Ant
 * @Date: 2018/12/14 14:58
 * @Version 1.0
 */

@Path("/userService")
@Produces("*/*")
public interface JaxrsServer {

    @POST
    @Path("/user")
    @Consumes({"application/xml","application/json"})
    public void saveUser(User user);


    @GET
    @Path("/user")
    @Consumes({"application/json","application/xml"})
    @Produces({"application/xml","application/json"})
    public List<User> getAllUsers();


    @PUT
    @Path("/user")
    @Consumes({"application/json","application/xml"})
    public void update(User user);

    @GET
    @Path("/user/{id}")
    @Consumes("application/xml")
    @Produces({ "application/xml", "application/json" })
    public User finUserById(@PathParam("id") Integer id);

    @DELETE
    @Path("/user/{id}")
    @Consumes({"application/json","application/xml"})
    public void delete(@PathParam("id") Integer id);


}
