/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package five;


public class Counter {
    private int counter = 0;
    
    public synchronized void increment(){
        counter++;
    }
    
    public synchronized void decrement(){
        counter--;
    }
}
