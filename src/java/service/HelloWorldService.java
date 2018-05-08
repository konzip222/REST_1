/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Jakub
 */
@Path("/hello")
public class HelloWorldService {



    /**
     * Retrieves representation of an instance of service.HelloWorldService
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getHtml() {
        //TODO return proper representation object
        return "Witaj JAX-RS";
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/echo")
    public String echo(){
        return "Witaj echo";
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/echo2/{parametr}")
    public String echo2(@PathParam("parametr") String name){
        return name;
    }

    /**
     * PUT method for updating or creating an instance of HelloWorldService
     * @param content representation for the resource
     */
}
