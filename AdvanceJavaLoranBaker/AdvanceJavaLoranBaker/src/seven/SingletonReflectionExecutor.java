/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seven;

import java.lang.reflect.Constructor;

public class SingletonReflectionExecutor{

    public static void main(String[] args) throws Exception {
        SingletonExecutor singletonExecutor = new SingletonExecutor();
        SingletonExecutor.ObjectPrinter printer = new SingletonExecutor.ObjectPrinter();

        //SINGLETON LAZY
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        printer.print("singleton lazy1", singletonLazy1);
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
        printer.print("singleton lazy2", singletonLazy2);
        
        //REFLEKSIJA
        Class clazz = SingletonLazy.class;
        Constructor<SingletonLazy> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonLazy singletonDuplikat = constructor.newInstance();
        printer.print("duplikat", singletonDuplikat);
        
        System.out.println("Sigleton Eager");
        //EAGER SINGLETON
        SingletonEager singleton1 = SingletonEager.getInstance();
        printer.print("singleton1",singleton1 );
        SingletonEager singleton2 = SingletonEager.getInstance();
        printer.print("singleton2",singleton2 );
        Class clazz1 = singleton1.getClass();
        Constructor<SingletonEager> constructorEager = clazz1.getDeclaredConstructor();
        constructorEager.setAccessible(true);
        SingletonEager drugiEager = constructorEager.newInstance();
        printer.print("drugi eager", drugiEager);
        
    }
}
