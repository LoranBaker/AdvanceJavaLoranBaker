/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seven;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author PC
 */
public class SingletonMultithredingBreak {
    
    static class InnerClassRunnable implements Runnable{

        @Override
        public void run() {
            useSingleton();
 
        }
        
    }
    
    public static void main(String[] args) {
       useSingleton();
       new Thread(new InnerClassRunnable()).start();
        Runnable runnable = new Runnable() {
            public void run() {
                useSingleton();
            }
        };
        new Thread(runnable).start();
        
        //lambda
        Runnable runnable1 = ()->useSingleton();
        new Thread(runnable1).start();
        //method referenciranja
        Runnable runnable2 = SingletonMultithredingBreak::useSingleton;
        new Thread(runnable2).start();
        
        //drugi nacin koristenja thredova
            ExecutorService executorService = Executors.newFixedThreadPool(100);
        executorService.submit(() -> useSingleton());
        executorService.submit(SingletonMultithredingBreak::useSingleton);
        executorService.submit(SingletonMultithredingBreak::useSingleton);
        executorService.submit(SingletonMultithredingBreak::useSingleton);

        executorService.submit(SingletonMultithredingBreak::useSingleton);
        executorService.submit(SingletonMultithredingBreak::useSingleton);
        executorService.submit(SingletonMultithredingBreak::useSingleton);
    }
    
    static void useSingleton (){
        System.out.println(Thread.currentThread().getName());
        SingletonExecutor singletonExecutor = new SingletonExecutor();
        SingletonExecutor.ObjectPrinter printer = singletonExecutor.new ObjectPrinter();
        //singleton 1 
        SingletonLazy nasFadil = SingletonLazy.getInstance();
        printer.print("nas fadil", nasFadil);
    }
}
