/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package five;

import javax.sound.midi.Soundbank;

/**
 *
 * @author PC
 */
public class HelloRunnable implements Runnable {
    
    @Override
    public void run() {
        try{
        Thread.sleep(2000);
        }catch(InterruptedException e ){
            return;
        }
        System.out.println("Hello from " + Thread.currentThread().getName());
    }
    
}
