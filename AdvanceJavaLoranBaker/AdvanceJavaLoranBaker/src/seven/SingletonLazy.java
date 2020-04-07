/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seven;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletonLazy implements Serializable, Cloneable {
    
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    private Object readResolve() throws ObjectStreamException{
        return SABIT;
    }
    
}
