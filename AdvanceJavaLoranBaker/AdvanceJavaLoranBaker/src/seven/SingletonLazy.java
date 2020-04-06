/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seven;

import java.io.Serializable;

public class SingletonLazy implements Serializable {
    
    private static SingletonLazy SABIT;
    //lazy singletone
    private SingletonLazy(){
        System.out.println("Kreiram naseg Sabita i jedan je sabit");
    }
    
    public static SingletonLazy getInstance(){
        if(SABIT == null){
            SABIT = new SingletonLazy();
        }
        return SABIT;
    }
    
}
