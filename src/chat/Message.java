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
public class Message {
    private int value;
    private boolean key=false;

    public  synchronized void sending(int x) throws InterruptedException{
        while(this.key==true){
            wait(15000);
        }
        this.value=x;
        key=true;
        notify();
        
        
        
    } 
    
    
    public synchronized int getting() throws InterruptedException{
        while(this.key==false){
            wait(1500);
        }
       
        key=false;
        notify();
        return value;
        
    } 
    
    public void setValue(int value) {
        this.value = value;
    }

    public void setKey(boolean key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public boolean isKey() {
        return key;
    }

    public Message() {
         this.value = 4;
        this.key = false;
    }

    public Message(int value, boolean key) {
        this.value = value;
        this.key = key;
    }
}
