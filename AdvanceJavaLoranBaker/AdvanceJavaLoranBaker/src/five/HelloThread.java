
package five;

public class HelloThread extends Thread {

    @Override
    public void run() {
        System.out.println("Pozdrav iz :" + Thread.currentThread().getName());
    }
    
    
    
}
