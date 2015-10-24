package com.splay.ws.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.splay.values.User;

@Path("/users")
public class GetUserServiceImpl {

	@GET
	@Path("/getUser")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser(){
		System.out.println("Here");
		User user=new User();
		user.setName("Dummy User");
		user.setAge("20");
		user.setGroup("dummy");
		user.setId("55id");
		System.out.println(user.getName());
		return user;
	}
}
