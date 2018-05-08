/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.util.ArrayList;
import java.util.List;
import model.Message;

/**
 *
 * @author Jakub
 */
public class MessageService {

    private List<Message> list = new ArrayList<>();

    public MessageService(){    
        Message m1 = new Message(1L,"first message", "author_1");
        Message m2 = new Message(1L,"second message", "author_2");
        Message m3 = new Message(1L,"third message", "author_3");

        list.add(m1);
        list.add(m2);
        list.add(m3);        
    }
    
    public List<Message> getAllMessages(){
        return list;
    }
    
}
