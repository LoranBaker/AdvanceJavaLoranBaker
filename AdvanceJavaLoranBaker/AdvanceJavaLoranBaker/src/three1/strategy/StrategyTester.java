/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package three1.strategy;

import java.math.BigDecimal;

/**
 *
 * @author PC
 */
public class StrategyTester {
    public static void main(String[] args) {
        BigDecimal price = BigDecimal.valueOf(50.0);
        System.out.println("Price = " + price);
        BigDecimal newYearprice = new NewYearDiscounter().applayDiscount(price);
        System.out.println("Price after discounter = " + newYearprice);
        BigDecimal newYearPrice1 = Discounter.newYearDiscount().applayDiscount(price);
        System.out.println(newYearPrice1);
    }
}
