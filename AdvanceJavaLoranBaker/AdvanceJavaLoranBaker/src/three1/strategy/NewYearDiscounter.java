/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package three1.strategy;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class NewYearDiscounter implements Discounter{
    
    
    @Override
    public BigDecimal applayDiscount(BigDecimal amount) {
        BigDecimal percentage = new BigDecimal(0.7);
        BigDecimal result = percentage.multiply(amount, new MathContext(2, RoundingMode.UP));
        return result;
    }
    
}
