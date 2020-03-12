/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package on1;

public class Order<K, V> implements Pair<K, V>{
    
    private final K key;
    private final V value;
    
    public Order(K kljuc, V vrijednost){
        this.key = kljuc;
        this.value = vrijednost;
    }
    
    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
       return value; 
    }
    
}
