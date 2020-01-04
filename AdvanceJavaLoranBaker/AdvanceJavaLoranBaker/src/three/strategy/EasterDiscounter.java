/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package three.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class EasterDiscounter implements Discounter {

    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        BigDecimal percentage = new BigDecimal(0.5);
        BigDecimal result = amount.multiply(percentage);
        result = result.setScale(2, RoundingMode.HALF_UP);
        return result;
    }
    public static void main(String[] args) {
       BigDecimal amount = new BigDecimal(1.25);
       amount = amount.setScale(2, RoundingMode.HALF_UP);
       System.out.println(amount);
    }
}
