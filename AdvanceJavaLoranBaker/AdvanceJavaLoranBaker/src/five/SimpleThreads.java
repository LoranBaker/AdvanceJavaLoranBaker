package five;


public class SimpleThreads {
    
    public static void main(String[] args) throws InterruptedException {
        long patient = 60*60*1000;//milisekunde
        threadMessage("Main thread ce poslati MessageLoop thread ");
        long startTime = System.currentTimeMillis();
        MessageLoop messageLoop = new MessageLoop();
        Thread thread1 = new Thread(messageLoop);
        thread1.start();
        threadMessage("Cekam");
        while(thread1.isAlive()){
            
            threadMessage("Ja jos cekam");
            long pragStrpljenja = System.currentTimeMillis()-startTime;
            if(pragStrpljenja>patient && thread1.isAlive()){
                threadMessage("ipak sam ja glavni tred");
                thread1.interrupt();
            }
          Thread.sleep(1000);
        }
         threadMessage("Konacno zavrsio");
    }

    static void threadMessage(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.format("%s: %s %n", threadName, message);
    }

    private static class MessageLoop implements Runnable {

        @Override
        public void run() {
            try {
                String[] importantMessage = {
                    "Maca prede", "Cuko laje", "Riba suti", "Ptice pjevuse", "Malo dijete place"
                };
                for (int i = 0; i < importantMessage.length; i++) {
                    String importanMessage = importantMessage[i];
                    Thread.sleep(4000);
                    threadMessage(importanMessage);
                }

            } catch (InterruptedException e) {
                threadMessage("nisam ve pojeo a ti si me prekinuo");

            }
        }

    }
}
