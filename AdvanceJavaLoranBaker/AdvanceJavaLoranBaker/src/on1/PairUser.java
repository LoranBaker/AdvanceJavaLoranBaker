
package on1;

import java.util.ArrayList;
import java.util.List;

public class PairUser {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Order<>(1, " Loran");
        System.out.println(pair1.getKey() + pair1.getValue());
        
        List<String> prvaKlupa = new ArrayList<>();
        prvaKlupa.add("Faruk");
        prvaKlupa.add("Ridji");
        prvaKlupa.add("Loran");
        
        Pair<Integer, List<String>> pair2 = new Order<>(1, prvaKlupa);
        System.out.println(pair2.getValue());
        
        Pair<Integer, String> pair3 = new Order<>(2, "Faruk");
        
        boolean result = Util.comparePair(pair1, pair3);
        System.out.println(result);
    }
}
