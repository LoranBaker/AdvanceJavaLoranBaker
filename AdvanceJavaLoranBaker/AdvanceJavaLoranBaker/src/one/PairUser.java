package one;

import java.util.ArrayList;
import java.util.List;

public class PairUser {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new OrderPair<>(1, "Kanita");
        Integer key = pair1.getKey();
        System.out.println(key.intValue());
        
        List<String> names1 = new ArrayList<>();
        names1.add("Mahir");
        names1.add("Ferida");
        names1.add("Kanita");
        
        Pair<Integer, List<String>> pair2 = new OrderPair<>(1, names1);
        
        
    }
}