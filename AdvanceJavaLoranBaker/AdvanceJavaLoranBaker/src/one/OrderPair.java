package one;

public class OrderPair <K, V> implements Pair <K, V> {
    private final K key;
    private final V value;
    
    public OrderPair(K kljuc, V vrijednost){
        this.key = kljuc;
        this.value = vrijednost;
    
    }
    
    @Override
    public K getKey() {
       return key; 
    }

    @Override
    public V getValue() {
        return null;
    }
    
}