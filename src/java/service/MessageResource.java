/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Message;
import resources.MessageService;

/**
 *
 * @author Jakub
 */
@Path("/messages")
public class MessageResource {
    
    MessageService messageService = new MessageService();
    
    @GET
    @Path("/XML")    
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> getText(){
        return messageService.getAllMessages();
    }
   
    @GET
    @Path("/JSON")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> gettText(){
        return messageService.getAllMessages();
    }
}
