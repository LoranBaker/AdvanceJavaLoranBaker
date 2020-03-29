/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package three1.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author PC
 */
public class EasterDiscounter implements Discounter {

    @Override
    public BigDecimal applayDiscount(BigDecimal amount) {
      BigDecimal percentage = new BigDecimal(0.5);
      BigDecimal result = amount.multiply(percentage);
      return result.setScale(2, RoundingMode.HALF_UP);
    }
   /*
    public static void main(String[] args) {
        BigDecimal amount = new BigDecimal(1.25);
        amount = amount.setScale(1, RoundingMode.HALF_EVEN);
        System.out.println(amount.toPlainString());
    }*/
    
}
