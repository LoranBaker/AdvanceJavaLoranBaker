/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seven;

public class SingletonEager {
    
    //eager singleton
    private static SingletonEager Fadil = new SingletonEager();
     
    private SingletonEager(){
       System.out.println("Kreiranje singleton objekta...");
       
   } 
    public static SingletonEager getInstance(){
       return Fadil;
    }
}
