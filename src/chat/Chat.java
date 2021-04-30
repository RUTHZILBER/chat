/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

/**
 *
 * @author admin
 */
public class Chat extends Thread{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Message m=new Message(1,false);
        Send t1=new Send(m,2);
        Get t2=new Get(m,3);
        t2.start(); t1.start();
        

    }
    
}
