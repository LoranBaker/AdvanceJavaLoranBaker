/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package five;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SleepMessage {
    public static void main(String[] args) {
        String [] importantMessage = {
        "Maca prede", "Cuko laje", "Riba suti", "Ptice pjevuse","Malo dijete place"
        };
        for(int i=0;i<importantMessage.length;i++){
            String poruka = importantMessage[i];
            System.out.println(poruka);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException ex) {
                Logger.getLogger(SleepMessage.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }
}
