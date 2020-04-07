
package seven;

public class SingletonColneExecutor {
    public static void main(String[] args) throws Exception {
        SingletonExecutor singletonExecutor = new SingletonExecutor();
        SingletonExecutor.ObjectPrinter printer = singletonExecutor.new ObjectPrinter();
        
        SingletonLazy nasFadil = SingletonLazy.getInstance();
        printer.print("nas fadil", nasFadil);
        
        SingletonLazy drugiFaidlPokusaj = SingletonLazy.getInstance();
        printer.print("nas fadil", drugiFaidlPokusaj);
        System.out.println(nasFadil==drugiFaidlPokusaj);
        System.out.println(nasFadil.equals(drugiFaidlPokusaj));
        
        //Clone
        SingletonLazy kloniranFadil = (SingletonLazy)nasFadil.clone();
        printer.print("Klonirani fadil", kloniranFadil);
        
    }
}
