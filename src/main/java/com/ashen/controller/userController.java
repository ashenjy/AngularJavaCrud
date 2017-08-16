package com.ashen.controller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ashen.bean.user;
import com.ashen.service.userService;


@Path("/userlist")
public class userController {
	
	userService userService=new userService();
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<user> getuserlist()
	{
		
		List<user> listOfuserlist=userService.getAlluserlist();
		return listOfuserlist;
	}

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public user getuserById(@PathParam("id") int id) throws Exception
	{
		return userService.getuser(id);
	}
   
    @POST
    @Produces(MediaType.APPLICATION_JSON)
	public user adduser(user user)
	{
		return userService.adduser(user);
	}

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
	public user updateuser(user user)
	{
		return userService.updateuser(user);
		
	}
	
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public void deleteuser(@PathParam("id") int id)
	{
		 userService.deleteuser(id);
		
	}
	
}
