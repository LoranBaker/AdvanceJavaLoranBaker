/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package three.strategy;

import java.math.BigDecimal;

/**
 *
 * @author PC
 */
public class StrategyTester {
    public static void main(String[] args) {
        BigDecimal price = BigDecimal.valueOf(50.0);
        System.out.println("price = " + price);
        BigDecimal newYearPrice = new NewYearDiscounter().applyDiscount(price);
        System.out.println("new year price = " + newYearPrice);
    }
}
