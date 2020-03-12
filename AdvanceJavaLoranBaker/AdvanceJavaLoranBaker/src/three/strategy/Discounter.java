package three.strategy;

import java.math.BigDecimal;
@FunctionalInterface
public interface Discounter {
    
   BigDecimal applyDiscount(BigDecimal amount);
   
   static Discounter newYearDiscount(){
       return null;
   }
}
