
package five;

public class FiveExecutor {
    public static void main(String[] args) {
        
        System.out.println("Pozdrav iz prvog : " + Thread.currentThread().getName());
        //prvi nacin da kreiramo kod koji ce se izvrsavati paralelno sa Main thredom
         HelloRunnable helloRunnable = new HelloRunnable();
         new Thread(helloRunnable).start();
         Thread thread2 = new HelloThread();
         thread2.start();
    } 
}
