
package on1;

import java.util.List;

public class Util {
    
    
    public static <S, U> boolean comparePair(Pair<S, U> pair1, Pair<S, U> pair3){
    return pair1.getKey().equals(pair3.getKey());
    }

}
