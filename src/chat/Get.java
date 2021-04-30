/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import static java.lang.Thread.sleep;

/**
 *
 * @author admin
 */
public class Get extends Thread{
    Message mes;
    int id;

    public Get(Message mes, int id) {
        this.mes = mes;
        this.id = id;
    }
    
    @Override
    public void run() {
        
        for (int i = 0; i < 10; i++) {
            try{
                
                mes.sending(i);
                sleep(3333);
                System.out.println("read the message "+ i + " and the contect: "+ mes.getValue());
            }
            catch(Exception e){
            }  
        }
   
    }
    
    
}
