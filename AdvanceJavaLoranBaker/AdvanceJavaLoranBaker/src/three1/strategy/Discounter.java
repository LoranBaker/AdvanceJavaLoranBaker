
package three1.strategy;

import java.math.BigDecimal;
 @FunctionalInterface
public interface Discounter {
 
    BigDecimal applayDiscount(BigDecimal amount);
    
    static Discounter newYearDiscount(){
        return amount -> amount.multiply(BigDecimal.valueOf(0.7));
    }
    
}
