package three.strategy;

import java.math.BigDecimal;

public class PriceTester {
    public static void main(String[] args) {
        BigDecimal price = BigDecimal.valueOf(212.53);
        System.out.println("Kada nisu snizenja " + price.toPlainString());
        System.out.println("Kada su snizenja " + new EasterDiscounter().applyDiscount(price));
        
        
    }
}
