
package seven;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonExecutor {
    public static void main(String[] args) throws Exception {
        SingletonExecutor singletonExecutor = new SingletonExecutor();
        SingletonExecutor.ObjectPrinter printer = singletonExecutor.new ObjectPrinter();
        //EAGER SINGLETON
        SingletonEager singleton1 = SingletonEager.getInstance();
        printer.print("singleton1",singleton1 );
        SingletonEager singleton2 = SingletonEager.getInstance();
        printer.print("singleton2",singleton2 );
        //SINGLETON LAZY
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        printer.print("singleton lazy1", singletonLazy1);
        SingletonLazy singletonLazy2= SingletonLazy.getInstance();
        printer.print("singleton lazy2",singletonLazy2);
        //REFLEKSIJA
        Class clazz = Class.forName("seven.SingletonLazy");
        Constructor <SingletonLazy> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonLazy singletonDuplikat = constructor.newInstance();
        printer.print("duplikat", singletonDuplikat);
        
            
    }
    
    class ObjectPrinter {
    
        public void print(String message, Object singleton){
            System.out.println(String.format(" ime objekta: %s, HashCode: %d", message, singleton.hashCode()));
        }
    }
    
}
