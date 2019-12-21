package one;


public class Util {
    
    public static <S, U> boolean comparePair (Pair<S,U> names1, Pair<S, U> pair2){
        return names1.getKey().equals(pair2.getKey());
    }
}
