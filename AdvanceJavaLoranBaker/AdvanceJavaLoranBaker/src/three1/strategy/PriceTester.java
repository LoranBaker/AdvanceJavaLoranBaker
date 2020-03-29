
package three1.strategy;

import java.math.BigDecimal;

public class PriceTester {
    public static void main(String[] args) {
        BigDecimal price = BigDecimal.valueOf(421.22);
        System.out.println("Cijena Kada Nisu snizenja = " + price.toPlainString());
        System.out.println("Cijena sa uskrsnim snizenjem = " + new EasterDiscounter().applayDiscount(price));
        System.out.println("Cijena za novu godinu " + new NewYearDiscounter().applayDiscount(price));
    }
}
