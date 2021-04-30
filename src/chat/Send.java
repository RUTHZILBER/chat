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
public class Send extends Thread{
  
    Message mes;
    int id;

    public Send(Message mes, int id) {
        this.mes = mes;
        this.id = id;
    }

   
    
    public void run(){
       for (int i = 0; i < 10; i++) {
            try{
                
                int x=mes.getting();
                sleep(33);
                System.out.println(" ------------- "+ x + " and the contect: "+ mes.getValue());
            }
            catch(Exception e){
            }
                
        }
    }
}
