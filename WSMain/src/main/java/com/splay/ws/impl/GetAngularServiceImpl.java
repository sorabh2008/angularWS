package com.splay.ws.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/angular")
public class GetAngularServiceImpl {

	@GET
	@Path("/{param}")
	public Response getName(@PathParam("param") String request) {
		// TODO Auto-generated method stub
		String resp="Hello "+request;
		return Response.status(200).entity(resp).build();
	}

}
