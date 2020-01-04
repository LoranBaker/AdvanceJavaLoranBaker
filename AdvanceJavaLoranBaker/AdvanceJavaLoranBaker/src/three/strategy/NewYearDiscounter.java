/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package three.strategy;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 *
 * @author PC
 */
public class NewYearDiscounter implements Discounter {

    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        BigDecimal percentege = new BigDecimal (0.7);
        BigDecimal result = percentege.multiply(amount, new MathContext(2, RoundingMode.HALF_UP));
        return result;
    }

   
    
}
